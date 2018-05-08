package classes

/** 伴生类是伴生与类本身的对象，可以直接通过类名来调用伴生对象的方法
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / wangweiwei12@jd.com</email>
 * @sine 2018/5/8
 * @version 1.0
 */
class AssociatedObject{
    companion object {
        fun name(){
            println("companion object method")
        }
    }
}

fun main(args: Array<String>) {
    AssociatedObject.name()
}