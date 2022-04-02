package vip.hyzt.questions;

/**
 * <h3>420.强密码校验器</h3>
 * <p>如果一个密码满足下述所有条件，这认为这个密码是强密码：</p>
 * <ul>
 *     <li>至少包含<b>一个小写</b>字母，<b>一个大小</b>字母，和<b>一个数字</b></li>
 *     <li>同一个字符<b>不能</b>连续出现三次，<b>一个大写</b>字母，和<b>一个数字</b></li>
 *     <li>同一字符 <b>不能</b> 连续出现三次（比如 ”...aaa...”是不允许的，但是”...aa...a..”如果满足其他条件也可以算是强密码）。</li>
 * </ul>
 * <p>给你一个字符串 `password`， 返回 <i>将 `password` 修改到满足强密码条件需要的最少修改步数。如果 `password` 已经是强密码，则返回 0。</i></p>
 * <p>在一步修改操作中，你可以：</p>
 * <ul>
 *     <li>插入一个字符串到 `password`</li>
 *     <li>从 `password` 中删除一个字符，或</li>
 *     <li>用另一个字符来替代 `password` 中的某个字符</li>
 * </ul>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>password = "a"
 *     <strong>输出：</strong>5
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>password = "aA1"
 *     <strong>输出：</strong>3
 * </pre>
 * <p><b>示例 3：</b></p>
 * <pre>
 *     <strong>输入：</strong>password = "1227Cod3"
 *     <strong>输出：</strong>0
 * </pre>
 * <p><b>提示：</b></p>
 * <ul>
 *     <li>`1 <= password.length <= 50`</li>
 *     <li>password 由字母、数字、点 '.' 或者感叹号 '!'</li>
 * </ul>
 * @see <a href="https://leetcode-cn.com/problems/strong-password-checker">LeetCode 420. 强密码检验器</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic420StrongPasswordChecker {

    public static int strongPasswordChecker(String password) {
        char[] cs = password.toCharArray();
        int n = cs.length;
        int A = 0, B = 0, C = 0;
        for (char c : cs) {
            if (c >= 'a' && c <= 'z') A = 1;
            else if (c >= '0' && c <= '9') B = 1;
            else if (c >= 'A' && c <= 'Z') C = 1;
        }
        int m = A + B + C;
        if (n < 6) {
            return Math.max(6 - n, 3 - m);
        }
        else if (n <= 20) {
            int tot = 0;
            for (int i = 0; i < n;) {
                int j = i;
                while (j < n && cs[j] == cs[i]) j++;
                int cnt = j - i;
                if (cnt >= 3) tot += cnt / 3;
                i = j;
            }
            return Math.max(tot, 3 - m);
        }
        else {
            int tot = 0;
            int[] cnts = new int[3];
            for (int i = 0; i < n;) {
                int j = i;
                while (j < n && cs[j] == cs[i]) j++;
                int cnt = j - i;
                if (cnt >= 3) {
                    tot += cnt / 3; cnts[cnt % 3]++;
                }
                i = j;
            }
            int base = n - 20, cur = base;
            for (int i = 0; i < 3; i++) {
                if (i == 2) cnts[i] = tot;
                if (cnts[i] != 0 && cur != 0) {
                    int t = Math.min(cnts[i] * (i + 1), cur);
                    cur -= t; tot -= t / (i + 1);
                }
            }
            return base + Math.max(tot, 3 - m);
        }
    }

}
