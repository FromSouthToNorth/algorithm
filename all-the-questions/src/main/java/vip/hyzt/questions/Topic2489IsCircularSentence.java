package vip.hyzt.questions;

/**
 * <h1>2489. 回环句</h1>
 * <p><strong>句子</strong> 是由单个空格分隔的一组单词，且不含前导或尾随空格。</p>
 * <ul>
 *     <li>例如，"Hello World"、"HELLO"、"hello world hello world" 都是符合要求的句子。</li>
 * </ul>
 * <p>单词 <strong>仅</strong> 由大写和小写英文字母组成。且大写和小写字母会视作不同字符。</p>
 * <p>如果句子满足下述全部条件，则认为它是一个 <strong>回环句</strong> ：</p>
 * <ul>
 *     <li>单词的最后一个字符和下一个单词的第一个字符相等。</li>
 *     <li>最后一个单词的最后一个字符和第一个单词的第一个字符相等。</li>
 * </ul>
 * <p>例如，"leetcode exercises sound delightful"、"eetcode"、"leetcode eats soul" 都是回环句。然而，"Leetcode is cool"、"happy Leetcode"、"Leetcode" 和 "I like Leetcode" 都 <strong></strong> 是回环句。</p>
 * <p>给你一个字符串 sentence ，请你判断它是不是一个回环句。如果是，返回 true ；否则，返回 false 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：sentence = "leetcode exercises sound delightful"
 *     输出：true
 *     解释：句子中的单词是 ["leetcode", "exercises", "sound", "delightful"] 。
 *     - leetcod<strong><em>e</em></strong> 的最后一个字符和 <strong><em>e</em></strong> xercises 的第一个字符相等。
 *     - exercise<strong><em>s</em></strong> 的最后一个字符和 <strong><em>s</em></strong>ound 的第一个字符相等。
 *     - soun<strong><em>d</em></strong> 的最后一个字符和 <strong><em>d</em></strong>elightful 的第一个字符相等。
 *     - delightfu<strong><em>l</em></strong> 的最后一个字符和 <strong><em>l</em></strong>eetcode 的第一个字符相等。
 * 这个句子是回环句。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：sentence = "eetcode"
 *     输出：true
 *     解释：句子中的单词是 ["eetcode"] 。
 *     - eetcod<strong><em>e</em></strong> 的最后一个字符和 <strong><em>e</em></strong>etcode 的第一个字符相等。
 *     这个句子是回环句。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：sentence = "Leetcode is cool"
 *     输出：false
 *     解释：句子中的单词是 ["Leetcode", "is", "cool"] 。
 *     - Leetcode 的最后一个字符和 is 的第一个字符 不 相等。
 *     这个句子 <strong>不</strong> 是回环句。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= sentence.length <= 500</li>
 *     <li>sentence 仅由大小写英文字母和空格组成</li>
 *     <li>sentence 中的单词由单个空格进行分隔</li>
 *     <li>不含任何前导或尾随空格</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/circular-sentence/">https://leetcode.cn/problems/circular-sentence/</a>
 */
public class Topic2489IsCircularSentence {

    public boolean isCircularSentence(String sentence) {
//        String[] s = sentence.split(" ");
//        if (s.length == 1) {
//            return s[0].charAt(0) == s[0].charAt(s[0].length() - 1);
//        }
//
//        if (s[0].charAt(0) != s[s.length - 1].charAt(s[s.length - 1].length() - 1)) {
//            return false;
//        }
//
//        for (int i = 1; i < s.length; i++) {
//            char start = s[i - 1].charAt(s[i - 1].length() - 1);
//            char end = s[i].charAt(0);
//            if (end != start) {
//                return false;
//            }
//        }
//        return true;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                return false;
            }
        }

        return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
    }

}
