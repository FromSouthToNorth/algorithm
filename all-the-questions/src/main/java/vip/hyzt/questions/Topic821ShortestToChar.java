package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>821.字符的最短距离</h3>
 * <p>给你一个字符串 s 和一个字符 c ，且 c 是 s 中出现过的字符。</p>
 * <p>返回一个整数数组 answer ，其中 answer.length == s.length 且 answer[i] 是 s 中从下标 i 到离它 最近 的字符 c 的 距离 。</p>
 * <p>两个下标i 和 j 之间的 距离 为 abs(i - j) ，其中 abs 是绝对值函数。</p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>s = "loveleetcode", c = "e"
 *     <strong>输出：</strong>[3,2,1,0,1,0,0,1,2,2,1,0]
 *     <strong>解释：</strong>
 *     字符 'e' 出现在下标 3、5、6 和 11 处（下标从 0 开始计数）。
 *     距下标 0 最近的 'e' 出现在下标 3 ，所以距离为 abs(0 - 3) = 3 。
 *     距下标 1 最近的 'e' 出现在下标 3 ，所以距离为 abs(1 - 3) = 2 。
 *     对于下标 4 ，出现在下标 3 和下标 5 处的 'e' 都离它最近，但距离是一样的 abs(4 - 3) == abs(4 - 5) = 1 。
 *     距下标 8 最近的 'e' 出现在下标 6 ，所以距离为 abs(8 - 6) = 2 。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>s = "aaab", c = "b"
 *     <strong>输出：</strong>[3,2,1,0]
 * </pre>
 * <p><b>提示：</b></p>
 * <li>1 <= s.length <= 104</li>
 * <li>s[i] 和 c 均为小写英文字母</li>
 * <li>题目数据保证 c 在 s 中至少出现一次</li>
 * @see <a href="https://leetcode-cn.com/problems/shortest-distance-to-a-character">链接：https://leetcode-cn.com/problems/shortest-distance-to-a-character</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic821ShortestToChar {

    /**
     * @param s "abcdefcd"
     * @param c 'c'
     * @return
     * [a, b, c, d, e, f, c, d]
     *  ↑  ↑  ↑  ↑  ↑  ↑  ↑  ↑
     *  2  1  0  1  2  1  0  1
     */
    public static int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] ans = new int[length];
        Arrays.fill(ans, length + 1);
        for (int i = 0, j = -1; i < length; i++) {
            if (s.charAt(i) == c) {
                j = i;
            }
            if (j != -1) {
                ans[i] = i - j;
            }
        }

        for (int i = length - 1, j = -1; i>= 0; i--) {
            if (s.charAt(i) == c) {
                j = i;
            }
            if (j != -1) {
                ans[i] = Math.min(ans[i], j - i);
            }
        }
        return ans;
    }

}
