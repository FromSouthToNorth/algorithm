package vip.hyzt.questions;

/**
 * <h1>1662. 检查两个字符串数组是否相等</h1>
 * <p>给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。</p>
 * <p><strong>数组表示的字符串</strong> 是由数组中的所有元素 <strong>按顺序</strong> 连接形成的字符串。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：word1 = ["ab", "c"], word2 = ["a", "bc"]
 *     输出：true
 *     解释：
 *     word1 表示的字符串为 "ab" + "c" -> "abc"
 *     word2 表示的字符串为 "a" + "bc" -> "abc"
 *     两个字符串相同，返回 true
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：word1 = ["a", "cb"], word2 = ["ab", "c"]
 *     输出：false
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 *     输出：true
 * </pre>
 * <h2></h2>
 * <ul>
 *     <li>1 <= word1.length, word2.length <= 10<sup>3</sup></li>
 *     <li>1 <= word1[i].length, word2[i].length <= 10<sup>3</sup></li>
 *     <li>1 <= sum(word1[i].length), sum(word2[i].length) <= 10<sup>3</sup></li>
 *     <li>word1[i] 和 word2[i] 由小写字母组成</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/check-if-two-string-arrays-are-equivalent/">https://leetcode.cn/problems/check-if-two-string-arrays-are-equivalent/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1662ArrayStringsAreEqual {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n = word1.length, m = word2.length;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < n || i < m; i++) {
            if (i < n) {
                s1.append(word1[i]);
            }
            if (i < m) {
                s2.append(word2[i]);
            }
        }
        return s1.toString().equals(s2.toString());
    }

}
