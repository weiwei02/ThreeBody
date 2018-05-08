package classes

/**
 * 重写
 * 在基类中，使用fun声明函数时，此函数默认为final修饰，不能被子类重写。如果允许子类重写该函数，那么就要手动添加 open 修饰它, 子类重写方法使用 override 关键词：
 * @author Weiwei Wang
 * @date 2018/5/8
 */
/**用户基类**/
open class Person2{
     open fun study(){       // 允许子类重写
        println("我毕业了")
    }
}

/**子类继承 Person 类**/
class Student : Person2() {

    override fun study(){    // 重写方法
        println("我在读大学")
    }
}

/**
 * 如果有多个相同的方法（继承或者实现自其他类，如A、B类），则必须要重写该方法，使用super范型去选择性地调用父类的实现。

open class A {
 * */
interface Man{
    fun study(){
        println("我在学计算机")
    }
}

class ManPerson : Person2() ,Man{
    override fun study() {
        super<Man>.study()
        super<Person2>.study()
    }
}
fun main(args: Array<String>) {
    val s =  Student()
    s.study()
}