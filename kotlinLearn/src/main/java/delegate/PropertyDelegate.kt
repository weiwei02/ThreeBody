package delegate

import kotlin.reflect.KProperty

/**
 * 属性委托指的是一个类的某个属性值不是在类中直接进行定义，而是将其托付给一个代理类，从而实现对该类的属性统一管理。
属性委托语法格式：
val/var <属性名>: <类型> by <表达式>
var/val：属性类型(可变/只读)
属性名：属性名称
类型：属性的数据类型
表达式：委托代理类
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / wangweiwei12@jd.com</email>
 * @sine 2018/5/9
 * @version 1.0
 */


/**
 * 定义包含属性委托的类
 * */
class PropertyDelegate{
    var p: String by Delegate1()
}

class Delegate1 {
    operator fun getValue(propertyDelegate: PropertyDelegate, property: KProperty<*>): String {
        return "$propertyDelegate, 这里委托了 ${property.name} 属性"
    }
    operator fun setValue(propertyDelegate: PropertyDelegate, property: KProperty<*>, s: String) {
        println("$propertyDelegate 的 ${property.name} 属性赋值为 $s")
    }
}

fun main(args: Array<String>) {
    val proper = PropertyDelegate()
    print(proper.p)
}

