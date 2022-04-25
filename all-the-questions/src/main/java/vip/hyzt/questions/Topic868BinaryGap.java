package vip.hyzt.questions;

/**
 * <h3>868.二进制间距</h3>
 * <p>给定一个整数 `n`，找到并返回 `n` 的二进制表示中两个 <b>相邻</b> 1之间的 <b>最长距离</b>。如果不存在两个相邻的 1，返回 0。</p>
 * <p>如果只有 `0` 和 `1` 分隔开（可能不存在 `0`），则认为这两个 1 彼此 <b>相邻</b>。两个 `1` 之间的距离是它们的二进制表示中位置的绝对差。例如，“1001” 中的两个 `1` 的距离为 3。</p>
 * <br>
 * <b>示例 1：</b>
 * <pre>
 *     <strong>输入：</strong>n = 22
 *     <strong>输出：</strong>2
 *     <strong>解释：</strong>
 *     22 的二进制是 "10110"。
 *     在 22 的二进制中，有三个 1，组成两个相邻的 1。
 *     第一对相邻的 1 中，两个之间的距离为 2。
 *     第二对相邻的 1 中，两个之间的距离为 1。
 *     答案取两个距离之中最大，也就是 2。
 * </pre>
 * <b>示例 2：</b>
 * <pre>
 *     <strong>输入：</strong>n = 8
 *     <strong>输出：</strong>0
 *     <strong>解释：</strong>
 *     8 的二进制是 "1000"。
 *     在 8 的二进制表示中没有相邻的两个 1，所以返回 0。
 * </pre>
 * <b>示例 3：</b>
 * <pre>
 *     <strong>输入：</strong>n = 5
 *     <strong>输出：</strong>2
 *     <strong>解释：</strong>
 *     5 的二进制是 "0101"。
 * </pre>
 * <br>
 * <b>提示</b>
 * <li>1 <= n <= 10<sup>9</sup></li>
 * @see <a href="https://leetcode-cn.com/problems/goat-latin">链接：https://leetcode-cn.com/problems/binary-gap</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic868BinaryGap {

    public static int binaryGap(int n) {
        int ans = 0;
        for (int i = 31, j = -1; i >= 0; i--) {
            if (((n >> i) & 1) == 1) {
                if (j != -1) ans = Math.max(ans, j - i);
                j = i;
            }
        }
        return ans;
    }

}
