package vip.hyzt.questions;

/**
 * <h3>1220. 统计元音字母序列的数目</h3>
 * <p>给你一个整数n，请你帮忙统计一下我们可以按下述规则形成多少个长度为n的字符串：</p>
 * <ul>
 *     <li>字符串中的每个字符都应当是小写元音字母（'a', 'e', 'i', 'o', 'u'）</li>
 *     <li>每个元音'a'后面都只能跟着'e'</li>
 *     <li>每个元音'e'后面只能跟着'a'或者是'i'</li>
 *     <li>每个元音'i'后面不能 再跟着另一个'i'</li>
 *     <li>每个元音'o'后面只能跟着'i'或者是'u'</li>
 *     <li>每个元音'u'后面只能跟着'a'</li>
 *     <li>由于答案可能会很大，所以请你返回 模10^9 + 7之后的结果。</li>
 * </ul>
 *
 * <p>示例 1:</p>
 * <pre>
 *     <strong>输入：</strong>n = 1
 *     <strong>输出：</strong>5
 *     <strong>解释：</strong>所有可能的字符串分别是："a", "e", "i" , "o" 和 "u"。
 * </pre>
 * <p>示例 2:</p>
 * <pre>
 *     <strong>输入：</strong>n = 2
 *     <strong>输出：</strong>10
 *     <strong>解释：</strong>所有可能的字符串分别是："ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" 和 "ua"。
 * </pre>
 * <p>示例 3:</p>
 * <pre>
 *     <strong>输入：</strong>n = 5
 *     <strong>输出：</strong>68
 * </pre>
 * @see <a href="https://leetcode-cn.com/problems/count-vowels-permutation"> * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。</a>
 * @author  力扣（LeetCode）
 * @author hy
 */
public abstract class Topic1220CountVowelPermutation {

    public static int dynamicProgramming(int n) {
        long mod = 1000000007;
        long[] dp = new long[5];
        long[] ndp = new long[5];
        for (int i = 0; i < 5; i++) {
            dp[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            ndp[0] = (dp[1] + dp[2] + dp[4]) % mod;
            ndp[1] = (dp[0] + dp[2]) % mod;
            ndp[2] = (dp[1] + dp[3]) % mod;
            ndp[3] = dp[2];
            ndp[4] = (dp[2] + dp[3]) % mod;
            System.arraycopy(ndp, 0, dp, 0, 5);
        }

        long ans = 0;
        for (int i = 0; i < 5; i++) {
            ans = (ans + dp[i]) % mod;
        }
        return (int) ans;
    }

}
