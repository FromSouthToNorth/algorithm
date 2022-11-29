package vip.hyzt.questions;

/**
 * <h1>2481. 分割圆的最少切割次数</h1>
 * <p>圆内一个 <strong>有效切割</strong> ，符合以下二者之一：</p>
 * <ul>
 *     <li>该切割是两个端点在圆上的线段，且该线段经过圆心。</li>
 *     <li>该切割是一端在圆心另一端在圆上的线段。</li>
 * </ul>
 * <p>一些有效和无效的切割如下图所示。</p>
 * <img src="https://assets.leetcode.com/uploads/2022/10/29/alldrawio.png">
 * <p>给你一个整数 n ，请你返回将圆切割成相等的 n 等分的 <strong>最少</strong> 切割次数。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/10/24/11drawio.png">
 * <pre>
 *    输入：n = 4
 *    输出：2
 *    解释：
 *    上图展示了切割圆 2 次，得到四等分。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/10/24/22drawio.png">
 * <per>
 *     输入：n = 3
 *     输出：3
 *     解释：
 *     最少需要切割 3 次，将圆切成三等分。
 *     少于 3 次切割无法将圆切成大小相等面积相同的 3 等分。
 *     同时可以观察到，第一次切割无法将圆切割开。
 * </per>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 100</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-cuts-to-divide-a-circle/">https://leetcode.cn/problems/minimum-cuts-to-divide-a-circle/</a>
 */
public class Topic2481NumberOfCuts {

    public int numberOfCuts(int n) {
        return n > 1 ? (n % 2 == 0 ? n / 2 : n) : 0;
    }

}
