package vip.hyzt.questions;

/**
 * <h2>2529. 正整数和负整数的最大计数</h2>
 * <p>给你一个按 <strong>非递减顺序</strong> 排列的数组 nums ，返回正整数数目和负整数数目中的最大值。</p>
 * <ul>
 *     <li>换句话讲，如果 nums 中正整数的数目是 pos ，而负整数的数目是 neg ，返回 pos 和 neg二者中的最大值。</li>
 * </ul>
 * <p>注意：0 既不是正整数也不是负整数。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [-2,-1,-1,1,2,3]
 *     输出：3
 *     解释：共有 3 个正整数和 3 个负整数。计数得到的最大值是 3 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [-3,-2,-1,0,0,1,2]
 *     输出：3
 *     解释：共有 2 个正整数和 3 个负整数。计数得到的最大值是 3 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：nums = [5,20,66,1314]
 *     输出：4
 *     解释：共有 4 个正整数和 0 个负整数。计数得到的最大值是 4 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 2000</li>
 *     <li>-2000 <= nums[i] <= 2000</li>
 *     <li>nums 按 非递减顺序 排列。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer/description/">https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer/description/</a>
 */
public class Topic2529MaximumCount {

    public int maximumCount(int[] nums) {
        int max1 = 0, max2 = 0;
        for (int num : nums) {
            max1 += num > 0 ? 1 : 0;
            max2 += num < 0 ? 1 : 0;
        }
        return Math.max(max1, max2);
    }

}
