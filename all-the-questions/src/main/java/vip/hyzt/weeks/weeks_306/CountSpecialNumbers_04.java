package vip.hyzt.weeks.weeks_306;

/**
 * <h3>6151. 统计特殊整数</h3>
 * <p>如果一个正整数每一个数位都是 <strong>互不相同</strong> 的，我们称它是 <strong>特殊整数 </strong> 。</p>
 * <p>给你一个 <strong>正</strong> 整数 n ，请你返回区间 [1, n] 之间特殊整数的数目。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：n = 20
 *     输出：19
 *     解释：1 到 20 之间所有整数除了 11 以外都是特殊整数。所以总共有 19 个特殊整数。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *    输入：n = 5
 *    输出：5
 *    解释：1 到 5 所有整数都是特殊整数。
 * </pre>
 * <h4>示例 3：</h4>
 * <pre>
 *     输入：n = 135
 *     输出：110
 *     解释：从 1 到 135 总共有 110 个整数是特殊整数。
 *     不特殊的部分数字为：22 ，114 和 131 。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= n <= 2 * 10<sup>9</sup></li>
 * </ul>
 * @see <a href=""></a>
 * @author hy
 */
public class CountSpecialNumbers_04 {

    public int countSpecialNumbers(int n) {
        return countSpecialNumbers(0, 0, "" + n, new Integer[("" + n).length()][1 << 10]) - 1;
    }

    public int countSpecialNumbers(int index, int mask, String n, Integer[][] dp) {
        mask = mask < 2 ? 0 : mask;
        if (index == dp.length) {
            return 1;
        }
        else if (dp[index][mask] == null) {
            int count = (mask & 1 << n.charAt(index) - '0') > 0 ? 0
                    : countSpecialNumbers(index + 1, mask | 1 << n.charAt(index) - '0', n, dp);
            for (int i = 0; i < n.charAt(index) - '0'; i++) {
                count += (mask & 1 << i) > 0 ? 0 : countSpecialNumbers(index + 1, mask | 1 << i, "9999999999", dp);
            }
            dp[index][mask] = "9999999999".equals(n) ? count : null;
            return count;
        }
        return dp[index][mask];
    }

}
