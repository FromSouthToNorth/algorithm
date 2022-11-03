package vip.hyzt.questions;

/**
 * <h1>1668. 最大重复子字符串</h1>
 * <p>给你一个字符串 sequence ，如果字符串 word 连续重复 k 次形成的字符串是 sequence 的一个子字符串，那么单词 word 的 <strong>重复值为</strong> k 。单词 word 的 <strong>最大重复值</strong> 是单词 word 在 sequence 中最大的重复值。如果 word 不是 sequence 的子串，那么重复值 k 为 0 。</p>
 * <p>给你一个字符串 sequence 和 word ，请你返回 <strong>最大重复值</strong> k 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：sequence = "ababc", word = "ab"
 *     输出：2
 *     解释："abab" 是 "<strong>abab</strong>c" 的子字符串。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：sequence = "ababc", word = "ba"
 *     输出：1
 *     解释："ba" 是 "a<strong>ba</strong>bc" 的子字符串，但 "baba" 不是 "ababc" 的子字符串。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：sequence = "ababc", word = "ac"
 *     输出：0
 *     解释："ac" 不是 "ababc" 的子字符串。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= sequence.length <= 100</li>
 *     <li>1 <= word.length <= 100</li>
 *     <li>sequence 和 word 都只包含小写英文字母。</li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * const maxRepeating = function(sequence, word) {
 *     let res = 0, n = sequence.length, m = word.length;
 *     for (let i = 0; i < n; i++) {
 *         if (sequence.charAt(i) === word.charAt(0)) {
 *             let index = i, wordIndex = 0, cur = 0;
 *             while (index < n && sequence.charAt(index) === word.charAt(wordIndex)) {
 *                 index++;
 *                 wordIndex++;
 *                 if (wordIndex === m) {
 *                     cur++;
 *                     wordIndex = 0;
 *                 }
 *             }
 *             res = Math.max(res, cur);
 *         }
 *     }
 *     return res;
 * }
 * console.log("%s: %d", "ababc", maxRepeating("ababc", "ab"));
 * console.log("%s: %d", "ababcab", maxRepeating("ababcab", "ab"));
 * console.log("%s: %d", "abcde", maxRepeating("abcde", "adc"));
 * console.log("%s: %d", "aaacaabcaaacaaaaba", maxRepeating("aaacaabcaaacaaaaba", "a"));
 * </pre>
 * @see <a href="https://leetcode.cn/problems/maximum-repeating-substring/">https://leetcode.cn/problems/maximum-repeating-substring/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1558MaxRepeating {

    public int maxRepeating(String sequence, String word) {
        int res = 0, n = sequence.length(), m = word.length();
        for (int i = 0; i < n; i++) {
            if (sequence.charAt(i) == word.charAt(0)) {
                int index = i, wordIndex = 0, cur = 0;
                while (index < n && sequence.charAt(index) == word.charAt(wordIndex)) {
                    index++;
                    wordIndex++;
                    if (wordIndex == m) {
                        cur++;
                        wordIndex = 0;
                    }
                }
                res = Math.max(res, cur);
            }
        }
        return res;
    }

}
