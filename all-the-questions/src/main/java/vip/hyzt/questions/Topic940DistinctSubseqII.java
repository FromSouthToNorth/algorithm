package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>940. 不同的子序列 II</h1>
 * <p>给定一个字符串 s，计算 s 的 <strong>不同非空子序列</strong> 的个数。因为结果可能很大，所以返回答案需要对 10^9 + 7 <strong>取余</strong> 。</p>
 * <p>字符串的 <strong>子序列</strong> 是经由原字符串删除一些（也可能不删除）字符但不改变剩余字符相对位置的一个新字符串。</p>
 * <ul>
 *     <li>例如，"ace" 是 "abcde" 的一个子序列，但 "aec" 不是。</li>
 * </ul>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：s = "abc"
 *     输出：7
 *     解释：7 个不同的子序列分别是 "a", "b", "c", "ab", "ac", "bc", 以及 "abc"。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "aba"
 *     输出：6
 *     解释：6 个不同的子序列分别是 "a", "b", "ab", "ba", "aa" 以及 "aba"。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：s = "aaa"
 *     输出：3
 *     解释：3 个不同的子序列分别是 "a", "aa" 以及 "aaa"。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= s.length <= 2000</li>
 *     <li>s 仅由小写英文字母组成</li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * const distinctSubseqII = function(s) {
 *   const mod = 1000000007; // 10^9+7
 *   const { length } = s;
 *   const last = new Array(26).fill(-1), f = new Array(length).fill(1);
 *   for (let i = 0; i < length; i++) {
 *     for (const k of last) {
 *       if (k != -1) {
 *         f[i] = (f[i] + f[k]) % mod;
 *       }
 *     }
 *     last[s.charCodeAt(i) - 97] = i;
 *   }
 *   let res = 0;
 *   for (const j of last) {
 *     if (j != -1) {
 *       res = (res + f[j]) % mod;
 *     }
 *   }
 *   return res;
 * }
 * const arr = ["abc", "aba", "aaa", "accb", "abcdefg"];
 * for (const s of arr) {
 *   console.log("%s %d\n", s, distinctSubseqII(s));
 * }
 * </pre>
 * @see <a href="https://leetcode.cn/problems/distinct-subsequences-ii/description/">https://leetcode.cn/problems/distinct-subsequences-ii/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic940DistinctSubseqII {

    public int distinctSubseqII(String s) {
        final int mod = 1000000007;
        int[] last = new int[26];
        Arrays.fill(last, -1);
        int n = s.length();
        int[] f = new int[n];
        Arrays.fill(f, 1);
        for (int i = 0; i < n; i++) {
            for (int k : last) {
                if (k != -1) {
                    f[i] = (f[i] + f[k]) % mod;
                }
            }
            last[s.charAt(i) - 'a'] = i;
        }

        int res = 0;
        for (int j : last) {
            if (j != -1) {
                res = (res + f[j]) % mod;
            }
        }
        return res;
    }

}
