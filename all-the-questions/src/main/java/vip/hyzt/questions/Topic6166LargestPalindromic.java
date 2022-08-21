package vip.hyzt.questions;

/**
 * <h3>6166. 最大回文数字</h3>
 * <p>给你一个仅由数字（0 - 9）组成的字符串 num 。</p>
 * <p>请你找出能够使用 num 中数字形成的 <strong>最大回文</strong> 整数，并以字符串形式返回。该整数不含 <strong>前导零</strong> 。</p>
 * <p><b>注意：</b></p>
 * <ul>
 *     <li>你 <strong>无需</strong> 使用 num 中的所有数字，但你必须使用 <strong>至少</strong> 一个数字。</li>
 *     <li>数字可以重新排序。</li>
 * </ul>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：num = "444947137"
 *     输出："7449447"
 *     解释：
 *     从 "444947137" 中选用数字 "4449477"，可以形成回文整数 "7449447" 。
 *     可以证明 "7449447" 是能够形成的最大回文整数。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：num = "00009"
 *     输出："9"
 *     解释：
 *     可以证明 "9" 能够形成的最大回文整数。
 *     注意返回的整数不应含前导零。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= num.length <= 10<sup>5</sup></li>
 *     <li>num 由数字（0 - 9）组成</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/largest-palindromic-number">https://leetcode.cn/problems/largest-palindromic-number</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6166LargestPalindromic {

    public String largestPalindromic(String num) {
        int[] count = new int[10];
        for (char c : num.toCharArray()) {
            count[c - '0']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (count[i] > 1 && (sb.length() > 0 || i > 0)) {
                sb.append(i);
                count[i] -= 2;
            }
        }
        for (int i = 9; i >= 0 ; i--) {
            if (count[i] > 0) {
                return sb.toString() + i + sb.reverse();
            }
        }
        return sb.toString() + sb.reverse();
    }

}
