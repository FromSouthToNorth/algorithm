package vip.hyzt.questions.wc311;

/**
 * <h2>2413. 最小偶倍数</h2>
 * <p>给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：n = 5
 *     输出：10
 *     解释：5 和 2 的最小公倍数是 10 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：n = 6
 *     输出：6
 *     解释：6 和 2 的最小公倍数是 6 。注意数字会是它自身的倍数。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= n <= 150</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/smallest-even-multiple/">https://leetcode.cn/problems/smallest-even-multiple/</a>
 * @see <a href="https://zh.wikipedia.org/zh-tw/%E6%9C%80%E5%B0%8F%E5%85%AC%E5%80%8D%E6%95%B8">https://zh.wikipedia.org/zh-tw/%E6%9C%80%E5%B0%8F%E5%85%AC%E5%80%8D%E6%95%B8</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2413SmallestEvenMultiple {

    public int smallestEvenMultiple(int n) {
        return n * ((n & 1) + 1);
    }

}
