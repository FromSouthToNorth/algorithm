package vip.hyzt.questions;

/**
 * <h3>9.回文串</h3>
 * <p>给你一个整数 <code>x</code> ，如果 <code>x</code> 是一个回文整数，返回 <code>true</code> ；否则，返回 <code>false</code> 。</p>
 * <p>回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。</p>
 * <li>例如，121 是回文，而 123 不是。</li>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>x = 121
 *     <strong>输出：</strong>true
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>x = -121
 *     <strong>输出：</strong>false
 *     <strong>解释：</strong>从左向右读，为 -121。从右往左读，为 121-。因此它不是一个回文数。
 * </pre>
 * <p><b>示例 3：</b></p>
 * <pre>
 *     <strong>输入：</strong>x = 10
 *     <strong>输出：</strong>false
 *     <strong>解释：</strong>从右向左读，为 01。因此它不是一个回文数。
 * </pre>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/palindrome-number">9.回文串</a>
 */
public abstract class Topic9IsPalindrome {

    /**
     * 字符串解法
     */
    public static boolean isPalindromeStr(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        // 反正字符串
        sb.reverse();
        return sb.toString().equals(s);
    }

    /**
     * 反正字符串解法
     */
    public static boolean isPalindromeReverseStr(int x) {
        if(x < 0) {
            return false;
        }
        long ans = 0;
        int t = x;
        while (x > 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans - t == 0;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int t = 0;
        while (x > t) {
            t = t * 10 + x % 10;
            x /= 10;
        }
        return x == t || x == t / 10;
    }

}
