package vip.hyzt.questions.wc334;

/**
 * <h1>2575. 找出字符串的可整除数组</h1>
 * <p></p>
 * <p>给你一个下标从 <strong>0</strong> 开始的字符串 word ，长度为 n ，由从 0 到 9 的数字组成。另给你一个正整数 m 。</p>
 * <p>word 的 <strong>可整除数组</strong> div 是一个长度为 n 的整数数组，并满足：</p>
 * <ul>
 *     <li>如果 word[0,...,i] 所表示的 <strong>数值</strong> 能被 m 整除，div[i] = 1</li>
 *     <li>否则，div[i] = 0</li>
 * </ul>
 * <p>返回 word 的可整除数组。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：word = "998244353", m = 3
 *     输出：[1,1,0,0,0,1,1,0,0]
 *     解释：仅有 4 个前缀可以被 3 整除："9"、"99"、"998244" 和 "9982443" 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：word = "1010", m = 10
 *     输出：[0,1,0,1]
 *     解释：仅有 2 个前缀可以被 10 整除："10" 和 "1010" 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 *     <li>word.length == n</li>
 *     <li>word 由数字 0 到 9 组成</li>
 *     <li>1 <= m <= 10<sup>9</sup></li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-the-divisibility-array-of-a-string/">https://leetcode.cn/problems/find-the-divisibility-array-of-a-string/</a>
 */
public class Topic2575DivisibilityArray {

    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] result = new int[n];
        for (long i = 0, mod = 0; i < n; i++) {
            mod = (mod * 10 + word.charAt((int) i) - '0') % m;
            result[(int) i] = mod == 0 ? 1 : 0;
        }
        return result;
    }

}
