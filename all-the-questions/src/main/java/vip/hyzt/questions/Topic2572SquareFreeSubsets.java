package vip.hyzt.questions;

/**
 * <h1>2572. 无平方子集计数</h1>
 * <p></p>
 * <p>给你一个正整数数组 nums 。</p>
 * <p>如果数组 nums 的子集中的元素乘积是一个 <strong>无平方因子数</strong> ，则认为该子集是一个 无平方 子集。</p>
 * <p><strong>无平方因子数</strong> 是无法被除 1 之外任何平方数整除的数字。</p>
 * <p>返回数组 nums 中 <strong>无平方</strong> 且 <strong>非空</strong> 的子集数目。因为答案可能很大，返回对 10<sup>9</sup> + 7 取余的结果。</p>
 * <p>nums 的 <strong>非空子集</strong> 是可以由删除 nums 中一些元素（可以不删除，但不能全部删除）得到的一个数组。如果构成两个子集时选择删除的下标不同，则认为这两个子集不同。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [3,4,4,5]
 *     输出：3
 *     解释：示例中有 3 个无平方子集：
 *     - 由第 0 个元素 [3] 组成的子集。其元素的乘积是 3 ，这是一个无平方因子数。
 *     - 由第 3 个元素 [5] 组成的子集。其元素的乘积是 5 ，这是一个无平方因子数。
 *     - 由第 0 个和第 3 个元素 [3,5] 组成的子集。其元素的乘积是 15 ，这是一个无平方因子数。
 *     可以证明给定数组中不存在超过 3 个无平方子集。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1]
 *     输出：1
 *     解释：示例中有 1 个无平方子集：
 *     - 由第 0 个元素 [1] 组成的子集。其元素的乘积是 1 ，这是一个无平方因子数。
 *     可以证明给定数组中不存在超过 1 个无平方子集。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 1000</li>
 *     <li>1 <= nums[i] <= 30</li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-square-free-subsets/">https://leetcode.cn/problems/count-the-number-of-square-free-subsets/</a>
 */
public class Topic2572SquareFreeSubsets {

    public int squareFreeSubsets(int[] nums) {
        int[] mask = new int[31], primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        for (int i = 2; i <= 30; i++) {
            for (int j = 0; j < 10; j++) {
                mask[i] |= i % primes[j] > 0 ? 0 : 1 << j;
                if (i % (primes[j] * primes[j]) == 0) {
                    mask[i] = -1;
                    break;
                }
            }
        }
        return (squareFreeSubsets(0, 0, nums, mask, new Integer[nums.length][1 << 10]) + 1000000006) % 1000000007;
    }

    private int squareFreeSubsets(int index, int curr, int[] nums, int[] mask, Integer[][] dp) {
        if (index == nums.length) {
            return 1;
        }
        else if (dp[index][curr] == null) {
            dp[index][curr] = ((mask[nums[index]] < 0 || (curr & mask[nums[index]]) > 0 ? 0 :
                    squareFreeSubsets(index + 1, curr | mask[nums[index]], nums, mask, dp))
                    + squareFreeSubsets(index + 1, curr, nums, mask, dp)) % 1000000007;
        }
        return dp[index][curr];
    }

}
