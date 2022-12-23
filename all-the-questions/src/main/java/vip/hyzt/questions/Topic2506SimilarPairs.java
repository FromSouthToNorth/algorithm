package vip.hyzt.questions;

/**
 * <h1>2506. 统计相似字符串对的数目</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始的字符串数组 words 。</p>
 * <p>如果两个字符串由相同的字符组成，则认为这两个字符串 <strong>相似</strong> 。</p>
 * <ul>
 *     <li>例如，"abca" 和 "cba" 相似，因为它们都由字符 'a'、'b'、'c' 组成。</li>
 *     <li>然而，"abacba" 和 "bcfd" 不相似，因为它们不是相同字符组成的。</li>
 * </ul>
 * <p>请你找出满足字符串 words[i] 和 words[j] 相似的下标对 (i, j) ，并返回下标对的数目，其中 0 <= i < j <= word.length - 1 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：words = ["aba","aabb","abcd","bac","aabc"]
 *     输出：2
 *     解释：共有 2 对满足条件：
 *     - i = 0 且 j = 1 ：words[0] 和 words[1] 只由字符 'a' 和 'b' 组成。
 *     - i = 3 且 j = 4 ：words[3] 和 words[4] 只由字符 'a'、'b' 和 'c' 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：words = ["aabb","ab","ba"]
 *     输出：3
 *     解释：共有 3 对满足条件：
 *     - i = 0 且 j = 1 ：words[0] 和 words[1] 只由字符 'a' 和 'b' 组成。
 *     - i = 0 且 j = 2 ：words[0] 和 words[2] 只由字符 'a' 和 'b' 组成。
 *     - i = 1 且 j = 2 ：words[1] 和 words[2] 只由字符 'a' 和 'b' 组成。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：words = ["nba","cba","dba"]
 *     输出：0
 *     解释：不存在满足条件的下标对，返回 0 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= words.length <= 100</li>
 *     <li>1 <= words[i].length <= 100</li>
 *     <li>words[i] 仅由小写英文字母组成</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-pairs-of-similar-strings/">https://leetcode.cn/problems/count-pairs-of-similar-strings/</a>
 */
public class Topic2506SimilarPairs {

    public int similarPairs(String[] words) {
        int n = words.length, res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (similarPairs(words[i], words[j])) {
                    res++;
                }
            }
        }
        return res;
    }

    private boolean similarPairs(String a, String b) {
        int[] acur= new int[26], bcur = new int[26];
        for (char c : a.toCharArray()) {
            acur[c - 'a'] = 1;
        }
        for (char c : b.toCharArray()) {
            bcur[c - 'a'] = 1;
        }

        for (int i = 0; i < 26; i++) {
            if (acur[i] != bcur[i]) {
                return false;
            }
        }
        return true;
    }

}
