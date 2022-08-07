package vip.hyzt.weeks.weeks_305;

/**
 * <h3>6136. 算术三元组的数目</h3>
 * <p>给你一个下标从 <strong>0</strong> 开始、<strong>严格递增</strong> 的整数数组 nums 和一个正整数 diff 。如果满足下述全部条件，则三元组 (i, j, k) 就是一个 <strong>算术三元组</strong> ：</p>
 * <ul>
 *     <li>i < j < k ，</li>
 *     <li>nums[j] - nums[i] == diff 且</li>
 *     <li>nums[k] - nums[j] == diff</li>
 * </ul>
 * <p>返回不同 <strong>算术三元组</strong> 的数目。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     <strong>输入：</strong>nums = [0,1,4,6,7,10], diff = 3
 *     <strong>输出：</strong>2
 *     <strong>解释：</strong>
 *     (1, 2, 4) 是算术三元组：7 - 4 == 3 且 4 - 1 == 3 。
 *     (2, 4, 5) 是算术三元组：10 - 7 == 3 且 7 - 4 == 3 。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     <strong>输入：</strong>nums = [4,5,6,7,8,9], diff = 2
 *     <strong>输出：</strong>2
 *     <strong>解释：</strong>
 *     (0, 2, 4) 是算术三元组：8 - 6 == 2 且 6 - 4 == 2 。
 *     (1, 3, 5) 是算术三元组：9 - 7 == 2 且 7 - 5 == 2 。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>3 <= nums.length <= 200</li>
 *     <li>0 <= nums[i] <= 200</li>
 *     <li>1 <= diff <= 50</li>
 *     <li>nums <strong>严格</strong> 递增</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/number-of-arithmetic-triplets">https://leetcode.cn/problems/number-of-arithmetic-triplets</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class ArithmeticTriplets_01 {

    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    count += nums[i] + diff == nums[j] && nums[j] + diff == nums[k] ? 1 : 0;
                }
            }
        }
        return count;
    }

}
