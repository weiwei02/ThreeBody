package base

/** 语法
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @sine 2017/11/22
 * @version 1.0
 */

fun main(args: Array<String>) {
    println("Hello kotlin")
    println(add(1, 2))
    lambda()
    strModel()
}

fun add(a: Int, b: Int): Int{
    return a + b
}


/**
 * 表达式作为函数体，返回类型自动推断：
 * */
fun add2(a: Int,b: Int) = a + b


/**
 *  public 方法则必须明确写出返回类型
 * */
public fun add3(a: Int,b: Int): Int = a + b


/**函数的变长参数可以用 vararg 关键字进行标识：*/
fun vars(vararg v:Int){
    for(vt in v){
        println(vt)
    }
}


/**
 * base.lambda
 * */
fun lambda(){
    val sumLambda: (Int, Int) -> Int = {x, y -> x + y}
    println(sumLambda(1,3))
}


/**
 * 字符串模版
 * */
fun strModel(){
    var a = 1
    val str1 = "a is $a"
    a = 2
    val str2 = "${str1.replace("is", "was")}, now is $a"
    println(str1)
    println(str2)
}