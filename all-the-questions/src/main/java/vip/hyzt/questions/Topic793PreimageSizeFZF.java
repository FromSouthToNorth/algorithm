package vip.hyzt.questions;

/**
 * <h2>793. 阶乘函数后 K 个零</h2>
 * <p> f(x) 是 x! 末尾是 0 的数量。回想一下 x! = 1 * 2 * 3 * ... * x，且 0! = 1 。</p>
 * <ul>
 *     <li>例如， f(3) = 0 ，因为 3! = 6 的末尾没有 0 ；而 f(11) = 2 ，因为 11!= 39916800 末端有 2 个 0 。</li>
 * </ul>
 * <p>给定 k，找出返回能满足 f(x) = k 的非负整数 x 的数量。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：k = 0
 *     输出：5
 *     解释：0!, 1!, 2!, 3!, 和 4! 均符合 k = 0 的条件。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：k = 5
 *     输出：0
 *     解释：没有匹配到这样的 x!，符合 k = 5 的条件。
 * </pre>
 * <h3>示例 3:</h3>
 * <pre>
 *     输入: k = 3
 *     输出: 5
 * </pre>
 * <h3>提示:</h3>
 * <ul>
 *     <li>0 <= k <= 10<sup>9</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/preimage-size-of-factorial-zeroes-function/">https://leetcode.cn/problems/preimage-size-of-factorial-zeroes-function/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic793PreimageSizeFZF {

    public int preimageSizeFZF(int k) {
        if (k <= 1) {
            return 5;
        }
        return f (k) - f(k - 1);
    }

    int f(int x) {
        long l = 0L, r = (long) 1e10;
        while (l < r) {
            long mid = l + r + 1 >> 1;
            if (getCnt(mid) <= x) {
                l = mid;
            }
            else {
                r = mid - 1;
            }
        }
        return (int) r;
    }

    long getCnt(long x) {
        long ans = 0L;
        while (x != 0) {
            ans += x / 5;
            x /= 5;
        }
        return ans;
    }

}
