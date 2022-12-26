package vip.hyzt.questions;

import java.math.BigInteger;

/**
 * <h1>2513. 最小化两个数组中的最大值</h1>
 * <p>给你两个数组 arr1 和 arr2 ，它们一开始都是空的。你需要往它们中添加正整数，使它们满足以下条件：</p>
 * <ul>
 *     <li>arr1 包含 uniqueCnt1 个 <strong>互不相同</strong> 的正整数，每个整数都 <strong>不能</strong> 被 divisor1 <strong>整除</strong> 。</li>
 *     <li>arr2 包含 uniqueCnt2 个 <strong>互不相同</strong> 的正整数，每个整数都 <strong>不能</strong> 被 divisor2 <strong>整除</strong> 。</li>
 *     <li>arr1 和 arr2 中的元素 <strong>互不相同</strong> 。</li>
 * </ul>
 * <p>给你 divisor1 ，divisor2 ，uniqueCnt1 和 uniqueCnt2 ，请你返回两个数组中 <strong>最大元素</strong> 的 <strong>最小值</strong> 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：divisor1 = 2, divisor2 = 7, uniqueCnt1 = 1, uniqueCnt2 = 3
 *     输出：4
 *     解释：
 *     我们可以把前 4 个自然数划分到 arr1 和 arr2 中。
 *     arr1 = [1] 和 arr2 = [2,3,4] 。
 *     可以看出两个数组都满足条件。
 *     最大值是 4 ，所以返回 4
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：divisor1 = 3, divisor2 = 5, uniqueCnt1 = 2, uniqueCnt2 = 1
 *     输出：3
 *     解释：
 *     arr1 = [1,2] 和 arr2 = [3] 满足所有条件。
 *     最大值是 3 ，所以返回 3 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：divisor1 = 2, divisor2 = 4, uniqueCnt1 = 8, uniqueCnt2 = 2
 *     输出：15
 *     解释：
 *     最终数组为 arr1 = [1,3,5,7,9,11,13,15] 和 arr2 = [2,6] 。
 *     上述方案是满足所有条件的最优解。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= divisor1, divisor2 <= 10<sup>5</sup></li>
 *     <li>1 <= uniqueCnt1, uniqueCnt2 < 10<sup>9</sup></li>
 *     <li>2 <= uniqueCnt1 + uniqueCnt2 <= 10<sup>9</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimize-the-maximum-of-two-arrays/description/">https://leetcode.cn/problems/minimize-the-maximum-of-two-arrays/description/</a>
 */
public class Topic2513MinimizeSet {

    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long left = 1, right = 2000000000;
        while (left < right) {
            long mid = (left + right) / 2,
                    count = mid / ((long) divisor1 * divisor2 / BigInteger.valueOf(divisor1).gcd(BigInteger.valueOf(divisor2)).intValue());

            if (mid - mid / divisor1 - mid / divisor2 + count < Math.max(0, uniqueCnt1 - mid / divisor2 + count) +
                    Math.max(0, uniqueCnt2 - mid / divisor1 + count)) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return (int) left;
    }

}
