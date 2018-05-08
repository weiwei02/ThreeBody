package externd

/**
 * 扩展函数
扩展函数可以在已有类中  ---添加--- 新的方法，不会对原类做修改，扩展函数定义形式：
fun receiverType.functionName(params){
body
}
receiverType：表示函数的接收者，也就是函数扩展的对象
functionName：扩展函数的名称
params：扩展函数的参数，可以为NULL

 * 扩展是静态的，在编译期间就会使扩展生效
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @sine 2018/5/8
 * @version 1.0
 */


class User{
    fun login(){
        print("login --- ")
    }
}

fun User.logins(){
    login()
    println("weiwei")
}

fun main(args: Array<String>) {
    val user = User()
    user.login()
}