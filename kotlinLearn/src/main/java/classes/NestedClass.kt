package classes

/**
 * 嵌套类
 * @author Weiwei Wang
 * @date 2018/5/8
 */
class NestedClass{ // 外部类
    private val no = 1
    class Inner{ // 嵌套类中无法使用外部类的属性
        fun foo(){
            println(2)
        }
    }
}

fun main(args: Array<String>) {
    val demo = NestedClass.Inner().foo()
}