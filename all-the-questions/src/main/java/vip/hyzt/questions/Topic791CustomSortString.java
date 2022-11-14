package vip.hyzt.questions;

/**
 * <h1>791. 自定义字符串排序</h1>
 * <p>给定两个字符串 order 和 s 。order 的所有单词都是 <strong>唯一</strong> 的，并且以前按照一些自定义的顺序排序。</p>
 * <p>对 s 的字符进行置换，使其与排序的 order 相匹配。更具体地说，如果在 order 中的字符 x 出现字符 y 之前，那么在排列后的字符串中， x 也应该出现在 y 之前。</p>
 * <p>返回 满足这个性质的 s 的任意排列 。</p>
 * <h2>示例 1:</h2>
 * <pre>
 *     输入: order = "cba", s = "abcd"
 *     输出: "cbad"
 *     解释:
 *     “a”、“b”、“c”是按顺序出现的，所以“a”、“b”、“c”的顺序应该是“c”、“b”、“a”。
 *     因为“d”不是按顺序出现的，所以它可以在返回的字符串中的任何位置。“dcba”、“cdba”、“cbda”也是有效的输出。
 * </pre>
 * <h2>示例 2:</h2>
 * <pre>
 *     输入: order = "cbafg", s = "abcd"
 *     输出: "cbad"
 * </pre>
 * <h2>提示:</h2>
 * <ul>
 *     <li>1 <= order.length <= 26</li>
 *     <li>1 <= s.length <= 200</li>
 *     <li>order 和 s 由小写英文字母组成</li>
 *     <li>order 中的所有字符都 <strong>不同</strong></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic791CustomSortString {

    public String customSortString(String order, String s) {
        int[] cur = new int[26];
        for (char c : s.toCharArray()) {
            cur[c - 'a']++;
        }
        StringBuilder res = new StringBuilder();
        for (char c : order.toCharArray()) {
            while (cur[c - 'a']-- > 0) {
                res.append(c);
            }
        }
        for (int i = 0; i < cur.length; i++) {
            while (cur[i]-- > 0) {
                res.append((char) (i + 'a'));
            }
        }
        return res.toString();
    }

}
