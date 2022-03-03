package vip.hyzt.questions;

/**
 * <h3>258.个位相加</h3>
 * <p>给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。</p>
 * <b>示例 1:</b>
 * <pre>
 *     <strong>输入:</strong>num = 38
 *     <strong>输出: </strong>2
 *     <strong>解释: </strong>各位相加的过程为：
 *     38 --> 3 + 8 --> 11
 *     11 --> 1 + 1 --> 2
 *     由于2 是一位数，所以返回 2。
 * </pre>
 * <b>示例 2:</b>
 * <pre>
 *     <strong>输入: </strong>num = 0
 *     <strong>输出: </strong>0
 * </pre>
 * 来源：力扣（LeetCode）
 * @see <a href="https://leetcode-cn.com/problems/add-digits"><tt>leetcode</tt> 258.个位相加</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic258AddDigits {

    /**
     * 模拟解法
     */
    public static int addDigits(int num) {
        while (num > 9) {
            int t = 0;
            while (num != 0) {
                t += num % 10;
                num /= 10;
            }
            num = t;
        }
        return num;
    }

}
