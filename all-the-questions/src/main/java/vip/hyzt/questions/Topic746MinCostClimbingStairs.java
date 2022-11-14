package vip.hyzt.questions;

/**
 * <h1>746. 使用最小花费爬楼梯</h1>
 * <p>给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。</p>
 * <p>你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。</p>
 * <p>请你计算并返回达到楼梯顶部的最低花费。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：cost = [10,<em><strong>15</strong></em>,20]
 *     输出：15
 *     解释：你将从下标为 1 的台阶开始。
 *     - 支付 15 ，向上爬两个台阶，到达楼梯顶部。
 *     总花费为 15 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：cost = [<em><strong>1</strong></em>,100,<em><strong>1</strong></em>,1,<em><strong>1</strong></em>,100,<em><strong>1</strong></em>,<em><strong>1</strong></em>,100,<em><strong>1</strong></em>]
 *     输出：6
 *     解释：你将从下标为 0 的台阶开始。
 *     - 支付 1 ，向上爬两个台阶，到达下标为 2 的台阶。
 *     - 支付 1 ，向上爬两个台阶，到达下标为 4 的台阶。
 *     - 支付 1 ，向上爬两个台阶，到达下标为 6 的台阶。
 *     - 支付 1 ，向上爬一个台阶，到达下标为 7 的台阶。
 *     - 支付 1 ，向上爬两个台阶，到达下标为 9 的台阶。
 *     - 支付 1 ，向上爬一个台阶，到达楼梯顶部。
 *     总花费为 6 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= cost.length <= 1000</li>
 *     <li>0 <= cost[i] <= 999</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/min-cost-climbing-stairs/description/">https://leetcode.cn/problems/min-cost-climbing-stairs/description/</a>
 */
public class Topic746MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length, cur = 0, prv = 0;
//        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
//            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
            int next = Math.min(cur + cost[i - 1], prv + cost[i - 2]);
            prv = cur;
            cur = next;
        }
//        return dp[n];
        return cur;
    }

}
