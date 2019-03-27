package dp;

/**
 *  有数组penny，penny中所有的值都为正数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，再给定一个整数aim(小于等于1000)代表要找的钱数，
 *  求换钱有多少种方法。
 *
 * 给定数组penny及它的大小(小于等于50)，同时给定一个整数aim，请返回有多少种方法可以凑成aim。
 * 测试样例：
 * [1,2,4],3,3
 * 返回：2
 *
 * @author Wang Weiwei / email : wangweiwei12@jd.com
 * @version 17.8.0
 * @since 2019-03-27
 */
public class MoneyProblem {

    public int countWays(int[] penny, int n, int aim) {
        if (n == 0 || penny == null || aim < 0) {
            return 0;
        }
        /*
         * 辅助存储
         * 数组横坐标表示要使用的货币种数，纵坐标表示要凑成的总金额
         * */
        int[][] pd = new int[n][aim + 1];
        // 使用第n中货币，将兑换值为0的货币方法总数默认设置为1种方法
        for (int i = 0; i < n; i++) {
            pd[i][0] = 1;
        }
        // 计算出只使用第一种货币时的方法数
        for (int i = 1; penny[0] * i <= aim; i++) {
            pd[0][penny[0] * i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= aim; j++) {
                if (j >= penny[i]) {
                    // 可以使用第i种货币
                    pd[i][j] = pd[i - 1][j] + pd[i][j - penny[i]];
                } else {
                    // 无法使用第i种货币的情况
                    pd[i][j] = pd[i - 1][j];
                }
            }
        }
        return pd[n - 1][aim];
    }
}