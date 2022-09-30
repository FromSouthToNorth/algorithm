package vip.hyzt.questions;

/**
 * <h2>面试题 01.08. 零矩阵</h2>
 * <p>编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：
 *     [
 *       [1,1,1],
 *       [1,0,1],
 *       [1,1,1]
 *     ]
 *     输出：
 *     [
 *       [1,0,1],
 *       [0,0,0],
 *       [1,0,1]
 *     ]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：
 *     [
 *       [0,1,2,0],
 *       [3,4,5,2],
 *       [1,3,1,5]
 *     ]
 *     输出：
 *     [
 *       [0,0,0,0],
 *       [0,4,5,0],
 *       [0,3,1,0]
 *     ]
 * </pre>
 * <h3>js</h3>
 * <pre>
 * function setZeroes(matrix) {
 *   let m = matrix.length, n = matrix[0].length;
 *   let row = [], col = [];
 *   for (let i = 0; i < m; i++) {
 *     for (let j = 0; j < n; j++) {
 *       if (matrix[i][j] == 0) {
 *         row[i] = col[j] = true;
 *       }
 *     }
 *   }
 *   for (let i = 0; i < m; i++) {
 *     for (let j = 0; j < n; j++) {
 *       if (row[i] || col[j]) {
 *         matrix[i][j] = 0;
 *       }
 *     }
 *   }
 * }
 * let matrix1 = [[1,1,1],[1,0,1],[1,1,1]];
 * let matrix2 = [[0,1,3,0],[2,3,5,2],[6,7,5,2]];
 * setZeroes(matrix1);
 * for (const m of matrix1) {
 *   console.log(m);
 * }
 * setZeroes(matrix2);
 * for (const m of matrix2) {
 *   console.log(m);
 * }
 * </pre>
 * @see <a href="https://leetcode.cn/problems/zero-matrix-lcci">https://leetcode.cn/problems/zero-matrix-lcci</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class TopicInterview01_08SetZeroes {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
