package vip.hyzt.questions;

/**
 * <h1>2536. 子矩阵元素加 1</h1>
 * <p></p>
 * <p>给你一个正整数 n ，表示最初有一个 n x n 、下标从 <strong>0</strong> 开始的整数矩阵 mat ，矩阵中填满了 0 。</p>
 * <p>另给你一个二维整数数组 query 。针对每个查询 query[i] = [row1<sub>i</sub>, col1<sub>i</sub>, row2<sub>i</sub>, col2<sub>i</sub>] ，请你执行下述操作：</p>
 * <ul>
 *     <li>找出 <strong>左上角</strong> 为 (row1i, col1i) 且 <strong>右下角</strong> 为 (row2i, col2i) 的子矩阵，将子矩阵中的 <strong>每个元素</strong> 加 1 。也就是给所有满足 row1i <= x <= row2i 和 col1i <= y <= col2i 的 mat[x][y] 加 1 。</li>
 * </ul>
 * <p>返回执行完所有操作后得到的矩阵 mat 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/11/24/p2example11.png">
 * <pre>
 *     输入：n = 3, queries = [[1,1,2,2],[0,0,1,1]]
 *     输出：[[1,1,0],[1,2,1],[0,1,1]]
 *     解释：上图所展示的分别是：初始矩阵、执行完第一个操作后的矩阵、执行完第二个操作后的矩阵。
 *     - 第一个操作：将左上角为 (1, 1) 且右下角为 (2, 2) 的子矩阵中的每个元素加 1 。
 *     - 第二个操作：将左上角为 (0, 0) 且右下角为 (1, 1) 的子矩阵中的每个元素加 1 。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/11/24/p2example22.png">
 * <pre>
 *     输入：n = 2, queries = [[0,0,1,1]]
 *     输出：[[1,1],[1,1]]
 *     解释：上图所展示的分别是：初始矩阵、执行完第一个操作后的矩阵。
 *     - 第一个操作：将矩阵中的每个元素加 1 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 500</li>
 *     <li>1 <= queries.length <= 10<sup>4</sup></li>
 *     <li>0 <= row1i <= row2<sub>i</sub> < n</li>
 *     <li>0 <= col1i <= col2<sub>i</sub> < n</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/increment-submatrices-by-one/">https://leetcode.cn/problems/increment-submatrices-by-one/</a>
 */
public class Topic2536RangeAddQueries {

    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] res = new int[n][n];
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[2]; i++) {
                res[i][query[1]]++;
                if (query[3] < n - 1) {
                    res[i][query[3] + 1]--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                res[i][j] += res[i][j - 1];
            }
        }
        return res;
    }

}
