package vip.hyzt.questions.wc319;

/**
 * <h1>2472. 不重叠回文子字符串的最大数目</h1>
 * <p>给你一个字符串 s 和一个 <strong>正</strong> 整数 k 。</p>
 * <p>从字符串 s 中选出一组满足下述条件且 <strong>不重叠</strong> 的子字符串：</p>
 * <ul>
 *     <li>每个子字符串的长度 <strong>至少</strong> 为 k 。</li>
 *     <li>每个子字符串是一个 <strong>回文串</strong> 。</li>
 * </ul>
 * <p>返回最优方案中能选择的子字符串的 <strong>最大</strong> 数目。</p>
 * <p><strong>子字符串</strong> 是字符串中一个连续的字符序列。</p>
 * <p></p>
 * <h2>示例 1 ：</h2>
 * <pre>
 *     输入：s = "abaccdbbd", k = 3
 *     输出：2
 *     解释：可以选择 s = "<em><strong>aba</strong></em>cc<em><strong>dbbd</strong></em>" 中斜体加粗的子字符串。"aba" 和 "dbbd" 都是回文，且长度至少为 k = 3 。
 *     可以证明，无法选出两个以上的有效子字符串。
 * </pre>
 * <h2>示例 2 ：</h2>
 * <pre>
 *     输入：s = "adbcda", k = 2
 *     输出：0
 *     解释：字符串中不存在长度至少为 2 的回文子字符串。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= k <= s.length <= 2000</li>
 *     <li>s 仅由小写英文字母组成</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-non-overlapping-palindrome-substrings/">https://leetcode.cn/problems/maximum-number-of-non-overlapping-palindrome-substrings/</a>
 */
public class Topic2472MaxPalindromes {

    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int[] index = new int[n], dp = new int[n + 1];

        for (int i = 0; i < 2 * n; i++) {

            for (int left = i / 2, right = left + i % 2;
                 left >= 0 && right < n && s.charAt(left) == s.charAt(right);
                 left--, right++) {

                index[right] = Math.max(index[right], right - left + 1 < k ? 0 : left + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            dp[i + 1] = Math.max(dp[i], index[i] > 0 ? 1 + dp[index[i] - 1] : 0);
        }

        return dp[n];
    }

}
