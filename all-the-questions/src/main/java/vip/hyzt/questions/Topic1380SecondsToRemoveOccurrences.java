package vip.hyzt.questions;

/**
 * <h3>2380. 二进制字符串重新安排顺序需要的时间</h3>
 * <p>给你一个二进制字符串 s 。在一秒之中，<strong>所有</strong> 子字符串 "01" <strong>同时</strong> 被替换成 "10" 。这个过程持续进行到没有 "01" 存在。</p>
 * <p>请你返回完成这个过程所需要的秒数。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：s = "0110101"
 *     输出：4
 *     解释：
 *     一秒后，s 变成 "1011010" 。
 *     再过 1 秒后，s 变成 "1101100" 。
 *     第三秒过后，s 变成 "1110100" 。
 *     第四秒后，s 变成 "1111000" 。
 *     此时没有 "01" 存在，整个过程花费 4 秒。
 *     所以我们返回 4 。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：s = "11100"
 *     输出：0
 *     解释：
 *     s 中没有 "01" 存在，整个过程花费 0 秒。
 *     所以我们返回 0 。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= s.length <= 1000</li>
 *     <li>s[i] 要么是 '0' ，要么是 '1' 。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/time-needed-to-rearrange-a-binary-string">https://leetcode.cn/problems/time-needed-to-rearrange-a-binary-string</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1380SecondsToRemoveOccurrences {

    public int secondsToRemoveOccurrences(String s) {
        int count = 0;
        for (; s.contains("01"); count++) {
            s = s.replace("01", "10");
        }
        return count;
    }

}
