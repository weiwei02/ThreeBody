package com.github.weiwei02.threebody.kotlin_spring.processers;

import com.alibaba.fastjson.JSONObject
import com.github.weiwei02.threebody.kotlin_spring.domain.Report
import org.springframework.batch.item.ItemProcessor
import org.springframework.stereotype.Service

/**
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / wangweiwei12@jd.com</email>
 * @version 1.0
 * @sine 2018/5/10
 */
@Service
class PrintProcesser : ItemProcessor<Report, Report> {
    override fun process(item: Report?): Report? {
        println(JSONObject.toJSON(item))
        return item
    }
}
