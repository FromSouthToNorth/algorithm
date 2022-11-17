package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * <h1>792. 匹配子序列的单词数</h1>
 * <p>给定字符串 s 和字符串数组 words, 返回 <em>words[i] 中是s的子序列的单词个数 。</em></p>
 * <p>字符串的 <strong>子序列</strong> 是从原始字符串中生成的新字符串，可以从中删去一些字符(可以是none)，而不改变其余字符的相对顺序。</p>
 * <ul>
 *     <li>例如， “ace” 是 “abcde” 的子序列。</li>
 * </ul>
 * <h2>示例 1:</h2>
 * <pre>
 *     输入: s = "abcde", words = ["a","bb","acd","ace"]
 *     输出: 3
 *     解释: 有三个是 s 的子序列的单词: "a", "acd", "ace"。
 * </pre>
 * <h2>示例 2:</h2>
 * <pre>
 *     输入: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
 *     输出: 2
 * </pre>
 * <h2>提示:</h2>
 * <ul>
 *     <li>1 <= s.length <= 5 * 10<sup>4</sup></li>
 *     <li>1 <= words.length <= 5000</li>
 *     <li>1 <= words[i].length <= 50</li>
 *     <li>words[i]和 s 都只由小写字母组成。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/number-of-matching-subsequences/">https://leetcode.cn/problems/number-of-matching-subsequences/</a>
 */
public class Topic792NumMatchingSubseq {

    public int numMatchingSubseq(String s, String[] words) {
        Queue<int[]>[] queues = new Queue[26];
        for (int i = 0; i < 26; i++) {
            queues[i] = new ArrayDeque<>();
        }
        for (int i = 0; i < words.length; i++) {
            queues[words[i].charAt(0) - 'a'].offer(new int[] {i ,0});
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int size = queues[c - 'a'].size();
            while (size > 0) {
                int[] poll = queues[c - 'a'].poll();
                if (poll[1] == words[poll[0]].length() - 1) {
                    res++;
                }
                else {
                    poll[1]++;
                    queues[words[poll[0]].charAt(poll[1]) - 'a'].offer(poll);
                }
                size--;
            }
        }
        return res;
    }

}
