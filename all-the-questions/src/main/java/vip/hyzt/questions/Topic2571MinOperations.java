package vip.hyzt.questions;

/**
 * <h1>2571. 将整数减少到零需要的最少操作数</h1>
 * <p></p>
 * <p>给你一个正整数 n ，你可以执行下述操作 <strong>任意</strong> 次：</p>
 * <ul>
 *     <li>n 加上或减去 2 的某个 <strong>幂</strong></li>
 * </ul>
 * <p>返回使 n 等于 0 需要执行的 <strong>最少</strong> 操作数。</p>
 * <p>如果 x == 2<sup>i</sup> 且其中 i >= 0 ，则数字 x 是 2 的幂。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：n = 39
 *     输出：3
 *     解释：我们可以执行下述操作：
 *     - n 加上 20 = 1 ，得到 n = 40 。
 *     - n 减去 23 = 8 ，得到 n = 32 。
 *     - n 减去 25 = 32 ，得到 n = 0 。
 *     可以证明使 n 等于 0 需要执行的最少操作数是 3 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 54
 *     输出：3
 *     解释：我们可以执行下述操作：
 *     - n 加上 21 = 2 ，得到 n = 56 。
 *     - n 加上 23 = 8 ，得到 n = 64 。
 *     - n 减去 26 = 64 ，得到 n = 0 。
 *     使 n 等于 0 需要执行的最少操作数是 3 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 * </ul>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-operations-to-reduce-an-integer-to-0/">https://leetcode.cn/problems/minimum-operations-to-reduce-an-integer-to-0/</a>
 */
public class Topic2571MinOperations {

    public int minOperations(int n) {
        int count = 0;
        for (int i = 0; i < 20; i++) {
            if ((n & 1 << i) > 0) {
                if ((n & 1 << i + 1) > 0) {
                    n += 1 << i;
                }
                count++;
            }
        }
        return count;
    }

}
