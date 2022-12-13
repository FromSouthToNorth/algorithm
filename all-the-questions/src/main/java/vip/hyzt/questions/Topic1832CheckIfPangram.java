package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>1832. 判断句子是否为全字母句</h1>
 * <p><strong>全字母句</strong> 指包含英语字母表中每个字母至少一次的句子。</p>
 * <p>给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 <strong>全字母句</strong> 。</p>
 * <p>如果是，返回 true ；否则，返回 false 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：sentence = "thequickbrownfoxjumpsoverthelazydog"
 *     输出：true
 *     解释：sentence 包含英语字母表中每个字母至少一次。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：sentence = "leetcode"
 *     输出：false
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= sentence.length <= 1000</li>
 *     <li>sentence 由小写英语字母组成</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/check-if-the-sentence-is-pangram/">https://leetcode.cn/problems/check-if-the-sentence-is-pangram/</a>
 */
public class Topic1832CheckIfPangram {

    public boolean checkIfPangram(String sentence) {
        boolean[] cur = new boolean[26];
        Arrays.fill(cur, false);
        for (char c : sentence.toCharArray()) {
            cur[c - 'a'] = true;
        }
        for (boolean b : cur) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

}
