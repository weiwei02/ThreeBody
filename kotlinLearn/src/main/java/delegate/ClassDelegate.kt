package delegate

/** 类的委托即一个类中定义的方法实际是调用另一个类的对象的方法来实现的。
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / wangweiwei12@jd.com</email>
 * @sine 2018/5/9
 * @version 1.0
 */
interface BaseInterface{
    fun foo()

    fun see(){
        println("see()")
    }
}

/**
 * 实现接口的被委托类
 * */
class BaseImpl(val x: Int) : BaseInterface{
    override fun foo() {
        println(x)
    }
}


/**
 * 通过by关键字创建委托类
 *
 * 在 Derived 声明中，by 子句表示，将 b 保存在 Derived 的对象实例内部，而且编译器将会生成继承自 Base 接口的所有方法, 并将调用转发给 b。
 * */
class Derived(base: BaseInterface) : BaseInterface by base{
    override fun see() {
        print("invoker ")
        super.see()
    }
}

fun main(args: Array<String>) {
    val base = BaseImpl(10)
    Derived(base).foo()
    Derived(base).see()
}