package vip.hyzt.questions;

/**
 * <h3>1281. 整数的各位积和之差</h3>
 * <p>给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：n = 234
 *     输出：15
 *     解释：
 *     各位数之积 = 2 * 3 * 4 = 24
 *     各位数之和 = 2 + 3 + 4 = 9
 *     结果 = 24 - 9 = 15
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：n = 4421
 *     输出：21
 *     解释：
 *     各位数之积 = 4 * 4 * 2 * 1 = 32
 *     各位数之和 = 4 + 4 + 2 + 1 = 11
 *     结果 = 32 - 11 = 21
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= n <= 10^5</li>
 * @see <a href="https://leetcode.cn/problems/subtract-the-product-and-sum-of-digits-of-an-integer/">https://leetcode.cn/problems/subtract-the-product-and-sum-of-digits-of-an-integer/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1281SubtractProductAndSum {

    public static int subtractProductAndSum(int n) {
        int p = 1, sum = 0;
        for (; n > 0; n /= 10) {
            int d = n % 10;
            sum += d;
            p *= d;
        }
        return p - sum;
    }

}
