package vip.hyzt.questions;

/**
 * <h1>1779. 找到最近的有相同 X 或 Y 坐标的点</h1>
 * <p>给你两个整数 x 和 y ，表示你在一个笛卡尔坐标系下的 (x, y) 处。同时，在同一个坐标系下给你一个数组 points ，其中 points[i] = [a<sub>i</sub>, b<sub>i</sub>] 表示在 (a<sub>i</sub>, b<sub>i</sub>) 处有一个点。当一个点与你所在的位置有相同的 x 坐标或者相同的 y 坐标时，我们称这个点是 <strong>有效的</strong> 。</p>
 * <p>请返回距离你当前位置 <strong>曼哈顿距离</strong> 最近的 <strong>有效</strong> 点的下标（下标从 <strong>0</strong> 开始）。如果有多个最近的有效点，请返回下标 <strong>最小</strong> 的一个。如果没有有效点，请返回 -1 。</p>
 * <p>两个点 (x1, y1) 和 (x2, y2) 之间的 <strong>曼哈顿距离</strong> 为 abs(x1 - x2) + abs(y1 - y2) 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
 *     输出：2
 *     解释：所有点中，[3,1]，[2,4] 和 [4,4] 是有效点。有效点中，[2,4] 和 [4,4] 距离你当前位置的曼哈顿距离最小，都为 1 。[2,4] 的下标最小，所以返回 2 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：x = 3, y = 4, points = [[3,4]]
 *     输出：0
 *     提示：答案可以与你当前所在位置坐标相同。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：x = 3, y = 4, points = [[2,3]]
 *     输出：-1
 *     解释：没有 有效点。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= points.length <= 10<sup>4</sup></li>
 *     <li>points[i].length == 2</li>
 *     <li>1 <= x, y, ai, bi <= 10<sup>4</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/description/">https://leetcode.cn/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/description/</a>
 */
public class Topic1779NearestValidPoint {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int res = -1, min = 1000000004;
        for (int i = 0; i < points.length; i++) {
            int a = points[i][0], b = points[i][1];
            if (x == a || y == b) {
                int newMin = Math.abs(a - x) + Math.abs(b - y);
                if (min > newMin) {
                    min = newMin;
                    res = i;
                }
            }
        }
        return res;
    }

}
