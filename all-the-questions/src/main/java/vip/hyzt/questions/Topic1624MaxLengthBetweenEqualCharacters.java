package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h2>1624. 两个相同字符之间的最长子字符串</h2>
 * <p>给你一个字符串 s，请你返回 <strong>两个相同字符之间的最长子字符串的长度</strong> ，计算长度时不含这两个字符。如果不存在这样的子字符串，返回 -1 。</p>
 * <p><strong>子字符串</strong> 是字符串中的一个连续字符序列。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "aa"
 *     输出：0
 *     解释：最优的子字符串是两个 'a' 之间的空子字符串。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s = "abca"
 *     输出：2
 *     解释：最优的子字符串是 "bc" 。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：s = "cbzxy"
 *     输出：-1
 *     解释：s 中不存在出现出现两次的字符，所以返回 -1 。
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入：s = "cabbac"
 *     输出：4
 *     解释：最优的子字符串是 "abba" ，其他的非最优解包括 "bb" 和 "" 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= s.length <= 300</li>
 *     <li>s 只含小写英文字母</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/largest-substring-between-two-equal-characters/">https://leetcode.cn/problems/largest-substring-between-two-equal-characters/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1624MaxLengthBetweenEqualCharacters {

    public int maxLengthBetweenEqualCharacters(String s) {
        int[] chars = new int[26];
        Arrays.fill(chars, -1);
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (chars[c] < 0) {
                chars[c] = i;
            }
            else {
                max = Math.max(max, i - chars[c] - 1);
            }
        }
        return max;
    }

}
