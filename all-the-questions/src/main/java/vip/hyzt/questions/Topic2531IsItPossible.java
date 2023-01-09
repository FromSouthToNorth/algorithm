package vip.hyzt.questions;

import java.util.HashMap;

/**
 * <h1>2531. 使字符串总不同字符的数目相等</h1>
 * <p>给你两个下标从 <strong>0</strong> 开始的字符串 word1 和 word2 。</p>
 * <p>一次 <strong>移动</strong> 由以下两个步骤组成：</p>
 * <ul>
 *     <li>选中两个下标 i 和 j ，分别满足 0 <= i < word1.length 和 0 <= j < word2.length ，</li>
 *     <li>交换 word1[i] 和 word2[j] 。</li>
 * </ul>
 * <p>如果可以通过 <strong>恰好一次</strong> 移动，使 word1 和 word2 中不同字符的数目相等，则返回 true ；否则，返回 false 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：word1 = "ac", word2 = "b"
 *     输出：false
 *     解释：交换任何一组下标都会导致第一个字符串中有 2 个不同的字符，而在第二个字符串中只有 1 个不同字符。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：word1 = "abcc", word2 = "aab"
 *     输出：true
 *     解释：交换第一个字符串的下标 2 和第二个字符串的下标 0 。之后得到 word1 = "abac" 和 word2 = "cab" ，各有 3 个不同字符。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：word1 = "abcde", word2 = "fghij"
 *     输出：true
 *     解释：无论交换哪一组下标，两个字符串中都会有 5 个不同字符。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= word1.length, word2.length <= 10<sup>5</sup></li>
 *     <li>word1 和 word2 仅由小写英文字母组成。</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/make-number-of-distinct-characters-equal/">https://leetcode.cn/problems/make-number-of-distinct-characters-equal/</a>
 */
public class Topic2531IsItPossible {


    public boolean isItPossible(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>(),
                map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (char c1 : map1.keySet()) {
            for (char c2 : map2.keySet()) {
                if (c1 == c2 ? map1.size() == map2.size()
                        : map1.size() - (map1.get(c1) > 1 ? 0 : 1) + (map1.containsKey(c2) ? 0 : 1) == map2.size()
                        - (map2.get(c2) > 1 ? 0 : 1) + (map2.containsKey(c1) ? 0 : 1)) {
                    return true;
                }
            }
        }
        return false;
    }

}
