package vip.hyzt.questions;

/**
 * <h2>1582. 二进制矩阵中的特殊位置</h2>
 * <p>给你一个大小为 rows x cols 的矩阵 mat，其中 mat[i][j] 是 0 或 1，请返回 <strong>矩阵 <i>mat</i> 中特殊位置的数目</strong> 。</p>
 * <p><strong>特殊位置</strong> 定义：如果 mat[i][j] == 1 并且第 i 行和第 j 列中的所有其他元素均为 0（行和列的下标均 <strong>从 0 开始</strong> ），则位置 (i, j) 被称为特殊位置。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：mat = [[1,0,0],
 *                 [0,0,<strong>1</strong>],
 *                 [1,0,0]]
 *     输出：1
 *     解释：(1,2) 是一个特殊位置，因为 mat[1][2] == 1 且所处的行和列上所有其他元素都是 0
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：mat = [[<strong>1</strong>,0,0],
 *                 [0,<strong>1</strong>,0],
 *                 [0,0,<strong>1</strong>]]
 *     输出：3
 *     解释：(0,0), (1,1) 和 (2,2) 都是特殊位置
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：mat = [[0,0,0,<strong>1</strong>],
 *                 [<strong>1</strong>,0,0,0],
 *                 [0,1,1,0],
 *                 [0,0,0,0]]
 *     输出：2
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入：mat = [[0,0,0,0,0],
 *                 [<strong>1</strong>,0,0,0,0],
 *                 [0,<strong>1</strong>,0,0,0],
 *                 [0,0,<strong>1</strong>,0,0],
 *                 [0,0,0,1,1]]
 *     输出：3
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>rows == mat.length</li>
 *     <li>cols == mat[i].length</li>
 *     <li>1 <= rows, cols <= 100</li>
 *     <li>mat[i][j] 是 0 或 1</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/special-positions-in-a-binary-matrix">https://leetcode.cn/problems/special-positions-in-a-binary-matrix</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1592NumSpecial {

    public int numSpecial(int[][] mat) {
        int result = 0, r = mat.length, m = mat[0].length;
        int[] row = new int[r];
        int[] col = new int[m];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < m; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    result++;
                }
            }
        }
        return result;
    }

}
