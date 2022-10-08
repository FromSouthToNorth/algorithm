package vip.hyzt.questions;

/**
 * <h2>2423. 删除字符使频率相同</h2>
 * <p>给你一个下标从 <strong>0</strong> 开始的字符串 word ，字符串只包含小写英文字母。你需要选择 一个 下标并 <strong>删除</strong> 下标处的字符，使得 word 中剩余每个字母出现 <strong>频率</strong> 相同。</p>
 * <p>如果删除一个字母后，word 中剩余所有字母的出现频率都相同，那么返回 true ，否则返回 false 。</p>
 * <p><strong>注意：</strong></p>
 * <ul>
 *     <li>字母 x 的 <strong>频率</strong> 是这个字母在字符串中出现的次数。</li>
 *     <li>你 <strong>必须</strong> 恰好删除一个字母，不能一个字母都不删除。</li>
 * </ul>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：word = "abcc"
 *     输出：true
 *     解释：选择下标 3 并删除该字母，word 变成 "abc" 且每个字母出现频率都为 1 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：word = "aazz"
 *     输出：false
 *     解释：我们必须删除一个字母，所以要么 "a" 的频率变为 1 且 "z" 的频率为 2 ，要么两个字母频率反过来。所以不可能让剩余所有字母出现频率相同。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>2 <= word.length <= 100</li>
 *     <li>word 只包含小写英文字母。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/remove-letter-to-equalize-frequency">https://leetcode.cn/problems/remove-letter-to-equalize-frequency</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2423EqualFrequency {

    public boolean equalFrequency(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (equalFrequency(word, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean equalFrequency(String s, int k) {
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (i != k) {
                table[s.charAt(i) - 'a']++;
            }
        }
        int pre = -1;
        for (int j : table) {
            if (j > 0) {
                if (pre == -1) {
                    pre = j;
                }
                else {
                    if (j != pre) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
