package vip.hyzt.questions;

/**
 * <h1>2573. 找出对应 LCP 矩阵的字符串</h1>
 * <p></p>
 * <p>对任一由 n 个小写英文字母组成的字符串 word ，我们可以定义一个 n x n 的矩阵，并满足：</p>
 * <ul>
 *     <li>lcp[i][j] 等于子字符串 word[i,...,n-1] 和 word[j,...,n-1] 之间的最长公共前缀的长度。</li>
 * </ul>
 * <p>给你一个 n x n 的矩阵 lcp 。返回与 lcp 对应的、按字典序最小的字符串 word 。如果不存在这样的字符串，则返回空字符串。</p>
 * <p>对于长度相同的两个字符串 a 和 b ，如果在 a 和 b 不同的第一个位置，字符串 a 的字母在字母表中出现的顺序先于 b 中的对应字母，则认为字符串 a 按字典序比字符串 b 小。例如，"aabd" 在字典上小于 "aaca" ，因为二者不同的第一位置是第三个字母，而 'b' 先于 'c' 出现。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：lcp = [[4,0,2,0],[0,3,0,1],[2,0,2,0],[0,1,0,1]]
 *     输出："abab"
 *     解释：lcp 对应由两个交替字母组成的任意 4 字母字符串，字典序最小的是 "abab" 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：lcp = [[4,3,2,1],[3,3,2,1],[2,2,2,1],[1,1,1,1]]
 *     输出："aaaa"
 *     解释：lcp 对应只有一个不同字母的任意 4 字母字符串，字典序最小的是 "aaaa" 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：lcp = [[4,3,2,1],[3,3,2,1],[2,2,2,1],[1,1,1,3]]
 *     输出：""
 *     解释：lcp[3][3] 无法等于 3 ，因为 word[3,...,3] 仅由单个字母组成；因此，不存在答案。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n == lcp.length == lcp[i].length <= 1000</li>
 *     <li>0 <= lcp[i][j] <= n</li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-the-string-with-lcp/">https://leetcode.cn/problems/find-the-string-with-lcp/</a>
 */
public class Topic2573FindTheString {

    public String findTheString(int[][] lcp) {
        char[] result = new char[lcp.length];
        char c = 'a';
        for (int i = 0; i < lcp.length; i++) {
            if (lcp[i][i] != lcp.length - i || result[i] == 0 && (result[i] = c++) > 'z') {
                return "";
            }
            for (int j = i + 1; j < lcp.length; j++) {
                if (lcp[i][j] != lcp[j][i]) {
                    return "";
                }
                else if (lcp[i][j] > 0) {
                    if (lcp[i][j] > lcp.length - j
                            || result[j] != 0 && result[j] != result[i]) {
                        return "";
                    }
                    result[j] = result[i];
                }
            }
        }
        for (int i = 0; i < lcp.length; i++) {
            int[] z = z(String.valueOf(result, i, lcp.length - i));
            for (int j = i + 1; j < lcp.length; j++) {
                if (lcp[i][j] != z[j - i]) {
                    return "";
                }
            }
        }
        return new String(result);
    }

    private static int[] z(String s) {
        int[] z = new int[s.length()];
        for (int i = 1, x = 0, y = 0; i < s.length(); i++) {
            for (z[i] = Math.max(0, Math.min(z[i - x], y - i + 1)); i + z[i] < s.length()
                    && s.charAt(z[i]) == s.charAt(i + z[i]); y = i + z[x = i]++) {
            }
        }
        return z;
    }

}
