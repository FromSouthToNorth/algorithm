package vip.hyzt.questions;

/**
 * <h1>647. 回文子串</h1>
 * <p>给你一个字符串 s ，请你统计并返回这个字符串中 <strong>回文子串</strong> 的数目。</p>
 * <p><strong>回文字符串</strong> 是正着读和倒过来读一样的字符串。</p>
 * <p><strong>子字符串</strong> 是字符串中的由连续字符组成的一个序列。</p>
 * <p>具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：s = "abc"
 *     输出：3
 *     解释：三个回文子串: "a", "b", "c"
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "aaa"
 *     输出：6
 *     解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= s.length <= 1000</li>
 *     <li>s 由小写英文字母组成</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/palindromic-substrings/description/">https://leetcode.cn/problems/palindromic-substrings/description/</a>
 */
public class Topic647CountSubstrings {

    public int countSubstrings(String s) {
        int n = s.length(), res = 0;
        for (int i = 0; i < 2 * n; i++) {
            for (int l = i / 2, r = l + i % 2;
                 l >= 0 && r < n && s.charAt(l) == s.charAt(r);
                 l--, r++) {

                res++;
            }
        }
        return res;
    }

}
