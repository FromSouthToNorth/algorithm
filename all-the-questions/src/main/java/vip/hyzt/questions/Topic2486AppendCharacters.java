package vip.hyzt.questions;

/**
 * <h1>2486. 追加字符以获得子序列</h1>
 * <p>给你两个仅由小写英文字母组成的字符串 s 和 t 。</p>
 * <p>现在需要通过向 s 末尾追加字符的方式使 t 变成 s 的一个 <strong>子序列</strong> ，返回需要追加的最少字符数。</p>
 * <p>子序列是一个可以由其他字符串删除部分（或不删除）字符但不改变剩下字符顺序得到的字符串。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：s = "coaching", t = "coding"
 *     输出：4
 *     解释：向 s 末尾追加字符串 "ding" ，s = "coachingding" 。
 *     现在，t 是 s ("<em><strong>co</strong></em>aching<em><strong>ding</strong></em>") 的一个子序列。
 *     可以证明向 s 末尾追加任何 3 个字符都无法使 t 成为 s 的一个子序列。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "abcde", t = "a"
 *     输出：0
 *     解释：t 已经是 s ("<em><strong>a</strong></em>bcde") 的一个子序列。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：s = "z", t = "abcde"
 *     输出：5
 *     解释：向 s 末尾追加字符串 "abcde" ，s = "zabcde" 。
 *     现在，t 是 s ("z<em><strong>abcde</strong></em>") 的一个子序列。
 *     可以证明向 s 末尾追加任何 4 个字符都无法使 t 成为 s 的一个子序列。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= s.length, t.length <= 10<sup>5</sup></li>
 *     <li>s 和 t 仅由小写英文字母组成</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/append-characters-to-string-to-make-subsequence/description/">https://leetcode.cn/problems/append-characters-to-string-to-make-subsequence/description/</a>
 */
public class Topic2486AppendCharacters {

    public int appendCharacters(String s, String t) {
        int k = 0;
        for (int i = 0; i < s.length() && k < t.length(); i++) {
            k += t.charAt(k) == s.charAt(i) ? 1 : 0;
        }
        return t.length() - k;
    }

}
