package vip.hyzt.questions;

/**
 * <h3>306. 累加数</h3>
 *
 * <p>累加数 是一个字符串，组成它的数字可以形成累加序列。</p>
 *
 * <p>一个有效的 累加序列 必须 至少 包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。</p>
 *
 * <p>给你一个只包含数字'0'-'9'的字符串，编写一个算法来判断给定输入是否是 累加数 。如果是，返回 true ；否则，返回 false 。</p>
 *
 * <p>说明：累加序列里的数 不会 以 0 开头，所以不会出现1, 2, 03 或者1, 02, 3的情况。</p>
 *
 * <h3>示例 1：</h3>
 * <ul>
 *     <li>输入："112358"</li>
 *     <li>输出：true </li>
 *     <li>解释：累加序列为: 1, 1, 2, 3, 5, 8 。1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8</li>
 * </ul>
 *
 * <h3>示例 2：</h3>
 * <ul>
 *     <li>输入："199100199"</li>
 *     <li>输出：true </li>
 *     <li>解释：累加序列为: 1, 99, 100, 199。1 + 99 = 100, 99 + 100 = 199</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/additive-number">链接：https://leetcode-cn.com/problems/additive-number</a>
 */
public abstract class Topic306IsAdditiveNumber {

    public static boolean isAdditiveNumber(String num) {
        int length = num.length();
        for (int secondStart = 1; secondStart < length - 1; ++secondStart) {
            if (num.charAt(0) == '0' && secondStart != 1) {
                break;
            }
            for (int secondEnd = secondStart; secondEnd < length - 1; ++secondEnd) {
                if (num.charAt(secondStart) == '0' && secondStart != secondEnd) {
                    break;
                }
                if (valid(secondStart, secondEnd, num)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean valid(int secondStart, int secondEnd, String num) {
        int length = num.length();
        int firstStart = 0, firstEnd = secondStart - 1;
        while (secondEnd <= length - 1) {
            String third = stringAdd(num, firstStart, firstEnd, secondStart, secondEnd);
            int thirdStart = secondEnd + 1;
            int thirdEnd = secondEnd + third.length();
            if (thirdEnd >= length || !num.substring(thirdStart, thirdEnd + 1).equals(third)) {
                break;
            }
            if (thirdEnd == length - 1) {
                return true;
            }
            firstStart = secondStart;
            firstEnd = secondEnd;
            secondStart = thirdStart;
            secondEnd = thirdEnd;
        }
        return false;
    }

    private static String stringAdd(String s, int firstStart, int firstEnd, int secondStart, int secondEnd) {
        StringBuilder third = new StringBuilder();
        int carry = 0, cur = 0;
        while (firstEnd >= firstStart || secondEnd >= secondStart || carry != 0) {
            cur = carry;
            if (firstEnd >= firstStart) {
                cur += s.charAt(firstEnd) - '0';
                --firstEnd;
            }
            if (secondEnd >= secondStart) {
                cur += s.charAt(secondEnd) - '0';
                --secondEnd;
            }
            carry = cur/ 10;
            cur %= 10;
            third.append((char) (cur + '0'));
        }
        third.reverse();
        return third.toString();
    }

}
