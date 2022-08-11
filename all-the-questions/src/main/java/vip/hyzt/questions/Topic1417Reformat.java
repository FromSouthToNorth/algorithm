package vip.hyzt.questions;

/**
 * <h3>1417. 重新格式化字符串</h3>
 * <p>给你一个混合了数字和字母的字符串 s，其中的字母均为小写英文字母。</p>
 * <p>请你将该字符串重新格式化，使得任意两个相邻字符的类型都不同。也就是说，字母后面应该跟着数字，而数字后面应该跟着字母。</p>
 * <p>请你返回 重新格式化后 的字符串；如果无法按要求重新格式化，则返回一个 空字符串 。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：s = "a0b1c2"
 *     输出："0a1b2c"
 *     解释："0a1b2c" 中任意两个相邻字符的类型都不同。 "a0b1c2", "0a1b2c", "0c2a1b" 也是满足题目要求的答案。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：s = "leetcode"
 *     输出：""
 *     解释："leetcode" 中只有字母，所以无法满足重新格式化的条件。
 * </pre>
 * <h4>示例 3：</h4>
 * <pre>
 *     输入：s = "1229857369"
 *     输出：""
 *     解释："1229857369" 中只有数字，所以无法满足重新格式化的条件。
 * </pre>
 * <h4>示例 4：</h4>
 * <pre>
 *     输入：s = "covid2019"
 *     输出："c2o0v1i9d"
 * </pre>
 * <h4>示例 5：</h4>
 * <pre>
 *     输入：s = "ab123"
 *     输出："1a2b3"
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= s.length <= 500</li>
 *     <li>s 仅由小写英文字母和/或数字组成。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/reformat-the-string/">https://leetcode.cn/problems/reformat-the-string/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1417Reformat {

    public String reformat(String s) {
        StringBuilder a = new StringBuilder(), b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a') {
                a.append(c);
            }
            else {
                b.append(c);
            }
        }
        int n = a.length(), m = b.length(), total = n + m;
        if (Math.abs(n - m) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() != total) {
            if (n > m) {
                sb.append(a.charAt(--n));
            }
            else if (n < m) {
                sb.append(b.charAt(--m));
            }
            else {
                if (!sb.isEmpty() && sb.charAt(sb.length() - 1) >= 'a') {
                    sb.append(b.charAt(--m));
                }
                else {
                    sb.append(a.charAt(--n));
                }
            }
        }
        return sb.toString();
    }

}
