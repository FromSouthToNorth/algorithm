package vip.hyzt.questions.wc311;

import java.util.HashMap;

/**
 * <h2>2416. 字符串的前缀分数和</h2>
 * <p>给你一个长度为 n 的数组 words ，该数组由 非空 字符串组成。</p>
 * <p>定义字符串 word 的 <strong>分数</strong> 等于以 word 作为 <strong>前缀</strong> 的 words[i] 的数目。</p>
 * <ul>
 *     <li>例如，如果 words = ["a", "ab", "abc", "cab"] ，那么 "ab" 的分数是 2 ，因为 "ab" 是 "ab" 和 "abc" 的一个前缀。</li>
 * </ul>
 * <p>返回一个长度为 n 的数组 answer ，其中 answer[i] 是 words[i] 的每个非空前缀的分数 <strong>总和</strong> 。</p>
 * <p><strong>注意：</strong>字符串视作它自身的一个前缀。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：words = ["abc","ab","bc","b"]
 *     输出：[5,4,3,2]
 *     解释：对应每个字符串的答案如下：
 *     - "abc" 有 3 个前缀："a"、"ab" 和 "abc" 。
 *     - 2 个字符串的前缀为 "a" ，2 个字符串的前缀为 "ab" ，1 个字符串的前缀为 "abc" 。
 *     总计 answer[0] = 2 + 2 + 1 = 5 。
 *     - "ab" 有 2 个前缀："a" 和 "ab" 。
 *     - 2 个字符串的前缀为 "a" ，2 个字符串的前缀为 "ab" 。
 *     总计 answer[1] = 2 + 2 = 4 。
 *     - "bc" 有 2 个前缀："b" 和 "bc" 。
 *     - 2 个字符串的前缀为 "b" ，1 个字符串的前缀为 "bc" 。
 *     总计 answer[2] = 2 + 1 = 3 。
 *     - "b" 有 1 个前缀："b"。
 *     - 2 个字符串的前缀为 "b" 。
 *     总计 answer[3] = 2 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：words = ["abcd"]
 *     输出：[4]
 *     解释：
 *     "abcd" 有 4 个前缀 "a"、"ab"、"abc" 和 "abcd"。
 *     每个前缀的分数都是 1 ，总计 answer[0] = 1 + 1 + 1 + 1 = 4 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= words.length <= 1000</li>
 *     <li>1 <= words[i].length <= 1000</li>
 *     <li>words[i] 由小写英文字母组成</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/sum-of-prefix-scores-of-strings">https://leetcode.cn/problems/sum-of-prefix-scores-of-strings</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2416SumPrefixScores {

    public int[] sumPrefixScores(String[] words) {
        Trie root = new Trie();
        for (String word : words) {
            Trie node = root;
            for (char c : word.toCharArray()) {
                (node = node.computeIfAbsent(c, t -> new Trie())).count++;
            }
        }
        int n = words.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            Trie node = root;
            for (char c : words[i].toCharArray()) {
                result[i] += (node = node.get(c)).count;
            }
        }
        return result;
    }

    private class Trie extends HashMap<Character, Trie> {
        private int count;
    }

}
