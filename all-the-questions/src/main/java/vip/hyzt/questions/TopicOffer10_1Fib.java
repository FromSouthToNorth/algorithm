package vip.hyzt.questions;

/**
 * <h1>剑指 Offer 10- I. 斐波那契数列</h1>
 * <p>写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：</p>
 * <pre>
 *     F(0) = 0,   F(1) = 1
 *     F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * </pre>
 * <p>斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。</p>
 * <p>答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：n = 2
 *     输出：1
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 5
 *     输出：5
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>0 <= n <= 100</li>
 * </ul>
 * <h2>递归方法存在大量的重复计算 这里只举例 深度为 3 的递归二叉树</h2>
 * <img src="../../../../resources/img/斐波那契数列递归树.png">
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/description/">https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/description/</a>
 */
public class TopicOffer10_1Fib {

   private static final int MODE = 1000000007;

    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        //////  递归，复杂度随着 输入 n 的规模越大时间复杂度越高，因为存在着重复的计算.
//        return fib(n - 1) + fib(n - 2) % MODE;

//        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2] % MODE;
//        }
//        return dp[n];

//        int a, b = 1, res = 0;
//        for (int i = 2; i <= n; i++) {
//            a = b;
//            b = res;
//            res = (a + b) % MODE;
//        }
//        return res;
        int[][] base = {{1, 1}, {1, 0}};
        int[][] res = fib(base, n - 1);
        return res[0][0];
    }

    private int[][] fib(int[][] base, int power) {
        int[][] res = {{1, 0}, {0, 1}};
        while (power > 0) {
            if ((power & 1) == 1) {
                res = fib(res, base);
            }
            power >>= 1;
            base = fib(base, base);
        }
        return res;
    }

    private int[][] fib(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = (int) (((long) a[i][0] * b[0][j] + (long) a[i][1] * b[1][j]) % MODE);
            }
        }
        return c;
    }

}
