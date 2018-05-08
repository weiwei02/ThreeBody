package externd

/** 测试在同一个包下扩展的作用域
 * 只要引用扩展定义所在的包，就能使用扩展
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @sine 2018/5/8
 * @version 1.0
 */

fun main(args: Array<String>) {
    val user = User()
    user.logins()
}