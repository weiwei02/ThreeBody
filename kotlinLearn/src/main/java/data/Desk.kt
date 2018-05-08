package data;

import externd.User

/** Kotlin 可以创建一个只包含数据的类，关键字为 data：
 * 编译器会自动的从主构造函数中根据所有声明的属性提取以下函数：
equals() / hashCode()
toString() 格式如 "User(name=John, age=42)"
componentN() functions 对应于属性，按声明顺序排列
copy() 函数
如果这些函数在类中已经被明确定义了，或者从超类中继承而来，就不再会生成。
为了保证生成代码的一致性以及有意义，数据类需要满足以下条件：
主构造函数至少包含一个参数。
所有的主构造函数的参数必须标识为val 或者 var ;
数据类不可以声明为 abstract, open, sealed 或者 inner;
数据类不能继承其他类 (但是可以实现接口)。
 * fun copy(name: String = this.name, age: Int = this.age) = User(name, age)
 * 复制
 * 复制使用 copy() 函数，我们可以使用该函数复制对象并修改部分属性, 对于上文的 User 类，其实现会类似下面这样：
 * fun copy(name: String = this.name, age: Int = this.age) = User(name, age)
 *
 *
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / wangweiwei12@jd.com</email>
 * @version 1.0
 * @sine 2018/5/8
 */
data class Desk(var name: String,var height: Double, var width: Double)

fun main(args: Array<String>) {
    val desk = Desk("办公桌", 100.0, 200.0)
    println(desk)

}
