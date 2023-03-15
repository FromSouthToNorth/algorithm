package vip.hyzt.questions.wc336;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <h1>2586. 统计范围内的元音字符串数</h1>
 * <p></p>
 * <p>给你一个下标从 <strong>0</strong> 开始的字符串数组 words 和两个整数：left 和 right 。</p>
 * <p>如果字符串以元音字母开头并以元音字母结尾，那么该字符串就是一个 元音字符串 ，其中元音字母是 'a'、'e'、'i'、'o'、'u' 。</p>
 * <p>返回 words[i] 是元音字符串的数目，其中 i 在闭区间 [left, right] 内。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：words = ["are","amy","u"], left = 0, right = 2
 *     输出：2
 *     解释：
 *     - "are" 是一个元音字符串，因为它以 'a' 开头并以 'e' 结尾。
 *     - "amy" 不是元音字符串，因为它没有以元音字母结尾。
 *     - "u" 是一个元音字符串，因为它以 'u' 开头并以 'u' 结尾。
 *     在上述范围中的元音字符串数目为 2 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
 *     输出：3
 *     解释：
 *     - "aeo" 是一个元音字符串，因为它以 'a' 开头并以 'o' 结尾。
 *     - "mu" 不是元音字符串，因为它没有以元音字母开头。
 *     - "ooo" 是一个元音字符串，因为它以 'o' 开头并以 'o' 结尾。
 *     - "artro" 是一个元音字符串，因为它以 'a' 开头并以 'o' 结尾。
 *     在上述范围中的元音字符串数目为 3 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= words.length <= 1000</li>
 *     <li>1 <= words[i].length <= 10</li>
 *     <li>words[i] 仅由小写英文字母组成</li>
 *     <li>0 <= left <= right < words.length</li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-vowel-strings-in-range/">https://leetcode.cn/problems/count-the-number-of-vowel-strings-in-range/</a>
 */
public class Topic2586VowelStrings {

    public int vowelStrings(String[] words, int left, int right) {
        return (int) Arrays.stream(words, left, right + 1)
                .filter(t -> t.matches("[aeiou](.*[aeiou])?"))
                .count();
    }

}
