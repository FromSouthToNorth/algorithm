package vip.hyzt.questions;

/**
 * <h1>1684. 统计一致字符串的数目</h1>
 * <p>给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 <strong>一致字符串</strong> 。</p>
 * <p>请你返回 words 数组中 <strong>一致字符串</strong> 的数目。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 *     输出：2
 *     解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 *     输出：7
 *     解释：所有字符串都是一致的。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 *     输出：4
 *     解释：字符串 "cc"，"acd"，"ac" 和 "d" 是一致字符串。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= words.length <= 10<sup>4</sup></li>
 *     <li>1 <= allowed.length <= 26</li>
 *     <li>1 <= words[i].length <= 10</li>
 *     <li>allowed 中的字符 互不相同 。</li>
 *     <li>words[i] 和 allowed 只包含小写英文字母。</li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * const countConsistentStrings = function (allowed, words) {
 *     let res = 0;
 *     const cur = new Array(26).fill(0);
 *     for (let i = 0; i < allowed.length; i++) {
 *         cur[allowed.charCodeAt(i) - 97]++;
 *     }
 *     out: for (let word of words) {
 *         for (let i = 0; i < word.length; i++) {
 *             if (cur[word.charCodeAt(i) - 97] === 0) {
 *                 continue out;
 *             }
 *         }
 *         res++;
 *     }
 *     return res;
 * }
 * console.log(countConsistentStrings("ab", ["ad", "bd", "aaab", "baa", "badab"]));
 * console.log(countConsistentStrings("abc", ["a", "b", "c", "ab", "ac", "bc", "abc"]));
 * console.log(countConsistentStrings("cad", ["cc", "acd", "b", "ba", "bac", "bad", "ac", "d"]));
 * </pre>
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-consistent-strings/">https://leetcode.cn/problems/count-the-number-of-consistent-strings/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1684CountConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
//        out: for (String word : words) {
//            for (char c : word.toCharArray()) {
//                if (!allowed.contains(c + "")) {
//                    continue out;
//                }
//            }
//            res++;
//        }
        int[] cur = new int[26];
        for (char c : allowed.toCharArray()) {
            cur[c - 'a']++;
        }
        out: for (String word : words) {
            for (char c : word.toCharArray()) {
                if (cur[c - 'a'] == 0) {
                    continue out;
                }
            }
            res++;
        }
        return res;
    }

}
