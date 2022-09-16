package vip.hyzt.questions;

/**
 * <h2>2397. 被列覆盖的最多行数</h2>
 * <p>给你一个下标从 <strong>0</strong> 开始的 m x n 二进制矩阵 mat 和一个整数 cols ，表示你需要选出的列数。</p>
 * <p>如果一行中，所有的 1 都被你选中的列所覆盖，那么我们称这一行 <strong>被覆盖</strong> 了。</p>
 * <p>请你返回在选择 cols 列的情况下，<strong>被覆盖</strong> 的行数 <strong>最大</strong> 为多少。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/07/14/rowscovered.png">
 * <pre>
 *     输入：mat = [[0,0,0],[1,0,1],[0,1,1],[0,0,1]], cols = 2
 *     输出：3
 *     解释：
 *     如上图所示，覆盖 3 行的一种可行办法是选择第 0 和第 2 列。
 *     可以看出，不存在大于 3 行被覆盖的方案，所以我们返回 3 。
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/07/14/rowscovered2.png">
 * <pre>
 *     输入：mat = [[1],[0]], cols = 1
 *     输出：2
 *     解释：
 *     选择唯一的一列，两行都被覆盖了，原因是整个矩阵都被覆盖了。
 *     所以我们返回 2 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>m == mat.length</li>
 *     <li>n == mat[i].length</li>
 *     <li>1 <= m, n <= 12</li>
 *     <li>mat[i][j] 要么是 0 要么是 1 。</li>
 *     <li>1 <= cols <= n</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/maximum-rows-covered-by-columns">https://leetcode.cn/problems/maximum-rows-covered-by-columns</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2397MaximumRows {

    public int maximumRows(int[][] mat, int cols) {
        int n = mat[0].length;
        int m = mat.length;
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i] = (nums[i] << 1) + mat[i][j];
            }
        }
        int max = 0;
        for (int i = 0; i < (1 << n); i++) {
            int t = Integer.bitCount(i);
            if (t > cols) {
                continue;
            }
            int c = 0;
            for (int j = 0; j < m; j++) {
                if ((i | nums[j]) == i) {
                    c++;
                }
            }
            max = Math.max(max, c);
        }
        return max;
    }

}
