package vip.hyzt.weeks.weeks_305;

/**
 * <h3>2370. 最长理想子序列</h3>
 * <p>给你一个由小写字母组成的字符串 s ，和一个整数 k 。如果满足下述条件，则可以将字符串 t 视作是 <strong>理想字符串</strong> ：</p>
 * <ul>
 *     <li>t 是字符串 s 的一个子序列。</li>
 *     <li>t 中每两个 相邻 字母在字母表中位次的绝对差值小于或等于 k 。</li>
 * </ul>
 * <p>返回 <strong>最长</strong> 理想字符串的长度。</p>
 * <p>字符串的子序列同样是一个字符串，并且子序列还满足：可以经由其他字符串删除某些字符（也可以不删除）但不改变剩余字符的顺序得到。</p>
 * <p><strong>注意：</strong>字母表顺序不会循环。例如，'a' 和 'z' 在字母表中位次的绝对差值是 25 ，而不是 1 。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：s = "acfgbd", k = 2
 *     输出：4
 *     解释：最长理想字符串是 "acbd" 。该字符串长度为 4 ，所以返回 4 。
 *     注意 "acfgbd" 不是理想字符串，因为 'c' 和 'f' 的字母表位次差值为 3 。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：s = "abcd", k = 3
 *     输出：4
 *     解释：最长理想字符串是 "abcd" ，该字符串长度为 4 ，所以返回 4 。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= s.length <= 10<sup>5</sup></li>
 *     <li>0 <= k <= 25</li>
 *     <li>s 由小写英文字母组成</li>
 * </ul>
 * @author hy
 */
public class Topic2370LongestIdealString_04 {

    public int longestIdealString(String s, int k) {
        int count[] = new int[26], max = 0;
        for (char c : s.toCharArray()) {
            for (int i = Math.max('a', c - k) - 'a'; i <= Math.min('z', c + k) - 'a'; i++) {
                count[c - 'a'] = Math.max(count[c - 'a'], count[i]);
            }
            max = Math.max(max, ++count[c - 'a']);
        }
        return max;
    }

}
