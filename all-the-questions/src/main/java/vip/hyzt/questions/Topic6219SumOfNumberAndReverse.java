package vip.hyzt.questions;

/**
 * <h1>6219. 反转之后的数字和</h1>
 * <p>给你一个 <strong>非负</strong> 整数 num 。如果存在某个 <strong>非负</strong> 整数 k 满足 k + reverse(k) = num  ，则返回 true ；否则，返回 false 。</p>
 * <p>reverse(k) 表示 k 反转每个数位后得到的数字。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *    输入：num = 443
 *    输出：true
 *    解释：172 + 271 = 443 ，所以返回 true 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：num = 63
 *     输出：false
 *     解释：63 不能表示为非负整数及其反转后数字之和，返回 false 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：num = 181
 *     输出：true
 *     解释：140 + 041 = 181 ，所以返回 true 。注意，反转后的数字可能包含前导零。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>0 <= num <= 10<sup>5</sup></li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * const sumOfNumberAndReverse = function(num) {
 *   for (let i = Math.floor(num / 2); i <= num; i++) {
 *     if ((i + Number(('' + i).split('').reverse().join(''))) === num) {
 *       return true;
 *     }
 *   }
 *   return false;
 * }
 * const nums = [443, 63, 181, 10e5, 10e5 - 6, 10e5 - 1];
 * for (let num of nums) {
 *   console.log("%d ", num, sumOfNumberAndReverse(num));
 * }
 * </pre>
 * @see <a href="https://leetcode.cn/problems/sum-of-number-and-its-reverse/">https://leetcode.cn/problems/sum-of-number-and-its-reverse/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6219SumOfNumberAndReverse {

    public boolean sumOfNumberAndReverse(int num) {
        for (int i = num / 2; i <= num; i++) {
            if (i + Integer.parseInt("" + new StringBuilder("" + i).reverse()) == num) {
                return true;
            }
//            if (i + reverse(i) == num) {
//                return true;
//            }
        }
        return false;
    }

    private int reverse(int num) {
        int res = 0;
        while (num > 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res;
    }

}
