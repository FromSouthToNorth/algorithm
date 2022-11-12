package vip.hyzt.questions;

/**
 * <h1>790. 多米诺和托米诺平铺</h1>
 * <p>有两种形状的瓷砖：一种是 2 x 1 的多米诺形，另一种是形如 "L" 的托米诺形。两种形状都可以旋转。</p>
 * <img src="https://assets.leetcode.com/uploads/2021/07/15/lc-domino.jpg">
 * <p>给定整数 n ，返回可以平铺 2 x n 的面板的方法的数量。返回对 10<sup>9</sup> + 7 <strong>取模</strong> 的值。</p>
 * <p>平铺指的是每个正方形都必须有瓷砖覆盖。两个平铺不同，当且仅当面板上有四个方向上的相邻单元中的两个，使得恰好有一个平铺有一个瓷砖占据两个正方形。</p>
 * <h2>示例 1:</h2>
 * <img src="https://assets.leetcode.com/uploads/2021/07/15/lc-domino1.jpg">
 * <pre>
 *     输入: n = 3
 *     输出: 5
 *     解释: 五种不同的方法如上所示。
 * </pre>
 * <h2>示例 2:</h2>
 * <pre>
 *     输入: n = 1
 *     输出: 1
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 1000</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/domino-and-tromino-tiling/">https://leetcode.cn/problems/domino-and-tromino-tiling/</a>
 */
public class Topic790NumTilings {

    private static final int MOD = 1000000007;

    public int numTilings(int n) {
        int[][] dp = new int[n + 1][4];
        dp[0][3] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][3];
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
            dp[i][3] = (((dp[i - 1][0] + dp[i - 1][1]) % MOD + dp[i - 1][2]) % MOD + dp[i - 1][3]) % MOD;
        }
        return dp[n][3];

    }

}
