package vip.hyzt.questions;

/**
 * <h1>6357. 最少得分子序列</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/subsequence-with-the-minimum-score/">https://leetcode.cn/problems/subsequence-with-the-minimum-score/ 11</a>
 */
public class Topic2565MinimumScore {

    public int minimumScore(String s, String t) {
        int n = s.length();
        int[] dp = new int[n + 1];
        int min = t.length();
        for (int i = 0, j = 0; i < n; i++) {
            dp[i + 1] = j += j < t.length() && s.charAt(i) == t.charAt(j) ? 1 : 0;
        }
        for (int i = n - 1, j = t.length() - 1; i >= 0; i--) {
            min = Math.min(min, Math.max(0, (j -= j >= 0 && s.charAt(i) == t.charAt(j) ? 1 : 0) - dp[i] + 1));
        }
        return Math.min(min, t.length() - dp[n]);
    }

}
