package vip.hyzt.questions.wc337;

/**
 * <h1>2596. 检查骑士巡视方案</h1>
 * <p></p>
 * <p>骑士在一张 n x n 的棋盘上巡视。在有效的巡视方案中，骑士会从棋盘的 <strong>左上角</strong> 出发，并且访问棋盘上的每个格子 <strong>恰好一次</strong> 。</p>
 * <p>给你一个 n x n 的整数矩阵 grid ，由范围 [0, n * n - 1] 内的不同整数组成，其中 grid[row][col] 表示单元格 (row, col) 是骑士访问的第 grid[row][col] 个单元格。骑士的行动是从下标 <strong>0</strong> 开始的。</p>
 * <p>如果 grid 表示了骑士的有效巡视方案，返回 true；否则返回 false。</p>
 * <p><strong>注意</strong>，骑士行动时可以垂直移动两个格子且水平移动一个格子，或水平移动两个格子且垂直移动一个格子。下图展示了骑士从某个格子出发可能的八种行动路线。</p>
 * <img src="https://assets.leetcode.com/uploads/2018/10/12/knight.png">
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/12/28/yetgriddrawio-5.png">
 * <pre>
 *     输入：grid = [[0,11,16,5,20],[17,4,19,10,15],[12,1,8,21,6],[3,18,23,14,9],[24,13,2,7,22]]
 *     输出：true
 *     解释：grid 如上图所示，可以证明这是一个有效的巡视方案。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/12/28/yetgriddrawio-6.png">
 * <pre>
 *     输入：grid = [[0,3,6],[5,8,1],[2,7,4]]
 *     输出：false
 *     解释：grid 如上图所示，考虑到骑士第 7 次行动后的位置，第 8 次行动是无效的。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>n == grid.length == grid[i].length</li>
 *     <li>3 <= n <= 7</li>
 *     <li>0 <= grid[row][col] < n * n</li>
 *     <li>grid 中的所有整数 <strong>互不相同</strong></li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/check-knight-tour-configuration/description/">https://leetcode.cn/problems/check-knight-tour-configuration/description/</a>
 */
public class Topic2596CheckValidGrid {

    public boolean checkValidGrid(int[][] grid) {
        int[][] index = new int[grid.length * grid.length][];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                index[grid[i][j]] = new int[] { i, j };
            }
        }
        for (int i = 1; i < index.length; i++) {
            if (Math.abs(index[i][0] - index[i - 1][0]) * Math.abs(index[i][1] - index[i - 1][1]) != 2) {
                return false;
            }
        }
        return grid[0][0] == 0;
    }

}
