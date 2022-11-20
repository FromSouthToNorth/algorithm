package vip.hyzt.questions;

/**
 * <h1>6244. 完美分割的方案数</h1>
 * <p>给你一个字符串 s ，每个字符是数字 '1' 到 '9' ，再给你两个整数 k 和 minLength 。</p>
 * <p>如果对 s 的分割满足以下条件，那么我们认为它是一个 <strong>完美</strong> 分割：</p>
 * <ul>
 *     <li>s 被分成 k 段互不相交的子字符串。</li>
 *     <li>每个子字符串长度都 <strong>至少</strong> 为 minLength 。</li>
 *     <li>每个子字符串的第一个字符都是一个 <strong>质数</strong> 数字，最后一个字符都是一个 <strong>非质数</strong> 数字。质数数字为 '2' ，'3' ，'5' 和 '7' ，剩下的都是非质数数字。</li>
 * </ul>
 * <p>一个 <strong>子字符串</strong> 是字符串中一段连续字符串序列。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：s = "23542185131", k = 3, minLength = 2
 *     输出：3
 *     解释：存在 3 种完美分割方案：
 *     "2354 | 218 | 5131"
 *     "2354 | 21851 | 31"
 *     "2354218 | 51 | 31"
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "23542185131", k = 3, minLength = 3
 *     输出：1
 *     解释：存在一种完美分割方案："2354 | 218 | 5131" 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：s = "3312958", k = 3, minLength = 1
 *     输出：1
 *     解释：存在一种完美分割方案："331 | 29 | 58" 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= k, minLength <= s.length <= 1000</li>
 *     <li>s 每个字符都为数字 '1' 到 '9' 之一。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/number-of-beautiful-partitions/">https://leetcode.cn/problems/number-of-beautiful-partitions/</a>
 */
public class Topic2476BeautifulPartitions {

    public int beautifulPartitions(String s, int k, int minLength) {
        int n = s.length();
        int[][] dp = new int[k + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int count = 0;
            for (int j = minLength - 1; j < n; j++) {
                count = (count + ((j < minLength || "2357".indexOf(s.charAt(j - minLength)) < 0)
                        && "2357".indexOf(s.charAt(j - minLength + 1)) >= 0 ? dp[i - 1][j - minLength + 1] : 0))
                        % 1000000007;

                dp[i][j + 1] = "2357".indexOf(s.charAt(j)) < 0 ? count : 0;
            }
        }
        return dp[k][n];
    }

}
