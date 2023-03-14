package vip.hyzt.questions.wc335;

/**
 * <h1>2585. 获得分数的方法数</h1>
 * <p></p>
 * <p>考试中有 n 种类型的题目。给你一个整数 target 和一个下标从 <strong>0</strong> 开始的二维整数数组 types ，其中 types[i] = [count<sub>i</sub>, marks<sub>i</sub>] 表示第 i 种类型的题目有 count<sub>i</sub> 道，每道题目对应 marks<sub>i</sub> 分。</p>
 * <p>返回你在考试中恰好得到 target 分的方法数。由于答案可能很大，结果需要对 10<sup>9</sup> +7 取余。</p>
 * <p>注意，同类型题目无法区分。</p>
 * <ul>
 *     <li>比如说，如果有 3 道同类型题目，那么解答第 1 和第 2 道题目与解答第 1 和第 3 道题目或者第 2 和第 3 道题目是相同的。</li>
 * </ul>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：target = 6, types = [[6,1],[3,2],[2,3]]
 *     输出：7
 *     解释：要获得 6 分，你可以选择以下七种方法之一：
 *     - 解决 6 道第 0 种类型的题目：1 + 1 + 1 + 1 + 1 + 1 = 6
 *     - 解决 4 道第 0 种类型的题目和 1 道第 1 种类型的题目：1 + 1 + 1 + 1 + 2 = 6
 *     - 解决 2 道第 0 种类型的题目和 2 道第 1 种类型的题目：1 + 1 + 2 + 2 = 6
 *     - 解决 3 道第 0 种类型的题目和 1 道第 2 种类型的题目：1 + 1 + 1 + 3 = 6
 *     - 解决 1 道第 0 种类型的题目、1 道第 1 种类型的题目和 1 道第 2 种类型的题目：1 + 2 + 3 = 6
 *     - 解决 3 道第 1 种类型的题目：2 + 2 + 2 = 6
 *     - 解决 2 道第 2 种类型的题目：3 + 3 = 6
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：target = 5, types = [[50,1],[50,2],[50,5]]
 *     输出：4
 *     解释：要获得 5 分，你可以选择以下四种方法之一：
 *     - 解决 5 道第 0 种类型的题目：1 + 1 + 1 + 1 + 1 = 5
 *     - 解决 3 道第 0 种类型的题目和 1 道第 1 种类型的题目：1 + 1 + 1 + 2 = 5
 *     - 解决 1 道第 0 种类型的题目和 2 道第 1 种类型的题目：1 + 2 + 2 = 5
 *     - 解决 1 道第 2 种类型的题目：5
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：target = 18, types = [[6,1],[3,2],[2,3]]
 *     输出：1
 *     解释：只有回答所有题目才能获得 18 分。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= target <= 1000</li>
 *     <li>n == types.length</li>
 *     <li>1 <= n <= 50</li>
 *     <li>types[i].length == 2</li>
 *     <li>1 <= count<sub>i</sub>, marks<sub>i</sub> <= 50</li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/number-of-ways-to-earn-points/">https://leetcode.cn/problems/number-of-ways-to-earn-points/</a>
 */
public class Topic2585WaysToReachTarget {

    public int waysToReachTarget(int target, int[][] types) {
        int[][] dp = new int[types.length + 1][target + 1];
        for (int i = 0; i <= types.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < types.length; i++) {
            for (int j = 1; j <= target; j++) {
                for (int k = 0; k <= types[i][0] && k * types[i][1] <= j; k++) {
                    dp[i + 1][j] = (dp[i + 1][j] + dp[i][j - k * types[i][1]]) % 1000000007;
                }
            }
        }
        return dp[types.length][target];
    }

}
