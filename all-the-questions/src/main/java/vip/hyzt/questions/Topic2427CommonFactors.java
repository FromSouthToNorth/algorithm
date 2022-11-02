package vip.hyzt.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>2427. 公因子的数目</h1>
 * <p>给你两个正整数 a 和 b ，返回 a 和 b 的 <strong>公</strong> 因子的数目。</p>
 * <p>如果 x 可以同时整除 a 和 b ，则认为 x 是 a 和 b 的一个 <strong>公因子</strong> 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：a = 12, b = 6
 *     输出：4
 *     解释：12 和 6 的公因子是 1、2、3、6 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：a = 25, b = 30
 *     输出：2
 *     解释：25 和 30 的公因子是 1、5 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= a, b <= 1000</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/number-of-common-factors/">https://leetcode.cn/problems/number-of-common-factors/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2427CommonFactors {

    public int commonFactors(int a, int b) {
        int n = Math.min(a, b), res = 0;
        for (int i = 1; i <= n; i++) {
            if ((a % i) + (b % i) == 0) {
                res++;
            }
        }
        return res;
    }

}
