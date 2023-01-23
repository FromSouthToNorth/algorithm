package vip.hyzt.questions;

/**
 * <h1>2535. 数组元素和与数字和的绝对差</h1>
 * <p></p>
 * <p>给你一个正整数数组 nums 。</p>
 * <ul>
 *     <li><strong>元素和</strong> 是 nums 中的所有元素相加求和。</li>
 *     <li><strong>数字和</strong> 是 nums 中每一个元素的每一数位（重复数位需多次求和）相加求和。</li>
 * </ul>
 * <p>返回 <strong>元素和</strong> 与 <strong>数字和</strong> 的绝对差。</p>
 * <p><strong>注意：</strong>两个整数 x 和 y 的绝对差定义为 |x - y| 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,15,6,3]
 *     输出：9
 *     解释：
 *     nums 的元素和是 1 + 15 + 6 + 3 = 25 。
 *     nums 的数字和是 1 + 1 + 5 + 6 + 3 = 16 。
 *     元素和与数字和的绝对差是 |25 - 16| = 9 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,2,3,4]
 *     输出：0
 *     解释：
 *     nums 的元素和是 1 + 2 + 3 + 4 = 10 。
 *     nums 的数字和是 1 + 2 + 3 + 4 = 10 。
 *     元素和与数字和的绝对差是 |10 - 10| = 0 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 2000</li>
 *     <li>1 <= nums[i] <= 2000</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/">https://leetcode.cn/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/</a>
 */
public class Topic2535DifferenceOfSum {

    public int differenceOfSum(int[] nums) {
        int x = 0, y = 0;
        for (int num : nums) {
            for (x += num; num > 0; num /= 10) {
                y += num % 10;
            }
        }
        return x - y;
    }

}
