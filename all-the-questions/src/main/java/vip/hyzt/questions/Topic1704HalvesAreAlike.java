package vip.hyzt.questions;

/**
 * <h1>1704. 判断字符串的两半是否相似</h1>
 * <p>给你一个偶数长度的字符串 s 。将其拆分成长度相同的两半，前一半为 a ，后一半为 b 。</p>
 * <p>两个字符串 <strong>相似</strong> 的前提是它们都含有相同数目的元音（'a'，'e'，'i'，'o'，'u'，'A'，'E'，'I'，'O'，'U'）。注意，s 可能同时含有大写和小写字母。</p>
 * <p>如果 a 和 b 相似，返回 true ；否则，返回 false 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：s = "book"
 *     输出：true
 *     解释：a = "bo" 且 b = "ok" 。a 中有 1 个元音，b 也有 1 个元音。所以，a 和 b 相似。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "textbook"
 *     输出：false
 *     解释：a = "text" 且 b = "book" 。a 中有 1 个元音，b 中有 2 个元音。因此，a 和 b 不相似。
 *     注意，元音 o 在 b 中出现两次，记为 2 个。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= s.length <= 1000</li>
 *     <li>s.length 是偶数</li>
 *     <li>s 由 大写和小写 字母组成</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/determine-if-string-halves-are-alike/description/">https://leetcode.cn/problems/determine-if-string-halves-are-alike/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1704HalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        String o = "aeiouAEIOU";
        int n = s.length() / 2, sum1 = 0, sum2 = 0;
        for (int i = 0, j = n; i < n; i++, j++) {
            if (o.contains(s.charAt(i) + "")) {
                sum1++;
            }
            if (o.contains(s.charAt(j) + "")) {
                sum2++;
            }
        }
        return sum1 == sum2;
    }

}
