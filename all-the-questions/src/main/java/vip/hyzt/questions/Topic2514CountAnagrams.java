package vip.hyzt.questions;

import java.math.BigInteger;

/**
 * <h1>2514. 统计同位异构字符串数目</h1>
 * <p>给你一个字符串 s ，它包含一个或者多个单词。单词之间用单个空格 ' ' 隔开。</p>
 * <p>如果字符串 t 中第 i 个单词是 s 中第 i 个单词的一个 排列 ，那么我们称字符串 t 是字符串 s 的同位异构字符串。</p>
 * <ul>
 *     <li>比方说，"acb dfe" 是 "abc def" 的同位异构字符串，但是 "def cab" 和 "adc bef" 不是。</li>
 * </ul>
 * <p>请你返回 s 的同位异构字符串的数目，由于答案可能很大，请你将它对 10<sup>9</sup> + 7 <strong>取余</strong> 后返回。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：s = "too hot"
 *     输出：18
 *     解释：输入字符串的一些同位异构字符串为 "too hot" ，"oot hot" ，"oto toh" ，"too toh" 以及 "too oht" 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "aa"
 *     输出：1
 *     解释：输入字符串只有一个同位异构字符串。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= s.length <= 10<sup>5</sup></li>
 *     <li>s 只包含小写英文字母和空格 ' ' 。</li>
 *     <li>相邻单词之间由单个空格隔开。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-anagrams/">https://leetcode.cn/problems/count-anagrams/</a>
 */
public class Topic2514CountAnagrams {

    private static final int MOD = 1000000007;

    public int countAnagrams(String s) {
        long[] dp = new long[s.length() + 1];
        long p = 1;
        dp[0]  = 1;
        for (int i = 1; i <= s.length(); i++) {
            dp[i] = dp[i - 1] * i % MOD;
        }
        for (String t : s.split(" ")) {
            int[] count = new int[26];
            for (char c : t.toCharArray()) {
                count[c - 'a']++;
            }
            p = p * dp[t.length()] % MOD;
            for (int i : count) {
                p = p * BigInteger.valueOf(dp[i]).modInverse(BigInteger.valueOf(MOD)).intValue() % MOD;
            }
        }
        return (int) p;
    }

}
