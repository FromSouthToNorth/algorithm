package vip.hyzt.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * <h2>564.寻找最近的回文数</h2>
 *
 * <p>给定一个表示整数的字符串 n ，返回与它最近的回文整数（不包括自身）。如果不止一个，返回较小的那个。</p>
 * <p>“最近的”定义为两个整数差的绝对值最小。</p>
 *
 * <b>示例 1: </b>
 * <pre>
 *     <strong>输入：</strong>n = "123"
 *     <strong>输出：</strong>"121"
 * </pre>
 * <b>示例 2: </b>
 * <pre>
 *    <strong>输入：</strong>n = "1"
 *    <strong>输出：</strong>"0"
 *    <strong>解释：</strong>0 和 2是最近的回文，但我们返回最小的，也就是 0。
 * </pre>
 *
 * <b>提示：</b>
 * <ul>
 *  <li>1 <= n.length <= 18</li>
 *  <li>n 只由数字组成</li>
 *  <li>n 不含前导 0</li>
 *  <li>n 代表在 [1, 10<sup>18</sup> - 1] 范围内的整数</li>
 * </ul>
 *
 * @see <a href="https://leetcode-cn.com/problems/find-the-closest-palindrome">链接：https://leetcode-cn.com/problems/find-the-closest-palindrome</a>
 * @author hy
 * @author 力扣（LeetCode）
 */
public abstract class Topic564NearestPalindromic {

    public static String nearestPalindromic(String s) {
        int n = s.length();
        long cur = Long.parseLong(s);
        Set<Long> set = new HashSet<>();
        set.add((long) Math.pow(10, n - 1) - 1);
        set.add((long) Math.pow(10, n) + 1);
        long t = Long.parseLong(s.substring(0, (n + 1) / 2));
        for (long i = t - 1; i <= t + 1; i++) {
            long temp = -1L;
            if (n % 2 == 0) {
                temp = getNum(i, true);
            }
            else {
                temp = getNum(i, false);
            }
            if (temp != cur) {
                set.add(temp);
            }
        }
        long ans = -1L;
        for (Long i : set) {
            if (ans == -1) {
                ans = i;
            }
            else if (Math.abs(i - cur) < Math.abs(ans - cur)) {
                ans = i;
            }
            else if (Math.abs(i - cur) == Math.abs(ans - cur) && i < ans) {
                ans = i;
            }
        }
        return String.valueOf(ans);
    }

    public static long getNum(long k, boolean isEven) {
        StringBuilder sb = new StringBuilder();
        sb.append(k);
        int idx = isEven ? sb.length() - 1 : sb.length() - 2;
        while (idx >= 0) {
            sb.append(sb.charAt(idx--));
        }
        return Long.parseLong(sb.toString());
    }

}
