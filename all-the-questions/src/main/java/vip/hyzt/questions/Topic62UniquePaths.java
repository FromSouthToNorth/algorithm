package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>62. 不同路径</h3>
 * <p>一个机器人位于一个 `m x n` 网格的左上角 （起始点在下图中标记为 “Start” ）。</p>
 * <p>机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。</p>
 * <p>问总共有多少条不同的路径？</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png">
 * <pre>
 *    输入：m = 3, n = 7
 *    输出：28
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：m = 3, n = 2
 *     输出：3
 *     解释：
 *     从左上角开始，总共有 3 条路径可以到达右下角。
 *     1. 向右 -> 向下 -> 向下
 *     2. 向下 -> 向下 -> 向右
 *     3. 向下 -> 向右 -> 向下
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：m = 7, n = 3
 *     输出：28
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入：m = 3, n = 3
 *     输出：6
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= m, n <= 100</li>
 * <li>题目数据保证答案小于等于 2 * 10<sup>9</sup></li>
 * @see <a href="https://leetcode.cn/problems/unique-paths">https://leetcode.cn/problems/unique-paths</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic62UniquePaths {

    public static int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        f[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j > 0) {
                    // 当前位置能【往下】也能【往右】移动
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                }
                else if (i > 0) {
                    // 往下移动
                    f[i][j] = f[i - 1][j];
                }
                else if (j > 0) {
                    // 往右移动
                    f[i][j] = f[i][j - 1];
                }
            }
        }
        System.out.println(Arrays.deepToString(f));
        return f[m - 1][n - 1];
    }

}
