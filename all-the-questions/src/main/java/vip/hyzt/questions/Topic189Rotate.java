package vip.hyzt.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * <h2>189. 轮转数组</h2>
 * <p>给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。</p>
 * <h3>示例 1:</h3>
 * <pre>
 *     输入: nums = [1,2,3,4,5,6,7], k = 3
 *     输出: [5,6,7,1,2,3,4]
 *     解释:
 *     向右轮转 1 步: [7,1,2,3,4,5,6]
 *     向右轮转 2 步: [6,7,1,2,3,4,5]
 *     向右轮转 3 步: [5,6,7,1,2,3,4]
 * </pre>
 * <h3>示例 2:</h3>
 * <pre>
 *     输入：nums = [-1,-100,3,99], k = 2
 *     输出：[3,99,-1,-100]
 *     解释:
 *     向右轮转 1 步: [99,-1,-100,3]
 *     向右轮转 2 步: [3,99,-1,-100]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</li>
 *     <li>0 <= k <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/rotate-array">https://leetcode.cn/problems/rotate-array</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic189Rotate {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        System.out.println(k);
        rotate(nums, 0, nums.length - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
    }

    public void rotate(int[] nums, int left, int right) {
        int t;
        while (left <= right) {
            t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            left++;
            right--;
        }
    }

}
