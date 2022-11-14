package vip.hyzt.questions;

/**
 * <h1>2466. 统计构造好字符串的方案数</h1>
 * <p>给你整数 zero ，one ，low 和 high ，我们从空字符串开始构造一个字符串，每一步执行下面操作中的一种：</p>
 * <ul>
 *     <li>将 '0' 在字符串末尾添加 zero  次。</li>
 *     <li>将 '1' 在字符串末尾添加 one 次。</li>
 * </ul>
 * <p>以上操作可以执行任意次。</p>
 * <p>如果通过以上过程得到一个 <strong>长度</strong> 在 low 和 high 之间（包含上下边界）的字符串，那么这个字符串我们称为 <strong>好</strong> 字符串。</p>
 * <p>请你返回满足以上要求的 <strong>不同</strong> 好字符串数目。由于答案可能很大，请将结果对 10<sup>9</sup> + 7 取余 后返回。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：low = 3, high = 3, zero = 1, one = 1
 *     输出：8
 *     解释：
 *     一个可能的好字符串是 "011" 。
 *     可以这样构造得到："" -> "0" -> "01" -> "011" 。
 *     从 "000" 到 "111" 之间所有的二进制字符串都是好字符串。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：low = 2, high = 3, zero = 1, one = 2
 *     输出：5
 *     解释：好字符串为 "00" ，"11" ，"000" ，"110" 和 "011" 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= low <= high <= 10<sup>5</sup></li>
 *     <li>1 <= zero, one <= low</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-ways-to-build-good-strings/">https://leetcode.cn/problems/count-ways-to-build-good-strings/</a>
 */
public class Topic2466CountGoodStrings {

    private static final int MOD = 1000000007;

    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        int count = 0;
        for (int i = dp[0] = 1; i <= high; i++) {
            count = (count + (dp[i] = ((i < zero ? 0 : dp[i - zero]) + (i < one ? 0 : dp[i - one])) % MOD)
                    * (i < low ? 0 : 1)) % MOD;
        }
        return count;
    }

}
