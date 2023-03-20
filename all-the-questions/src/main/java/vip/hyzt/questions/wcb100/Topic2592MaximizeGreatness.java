package vip.hyzt.questions.wcb100;

import java.util.Arrays;

/**
 * <h1>2592. 最大化数组的伟大值</h1>
 * <p></p>
 * <p>给你一个下标从 0 开始的整数数组 nums 。你需要将 nums 重新排列成一个新的数组 perm 。</p>
 * <p>定义 nums 的 <strong>伟大值</strong> 为满足 0 <= i < nums.length 且 perm[i] > nums[i] 的下标数目。</p>
 * <p>请你返回重新排列 nums 后的 <strong>最大</strong> 伟大值。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,3,5,2,1,3,1]
 *     输出：4
 *     解释：一个最优安排方案为 perm = [2,5,1,3,3,1,1] 。
 *     在下标为 0, 1, 3 和 4 处，都有 perm[i] > nums[i] 。因此我们返回 4 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,2,3,4]
 *     输出：3
 *     解释：最优排列为 [2,3,4,1] 。
 *     在下标为 0, 1 和 2 处，都有 perm[i] > nums[i] 。因此我们返回 3 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>0 <= nums[i] <= 10<sup>9</sup></li>
 * </ul>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximize-greatness-of-an-array/">https://leetcode.cn/problems/maximize-greatness-of-an-array/</a>
 */
public class Topic2592MaximizeGreatness {

    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        for (int num : nums) {
            j += num > nums[j] ? 1 : 0;
        }
        return j;
    }

}
