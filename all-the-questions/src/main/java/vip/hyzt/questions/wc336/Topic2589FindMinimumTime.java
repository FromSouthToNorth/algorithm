package vip.hyzt.questions.wc336;

import java.util.Arrays;

/**
 * <h1>2589. 完成所有任务的最少时间</h1>
 * <p>你有一台电脑，它可以 <strong>同时</strong> 运行无数个任务。给你一个二维整数数组 tasks ，其中 tasks[i] = [start<sub>i</sub>, end<sub>i</sub>, duration<sub>i</sub>] 表示第 i 个任务需要在 <strong>闭区间</strong> 时间段 [start<sub>i</sub>, end<sub>i</sub>] 内运行 duration<sub>i</sub> 个整数时间点（但不需要连续）。</p>
 * <p>当电脑需要运行任务时，你可以打开电脑，如果空闲时，你可以将电脑关闭。</p>
 * <p>请你返回完成所有任务的情况下，电脑最少需要运行多少秒。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：tasks = [[2,3,1],[4,5,1],[1,5,2]]
 *     输出：2
 *     解释：
 *     - 第一个任务在闭区间 [2, 2] 运行。
 *     - 第二个任务在闭区间 [5, 5] 运行。
 *     - 第三个任务在闭区间 [2, 2] 和 [5, 5] 运行。
 *     电脑总共运行 2 个整数时间点。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：tasks = [[1,3,2],[2,5,3],[5,6,2]]
 *     输出：4
 *     解释：
 *     - 第一个任务在闭区间 [2, 3] 运行
 *     - 第二个任务在闭区间 [2, 3] 和 [5, 5] 运行。
 *     - 第三个任务在闭区间 [5, 6] 运行。
 *     电脑总共运行 4 个整数时间点。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= tasks.length <= 2000</li>
 *     <li>tasks[i].length == 3</li>
 *     <li>1 <= start<sub>i</sub>, end<sub>i</sub> <= 2000</li>
 *     <li>1 <= duration<sub>i</sub> <= end<sub>i</sub> - start<sub>i</sub> + 1 </li>
 * </ul>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-time-to-complete-all-tasks/">https://leetcode.cn/problems/minimum-time-to-complete-all-tasks/</a>
 */
public class Topic2589FindMinimumTime {

    public int findMinimumTime(int[][] tasks) {
        Arrays.sort(tasks, (o, p) -> o[1] - p[1]);
        int count = 0, visited[] = new int[20001];
        for (int[] task : tasks) {
            for (int i = task[0]; i <= task[1]; i++) {
                task[2] -= visited[i];
            }
            for (int i = task[1]; i >= task[0] && task[2] > 0; i--) {
                if (visited[i] == 0) {
                    task[2]--;
                    count += visited[i] = 1;
                }
            }
        }
        return count;
    }

}
