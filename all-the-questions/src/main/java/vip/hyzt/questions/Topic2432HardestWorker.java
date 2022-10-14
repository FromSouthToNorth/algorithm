package vip.hyzt.questions;

import java.util.stream.IntStream;

/**
 * <h1>2432. 处理用时最长的那个任务的员工</h1>
 * <p>共有 n 位员工，每位员工都有一个从 0 到 n - 1 的唯一 id 。</p>
 * <p>给你一个二维整数数组 logs ，其中 logs[i] = [id<sub>i</sub>, leaveTime<sub>i</sub>] ：</p>
 * <ul>
 *     <li>id<sub>i</sub> 是处理第 i 个任务的员工的 id ，且</li>
 *     <li>leaveTime<sub>i</sub> 是员工完成第 i 个任务的时刻。所有 leaveTime<sub>i</sub> 的值都是 <strong>唯一</strong> 的。</li>
 * </ul>
 * <p>注意，第 i 个任务在第 (i - 1) 个任务结束后立即开始，且第 0 个任务从时刻 0 开始。</p>
 * <p>返回处理用时最长的那个任务的员工的 id 。如果存在两个或多个员工同时满足，则返回几人中 <strong>最小</strong> 的 id 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：n = 10, logs = [[0,3],[2,5],[0,9],[1,15]]
 *     输出：1
 *     解释：
 *     任务 0 于时刻 0 开始，且在时刻 3 结束，共计 3 个单位时间。
 *     任务 1 于时刻 3 开始，且在时刻 5 结束，共计 2 个单位时间。
 *     任务 2 于时刻 5 开始，且在时刻 9 结束，共计 4 个单位时间。
 *     任务 3 于时刻 9 开始，且在时刻 15 结束，共计 6 个单位时间。
 *     时间最长的任务是任务 3 ，而 id 为 1 的员工是处理此任务的员工，所以返回 1 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 26, logs = [[1,1],[3,7],[2,12],[7,17]]
 *     输出：3
 *     解释：
 *     任务 0 于时刻 0 开始，且在时刻 1 结束，共计 1 个单位时间。
 *     任务 1 于时刻 1 开始，且在时刻 7 结束，共计 6 个单位时间。
 *     任务 2 于时刻 7 开始，且在时刻 12 结束，共计 5 个单位时间。
 *     任务 3 于时刻 12 开始，且在时刻 17 结束，共计 5 个单位时间。
 *     时间最长的任务是任务 1 ，而 id 为 3 的员工是处理此任务的员工，所以返回 3 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：n = 2, logs = [[0,10],[1,20]]
 *     输出：0
 *     解释：
 *     任务 0 于时刻 0 开始，且在时刻 10 结束，共计 10 个单位时间。
 *     任务 1 于时刻 10 开始，且在时刻 20 结束，共计 10 个单位时间。
 *     时间最长的任务是任务 0 和 1 ，处理这两个任务的员工的 id 分别是 0 和 1 ，所以返回最小的 0 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= n <= 500</li>
 *     <li>1 <= logs.length <= 500</li>
 *     <li>logs[i].length == 2</li>
 *     <li>0 <= idi <= n - 1</li>
 *     <li>1 <= leaveTime<sub>i</sub> <= 500</li>
 *     <li>id<sub>i</sub> != id<sub>i</sub> + 1</li>
 *     <li>leaveTime<sub>i</sub> 按严格递增顺序排列</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/the-employee-that-worked-on-the-longest-task/">https://leetcode.cn/problems/the-employee-that-worked-on-the-longest-task/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2432HardestWorker {

    public int hardestWorker(int n, int[][] logs) {
        return logs[IntStream.range(0, logs.length).boxed()
                .min((o, p) -> logs[o][1] - (o > 0 ? logs[o - 1][1] : 0) == logs[p][1] - (p > 0 ? logs[p - 1][1] : 0)
                        ? logs[o][0] - logs[p][0]
                        : logs[p][1] - (p > 0 ? logs[p - 1][1] : 0) - logs[o][1] + (o > 0 ? logs[o - 1][1] : 0))
                .get()][0];
    }

}
