package vip.hyzt.weeks.weeks_306;

/**
 * <h3>6148. 矩阵中的局部最大值</h3>
 * <p>给你一个大小为 n x n 的整数矩阵 grid 。</p>
 * <p>生成一个大小为 (n - 2) x (n - 2) 的整数矩阵  maxLocal ，并满足：</p>
 * <ul>
 *     <li>maxLocal[i][j] 等于 grid 中以 i + 1 行和 j + 1 列为中心的 3 x 3 矩阵中的 最大值 。</li>
 * </ul>
 * <p>换句话说，我们希望找出 grid 中每个 3 x 3 矩阵中的最大值。</p>
 * <p>返回生成的矩阵。</p>
 * <h4>示例 1：</h4>
 * <img src="https://assets.leetcode.com/uploads/2022/06/21/ex1.png">
 * <pre>
 *     输入：grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
 *     输出：[[9,9],[8,6]]
 *     解释：原矩阵和生成的矩阵如上图所示。
 *     注意，生成的矩阵中，每个值都对应 grid 中一个相接的 3 x 3 矩阵的最大值。
 * </pre>
 * <h4>示例 2：</h4>
 * <img src="	https://assets.leetcode.com/uploads/2022/07/02/ex2new2.png">
 * <pre>
 *     输入：grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
 *     输出：[[2,2,2],[2,2,2],[2,2,2]]
 *     解释：注意，2 包含在 grid 中每个 3 x 3 的矩阵中。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>n == grid.length == grid[i].length</li>
 *     <li>3 <= n <= 100</li>
 *     <li>1 <= grid[i][j] <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/largest-local-values-in-a-matrix">https://leetcode.cn/problems/largest-local-values-in-a-matrix</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class LargestLocal_01 {

    public int[][] largestLocal(int[][] grid) {
        int length = grid.length;
        int[][] result = new int[length - 2][length - 2];
        for (int i = 0; i < length - 2; i++) {
            for (int j = 0; j < length - 2; j++) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        result[i][j] = Math.max(result[i][j], grid[k][l]);
                    }
                }
            }
        }
        return result;
    }

}
