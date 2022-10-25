package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>1235. 规划兼职工作</h1>
 * <p>你打算利用空闲时间来做兼职工作赚些零花钱。</p>
 * <p>这里有 n 份兼职工作，每份工作预计从 startTime[i] 开始到 endTime[i] 结束，报酬为 profit[i]。</p>
 * <p>给你一份兼职工作表，包含开始时间 startTime，结束时间 endTime 和预计报酬 profit 三个数组，请你计算并返回可以获得的最大报酬。</p>
 * <p>注意，时间上出现重叠的 2 份工作不能同时进行。</p>
 * <p>如果你选择的工作在时间 X 结束，那么你可以立刻进行在时间 X 开始的下一份工作。</p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/10/19/sample1_1584.png">
 * <pre>
 *     输入：startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
 *     输出：120
 *     解释：
 *     我们选出第 1 份和第 4 份工作，
 *     时间范围是 [1-3]+[3-6]，共获得报酬 120 = 50 + 70。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/10/19/sample22_1584.png">
 * <pre>
 *     输入：startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
 *     输出：150
 *     解释：
 *     我们选择第 1，4，5 份工作。
 *     共获得报酬 150 = 20 + 70 + 60。
 * </pre>
 * <h2>示例 3：</h2>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/10/19/sample3_1584.png">
 * <pre>
 *     输入：startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
 *     输出：6
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= startTime.length == endTime.length == profit.length <= 5 * 10^4</li>
 *     <li>1 <= startTime[i] < endTime[i] <= 10^9</li>
 *     <li>1 <= profit[i] <= 10^4</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/maximum-profit-in-job-scheduling/description/">https://leetcode.cn/problems/maximum-profit-in-job-scheduling/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1235JobScheduling {

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int k = jobScheduling(jobs, i - 1, jobs[i - 1][0]);
            dp[i] = Math.max(dp[i - 1], dp[k] + jobs[i - 1][2]);
        }
        return dp[n];
    }

    public int jobScheduling(int[][] jobs, int right, int target) {
        int left = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (jobs[mid][1] > target) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

}
