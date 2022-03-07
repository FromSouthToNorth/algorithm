package vip.hyzt.questions;

/**
 * <h3>504. 七进制数</h3>
 * <p>给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。</p>
 * <b>示例 1:</b>
 * <pre>
 *     <strong>输入: </strong>num = 100
 *     <strong>输出: </strong>"202"
 * </pre>
 * <b>示例 2:</b>
 * <pre>
 *     <strong>输入: </strong>num = -7
 *     <strong>输出: </strong>"-10"
 * </pre>
 * @see <a href="https://leetcode-cn.com/problems/base-7">504. 七进制数</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic504ConvertToBase7 {

    public static String convertToBase2(int num) {
        boolean flag = num < 0;
        if (flag) {
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(num % 2);
            num /= 2;
        } while (num != 0);
        sb.reverse();
        return flag ? "-" + sb : sb.toString();
    }

    public static String convertToBase7(int num) {
        boolean flag = num < 0;
        if (flag) {
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(num % 7);
            num /= 7;
        } while (num != 0);
        sb.reverse();
        return flag ? "-" + sb : sb.toString();
    }

}
