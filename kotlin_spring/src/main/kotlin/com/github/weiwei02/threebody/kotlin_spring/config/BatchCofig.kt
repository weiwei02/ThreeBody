package com.github.weiwei02.threebody.kotlin_spring.config

import com.github.weiwei02.threebody.kotlin_spring.domain.Report
import com.github.weiwei02.threebody.kotlin_spring.processers.PrintProcesser
import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.batch.core.launch.support.RunIdIncrementer
import org.springframework.batch.core.step.tasklet.Tasklet
import org.springframework.batch.item.ItemReader
import org.springframework.batch.item.file.FlatFileItemReader
import org.springframework.batch.item.file.mapping.DefaultLineMapper
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource


/** 批处理配置
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / wangweiwei12@jd.com</email>
 * @sine 2018/5/10
 * @version 1.0
 */
@Configuration
class BatchCofig{
    @Autowired
    private lateinit var jobBuilderFactory: JobBuilderFactory

    @Autowired
    private lateinit var stepBuilderFactory: StepBuilderFactory


    /**
     * csv读取器
     * */
    @Bean
    fun  readCsv(): ItemReader<Report> {
        val reader = FlatFileItemReader<Report>()
        reader.setResource(ClassPathResource("cvs/input/report.csv"))
        // 设置映射器
        val defaultLinerMapper = DefaultLineMapper<Report>()
        // 设置分词器
        val tokenizer =  DelimitedLineTokenizer()
        tokenizer.setNames(arrayOf("id", "sales", "qty", "staffName", "date"))
        tokenizer.setDelimiter(",")
        defaultLinerMapper.setLineTokenizer(tokenizer)
        // 设置bean结果映射器
//        val  beanWrapperFieldSetMapper = BeanWrapperFieldSetMapper<Report>()
//        beanWrapperFieldSetMapper.setPrototypeBeanName("report")
//        defaultLinerMapper.setFieldSetMapper(beanWrapperFieldSetMapper)
        defaultLinerMapper.setFieldSetMapper { fieldSet ->  Report(fieldSet.readInt(0), fieldSet.readBigDecimal(1), fieldSet.readInt(2), fieldSet.readString(3), fieldSet.readDate(4)) }
        reader.setLineMapper(defaultLinerMapper)
        return reader
    }

    /**
     * 批处理步骤
     * */
    @Bean
    fun step1 (printPeocesser : PrintProcesser): Step{
        return stepBuilderFactory.get("step1").chunk<Report, Report>(2).reader(readCsv()).processor(printPeocesser).build()
    }

    /**
     * 批处理任务
     * */
    @Bean
    fun job1(step1 : Step): Job{
        return jobBuilderFactory.get("job1").incrementer( RunIdIncrementer()).start(step1).build()
    }
}