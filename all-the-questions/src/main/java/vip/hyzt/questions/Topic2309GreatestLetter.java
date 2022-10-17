package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>5242. 兼具大小写的最好英文字母</h3>
 * <p>给你一个由英文字母组成的字符串 s ，请你找出并返回 s 中的 最好 英文字母。返回的字母必须为大写形式。如果不存在满足条件的字母，则返回一个空字符串。</p>
 * <p>最好 英文字母的大写和小写形式必须 都 在 s 中出现。</p>
 * <p>英文字母 b 比另一个英文字母 a 更好 的前提是：英文字母表中，b 在 a 之 后 出现。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "lEeTcOdE"
 *     输出："E"
 *     解释：
 *     字母 'E' 是唯一一个大写和小写形式都出现的字母。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s = "arRAzFif"
 *     输出："R"
 *     解释：
 *     字母 'R' 是大写和小写形式都出现的最好英文字母。
 *     注意 'A' 和 'F' 的大写和小写形式也都出现了，但是 'R' 比 'F' 和 'A' 更好。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：s = "AbCdEfGhIjK"
 *     输出：""
 *     解释：
 *     不存在大写和小写形式都出现的字母。
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= s.length <= 1000</li>
 * <li>s 由小写和大写英文字母组成</li>
 * @see <a href="https://leetcode.cn/problems/greatest-english-letter-in-upper-and-lower-case/">https://leetcode.cn/problems/greatest-english-letter-in-upper-and-lower-case/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2309GreatestLetter {

    public static String greatestLetter1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int ans = 0;
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0 && map.containsKey((char) ((int) entry.getKey() + 32))) {
                ans = Math.max((int) entry.getKey(), ans);
            }
        }
        return ans == 0 ? "" : String.valueOf((char) ans);
    }

    public static String greatestLetter2(String s) {
        // 记录出现过的字母
        long mask = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // A 在最低位的
            mask |= (1L << (s.charAt(i) - 'A'));
        }
        // 遍历 Z ~ A
        for (int i = 25; i >= 0; i--) {
            // 同时出现 大小写 字母
            if (((mask >> i & 1) == 1) && ((mask >> (i + 32) & 1) == 1)) {
                return (char) ('A' + i) + "";
            }
        }
        return "";
    }

    public static String greatestLetter3(String s) {
        // 记录出现过的字母
        for (char c = 'Z'; c >= 'A'; c--) {
            if (s.indexOf(c) >= 0 && s.indexOf(c - 'a' + 'A') >= 0) {
                return c+"";
            }
        }
        return "";
    }

}
