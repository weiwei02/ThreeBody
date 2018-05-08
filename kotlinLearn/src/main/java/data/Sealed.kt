package data;

/**
 * 密封类用来表示受限的类继承结构：当一个值为有限几种的类型, 而不能有任何其他类型时。在某种意义上，他们是枚举类的扩展：枚举类型的值集合 也是受限的，但每个枚举常量只存在一个实例，而密封类 的一个子类可以有可包含状态的多个实例。
声明一个密封类，使用 sealed 修饰类，密封类可以有子类，但是所有的子类都必须要内嵌在密封类中。
sealed 不能修饰 interface ,abstract class(会报 warning,但是不会出现编译错误)
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / wangweiwei12@jd.com</email>
 * @version 1.0
 * @sine 2018/5/9
 */
 sealed class Sealed {
    data class Const(val number: Double): Sealed()
    data class Sum(val e1: Sealed, val e2: Sealed): Sealed()
    object NotANumber: Sealed()

    fun eval(sealed: Sealed): Double = when(sealed){
            is Const -> sealed.number
            is Sum -> eval(sealed.e1) + eval(sealed.e2)
            NotANumber -> Double.NaN
        // 不需要else语句，因为已经涵盖了所有情况
        }
}
