package vip.hyzt.questions;

/**
 * <h1>6241. 数组中不等三元组的数目</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始的正整数数组 nums 。请你找出并统计满足下述条件的三元组 (i, j, k) 的数目：</p>
 * <ul>
 *     <li>0 <= i < j < k < nums.length</li>
 *     <li>
 *         nums[i]、nums[j] 和 nums[k] <strong>两两不同</strong> 。
 *         <ul>
 *             <li>换句话说：nums[i] != nums[j]、nums[i] != nums[k] 且 nums[j] != nums[k] 。</li>
 *         </ul>
 *     </li>
 * </ul>
 * <p>返回满足上述条件三元组的数目。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [4,4,2,4,3]
 *     输出：3
 *     解释：下面列出的三元组均满足题目条件：
 *     - (0, 2, 4) 因为 4 != 2 != 3
 *     - (1, 2, 4) 因为 4 != 2 != 3
 *     - (2, 3, 4) 因为 2 != 4 != 3
 *     共计 3 个三元组，返回 3 。
 *     注意 (2, 0, 4) 不是有效的三元组，因为 2 > 0 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,1,1,1,1]
 *     输出：0
 *     解释：不存在满足条件的三元组，所以返回 0 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>3 <= nums.length <= 100</li>
 *     <li>1 <= nums[i] <= 1000</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/number-of-unequal-triplets-in-array/">https://leetcode.cn/problems/number-of-unequal-triplets-in-array/</a>
 */
public class Topic2473UnequalTriplets {

    public int unequalTriplets(int[] nums) {
        int n = nums.length, res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    res += nums[i] == nums[j] | nums[i] == nums[k] | nums[j] == nums[k] ? 0 : 1;
                }
            }
        }
        return res;
    }

}
