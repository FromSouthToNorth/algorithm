package vip.hyzt.questions;

/**
 * <h2>面试题 01.02. 判定是否互为字符重排</h2>
 * <p>给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入: s1 = "abc", s2 = "bca"
 *     输出: true
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入: s1 = "abc", s2 = "bad"
 *     输出: false
 * </pre>
 * <h3>说明：</h3>
 * <ul>
 *     <li>0 <= len(s1) <= 100</li>
 *     <li>0 <= len(s2) <= 100</li>
 * </ul>
 * <h3>js</h3>
 * <p><a href="https://tool.oschina.net/commons?type=4">ASCII</a></p>
 * <pre>
 * function checkPermutation(s1, s2) {
 *   let table = new Array(26);
 *   table.fill(0);
 *   let n = s1.length;
 *   if (n != s2.length) {
 *     return false;
 *   }
 *   for (let i = 0; i < n; i++) {
 *     table[s1.charCodeAt(i) - 97]++;
 *     table[s2.charCodeAt(i) - 97]--;
 *   }
 *   for (const i of table) {
 *     if (i != 0) {
 *       return false;
 *     }
 *   }
 *   return true;
 * }
 * let tests = [["abc", "cba"],["sdfg","scfg"],["wer","we"]];
 * for (const str of tests) {
 *   console.log("%s: %b\n",str, checkPermutation(str[0], str[1]));
 * }
 * </pre>
 * @see <a href="https://leetcode.cn/problems/check-permutation-lcci/">https://leetcode.cn/problems/check-permutation-lcci/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class TopicInterview01_02CheckPermutation {

    public boolean checkPermutation(String s1, String s2) {
        int[] count = new int[26];
        int n = s1.length();
        if (n != s2.length()) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
