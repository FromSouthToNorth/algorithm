package vip.hyzt.questions;

/**
 * <h1>2484. 统计回文子序列数目</h1>
 * <p>给你数字字符串 s ，请你返回 s 中长度为 5 的 <strong>回文子序列</strong> 数目。由于答案可能很大，请你将答案对 109 + 7 <strong>取余</strong> 后返回。</p>
 * <p><strong>提示：</strong></p>
 * <ul>
 *     <li>如果一个字符串从前往后和从后往前读相同，那么它是 <strong>回文字符串</strong> 。</li>
 *     <li>子序列是一个字符串中删除若干个字符后，不改变字符顺序，剩余字符构成的字符串。</li>
 * </ul>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：s = "103301"
 *     输出：2
 *     解释：
 *     总共有 6 长度为 5 的子序列："10330" ，"10331" ，"10301" ，"10301" ，"13301" ，"03301" 。
 *     它们中有两个（都是 "10301"）是回文的。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "0000000"
 *     输出：21
 *     解释：所有 21 个长度为 5 的子序列都是 "00000" ，都是回文的。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：s = "9999900000"
 *     输出：2
 *     解释：仅有的两个回文子序列是 "99999" 和 "00000" 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= s.length <= 10<sup>4</sup></li>
 *     <li>s 只包含数字字符。</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-palindromic-subsequences/description/">https://leetcode.cn/problems/count-palindromic-subsequences/description/</a>
 */
public class Topic2484CountPalindromes {

    public int countPalindromes(String s) {
        int mod = 1000000007;
        long[] right = new long[10];
        long[][] r = new long[s.length()][100];
        long count = 0;
        for (int i = s.length() - 1; i > 0; right[s.charAt(i--) - '0']++) {
            r[i - 1] = r[i].clone();
            for (int j = 0; j <= 9; j++) {
                int index = s.charAt(i) - '0' + 10 * j;
                r[i - 1][index] = (r[i - 1][index] + right[j]) % mod;
            }
        }
        for (int i = 0; i <= 99; i++) {
            int[] left = new int[10];
            int[] l = new int[100];
            for (int j = 0; j < s.length(); left[s.charAt(j++) - '0']++) {
                count = (count + l[i] * r[j][i]) % mod;
                for (int k = 0; k <= 9; k++) {
                    int index = s.charAt(j) - '0' + 10 * k;
                    l[index] = (l[index] + left[k]) % mod;
                }
            }
        }
        return (int) count;
    }

}
