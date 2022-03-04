package vip.hyzt.questions;

/**
 * <h3>5.最长回文子串</h3>
 * <p>给你一个字符串 s，找到 s 中最长的回文子串。</p>
 * <b>示例 1：</b>
 * <pre>
 *     <strong>输入：</strong>s = "babad"
 *     <strong>输出：</strong>"bab"
 *     <strong>解释：</strong>"aba" 同样是符合题意的答案。
 * </pre>
 * <b>示例 2：</b>
 * <pre>
 *     <Strong>输入：</Strong>s = "cbbd"
 *     <Strong>输出：</Strong>"bb"
 * </pre>
 * @see <a href="https://leetcode-cn.com/problems/longest-palindromic-substring"><tt>leetcode</tt> 5. 最长回文子串</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic5LongestPalindrome {

    public static String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            // 回文串为奇数
            int l = i - 1, r = i + 1;
            String sub = getString(s, l, r);
            if (sub.length() > ans.length()) ans = sub;

            // 回文串为偶数
            l = i - 1;
            r = i + 1 - 1;
            sub = getString(s, l, r);
            if (sub.length() > ans.length()) ans = sub;
        }
        return ans;
    }

    static String getString(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
           l--;
           r++;
        }
        return s.substring(l + 1, r);
    }

}
