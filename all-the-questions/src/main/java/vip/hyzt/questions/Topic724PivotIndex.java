package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>724.寻找数组的中心下标</h3>
 * <p>数组 <b>中心下标</b> 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。</p>
 * <p>如果中心下标位于数组最左端，那么左侧数之和视为 `0`，因此在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。</p>
 * <p>如果数组有多个中心下标，应该返回 <b>最靠近左边</b> 的那一个。如果数组不存在中心下标，返回 `-1`。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [1, 7, 3, 6, 5, 6]
 *     <strong>输出：</strong>3
 *     <strong>解释：</strong>
 *     中心下标是 3 。
 *     左侧数之和 sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11 ，
 *     右侧数之和 sum = nums[4] + nums[5] = 5 + 6 = 11 ，二者相等。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [1,2,3]
 *     <strong>输出：</strong>-1
 *     <strong>解释：</strong>
 *     数组中不存在满足此条件的中心下标。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [2,1,-1]
 *     <strong>输出：</strong>0
 *     <strong>解释：</strong>
 *     中心下标是 0 。
 *     左侧数之和 sum = 0 ，（下标 0 左侧不存在元素），
 *     右侧数之和 sum = nums[1] + nums[2] = 1 + -1 = 0 。
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= nums.length <= 10<sup>4</sup></li>
 * <li>-1000 <= nums[i] <= 1000</li>
 * @see <a href="https://leetcode-cn.com/problems/find-pivot-index/">链接: https://leetcode-cn.com/problems/find-pivot-index/</a>
 * @author  力扣（LeetCode）
 * @author hy
 */
public class Topic724PivotIndex {

    public static int pivotIndex(int[] nums) {
        int n = nums.length, sum = 0;
        int total = Arrays.stream(nums).sum();
        for (int i = 0; i < n; i++) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

}
