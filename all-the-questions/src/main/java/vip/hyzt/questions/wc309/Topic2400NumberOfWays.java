package vip.hyzt.questions.wc309;

import java.math.BigInteger;

/**
 * <h2>6168. 恰好移动 k 步到达某一位置的方法数目</h2>
 * <p>给你两个 <strong>正</strong> 整数 startPos 和 endPos 。最初，你站在 <strong>无限</strong> 数轴上位置 startPos 处。在一步移动中，你可以向左或者向右移动一个位置。</p>
 * <p>给你一个正整数 k ，返回从 startPos 出发、恰好 移动 k 步并到达 endPos 的 不同 方法数目。由于答案可能会很大，返回对 10<sup>9</sup> + 7 取余 的结果。</p>
 * <p>如果所执行移动的顺序不完全相同，则认为两种方法不同。</p>
 * <p><strong>注意：</strong>数轴包含负整数。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：startPos = 1, endPos = 2, k = 3
 *     输出：3
 *     解释：存在 3 种从 1 到 2 且恰好移动 3 步的方法：
 *     - 1 -> 2 -> 3 -> 2.
 *     - 1 -> 2 -> 1 -> 2.
 *     - 1 -> 0 -> 1 -> 2.
 *     可以证明不存在其他方法，所以返回 3 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：startPos = 2, endPos = 5, k = 10
 *     输出：0
 *     解释：不存在从 2 到 5 且恰好移动 10 步的方法。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= startPos, endPos, k <= 1000</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/number-of-ways-to-reach-a-position-after-exactly-k-steps">https://leetcode.cn/problems/number-of-ways-to-reach-a-position-after-exactly-k-steps</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2400NumberOfWays {

    int mod = 1000000007;

    public int numberOfWays(int startPos, int endPos, int k) {
        int index = k + Math.abs(startPos - endPos);
        if (index % 2 > 0 || Math.abs(startPos - endPos) > k) {
            return 0;
        }
        long[] dp = new long[k + Math.abs(startPos - endPos) + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = i * dp[i - 1] % mod;
        }
        return (int) (dp[k]
                * BigInteger.valueOf(dp[index / 2])
                .modInverse(BigInteger.valueOf(mod)).longValue()
                % mod * BigInteger.valueOf(dp[(k - Math.abs(startPos - endPos)) / 2])
                .modInverse(BigInteger.valueOf(mod)).longValue()
                % mod);
    }

}
