package vip.hyzt.questions;

/**
 * <h1>2482. 行和列中一和零的差值</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始的 m x n 二进制矩阵 grid 。</p>
 * <p>我们按照如下过程，定义一个下标从 <strong>0</strong> 开始的 m x n 差值矩阵 diff ：</p>
 * <ul>
 *     <li>令第 i 行一的数目为 onesRow<sub>i</sub> 。</li>
 *     <li>令第 j 列一的数目为 onesCol<sub>j</sub> 。</li>
 *     <li>令第 i 行零的数目为 zerosRow<sub>i</sub> 。</li>
 *     <li>令第 j 列零的数目为 zerosCol<sub>j</sub> 。</li>
 *     <li>diff[i][j] = onesRow<sub>i</sub> + onesCol<sub>j</sub> - zerosRow<sub>i</sub> - zerosCol<sub>j</sub></li>
 * </ul>
 * <p>请你返回差值矩阵 diff 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/11/06/image-20221106171729-5.png">
 * <pre>
 *     输入：grid = [[0,1,1],[1,0,1],[0,0,1]]
 *     输出：[[0,0,4],[0,0,4],[-2,-2,2]]
 *     解释：
 *     - diff[0][0] = onesRow<sub>0</sub> + onesCol<sub>0</sub> - zerosRow<sub>0</sub> - zerosCol<sub>0</sub> = 2 + 1 - 1 - 2 = 0
 *     - diff[0][1] = onesRow<sub>0</sub> + onesCol<sub>1</sub> - zerosRow<sub>0</sub> - zerosCol<sub>1</sub> = 2 + 1 - 1 - 2 = 0
 *     - diff[0][2] = onesRow<sub>0</sub> + onesCol<sub>2</sub> - zerosRow<sub>0</sub> - zerosCol<sub>2</sub> = 2 + 3 - 1 - 0 = 4
 *     - diff[1][0] = onesRow<sub>1</sub> + onesCol<sub>0</sub> - zerosRow<sub>1</sub> - zerosCol<sub>0</sub> = 2 + 1 - 1 - 2 = 0
 *     - diff[1][1] = onesRow<sub>1</sub> + onesCol<sub>1</sub> - zerosRow<sub>1</sub> - zerosCol<sub>1</sub> = 2 + 1 - 1 - 2 = 0
 *     - diff[1][2] = onesRow<sub>1</sub> + onesCol<sub>2</sub> - zerosRow<sub>1</sub> - zerosCol<sub>2</sub> = 2 + 3 - 1 - 0 = 4
 *     - diff[2][0] = onesRow<sub>2</sub> + onesCol<sub>0</sub> - zerosRow<sub>2</sub> - zerosCol<sub>0</sub> = 1 + 1 - 2 - 2 = -2
 *     - diff[2][1] = onesRow<sub>2</sub> + onesCol<sub>1</sub> - zerosRow<sub>2</sub> - zerosCol<sub>1</sub> = 1 + 1 - 2 - 2 = -2
 *     - diff[2][2] = onesRow<sub>2</sub> + onesCol<sub>2</sub> - zerosRow<sub>2</sub> - zerosCol<sub>2</sub> = 1 + 3 - 2 - 0 = 2
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/11/06/image-20221106171747-6.png">
 * <pre>
 *     输入：grid = [[1,1,1],[1,1,1]]
 *     输出：[[5,5,5],[5,5,5]]
 *     解释：
 *     - diff[0][0] = onesRow<sub>0</sub> + onesCol<sub>0</sub> - zerosRow<sub>0</sub> - zerosCol<sub>0</sub> = 3 + 2 - 0 - 0 = 5
 *     - diff[0][1] = onesRow<sub>0</sub> + onesCol<sub>1</sub> - zerosRow<sub>0</sub> - zerosCol<sub>1</sub> = 3 + 2 - 0 - 0 = 5
 *     - diff[0][2] = onesRow<sub>0</sub> + onesCol<sub>2</sub> - zerosRow<sub>0</sub> - zerosCol<sub>2</sub> = 3 + 2 - 0 - 0 = 5
 *     - diff[1][0] = onesRow<sub>1</sub> + onesCol<sub>0</sub> - zerosRow<sub>1</sub> - zerosCol<sub>0</sub> = 3 + 2 - 0 - 0 = 5
 *     - diff[1][1] = onesRow<sub>1</sub> + onesCol<sub>1</sub> - zerosRow<sub>1</sub> - zerosCol<sub>1</sub> = 3 + 2 - 0 - 0 = 5
 *     - diff[1][2] = onesRow<sub>1</sub> + onesCol<sub>2</sub> - zerosRow<sub>1</sub> - zerosCol<sub>2</sub> = 3 + 2 - 0 - 0 = 5
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>m == grid.length</li>
 *     <li>n == grid[i].length</li>
 *     <li>1 <= m, n <= 10<sup>5</sup></li>
 *     <li>1 <= m * n <= 10<sup>5</sup></li>
 *     <li>grid[i][j] 要么是 0 ，要么是 1 。</li>
 * </ul>
 * <p></p>
 * <h2>js</h2>
 * <pre>
 * const onesMinusZeros = function(grid) {
 *     const n = grid.length,
 *         row = new Array(n).fill(0).map(() => new Array(2).fill(0)),
 *         col = new Array(grid[0].length).fill(0).map(() => new Array(2).fill(0)),
 *         res = new Array(n).fill(0).map(() => new Array(grid[0].length).fill(0));
 *     for (let i = 0; i < n; i++) {
 *         for (let j = 0; j < grid[i].length; j++) {
 *             row[i][grid[i][j]]++;
 *             col[j][grid[i][j]]++;
 *         }
 *     }
 *     for (let i = 0; i < n; i++) {
 *         for (let j = 0; j < grid[i].length; j++) {
 *             res[i][j] = row[i][1] + col[j][1] - row[i][0] - col[j][0];
 *         }
 *     }
 *     return res;
 * }
 * console.log(onesMinusZeros([[0, 1, 1], [1, 0, 1], [0, 0, 1]]))
 * console.log(onesMinusZeros([[1, 1, 1], [1, 1, 1]]))
 * </pre>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/difference-between-ones-and-zeros-in-row-and-column/">https://leetcode.cn/problems/difference-between-ones-and-zeros-in-row-and-column/</a>
 */
public class Topic2482OnesMinusZeros {

    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int[][] row = new int[n][2],
                col = new int[grid[0].length][2],
                res = new int[n][grid[0].length];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                row[i][grid[i][j]]++;
                col[j][grid[i][j]]++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res[i][j] = row[i][1] + col[j][1] - row[i][0] - col[j][0];
            }
        }
        return res;
    }

}
