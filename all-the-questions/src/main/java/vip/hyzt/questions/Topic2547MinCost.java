package vip.hyzt.questions;

/**
 * <h1>2547. 拆分数组的最小代价</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-cost-to-split-an-array/">https://leetcode.cn/problems/minimum-cost-to-split-an-array/</a>
 */
public class Topic2547MinCost {

    public int minCost(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            dp[i + 1] = Integer.MAX_VALUE;
            for (int j = i, count[] = new int[n], curr = 0; j >= 0; j--) {
                int index = nums[j];
                dp[i + 1] = Math.min(dp[i + 1], (curr += ++count[index] == 1 ? 0 : count[index] == 2 ? 2 : 1) + dp[j] + k);
            }
        }
        return dp[n];
    }

}
