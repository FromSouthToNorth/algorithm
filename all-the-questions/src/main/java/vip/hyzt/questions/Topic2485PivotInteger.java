package vip.hyzt.questions;

/**
 * <h1>2485. 找出中枢整数</h1>
 * <p>给你一个正整数 n ，找出满足下述条件的 <strong>中枢整数</strong> x ：</p>
 * <ul>
 *     <li>1 和 x 之间的所有元素之和等于 x 和 n 之间所有元素之和。</li>
 * </ul>
 * <p>返回中枢整数 x 。如果不存在中枢整数，则返回 -1 。题目保证对于给定的输入，至多存在一个中枢整数。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：n = 8
 *     输出：6
 *     解释：6 是中枢整数，因为 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 1
 *     输出：1
 *     解释：1 是中枢整数，因为 1 = 1 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：n = 4
 *     输出：-1
 *     解释：可以证明不存在满足题目要求的整数。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 1000</li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * const pivotInteger = function (n) {
 *     let total = 0, sum = 0;
 *     for (let num = 1; num <= n; num++) {
 *         total += num;
 *     }
 *     for (let num = 1; num <= n; num++) {
 *         if (sum * 2 + num == total) {
 *             return num;
 *         }
 *         sum += num;
 *     }
 *     return -1;
 * }
 * console.log(pivotInteger(8));
 * console.log(pivotInteger(1));
 * console.log(pivotInteger(4));
 * </pre>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-the-pivot-integer/"></a>
 */
public class Topic2485PivotInteger {

    public int pivotInteger(int n) {
        int total = 0, sum = 0;
        for (int num = 1; num <= n; num++) {
            total += num;
        }
        for (int num = 1; num <= n; num++) {
            if (sum * 2 + num == total) {
                return num;
            }
            sum += num;
        }
        return -1;
    }

}
