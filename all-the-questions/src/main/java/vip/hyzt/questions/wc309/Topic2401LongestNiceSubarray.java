package vip.hyzt.questions.wc309;

/**
 * <h2>6169. 最长优雅子数组</h2>
 * <p>给你一个由 <strong>正</strong> 整数组成的数组 nums 。</p>
 * <p>如果 nums 的子数组中位于 <strong>不同</strong> 位置的每对元素按位 <strong>与（AND）</strong>运算的结果等于 0 ，则称该子数组为 <strong>优雅</strong> 子数组。</p>
 * <p>返回 <strong>最长</strong> 的优雅子数组的长度。</p>
 * <p><strong>子数组</strong> 是数组中的一个 连续 部分。</p>
 * <p><strong>注意：</strong>长度为 1 的子数组始终视作优雅子数组。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [1,3,8,48,10]
 *     输出：3
 *     解释：最长的优雅子数组是 [3,8,48] 。子数组满足题目条件：
 *     - 3 AND 8 = 0
 *     - 3 AND 48 = 0
 *     - 8 AND 48 = 0
 *     可以证明不存在更长的优雅子数组，所以返回 3 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [3,1,5,11,13]
 *     输出：1
 *     解释：最长的优雅子数组长度为 1 ，任何长度为 1 的子数组都满足题目条件。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>9</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/longest-nice-subarray/">https://leetcode.cn/problems/longest-nice-subarray/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2401LongestNiceSubarray {

    public int longestNiceSubarray(int[] nums) {
        int max = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            int mask = 0;
            for (int j = i; j < n && (mask & nums[j]) == 0; j++) {
                mask ^= nums[j];
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }

}
