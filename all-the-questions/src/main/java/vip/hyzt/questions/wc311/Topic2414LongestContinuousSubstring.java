package vip.hyzt.questions.wc311;

/**
 * <h2>2414. 最长的字母序连续子字符串的长度</h2>
 * <p><strong>字母序连续字符串</strong> 是由字母表中连续字母组成的字符串。换句话说，字符串 "abcdefghijklmnopqrstuvwxyz" 的任意子字符串都是 <strong>字母序连续字符串</strong> 。</p>
 * <ul>
 *     <li>例如，"abc" 是一个字母序连续字符串，而 "acb" 和 "za" 不是。</li>
 * </ul>
 * <p>给你一个仅由小写英文字母组成的字符串 s ，返回其 最长 的 字母序连续子字符串 的长度。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "abacaba"
 *     输出：2
 *     解释：共有 4 个不同的字母序连续子字符串 "a"、"b"、"c" 和 "ab" 。
 *     "ab" 是最长的字母序连续子字符串。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s = "abcde"
 *     输出：5
 *     解释："abcde" 是最长的字母序连续子字符串。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= s.length <= 10<sup>5</sup></li>
 *     <li>s 由小写英文字母组成</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/length-of-the-longest-alphabetical-continuous-substring">https://leetcode.cn/problems/length-of-the-longest-alphabetical-continuous-substring</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2414LongestContinuousSubstring {

    public int longestContinuousSubstring(String s) {
        int max = 1, curr = 1, n = s.length();
        for (int i = 1; i < n; i++) {
            max = Math.max(max, curr = s.charAt(i) - s.charAt(i - 1) == 1 ? curr + 1 : 1);
        }
        return max;
    }

}
