package vip.hyzt.questions;

/**
 * <h1>2544. 交替数字和</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/alternating-digit-sum/">https://leetcode.cn/problems/alternating-digit-sum/</a>
 */
public class Topic2544AlternateDigitSum {

    public int alternateDigitSum(int n) {
        int sum = 0, sign = -1;
        for (char c : (n + "").toCharArray()) {
            sum += (sign *= -1) * (c - '0');
        }
        return sum;
    }

}
