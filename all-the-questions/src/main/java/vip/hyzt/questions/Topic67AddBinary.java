package vip.hyzt.questions;

/**
 * <h3>67.二进制求和</h3>
 * <p>给你两个二进制字符串，返回它们的和（用二进制表示）。</p>
 * <p>输入为 非空 字符串且只包含数字`1`和`0`。</p>
 * <p><b>示例1:</b></p>
 * <pre>
 *     <strong>输入: </strong>a = "11", b = "1"
 *     <strong>输出: </strong>"100"
 * </pre>
 * 示例2:
 * <pre>
 *     <strong>输入: </strong>a = "1010", b = "1011"
 *     <strong>输出: </strong>"10101"
 * </pre>
 * <p><b>提示：</b></p>
 * <ul>
 *     <li>每个字符串仅由字符 '0' 或 '1' 组成。</li>
 *     <li>1 <= a.length, b.length <= 10^<sup>4</sup></li>
 *     <li>字符串如果不是 "0" ，就都不含前导零。</li>
 * </ul>
 * @see <a href="https://leetcode-cn.com/problems/add-binary">链接：https://leetcode-cn.com/problems/add-binary</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic67AddBinary {

    public static String addBinary(String a, String b) {
        int an = a.length() - 1, bn = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (an >= 0 || bn >= 0) {
            int sum = carry;
            if (an >= 0) {
                sum += a.charAt(an) == '0' ? 0 : 1;
            }
            if (bn >= 0) {
                sum+= b.charAt(bn) == '0' ? 0 : 1;
            }
            sb.append(sum % 2);
            carry = sum / 2;
            an--;
            bn--;
        }
        sb.append(carry == 1 ? carry : "");
        return sb.reverse().toString();
    }

}
