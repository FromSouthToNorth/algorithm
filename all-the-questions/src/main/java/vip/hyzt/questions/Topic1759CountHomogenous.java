package vip.hyzt.questions;

/**
 * <h1>1759. 统计同构子字符串的数目</h1>
 * <p>给你一个字符串 s ，返回 s 中 <strong>同构子字符串</strong> 的数目。由于答案可能很大，只需返回对 10<sup>9 </sup> + 7 <strong>取余</strong> 后的结果。</p>
 * <p><strong>同构字符串</strong> 的定义为：如果一个字符串中的所有字符都相同，那么该字符串就是同构字符串。</p>
 * <p><strong>子字符串</strong> 是字符串中的一个连续字符序列。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *   输入：s = "abbcccaa"
 *   输出：13
 *   解释：同构子字符串如下所列：
 *   "a"   出现 3 次。
 *   "aa"  出现 1 次。
 *   "b"   出现 2 次。
 *   "bb"  出现 1 次。
 *   "c"   出现 3 次。
 *   "cc"  出现 2 次。
 *   "ccc" 出现 1 次。
 *   3 + 1 + 2 + 1 + 3 + 2 + 1 = 13
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "xy"
 *     输出：2
 *     解释：同构子字符串是 "x" 和 "y" 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：s = "zzzzz"
 *     输出：15
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= s.length <= 10<sup>5</sup></li>
 *     <li>s 由小写字符串组成</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-number-of-homogenous-substrings/">https://leetcode.cn/problems/count-number-of-homogenous-substrings/</a>
 */
public class Topic1759CountHomogenous {

    private static final int MOD = 1000000007;

    public int countHomogenous(String s) {
        int tmp = 1, res = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                tmp = (tmp + 1) % MOD;
            }
            else {
                tmp = 1;
            }
            res = (res + tmp) % MOD;
        }
        return res;
    }

}
