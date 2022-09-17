package vip.hyzt.questions;

/**
 * <h2>2398. 预算内的最多机器人数目</h2>
 * <p>你有 n 个机器人，给你两个下标从 <strong>0</strong> 开始的整数数组 chargeTimes 和 runningCosts ，两者长度都为 n 。第 i 个机器人充电时间为 chargeTimes[i] 单位时间，花费 runningCosts[i] 单位时间运行。再给你一个整数 budget 。</p>
 * <p>运行 k 个机器人 总开销 是 max(chargeTimes) + k * sum(runningCosts) ，其中 max(chargeTimes) 是这 k 个机器人中最大充电时间，sum(runningCosts) 是这 k 个机器人的运行时间之和。</p>
 * <p>请你返回在 <strong>不超过</strong> budget 的前提下，你 <strong>最多</strong> 可以 <strong>连续</strong> 运行的机器人数目为多少。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：chargeTimes = [3,6,1,3,4], runningCosts = [2,1,3,4,5], budget = 25
 *     输出：3
 *     解释：
 *     可以在 budget 以内运行所有单个机器人或者连续运行 2 个机器人。
 *     选择前 3 个机器人，可以得到答案最大值 3 。总开销是 max(3,6,1) + 3 * sum(2,1,3) = 6 + 3 * 6 = 24 ，小于 25 。
 *     可以看出无法在 budget 以内连续运行超过 3 个机器人，所以我们返回 3 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：chargeTimes = [11,12,19], runningCosts = [10,8,7], budget = 19
 *     输出：0
 *     解释：即使运行任何一个单个机器人，还是会超出 budget，所以我们返回 0 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>chargeTimes.length == runningCosts.length == n</li>
 *     <li>1 <= n <= 5 * 10<sup>4</sup></li>
 *     <li>1 <= chargeTimes[i], runningCosts[i] <= 10<sup>5</sup></li>
 *     <li>1 <= budget <= 10<sup>15</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-robots-within-budget">https://leetcode.cn/problems/maximum-number-of-robots-within-budget</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2398MaximumRobots {

    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int n = chargeTimes.length;
        long[] preSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + runningCosts[i - 1];
        }
        int l = 0, r = n;
        int[] queue = new int[n];
        while (l < r) {
            int mid = l + r + 1>> 1;
            int head = 0, tail = 0;
            boolean success = false;
            for (int i = 0; i < n; i++) {
                while (head < tail && i - queue[head] >= mid) {
                    head++;
                }
                while (head < tail && chargeTimes[queue[tail - 1]] <= chargeTimes[i]) {
                    tail--;
                }
                queue[tail++] = i;
                if (i >= mid - 1) {
                    long cost = chargeTimes[queue[head]] + mid * (preSum[i + 1] - preSum[i + 1 - mid]);
                    if (cost <= budget) {
                        success = true;
                        break;
                    }
                }
            }
            if (!success) {
                r = mid - 1;
            }
            else {
                l = mid;
            }
        }
        return l;
    }

}
