package vip.hyzt.questions;

/**
 * <h1>剑指 Offer 47. 礼物的最大价值</h1>
 * <p></p>
 * <p>在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？</p>
 * <p></p>
 * <h2>示例 1:</h2>
 * <pre>
 *     输入:
 *     [
 *       [1,3,1],
 *       [1,5,1],
 *       [4,2,1]
 *     ]
 *     输出: 12
 *     解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>0 < grid.length <= 200</li>
 *     <li>0 < grid[0].length <= 200</li>
 * </ul>
 *
 * @author hy
 */
public class TopicOffer47MaxValue {

    private int[][] grid, memo;

//    public int maxValue(int[][] grid) {
//        this.grid = grid;
//        return dfs(grid.length - 1, grid[0].length - 1);
//    }
//
//    private int dfs(int i, int j) {
//        if (i < 0 || j < 0) {
//            return 0;
//        }
//        return Math.max(dfs(i, j - 1), dfs(i - 1, j)) + grid[i][j];
//    }

    public int maxValue(int[][] grid) {
        this.grid = grid;
        int m = grid.length, n = grid[0].length;
        memo = new int[m][n];
        return dfs(m - 1, n - 1);
    }

    private int dfs(int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (memo[i][j] > 0) {
            return memo[i][j];
        }
        return memo[i][j] = Math.max(dfs(i - 1, j), dfs(i, j - 1)) + grid[i][j];
    }

}
