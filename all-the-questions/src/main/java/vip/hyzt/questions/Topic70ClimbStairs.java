package vip.hyzt.questions;

/**
 * <h1>70. 爬楼梯</h1>
 * <p>假设你正在爬楼梯。需要 n 阶你才能到达楼顶。</p>
 * <p>每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：n = 2
 *     输出：2
 *     解释：有两种方法可以爬到楼顶。
 *     1. 1 阶 + 1 阶
 *     2. 2 阶
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 3
 *     输出：3
 *     解释：有三种方法可以爬到楼顶。
 *     1. 1 阶 + 1 阶 + 1 阶
 *     2. 1 阶 + 2 阶
 *     3. 2 阶 + 1 阶
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 45</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/climbing-stairs/description/">https://leetcode.cn/problems/climbing-stairs/description/</a>
 */
public class Topic70ClimbStairs {

    public int climbStairs(int n) {
//        if (2 >= n) {
//            return n;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
