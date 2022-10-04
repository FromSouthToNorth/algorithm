package vip.hyzt.questions;

/**
 * <h2>921. 使括号有效的最少添加</h2>
 * <p>只有满足下面几点之一，括号字符串才是有效的：</p>
 * <ul>
 *     <li>它是一个空字符串，或者</li>
 *     <li>它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者</li>
 *     <li>它可以被写作 (A)，其中 A 是有效字符串。</li>
 * </ul>
 * <p>给定一个括号字符串 s ，移动N次，你就可以在字符串的任何位置插入一个括号。</p>
 * <ul>
 *     <li>例如，如果 s = "()))" ，你可以插入一个开始括号为 "(()))" 或结束括号为 "())))" </li>
 * </ul>
 * <p>返回 <em>为使结果字符串 s 有效而必须添加的最少括号数。</em></p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "())"
 *     输出：1
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s = "((("
 *     输出：3
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= s.length <= 1000</li>
 *     <li>s 只包含 '(' 和 ')' 字符。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid/">https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic921MinAddToMakeValid {

    public int minAddToMakeValid(String s) {
        int score = 0, ans = 0;
        for (char c : s.toCharArray()) {
            score += c == '(' ? 1 : -1;
            if (score < 0) {
                score = 0; ans++;
            }
        }
        return ans + score;
    }

}
