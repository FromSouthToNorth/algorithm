package vip.hyzt.questions;

/**
 * <h1>902. 最大为 N 的数字组合</h1>
 * <p>给定一个按 <strong>非递减顺序</strong> 排列的数字数组 digits 。你可以用任意次数 digits[i] 来写的数字。例如，如果 digits = ['1','3','5']，我们可以写数字，如 '13', '551', 和 '1351315'。</p>
 * <p>返回 <em>可以生成的小于或等于给定整数 n 的正整数的个数</em> 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：digits = ["1","3","5","7"], n = 100
 *     输出：20
 *     解释：
 *     可写出的 20 个数字是：
 *     1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：digits = ["1","4","9"], n = 1000000000
 *     输出：29523
 *     解释：
 *     我们可以写 3 个一位数字，9 个两位数字，27 个三位数字，
 *     81 个四位数字，243 个五位数字，729 个六位数字，
 *     2187 个七位数字，6561 个八位数字和 19683 个九位数字。
 *     总共，可以使用D中的数字写出 29523 个整数。
 * </pre>
 * <h2>示例 3:</h2>
 * <pre>
 *     输入：digits = ["7"], n = 8
 *     输出：1
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= digits.length <= 9</li>
 *     <li>digits[i].length == 1</li>
 *     <li>digits[i] 是从 '1' 到 '9' 的数</li>
 *     <li>digits 中的所有值都 不同 </li>
 *     <li>digits 按 非递减顺序 排列</li>
 *     <li>1 <= n <= 10<sup>9</sup></li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * const atMostNGivenDigitSet = function (digits, n) {
 *     const s = '' + n;
 *     const m = digits.length, k = s.length;
 *     const dp = new Array(k + 1).fill(0).map(() => new Array(2).fill(0));
 *     dp[0][1] = 1;
 *     for (let i = 1; i <= k; i++) {
 *         for (let j = 0; j < m; j++) {
 *             if (digits[j][0] === s[i - 1]) {
 *                 dp[i][1] = dp[i - 1][1];
 *             }
 *             else if (digits[j][0] < s[i - 1]) {
 *                 dp[i][0] += dp[i - 1][1];
 *             }
 *             else {
 *                 break;
 *             }
 *         }
 *         if (i > 1) {
 *             dp[i][0] += m + dp[i - 1][0] * m;
 *         }
 *     }
 *     return dp[k][0] + dp[k][1];
 * }
 *
 * console.log(atMostNGivenDigitSet(["1", "2", "3", "4", "5", "6", "7", "8", "9"], 10e9));
 * console.log(atMostNGivenDigitSet(["1", "4", "9"], 1000000000));
 * console.log(atMostNGivenDigitSet(["1", "3", "5", "7"], 100));
 * console.log(atMostNGivenDigitSet(["7"], 8));
 * </pre>
 * @see <a href="https://leetcode.cn/problems/numbers-at-most-n-given-digit-set/description/">https://leetcode.cn/problems/numbers-at-most-n-given-digit-set/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic902AtMostNGivenDigitSet {

    public int atMostNGivenDigitSet(String[] digits, int n) {
        String s = Integer.toString(n);
        int m = digits.length, k = s.length();
        int[][] dp = new int[k + 1][2];
        dp[0][1] = 1;
        for (int i = 1; i <= k; i++) {
            for (String digit : digits) {
                char d = digit.charAt(0), c = s.charAt(i - 1);
                if (d == c) {
                    dp[i][1] = dp[i - 1][1];
                }
                else if (d < c) {
                    dp[i][0] += dp[i - 1][1];
                }
                else {
                    break;
                }
            }
            if (i > 1) {
                dp[i][0] += m + dp[i - 1][0] * m;
            }
        }
        return dp[k][0] + dp[k][1];
    }

}
