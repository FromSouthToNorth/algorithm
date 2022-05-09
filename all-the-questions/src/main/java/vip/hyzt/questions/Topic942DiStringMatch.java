package vip.hyzt.questions;

/**
 * <h3>942.增减字符串匹配</h3>
 * <p>由范围 [0,n] 内所有整数组成的 n + 1 个整数的排列序列可以表示为长度为 n 的字符串 s ，其中:</p>
 * <li>如果perm[i] < perm[i + 1]，那么s[i] == 'I'</li>
 * <li>如果perm[i] > perm[i + 1]，那么 s[i] == 'D'</li>
 * <p>给定一个字符串 s ，重构排列 perm 并返回它。如果有多个有效排列perm，则返回其中 任何一个 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     <strong>输入：</strong>s = "IDID"
 *     <strong>输出：</strong>[0,4,1,3,2]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入：</strong>s = "III"
 *     <strong>输出：</strong>[0,1,2,3]
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     <strong>输入：</strong>s = "DDI"
 *     <strong>输出：</strong>[3,2,0,1]
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= s.length <= 10<sup>5</sup></=></li>
 * <li>s 只包含字符 "I" 或 "D"</li>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/di-string-match/">链接：https://leetcode.cn/problems/di-string-match/</a>
 */
public class Topic942DiStringMatch {

    public static int[] diStringMatch(String s) {
        int n = s.length(), left = 0, right = n;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            ans[i] = s.charAt(i) == 'I' ? left++ : right--;
        }
        ans[n] = left;
        return ans;
    }
}