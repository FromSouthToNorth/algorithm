package vip.hyzt.questions;

/**
 * <h1>481. 神奇字符串</h1>
 * <p>神奇字符串 s 仅由 '1' 和 '2' 组成，并需要遵守下面的规则：</p>
 * <ul>
 *     <li>神奇字符串 s 的神奇之处在于，串联字符串中 '1' 和 '2' 的连续出现次数可以生成该字符串。</li>
 * </ul>
 * <p>s 的前几个元素是 s = "1221121221221121122……" 。如果将 s 中连续的若干 1 和 2 进行分组，可以得到 "1 22 11 2 1 22 1 22 11 2 11 22 ......" 。每组中 1 或者 2 的出现次数分别是 "1 2 2 1 1 2 1 2 2 1 2 2 ......" 。上面的出现次数正是 s 自身。</p>
 * <p>给你一个整数 n ，返回在神奇字符串 s 的前 n 个数字中 1 的数目。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：n = 6
 *     输出：3
 *     解释：神奇字符串 s 的前 6 个元素是 “122112”，它包含三个 1，因此返回 3 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 1
 *     输出：1
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/magical-string/">https://leetcode.cn/problems/magical-string/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic481MagicalString {

    public int magicalString(int n) {
        char[] cs = new char[n + 2];
        cs[0] = 1; cs[1] = cs[2] = 2;
        char c = 2;
        for (int i = 2, j = 3; j < n; i++) {
            c ^= 3;
            cs[j++] = c;
            if (cs[i] == 2) {
                cs[j++] = c;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += 2 - cs[i];
        }
        return res;
    }

}
