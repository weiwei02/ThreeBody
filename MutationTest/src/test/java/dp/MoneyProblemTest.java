package dp;

import org.junit.Test;

import static org.junit.Assert.*;

/** 动态规划-零钱问题
 * @author Wang Weiwei / email : wangweiwei12@jd.com
 * @version 17.8.0
 * @since 2019-03-27
 */
public class MoneyProblemTest {

    @Test
    public void countWays() {
        MoneyProblem problem = new MoneyProblem();
        int[] penny = {1, 2, 4};
        // 求
        int count = problem.countWays(penny, 3, 3);
        int count2 = problem.countWays(penny, 4, 4);
        assertEquals(count, 2);
        assertEquals(count, 4);
    }
}