package base

/**
 * 条件控制
 * @author Weiwei Wang
 * @date 2018/5/8
 */

/**
 * if 表达式，一个if包含
 * */
fun ifExpression(){
    var a = 1
    var b = 2
    var c = if (a > b) {
        a
    } else {
        printSum(a, b)
        b
    }
}


/**
 * 使用区间
 * 使用 in 运算符来检测某个数字是否在指定区间内，区间格式为 x..y ：
 * */
fun ranges(){
    val a = 1
    if (a in 1..10){
        println("a is $a , and in range 1..10")
    }
}


/**
 * when 表达式
 * when 将它的参数和所有的分支条件顺序比较，直到某个分支满足条件。

when 既可以被当做表达式使用也可以被当做语句使用。如果它被当做表达式，符合条件的分支的值就是整个表达式的值，如果当做语句使用， 则忽略个别分支的值。
 * */
fun switchWhen(){
    val a = 1
    when(a){
        0 -> println("a is 0")
        1 -> println("when a = 1")
        else -> println("don't know a")
    }
}
fun main(args: Array<String>) {
    ifExpression()
    ranges()
    switchWhen()
}