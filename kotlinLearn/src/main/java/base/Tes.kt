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
    isNull(null)
    range1()
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


/**
 * 是否为空函数
 * 类型后 + ? 代表可以为空
 * */
fun isNull(age: String?){
    //抛出空指针异常
//    val ages = age!!.toInt()
    //不做处理直接返回null
    val ages1 = age?.toInt()
    //如果未空返回-1
    val ages3 = age?.toInt() ?: -1
    println("a1 = $ages1 , a2 = $ages3")
}


/**
 *
 * */
fun range1(){
    for (i in 4..1) print(i)
    for (i in 1 until 10) println(i)
}


class Person{
    var name: String? = null
}