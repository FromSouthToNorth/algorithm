package vip.hyzt.questions;

/**
 * <h3>883. 三维形体投影面积</h3>
 * <p>在n x n的网格grid中，我们放置了一些与 x，y，z 三轴对齐的1 x 1 x 1立方体。</p>
 * <p>每个值v = grid[i][j]表示 v个正方体叠放在单元格(i, j)上。</p>
 * <p>现在，我们查看这些立方体在 xy、yz和 zx平面上的投影。</p>
 * <p>投影就像影子，将 三维 形体映射到一个 二维 平面上。从顶部、前面和侧面看立方体时，我们会看到“影子”。</p>
 * <p>返回 <i>所有三个投影的总面积</i> 。</p>
 * <p><b>示例 1：</b></p>
 * <img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/02/shadow.png" >
 * <pre>
 *     <strong>输入：</strong>[[1,2],[3,4]]
 *     <strong>输出：</strong>17
 *     <strong>解释：</strong>这里有该形体在三个轴对齐平面上的三个投影(“阴影部分”)。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>grid = [[2]]
 *     <strong>输出：</strong>5
 * </pre>
 * <p><b>示例 3：</b></p>
 * <pre>
 *     <strong>输入：</strong>[[1,0],[0,2]]
 *     <strong>输出：</strong>8
 * </pre>
 * <p><b>提示：</b></p>
 * <li>n == grid.length == grid[i].length</li>
 * <li>1 <= n <= 50</li>
 * <li>0 <= grid[i][j] <= 50</li>
 * @see <a href="https://leetcode-cn.com/problems/projection-area-of-3d-shapes/">链接：https://leetcode-cn.com/problems/projection-area-of-3d-shapes/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic883ProjectionArea {

    public static int projectionArea(int[][] grid) {
        int ans1 = 0, ans2 = 0, ans3 = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            int a = 0, b = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) ans1++;
                a = Math.max(a, grid[i][j]);
                b = Math.max(b, grid[j][i]);
            }
            ans2 += a; ans3 += b;
        }

        return ans1 + ans2 + ans3;
    }

}
