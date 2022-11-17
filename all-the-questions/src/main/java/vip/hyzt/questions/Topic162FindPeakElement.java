package vip.hyzt.questions;

/**
 * <h1>162. 寻找峰值</h1>
 * <p>峰值元素是指其值严格大于左右相邻值的元素。</p>
 * <p>给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 <strong>任何一个峰值</strong> 所在位置即可。</p>
 * <p>你可以假设 nums[-1] = nums[n] = -∞ 。</p>
 * <p>你必须实现时间复杂度为 O(log n) 的算法来解决此问题。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,2,3,1]
 *     输出：2
 *     解释：3 是峰值元素，你的函数应该返回其索引 2。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,2,1,3,5,6,4]
 *     输出：1 或 5
 *     解释：你的函数可以返回索引 1，其峰值元素为 2；
 *          或者返回索引 5， 其峰值元素为 6。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 1000</li>
 *     <li>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</li>
 *     <li>对于所有有效的 i 都有 nums[i] != nums[i + 1]</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-peak-element/description/">https://leetcode.cn/problems/find-peak-element/description/</a>
 */
public class Topic162FindPeakElement {

    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + ((right - left) >> 1);
            int num = nums[mid];
            if (num < nums[mid + 1]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        return left;
    }

}
