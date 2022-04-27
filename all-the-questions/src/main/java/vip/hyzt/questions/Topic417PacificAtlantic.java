package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>417.太平洋大西洋流水问题</h3>
 * <p>有一个 `m * n` 的矩阵岛屿，与 <b>太平洋</b> 和 <b>大西洋</b> 相邻。<b>“太平洋”</b> 处于大陆的左边界和上边界，而 <b>“大西洋”</b> 处于大陆的右边界和下边界</p>
 * <p>这个岛屿被分隔成一个由若干方形单元格组成的网格。给定一个 `m * n` 的整数矩阵 `heights`，`heights[r][c]` 表示坐标`(r, c)` 上单元格 <b>高于海平面的高度。</b></p>
 * <p>岛上雨水较多，如果相邻单元格的高度 <b>小于或等于</b> 当前单元格的高度，雨水可以直接向北，南，东西流向相邻的单元格。水可以从海洋附件的任何单元格流入海中。</p>
 * <p>返回 <i>网格坐标 `result` 的 <b>2D列表</b>，其中 `result[i] = [r<sub>i</sub>, c<sub>i</sub>]` 表示雨水可以从单元格 `(ri, ci)` 流向 <b>太平洋和大西洋。</b></i></p>
 * <br />
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2021/06/08/waterflow-grid.jpg" />
 * <pre>
 *     <strong>输入：</strong>heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
 *     <strong>输出：</strong>[[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入：</strong>heights = [[2,1],[1,2]]
 *     <strong>输出：</strong>[[0,0],[0,1],[1,0],[1,1]]
 * </pre>
 * <h3>提示：</h3>
 * <li>m == heights.length</li>
 * <li>n == heights[r].length</li>
 * <li>1 <= m, n <= 200</li>
 * <li>0 <= heights[r][c] <= 10<sup>5</sup></li>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/pacific-atlantic-water-flow/">链接：https://leetcode-cn.com/problems/pacific-atlantic-water-flow/</a>
 */
public class Topic417PacificAtlantic {

    static int n, m;
    static int[][] g;

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        g = heights;
        m = g.length;
        n = g[0].length;
        boolean[][] res1 = new boolean[m][n], res2 = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    if (!res1[i][j]) dfs(i, j, res1);
                }
                if (i == m - 1 || j == n - 1) {
                    if(!res2[i][j]) dfs(i, j, res2);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res1[i][j] && res2[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i); list.add(j);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    static int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, -1}};
    static void dfs(int x, int y, boolean[][] res) {
        res[x][y] = true;
        for (int[] dir : dirs) {
            int nx = x + dir[0], ny = y + dir[1];
            if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
            if (res[nx][ny] || g[nx][ny] < g[x][y]) continue;
            dfs(nx, ny, res);
        }
    }
}
