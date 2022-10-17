package vip.hyzt.questions;

/**
 * <h3>6101. 判断矩阵是否是一个 X 矩阵</h3>
 * <p>如果一个正方形矩阵满足下述 全部 条件，则称之为一个 X 矩阵 ：</p>
 * <ol>
 *     <li>矩阵对角线上的所有元素都 不是 0</li>
 *     <li>矩阵中所有其他元素都是 0</li>
 * </ol>
 * <p>给你一个大小为 n x n 的二维整数数组 grid ，表示一个正方形矩阵。如果 grid 是一个 X 矩阵 ，返回 true ；否则，返回 false 。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/05/03/ex1.jpg" >
 * <pre>
 *     输入：grid = [[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]]
 *     输出：true
 *     解释：矩阵如上图所示。
 *     X 矩阵应该满足：绿色元素（对角线上）都不是 0 ，红色元素都是 0 。
 *     因此，grid 是一个 X 矩阵。
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/05/03/ex2.jpg" >
 * <pre>
 *     输入：grid = [[5,7,0],[0,3,1],[0,5,0]]
 *     输出：false
 *     解释：矩阵如上图所示。
 *     X 矩阵应该满足：绿色元素（对角线上）都不是 0 ，红色元素都是 0 。
 *     因此，grid 不是一个 X 矩阵。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>n == grid.length == grid[i].length</li>
 *     <li>3 <= n <= 100</li>
 *     <li>0 <= grid[i][j] <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/check-if-matrix-is-x-matrix/">https://leetcode.cn/problems/check-if-matrix-is-x-matrix/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2319CheckXMatrix {

    public static boolean checkXMatrix (int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if ((i == j || i == grid.length - i - j) ? grid[i][j] == 0 : grid[i][j] > 0) {
                    return false;
                }
            }
        }
        return true;

    }

}
