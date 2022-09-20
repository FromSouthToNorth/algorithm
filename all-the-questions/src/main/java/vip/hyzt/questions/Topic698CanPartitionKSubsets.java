package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h2>698. 划分为k个相等的子集</h2>
 * <p>给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入： nums = [4, 3, 2, 3, 5, 2, 1], k = 4
 *     输出： True
 *     说明： 有可能将其分成 4 个子集（5），（1,4），（2,3），（2,3）等于总和。
 * </pre>
 * <h3>示例 2:</h3>
 * <pre>
 *     输入: nums = [1,2,3,4], k = 3
 *     输出: false
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= k <= len(nums) <= 16</li>
 *     <li>0 < nums[i] < 10000</li>
 *     <li>每个元素的频率在 [1,4] 范围内</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/partition-to-k-equal-sum-subsets">https://leetcode.cn/problems/partition-to-k-equal-sum-subsets</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic698CanPartitionKSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k != 0) {
            return false;
        }
        int pre = sum / k, n = nums.length;
        Arrays.sort(nums);
        if (nums[n - 1] > pre) {
            return false;
        }
        boolean[] dp = new boolean[1 << n];
        int[] sums = new int[1 << n];
        dp[0] = true;
        for (int i = 0; i < 1 << n; i++) {
            if (!dp[i]) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (sums[i] + nums[j] > pre) {
                    break;
                }
                if (((i >> j) & 1) == 0) {
                    int next = i | (1 << j);
                    if (!dp[next]) {
                        sums[next] = (sums[i] + nums[j]) % pre;
                        dp[next] = true;
                    }
                }
            }
        }
        return dp[(1 << n) - 1];
    }

}
