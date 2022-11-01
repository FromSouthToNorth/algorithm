package vip.hyzt.questions;

/**
 * <h1>44. 通配符匹配</h1>
 * <p>给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。</p>
 * <pre>
 *     '?' 可以匹配任何单个字符。
 *     '*' 可以匹配任意字符串（包括空字符串）。
 * </pre>
 * <p>两个字符串 <strong>完全匹配</strong> 才算匹配成功。</p>
 * <p><strong>说明:</strong></p>
 * <ul>
 *     <li>s 可能为空，且只包含从 a-z 的小写字母。</li>
 *     <li>p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。</li>
 * </ul>
 * <h2>示例 1:</h2>
 * <pre>
 *     输入:
 *     s = "aa"
 *     p = "a"
 *     输出: false
 *     解释: "a" 无法匹配 "aa" 整个字符串。
 * </pre>
 * <h2>示例 2:</h2>
 * <pre>
 *     输入:
 *     s = "aa"
 *     p = "*"
 *     输出: true
 *     解释: '*' 可以匹配任意字符串。
 * </pre>
 * <h2>示例 3:</h2>
 * <pre>
 *     输入:
 *     s = "cb"
 *     p = "?a"
 *     输出: false
 *     解释: '?' 可以匹配 'c', 但第二个 'a' 无法匹配 'b'。
 * </pre>
 * <h2>示例 4:</h2>
 * <pre>
 *     输入:
 *     s = "adceb"
 *     p = "*a*b"
 *     输出: true
 *     解释: 第一个 '*' 可以匹配空字符串, 第二个 '*' 可以匹配字符串 "dce".
 * </pre>
 * <h2>示例 5:</h2>
 * <pre>
 *     输入:
 *     s = "acdcb"
 *     p = "a*c?b"
 *     输出: false
 * </pre>
 * @see <a href="https://leetcode.cn/problems/wildcard-matching/description/">https://leetcode.cn/problems/wildcard-matching/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic44IsMatch {

    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = true;
            }
            else {
                break;
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                }
                else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }

}
