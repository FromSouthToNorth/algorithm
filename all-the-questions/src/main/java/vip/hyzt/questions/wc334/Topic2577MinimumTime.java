package vip.hyzt.questions.wc334;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <h1>2577. 在网格图中访问一个格子的最少时间</h1>
 * <p></p>
 * <p>给你一个 m x n 的矩阵 grid ，每个元素都为 <strong>非负</strong> 整数，其中 grid[row][col] 表示可以访问格子 (row, col) 的 <strong>最早</strong> 时间。也就是说当你访问格子 (row, col) 时，最少已经经过的时间为 grid[row][col] 。</p>
 * <p>你从 <strong>最左上角</strong> 出发，出发时刻为 0 ，你必须一直移动到上下左右相邻四个格子中的 <strong>任意</strong> 一个格子（即不能停留在格子上）。每次移动都需要花费 1 单位时间。</p>
 * <p>请你返回 <strong>最早</strong> 到达右下角格子的时间，如果你无法到达右下角的格子，请你返回 -1 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2023/02/14/yetgriddrawio-8.png">
 * <pre>
 *     输入：grid = [[0,1,3,2],[5,1,2,5],[4,3,8,6]]
 *     输出：7
 *     解释：一条可行的路径为：
 *     - 时刻 t = 0 ，我们在格子 (0,0) 。
 *     - 时刻 t = 1 ，我们移动到格子 (0,1) ，可以移动的原因是 grid[0][1] <= 1 。
 *     - 时刻 t = 2 ，我们移动到格子 (1,1) ，可以移动的原因是 grid[1][1] <= 2 。
 *     - 时刻 t = 3 ，我们移动到格子 (1,2) ，可以移动的原因是 grid[1][2] <= 3 。
 *     - 时刻 t = 4 ，我们移动到格子 (1,1) ，可以移动的原因是 grid[1][1] <= 4 。
 *     - 时刻 t = 5 ，我们移动到格子 (1,2) ，可以移动的原因是 grid[1][2] <= 5 。
 *     - 时刻 t = 6 ，我们移动到格子 (1,3) ，可以移动的原因是 grid[1][3] <= 6 。
 *     - 时刻 t = 7 ，我们移动到格子 (2,3) ，可以移动的原因是 grid[2][3] <= 7 。
 *     最终到达时刻为 7 。这是最早可以到达的时间。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2023/02/14/yetgriddrawio-9.png">
 * <pre>
 *     输入：grid = [[0,2,4],[3,2,1],[1,0,4]]
 *     输出：-1
 *     解释：没法从左上角按题目规定走到右下角。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>m == grid.length</li>
 *     <li>n == grid[i].length</li>
 *     <li>2 <= m, n <= 1000</li>
 *     <li>4 <= m * n <= 10<sup>5</sup></li>
 *     <li>0 <= grid[i][j] <= 10<sup>5</sup></li>
 *     <li>grid[0][0] == 0</li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-time-to-visit-a-cell-in-a-grid/">https://leetcode.cn/problems/minimum-time-to-visit-a-cell-in-a-grid/</a>
 */
public class Topic2577MinimumTime {

    int[][] grid;

    private boolean minimumTime(int x, int y) {
        return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length;
    }

    public int minimumTime(int[][] grid) {
        this.grid = grid;
        int[][] dirs = new int[][] {
                { -1, 0 },
                { 1, 0 },
                { 0, 1 },
                { 0, -1 }
        };
        if (grid[0][1] > 1 && grid[1][0] > 1) {
            return -1;
        }
        PriorityQueue<Event> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x.time));
        queue.add(new Event(0, 0, 0));
        int[][] time = new int[grid.length][grid[0].length];
        int inf = (int) 1e9;
        for (int[] ints : time) {
            Arrays.fill(ints, inf);
        }
        while (!queue.isEmpty()) {
            Event head = queue.remove();
            if (time[head.x][head.y] <= head.time) {
                continue;
            }
            time[head.x][head.y] = head.time;
            for (int[] dir : dirs) {
                int x = head.x + dir[0];
                int y = head.y + dir[1];
                if (!minimumTime(x, y)) {
                    continue;
                }
                queue.add(new Event(x, y, Math.max(head.time + 1, grid[x][y] + (grid[x][y] % 2 != (x + y) % 2 ? 1 : 0))));
            }
        }
        return time[grid.length - 1][grid[0].length - 1];
    }

    class Event {
        int x;
        int y;
        int time;

        public Event(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

}
