package vip.hyzt.questions.wcb86;

/**
 * <h2>2396. 严格回文的数字</h2>
 * <p>如果一个整数 n 在 b 进制下（b 为 2 到 n - 2 之间的所有整数）对应的字符串 <strong>全部</strong> 都是 <strong>回文的</strong> ，那么我们称这个数 n 是 <strong>严格回文</strong> 的。</p>
 * <p>给你一个整数 n ，如果 n 是 <strong>严格回文</strong> 的，请返回 true ，否则返回 false 。</p>
 * <p>如果一个字符串从前往后读和从后往前读完全相同，那么这个字符串是 <strong>回文的</strong> 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：n = 9
 *     输出：false
 *     解释：在 2 进制下：9 = 1001 ，是回文的。
 *     在 3 进制下：9 = 100 ，不是回文的。
 *     所以，9 不是严格回文数字，我们返回 false 。
 *     注意在 4, 5, 6 和 7 进制下，n = 9 都不是回文的。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：n = 4
 *     输出：false
 *     解释：我们只考虑 2 进制：4 = 100 ，不是回文的。
 *     所以我们返回 false 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>4 <= n <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/strictly-palindromic-number">https://leetcode.cn/problems/strictly-palindromic-number</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2396IsStrictlyPalindromic {

    public boolean isStrictlyPalindromic(int n) {
//        return false;
        for (int i = 2; i <= n - 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = n; j > 0; j /= i) {
                sb.append(j % i);
            }
            for (int left = 0, right = sb.length() - 1; left < right; ++left, --right) {
                if (sb.charAt(left) != sb.charAt(right)) {
                    return false;
                }
            }
        }
        return true;
    }

}
