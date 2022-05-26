package vip.hyzt.questions;

/**
 * <h3>7. 整数反转</h3>
 * <p>给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。</p>
 * <p>如果反转后整数超过 32 位的有符号整数的范围[−2<sup>31</sup>, 2<sup>31</sup> − 1] ，就返回 0。</p>
 * <p><strong>假设环境不允许存储 64 位整数（有符号或无符号）。</strong></p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：x = 123
 *     输出：321
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：x = -123
 *     输出：-321
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：x = 120
 *     输出：21
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入：x = 0
 *     输出：0
 * </pre>
 * <h3>提示：</h3>
 * <li>-231 <= x <= 231 - 1</li>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/reverse-integer/"> 链接：https://leetcode.cn/problems/reverse-integer/</a>
 */
public class Topic7Reverse {

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if (x > 0 && ans >(Integer.MAX_VALUE - x % 10) / 10) return 0;
            if (x < 0 && ans <(Integer.MIN_VALUE - x % 10) / 10) return 0;
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans;
    }

}
