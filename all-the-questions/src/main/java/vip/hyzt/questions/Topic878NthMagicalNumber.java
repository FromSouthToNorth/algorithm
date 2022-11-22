package vip.hyzt.questions;

/**
 * <h1>878. 第 N 个神奇数字</h1>
 * <p>一个正整数如果能被 a 或 b 整除，那么它是神奇的。</p>
 * <p>给定三个整数 n , a , b ，返回第 n 个神奇的数字。因为答案可能很大，所以返回答案 <strong>对 10<sup>9</sup> + 7 取模</strong> 后的值。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：n = 1, a = 2, b = 3
 *     输出：2
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 4, a = 2, b = 3
 *     输出：6
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 10<sup>9</sup></li>
 *     <li>2 <= a, b <= 4 * 10<sup>4</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/nth-magical-number/description/">https://leetcode.cn/problems/nth-magical-number/description/</a>
 */
public class Topic878NthMagicalNumber {

    private final int mod = 1000000007;

    public int nthMagicalNumber(int n, int a, int b) {
        long gcd = a / nthMagicalNumber(a, b) * b;
        long left = 0, rigth = (long) Math.max(a, b) * n;
        while (left + 1 < rigth) {
            long mid = left + (rigth - left) / 2;
            if (mid / a + mid / b - mid / gcd >= n) {
                rigth = mid;
            }
            else {
                left = mid;
            }
        }
        return (int) (rigth % mod);
    }

    private int nthMagicalNumber(int a, int b) {
        return b == 0 ? a : nthMagicalNumber(b, a % b);
    }

}
