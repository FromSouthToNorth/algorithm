package vip.hyzt.questions;

/**
 * <h1>2444. 统计定界子数组的数目</h1>
 * <p>给你一个整数数组 nums 和两个整数 minK 以及 maxK 。</p>
 * <p>nums 的定界子数组是满足下述条件的一个子数组：</p>
 * <ul>
 *     <li>子数组中的 <strong>最小值</strong> 等于 minK 。</li>
 *     <li>子数组中的 <strong>最大值</strong> 等于 maxK 。</li>
 * </ul>
 * <p>返回定界子数组的数目。</p>
 * <p>子数组是数组中的一个连续部分。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,3,5,2,7,5], minK = 1, maxK = 5
 *     输出：2
 *     解释：定界子数组是 [1,3,5] 和 [1,3,5,2] 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,1,1,1], minK = 1, maxK = 1
 *     输出：10
 *     解释：nums 的每个子数组都是一个定界子数组。共有 10 个子数组。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i], minK, maxK <= 10<sup>6</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/count-subarrays-with-fixed-bounds/">https://leetcode.cn/problems/count-subarrays-with-fixed-bounds/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2444CountSubarrays {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        long min = -1, max = -1, index = -1, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += Math.max(0, Math.min(min = nums[i] == minK ? i : min, max = nums[i] == maxK ? i : max)
                    - (index = nums[i] < minK || nums[i] > maxK ? i : index));
        }
        return count;
    }

}
