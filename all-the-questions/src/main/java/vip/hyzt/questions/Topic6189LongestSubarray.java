package vip.hyzt.questions;

/**
 * <h2>6189. 按位与最大的最长子数组</h2>
 * <p>给你一个长度为 n 的整数数组 nums 。</p>
 * <p>考虑 nums 中进行 <strong>按位与（bitwise AND）</strong>运算得到的值 最大 的 非空 子数组。</p>
 * <ul>
 *     <li>换句话说，令 k 是 nums 任意 子数组执行按位与运算所能得到的最大值。那么，只需要考虑那些执行一次按位与运算后等于 k 的子数组。</li>
 * </ul>
 * <p>返回满足要求的 最长 子数组的长度。</p>
 * <p>数组的按位与就是对数组中的所有数字进行按位与运算。</p>
 * <p><strong>子数组</strong> 是数组中的一个连续元素序列。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [1,2,3,3,2,2]
 *     输出：2
 *     解释：
 *     子数组按位与运算的最大值是 3 。
 *     能得到此结果的最长子数组是 [3,3]，所以返回 2 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [1,2,3,4]
 *     输出：1
 *     解释：
 *     子数组按位与运算的最大值是 4 。
 *     能得到此结果的最长子数组是 [4]，所以返回 1 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>6</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/longest-subarray-with-maximum-bitwise-and/">https://leetcode.cn/problems/longest-subarray-with-maximum-bitwise-and/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6189LongestSubarray {

    public int longestSubarray(int[] nums) {
        int max = 0, result = 0, curr = 0;
        for (int num : nums) {
            if (num == max) {
                result = Math.max(result, ++curr);
            }
            else if (num > max) {
                max = num;
                result = curr = 1;
            }
            else {
                curr = 0;
            }
        }
        return result;
    }

}
