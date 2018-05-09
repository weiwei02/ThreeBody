package com.github.weiwei02.threebody.kotlin_spring.domain

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import java.math.BigDecimal
import java.util.*


/** csv数据类
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / wangweiwei12@jd.com</email>
 * @sine 2018/5/10
 * @version 1.0
 */
@Component("report")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
data class Report(var id: Int,var sales: BigDecimal,var qty: Int,var staffName: String,var date: Date)