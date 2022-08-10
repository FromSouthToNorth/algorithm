package vip.hyzt.questions;

/**
 * <h3>640. 求解方程</h3>
 * <p>求解一个给定的方程，将x以字符串 "x=#value"的形式返回。该方程仅包含 '+' ， '-' 操作，变量 x 和其对应系数。</p>
 * <p>如果方程没有解，请返回 "No solution" 。如果方程有无限解，则返回 “Infinite solutions” 。</p>
 * <p>题目保证，如果方程中只有一个解，则 <font>'x'</font> 的值是一个整数。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入: equation = "x+5-3+x=6+x-2"
 *     输出: "x=2"
 * </pre>
 * <h4>示例 2:</h4>
 * <pre>
 *     输入: equation = "x=x"
 *     输出: "Infinite solutions"
 * </pre>
 * <h4>示例 3:</h4>
 * <pre>
 *     输入: equation = "2x=x"
 *     输出: "x=0"
 * </pre>
 * <h4>提示:</h4>
 * <ul>
 *     <li>3 <= equation.length <= 1000</li>
 *     <li>equation 只有一个'='.</li>
 *     <li>equation 方程由整数组成，其绝对值在  [0, 100] 范围内，不含前导零和变量 'x' 。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/solve-the-equation">https://leetcode.cn/problems/solve-the-equation</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic640SolveEquation {

    public String solveEquation(String s) {
        int x =0, num = 0, n = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0, op = 1; i < n;) {
            if (chars[i] == '+') {
                op = 1;
                i++;
            }
            else if (chars[i] == '-') {
                op = -1;
                i++;
            }
            else if (chars[i] == '=') {
                x *= -1;
                num *= -1;
                op = 1;
                i++;
            }
            else {
                int j = i;
                while (j < n && chars[j] != '+' && chars[j] != '-' && chars[j] != '=') {
                    j++;
                }
                if (chars[j - 1] == 'x') {
                    x += (i < j - 1 ? Integer.parseInt(s.substring(i, j - 1)) : 1) * op;
                }
                else {
                    num += Integer.parseInt(s.substring(i, j)) * op;
                }
                i = j;
            }
        }
        if (x == 0) {
            return num == 0 ? "Infinite solutions" : "No solution";
        }
        else {
            int c = gcd(x, num);
            x /= c;
            num /= c;
            if (x > 0) {
                num *= -1;
            }
            return "x=" + num;
        }
    }

    int gcd (int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
