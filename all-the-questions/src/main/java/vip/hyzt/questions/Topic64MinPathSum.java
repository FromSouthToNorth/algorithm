package vip.hyzt.questions;

/**
 * <h3>64.最小路径和</h3>
 * <p>给定一个包含非负整数的 <pre><me>m</me><me>x</me><me>n</me></pre> 网格 <pre><me>grid</me></pre>，请找出一条左上角到右下角的路径，使得路径上的数字总和为最小。</p>
 * <p><b>说明：</b>每次只能向下或者向右移动一步。</p>
 * <p><b>示例 1：</b></p>
 * <img src="https://assets.leetcode.com/uploads/2020/11/05/minpath.jpg" />
 * <pre>
 *     <strong>输入：</strong>grid = [[1,3,1],[1,5,1],[4,2,1]]
 *     <strong>输出：</strong>7
 *     <strong>解释：</strong>因为路径 1→3→1→1→1 的总和最小。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>grid = [[1,2,3],[4,5,6]]
 *     <strong>输出：</strong>12
 * </pre>
 * @see <a href="https://leetcode-cn.com/problems/minimum-path-sum">64.最小路径和</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic64MinPathSum {

    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length, columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < columns; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[rows - 1][columns - 1];
    }

}
