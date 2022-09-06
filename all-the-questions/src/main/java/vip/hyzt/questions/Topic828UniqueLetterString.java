package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h2>828. 统计子串中的唯一字符</h2>
 * <p>我们定义了一个函数 countUniqueChars(s) 来统计字符串 s 中的唯一字符，并返回唯一字符的个数。</p>
 * <p>例如：s = "LEETCODE" ，则其中 "L", "T","C","O","D" 都是唯一字符，因为它们只出现一次，所以 countUniqueChars(s) = 5 。</p>
 * <p>本题将会给你一个字符串 s ，我们需要返回 countUniqueChars(t) 的总和，其中 t 是 s 的子字符串。输入用例保证返回值为 32 位整数。</p>
 * <p>注意，某些子字符串可能是重复的，但你统计时也必须算上这些重复的子字符串（也就是说，你必须统计 s 的所有子字符串中的唯一字符）。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入: s = "ABC"
 *     输出: 10
 *     解释: 所有可能的子串为："A","B","C","AB","BC" 和 "ABC"。
 *          其中，每一个子串都由独特字符构成。
 *          所以其长度总和为：1 + 1 + 1 + 2 + 2 + 3 = 10
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入: s = "ABA"
 *     输出: 8
 *     解释: 除了 countUniqueChars("ABA") = 1 之外，其余与示例 1 相同。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：s = "LEETCODE"
 *     输出：92
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= s.length <= 10^5</li>
 *     <li>s 只包含大写英文字符</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/count-unique-characters-of-all-substrings-of-a-given-string/">https://leetcode.cn/problems/count-unique-characters-of-all-substrings-of-a-given-string/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic828UniqueLetterString {

    public int uniqueLetterString(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length, result = 0;
        int[] col = new int[n], row = new int[n];
        int[] cnts = new int[26];
        Arrays.fill(cnts, -1);
        for (int i = 0; i < n; i++) {
            int u = chars[i] - 'A';
            col[i] = cnts[u];
            cnts[u] = i;
        }
        Arrays.fill(cnts, n);
        for (int i = n - 1; i >= 0; i--) {
            int u = chars[i] - 'A';
            row[i] = cnts[u];
            cnts[u] = i;
        }
        for (int i = 0; i < n; i++) {
            result += (i - col[i]) * (row[i] - i);
        }
        return result;
    }

}
