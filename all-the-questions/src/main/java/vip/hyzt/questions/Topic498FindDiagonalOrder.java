package vip.hyzt.questions;

/**
 * <h3>498. 对角线遍历</h3>
 * <p>给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2021/04/10/diag1-grid.jpg" >
 * <pre>
 *     输入：mat = [[1,2,3],[4,5,6],[7,8,9]]
 *     输出：[1,2,4,7,5,3,6,8,9]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：mat = [[1,2],[3,4]]
 *     输出：[1,2,3,4]
 * </pre>
 * <h3>提示：</h3>
 * <li>m == mat.length</li>
 * <li>n == mat[i].length</li>
 * <li>1 <= m, n <= 10<sup>4</sup></li>
 * <li>1 <= m * n <= 10<sup>4</sup></li>
 * <li>-10<sup>5</sup> <= mat[i][j] <= 10<sup>5</sup></li>
 * @see <a href="https://leetcode.cn/problems/diagonal-traverse/">https://leetcode.cn/problems/diagonal-traverse/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic498FindDiagonalOrder {

    /**
     * @param mat [[1,2,3],[4,5,6],[7,8,9]]
     *            <p>1 2 3</p>
     *            <p>4 5 6</p>
     *            <p>7 8 9</p>
     * @return [1,2,4,7,5,3,6,8,9]
     * <li>↗ 1 ↙ 2 ↗ 3</li>
     * <li>↙ 4 ↗ 5 ↙ 6</li>
     * <li>↗ 7 ↙ 8 ↗ 9</li>
     */
    public static int[] findDiagonalOrder(int[][] mat) {
        // mat 的 行（n） 宽（m）
        int n = mat.length, m = mat[0].length, cnt = n * m;
        int[] ans = new int[cnt];
        int x = 0, y = 0, dir = 1, idx = 0;
        while (idx != cnt) {
            ans[idx++] = mat[x][y];
            int nx, ny;
            if (dir == 1) {
                nx = x - 1;
                ny = y + 1;
            }
            else {
                nx = x + 1;
                ny = y - 1;
            }
            boolean existed = idx < cnt && (nx < 0 || nx >= n || ny < 0 || ny >= m);
            if (existed) {
                if (dir == 1) {
                    nx = y + 1 < m ? x : x + 1;
                    ny = y + 1 < m ? y + 1 : y;
                }
                else {
                    nx = x + 1 < n ? x + 1 : x;
                    ny = x + 1 < n ? y : y + 1;
                }
                dir *= -1;
            }
            x = nx;
            y = ny;
        }
        return ans;
    }

}
