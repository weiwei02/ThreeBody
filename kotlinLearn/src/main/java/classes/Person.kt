package classes

/**
 * kotlin 类定义
 * @author Weiwei Wang
 * @date 2018/5/8
 */
class Person constructor(private var name: String) {
    var age: Int? = null
    var height: Float = 143f
        private set(value){
            field = if (value > 100){
                value
            }else{
                100f
            }
        }

    fun say(){
        println("I am $name, my age is $age, and height is $height")
    }
}