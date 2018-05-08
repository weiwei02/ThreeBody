package base

/**
 * kotlin基本语法练习
 * @author Weiwei Wang
 * @date 2018/5/8
 */


/**
 * 函数定义使用 fun 关键字 参数格式为： 参数: 类型
 * */
fun sum(a : Int, b : Int): Int{ // Int 参数 返回 Int
    return a + b
}

/**
 * 表达式作为函数体，返回值类型自动判断
 * */
fun sum2(a: Int, b: Int) = a + b

/**
 * public方法必须明确声明返回数据类型
 * */
public fun sum3(a: Int, b: Int): Int = a + b

/**
 * 无返回值的函数
 * */
fun printSum(a: Int, b: Int): Unit{
    print(a + b)
}

/**
 * 如果返回 Unit 类型，则可以省略
 * */
public fun printSum1(a: Int, b: Int): Unit{
    print(a + b)
}


/**
 * 可变长参数
 * */
fun varse(vararg args: Int){
    for (a in args){
        print(a)
    }
    println()
}


/**
 * base.lambda 匿名函数
 * */
fun testLambda(){
    val sumlambda: (Int, Int) -> Int = {x ,y -> x + y}
    println(sumlambda(2, 3))
}


/**
 * 字符串模板
 * */
fun repleace(){
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now was $a"
    println(s2)
}

/**
 * 空判断
 * kotlin空安全的设计用于声明可为空的参数，在使用时要进行空判断处理，有两种处理方式
 * */
fun isNull(){
    // 类型后加?表示可空
    var age: String ?= "1"
    // 抛出空指针异常
    val ages = age!!.toInt()
    // 不做任何处理返回空
    val ages1 = age ?.toInt()
    // 如果为空返回 -1
    val ages2 = age?.toInt() ?: -1
}

/**
 * 类型检测及自动转换
 * */
fun convert(obj: Any){
    if (obj is String){
        println("obj is String")
    }else{
        println("obj is ${obj.javaClass}")
    }
}

public fun main(args: Array<String>){
    varse(1, 2, 3, 5)
    testLambda()
    repleace()
    convert("a")
    convert(2)
}