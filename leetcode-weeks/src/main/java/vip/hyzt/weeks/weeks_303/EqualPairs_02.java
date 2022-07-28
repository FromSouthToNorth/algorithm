package vip.hyzt.weeks.weeks_303;

/**
 * <h3>2352. 相等行列对</h3>
 * <p>给你一个下标从 <strong>0</strong> 开始、大小为 <code>n x n</code> 的整数矩阵 grid ，返回满足 R<sub>i</sub> 行和 C<sub>j</sub> 列相等的行列对 (R<sub>i</sub>, C<sub>j</sub>) 的数目。</p>
 * <p>如果行和列以相同的顺序包含相同的元素（即相等的数组），则认为二者是相等的。</p>
 * <h4>示例 1：</h4>
 * <img src="https://assets.leetcode.com/uploads/2022/06/01/ex1.jpg" />
 * <pre>
 *     <strong>输入：</strong>grid = [[3,2,1],[1,7,6],[2,7,7]]
 *     <strong>输出：</strong>1
 *     <strong>解释：</strong>存在一对相等行列对：
 *          - (第 2 行，第 1 列)：[2,7,7]
 * </pre>
 * <h4>示例 2：</h4>
 * <img src="	https://assets.leetcode.com/uploads/2022/06/01/ex2.jpg" />
 * <pre>
 *     <strong>输入：</strong>grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
 *     <strong>输出：</strong>3
 *     <strong>解释：</strong>存在三对相等行列对：
 *            - (第 0 行，第 0 列)：[3,1,2,2]
 *            - (第 2 行, 第 2 列)：[2,4,2,2]
 *            - (第 3 行, 第 2 列)：[2,4,2,2]
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>n == grid.length == grid[i].length</li>
 *     <li>1 <= n <= 200</li>
 *     <li>1 <= grid[i][j] <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/equal-row-and-column-pairs/">https://leetcode.cn/problems/equal-row-and-column-pairs</a>
 * @author hy
 */
public class EqualPairs_02 {

    public int equalPairs(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                count += equalPairs(i, j, grid);
            }
        }
        return count;
    }

    private int equalPairs(int i, int j, int[][] grid){
        for (int k = 0; k < grid.length; k++) {
            if (grid[i][k] != grid[k][j]) {
                return 0;
            }
        }
        return 1;
    }

}
