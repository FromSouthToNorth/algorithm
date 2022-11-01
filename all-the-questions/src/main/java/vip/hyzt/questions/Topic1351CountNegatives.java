package vip.hyzt.questions;

/**
 * <h3>1351. 统计有序矩阵中的负数</h3>
 * <p>给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 请你统计并返回 grid 中 负数 的数目。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 *     输出：8
 *     解释：矩阵中共有 8 个负数。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：grid = [[3,2],[1,0]]
 *     输出：0
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>m == grid.length</li>
 *     <li>n == grid[i].length</li>
 *     <li>1 <= m, n <= 100</li>
 *     <li>-100 <= grid[i][j] <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/">https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1351CountNegatives {

    public static int countNegatives(int[][] grid) {
        int res = 0;
//        for (int i = 0, j = grid[0].length - 1; i < grid.length && j >= 0;) {
//            if (grid[i][j] >= 0) {
//                i++;
//            }
//            else {
//                ans += grid.length - i;
//                j--;
//            }
//        }
//        return res;
        for (int[] g : grid) {
            int n = g.length, left = 0, right = n - 1, index = -1;
            while (left <= right) {
                int mid = left + ((right - left) >> 1);
                int num = g[mid];
                if (num < 0) {
                    index = mid;
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            if (index != -1) {
                res += n - index;
            }
        }
        return res;
    }

}
