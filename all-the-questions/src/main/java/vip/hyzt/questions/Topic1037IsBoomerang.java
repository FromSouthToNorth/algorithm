package vip.hyzt.questions;

/**
 * <h3>1037. 有效的回旋镖</h3>
 * <p>给定一个数组 points ，其中 points[i] = [x<sub>i</sub>, y<sub>i</sub>] 表示 X-Y 平面上的一个点，如果这些点构成一个 回旋镖 则返回 true 。</p>
 * <p>回旋镖 定义为一组三个点，这些点 各不相同 且 不在一条直线上 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：points = [[1,1],[2,3],[3,2]]
 *     输出：true
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：points = [[1,1],[2,2],[3,3]]
 *     输出：false
 * </pre>
 * <h3>提示：</h3>
 * <li>points.length == 3</li>
 * <li>points[i].length == 2</li>
 * <li>0 <= x<sub>i</sub>, y<sub>i</sub> <= 100</li>
 * @see <a href="https://leetcode.cn/problems/valid-boomerang/">https://leetcode.cn/problems/valid-boomerang/</a>
 * @author hy
 */
public class Topic1037IsBoomerang {

    public static boolean isBoomerang(int[][] points) {
        return (points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) != (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]);
    }

}
