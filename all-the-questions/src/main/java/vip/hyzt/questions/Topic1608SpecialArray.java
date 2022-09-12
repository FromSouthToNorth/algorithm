package vip.hyzt.questions;

/**
 * <h2>1608. 特殊数组的特征值</h2>
 * <p>给你一个非负整数数组 nums 。如果存在一个数 x ，使得 nums 中恰好有 x 个元素 <strong>大于或者等于</strong> x ，那么就称 nums 是一个 <strong>特殊数组</strong> ，而 x 是该数组的 <strong>特征值</strong> 。</p>
 * <p>注意： x <strong>不必</strong> 是 nums 的中的元素。</p>
 * <p>如果数组 nums 是一个 <strong>特殊数组</strong> ，请返回它的特征值 x 。否则，返回 -1 。可以证明的是，如果 nums 是特殊数组，那么其特征值 x 是 <strong>唯一的</strong> 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [3,5]
 *     输出：2
 *     解释：有 2 个元素（3 和 5）大于或等于 2 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [0,0]
 *     输出：-1
 *     解释：没有满足题目要求的特殊数组，故而也不存在特征值 x 。
 *     如果 x = 0，应该有 0 个元素 >= x，但实际有 2 个。
 *     如果 x = 1，应该有 1 个元素 >= x，但实际有 0 个。
 *     如果 x = 2，应该有 2 个元素 >= x，但实际有 0 个。
 *     x 不能取更大的值，因为 nums 中只有两个元素。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：nums = [0,4,3,0,4]
 *     输出：3
 *     解释：有 3 个元素大于或等于 3 。
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入：nums = [3,6,7,7,0]
 *     输出：-1
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= nums.length <= 100</li>
 *     <li>0 <= nums[i] <= 1000</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/special-array-with-x-elements-greater-than-or-equal-x">https://leetcode.cn/problems/special-array-with-x-elements-greater-than-or-equal-x</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1608SpecialArray {

    public int specialArray(int[] nums) {
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
        }
        return -1;
    }

}
