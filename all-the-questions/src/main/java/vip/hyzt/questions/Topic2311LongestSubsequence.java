package vip.hyzt.questions;

import java.math.BigInteger;

/**
 * <h3>2311. 小于等于 K 的最长二进制子序列</h3>
 * <p>给你一个二进制字符串 s 和一个正整数 k 。</p>
 * <p>请你返回 s 的 最长 子序列，且该子序列对应的 二进制 数字小于等于 k 。</p>
 * <p>注意：</p>
 * <ul>
 *     <li>子序列可以有 前导 0 。</li>
 *     <li>空字符串视为 0 。</li>
 *     <li>子序列 是指从一个字符串中删除零个或者多个字符后，不改变顺序得到的剩余字符序列。</li>
 * </ul>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "1001010", k = 5
 *     输出：5
 *     解释：s 中小于等于 5 的最长子序列是 "00010" ，对应的十进制数字是 2 。
 *     注意 "00100" 和 "00101" 也是可行的最长子序列，十进制分别对应 4 和 5 。
 *     最长子序列的长度为 5 ，所以返回 5 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s = "00101001", k = 1
 *     输出：6
 *     解释："000001" 是 s 中小于等于 1 的最长子序列，对应的十进制数字是 1 。
 *     最长子序列的长度为 6 ，所以返回 6 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= s.length <= 1000</li>
 *     <li>s[i] 要么是 '0' ，要么是 '1' 。</li>
 *     <li>1 <= k <= 10<sup>9</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/longest-binary-subsequence-less-than-or-equal-to-k/">https://leetcode.cn/problems/longest-binary-subsequence-less-than-or-equal-to-k/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2311LongestSubsequence {

    public static int longestSubsequence(String s, int k) {
        int i = s.length(), j = s.length();
        for (BigInteger n = new BigInteger(s, 2); n.compareTo(BigInteger.valueOf(k)) > 0; i--) {
            while (!n.testBit(j)) {
                j--;
            }
            n = n.clearBit(j);
        }
        return i;
    }

}
