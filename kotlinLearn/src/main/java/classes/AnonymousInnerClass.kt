package classes

/**
 * 匿名内部类
 * @author Weiwei Wang
 * @date 2018/5/8
 */
class AnonymousInnerClass{
    fun test(person : Persons){
        person.say()
    }


}

interface Persons {
    fun say()
}

fun main(args: Array<String>) {
    var inner = AnonymousInnerClass()
    // 匿名内部类中变量名必须是 object
    inner.test(object : Persons{
        override fun say(){
            println("hello")
        }
    } )
}