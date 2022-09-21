package vip.hyzt.questions;

/**
 * <h2>854. 相似度为 K 的字符串</h2>
 * <p>对于某些非负整数 k ，如果交换 s1 中两个字母的位置恰好 k 次，能够使结果字符串等于 s2 ，则认为字符串 s1 和 s2 的 <b>相似度为</b> k 。</p>
 * <p>给你两个字母异位词 s1 和 s2 ，返回 s1 和 s2 的相似度 k 的最小值。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s1 = "ab", s2 = "ba"
 *     输出：1
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s1 = "abc", s2 = "bca"
 *     输出：2
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= s1.length <= 20</li>
 *     <li>s2.length == s1.length</li>
 *     <li>s1 和 s2  只包含集合 {'a', 'b', 'c', 'd', 'e', 'f'} 中的小写字母</li>
 *     <li>s2 是 s1 的一个字母异位词</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/k-similar-strings/">https://leetcode.cn/problems/k-similar-strings/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic854KSimilarity {

    int res;

    public int kSimilarity(String s1, String s2) {
       StringBuilder str1 = new StringBuilder();
       StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                str1.append(s1.charAt(i));
                str2.append(s2.charAt(i));
            }
        }
        if (str1.length() == 0) {
            return 0;
        }
        res = str1.length() - 1;
        kSimilarity(0, 0, str1.length(), str1.toString(), str2.toString());
        return res;
    }

    private void kSimilarity(int pos, int cost, int len, String str1, String str2) {
        if (cost > res) {
            return;
        }
        while (pos < str1.length() && str1.charAt(pos) == str2.charAt(pos)) {
            pos++;
        }
        if (pos == str1.length()) {
            res = Math.min(res, cost);
            return;
        }
        if (cost + kSimilarity(str1, str2, pos) >= res) {
            return;
        }
        for (int i = pos + 1; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(pos)) {
                char[] chars = str1.toCharArray();
                String next = kSimilarity(chars, i, pos);
                kSimilarity(pos + 1, cost + 1, len, next, str2);
            }
        }
    }

    private int kSimilarity(String s1, String s2, int pos) {
        int tot = 0;
        for (int i = pos; i < s1.length(); i++) {
            tot += s1.charAt(i) != s2.charAt(i) ? 1 : 0;
        }
        return tot + 1 >> 1;
    }

    private String kSimilarity(char[] chars, int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
        return new String(chars);
    }

}
