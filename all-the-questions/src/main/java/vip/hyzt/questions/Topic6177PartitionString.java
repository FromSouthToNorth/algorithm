package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h2>6177. 子字符串的最优划分</h2>
 * <p>给你一个字符串 s ，请你将该字符串划分成一个或多个 <strong>子字符串</strong> ，并满足每个子字符串中的字符都是 <strong>唯一</strong> 的。也就是说，在单个子字符串中，字母的出现次数都不超过 <strong>一次</strong> 。</p>
 * <p>满足题目要求的情况下，返回 <strong>最少</strong> 需要划分多少个子字符串。</p>
 * <p>注意，划分后，原字符串中的每个字符都应该恰好属于一个子字符串。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "abacaba"
 *     输出：4
 *     解释：
 *     两种可行的划分方法分别是 ("a","ba","cab","a") 和 ("ab","a","ca","ba") 。
 *     可以证明最少需要划分 4 个子字符串。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s = "ssssss"
 *     输出：6
 *     解释：
 *     只存在一种可行的划分方法 ("s","s","s","s","s","s") 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= s.length <= 10<sup>5</sup></li>
 *     <li>s 仅由小写英文字母组成</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/optimal-partition-of-string">https://leetcode.cn/problems/optimal-partition-of-string</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6177PartitionString {

    public int partitionString(String s) {
        int count = 1;
        int[] visited = new int[26];
        for (char c : s.toCharArray()) {
            int code = c - 'a';
            if (visited[code] == 1) {
                count++;
                visited = new int[26];
            }
            visited[code] = 1;
        }
        return count;
    }

}
