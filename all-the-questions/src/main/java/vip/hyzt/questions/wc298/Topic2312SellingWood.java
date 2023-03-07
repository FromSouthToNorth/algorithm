package vip.hyzt.questions.wc298;

/**
 * <h3>2312. 卖木头块</h3>
 * <p>给你两个整数 m 和 n ，分别表示一块矩形木块的高和宽。同时给你一个二维整数数组 prices，其中 prices[i] = [hi, wi, price<sub>i</sub>] 表示你可以以 price<sub>i</sub> 元的价格卖一块高为 h<sub>i</sub> 宽为 w<sub>i</sub> 的矩形木块。</p>
 * <p>每一次操作中，你必须按下述方式之一执行切割操作，以得到两块更小的矩形木块：</p>
 * <ul>
 *     <li>沿垂直方向按高度 完全 切割木块，或</li>
 *     <li>沿水平方向按宽度 完全 切割木块</li>
 * </ul>
 * <p>在将一块木块切成若干小木块后，你可以根据 prices 卖木块。你可以卖多块同样尺寸的木块。你不需要将所有小木块都卖出去。你 不能 旋转切好后木块的高和宽。</p>
 * <p>请你返回切割一块大小为 m x n 的木块后，能得到的 最多 钱数。</p>
 * <p>注意你可以切割木块任意次。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/04/27/ex1.png" >
 * <pre>
 *     输入：m = 3, n = 5, prices = [[1,4,2],[2,2,7],[2,1,3]]
 *     输出：19
 *     解释：上图展示了一个可行的方案。包括：
 *     - 2 块 2 x 2 的小木块，售出 2 * 7 = 14 元。
 *     - 1 块 2 x 1 的小木块，售出 1 * 3 = 3 元。
 *     - 1 块 1 x 4 的小木块，售出 1 * 2 = 2 元。
 *     总共售出 14 + 3 + 2 = 19 元。
 *     19 元是最多能得到的钱数。
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/04/27/ex2new.png" >
 * <pre>
 *     输入：m = 4, n = 6, prices = [[3,2,10],[1,4,2],[4,1,3]]
 *     输出：32
 *     解释：上图展示了一个可行的方案。包括：
 *     - 3 块 3 x 2 的小木块，售出 3 * 10 = 30 元。
 *     - 1 块 1 x 4 的小木块，售出 1 * 2 = 2 元。
 *     总共售出 30 + 2 = 32 元。
 *     32 元是最多能得到的钱数。
 *     注意我们不能旋转 1 x 4 的木块来得到 4 x 1 的木块。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= m, n <= 200</li>
 *     <li>1 <= prices.length <= 2 * 10<sup>4</sup></li>
 *     <li>prices[i].length == 3</li>
 *     <li>1 <= h<sub>i</sub> <= m</li>
 *     <li>1 <= w<sub>i</sub> <= m</li>
 *     <li>1 <= price<sub>i</sub> <= 10<sup>6</sup></li>
 *     <li>所有 (h<sub>i</sub>, w<sub>i</sub>) 互不相同 。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/selling-pieces-of-wood/">https://leetcode.cn/problems/selling-pieces-of-wood/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2312SellingWood {

    public static long sellingWood(int m, int n, int[][] prices) {
        long[][] map = new long[m + 1][n + 1], dp = new long[m + 1][n + 1];
        for (int[] price : prices) {
            map[price[0]][price[1]] = price[2];
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = map[i][j];
                for (int k = 1; k < i; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[k][j] + dp[i - k][j]);
                }
                for (int k = 1; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[i][j - k]);
                }
            }
        }
        return dp[m][n];
    }

}
