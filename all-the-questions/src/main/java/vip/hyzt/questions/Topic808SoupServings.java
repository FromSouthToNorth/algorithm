package vip.hyzt.questions;

/**
 * <h1>808. 分汤</h1>
 * <p>有 <strong>A 和 B 两种类型</strong> 的汤。一开始每种类型的汤有 n 毫升。有四种分配操作：</p>
 * <p>提供 100ml 的 <strong>汤A</strong> 和 0ml 的 <strong>汤B</strong> 。</p>
 * <p>提供 75ml 的 <strong>汤A</strong> 和 25ml 的 <strong>汤B</strong> 。</p>
 * <p>提供 50ml 的 <strong>汤A</strong> 和 50ml 的 <strong>汤B</strong> 。</p>
 * <p>提供 25ml 的 <strong>汤A</strong> 和 75ml 的 <strong>汤B</strong> 。</p>
 * <p>当我们把汤分配给某人之后，汤就没有了。每个回合，我们将从四种概率同为 0.25 的操作中进行分配选择。如果汤的剩余量不足以完成某次操作，我们将尽可能分配。当两种类型的汤都分配完时，停止操作。</p>
 * <p>注意 不存在先分配 100 ml <strong>汤B</strong> 的操作。</p>
 * <p>需要返回的值： <strong>汤A</strong> 先分配完的概率 + <strong>汤A和汤B</strong> 同时分配完的概率 / 2。返回值在正确答案 10-<sup>5</sup> 的范围内将被认为是正确的。</p>
 * <p></p>
 * <h2>示例 1:</h2>
 * <pre>
 *     输入: n = 50
 *     输出: 0.62500
 *     解释:如果我们选择前两个操作，A 首先将变为空。
 *     对于第三个操作，A 和 B 会同时变为空。
 *     对于第四个操作，B 首先将变为空。
 *     所以 A 变为空的总概率加上 A 和 B 同时变为空的概率的一半是 0.25 *(1 + 1 + 0.5 + 0)= 0.625。
 * </pre>
 * <h2>示例 2:</h2>
 * <pre>
 *     输入: n = 100
 *     输出: 0.71875
 * </pre>
 * <p></p>
 * <h2>提示:</h2>
 * <ul>
 *     <li>0 <= n <= 10<sup>9</sup></li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/soup-servings/">https://leetcode.cn/problems/soup-servings/</a>
 */
public class Topic808SoupServings {

    private double[][] memo;

    public double soupServings(int n) {
        n = (int) Math.ceil((double) n / 25);
        if (n >= 179) {
            return 1.0;
        }
        memo = new double[n + 1][n + 1];

        return soupServings(n, n);
    }

    private double soupServings(int a, int b) {
        if (a <= 0 && b <= 0) {
            return 0.5;
        }
        else if (a <= 0) {
            return 1;
        }
        else if (b <= 0) {
            return 0;
        }
        if (memo[a][b] == 0) {
            memo[a][b] = 0.25 * (soupServings(a - 4, b) + soupServings(a - 3, b - 1) + soupServings(a - 2, b - 2) + soupServings(a - 1, b - 3));
        }

        return memo[a][b];
    }

}
