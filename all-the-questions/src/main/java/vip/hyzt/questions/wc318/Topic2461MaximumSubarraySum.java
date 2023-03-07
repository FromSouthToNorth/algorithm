package vip.hyzt.questions.wc318;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>2461. 长度为 K 子数组中的最大和</h1>
 * <p>给你一个整数数组 nums 和一个整数 k 。请你从 nums 中满足下述条件的全部子数组中找出最大子数组和：</p>
 * <ul>
 *     <li>子数组的长度是 k，且</li>
 *     <li>子数组中的所有元素 <strong>各不相同</strong> 。</li>
 * </ul>
 * <p>返回满足题面要求的最大子数组和。如果不存在子数组满足这些条件，返回 0 。</p>
 * <p><strong>子数组</strong> 是数组中一段连续非空的元素序列。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,5,4,2,9,9,9], k = 3
 *     输出：15
 *     解释：nums 中长度为 3 的子数组是：
 *     - [1,5,4] 满足全部条件，和为 10 。
 *     - [5,4,2] 满足全部条件，和为 11 。
 *     - [4,2,9] 满足全部条件，和为 15 。
 *     - [2,9,9] 不满足全部条件，因为元素 9 出现重复。
 *     - [9,9,9] 不满足全部条件，因为元素 9 出现重复。
 *     因为 15 是满足全部条件的所有子数组中的最大子数组和，所以返回 15 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [4,4,4], k = 3
 *     输出：0
 *     解释：nums 中长度为 3 的子数组是：
 *     - [4,4,4] 不满足全部条件，因为元素 4 出现重复。
 *     因为不存在满足全部条件的子数组，所以返回 0 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= k <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/maximum-sum-of-distinct-subarrays-with-length-k/">https://leetcode.cn/problems/maximum-sum-of-distinct-subarrays-with-length-k/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2461MaximumSubarraySum {

    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                sum -= nums[i - k];
                map.put(nums[i - k], map.get(nums[i - k]) - 1);
                if (map.get(nums[i - k]) == 0) {
                    map.remove(nums[i - k]);
                }
            }
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            max = Math.max(max, map.size() == k ? sum : 0);
        }
        return max;
    }

}
