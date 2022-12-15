package vip.hyzt.questions;

/**
 * <h1>1945. 字符串转化后的各位数字之和</h1>
 * <p>给你一个由小写字母组成的字符串 s ，以及一个整数 k 。</p>
 * <p>首先，用字母在字母表中的位置替换该字母，将 s <strong>转化</strong> 为一个整数（也就是，'a' 用 1 替换，'b' 用 2 替换，... 'z' 用 26 替换）。接着，将整数 <strong>转换</strong> 为其 <strong>各位数字之和</strong> 。共重复 <strong>转换</strong> 操作 k <strong>次</strong> 。</p>
 * <p>例如，如果 s = "zbax" 且 k = 2 ，那么执行下述步骤后得到的结果是整数 8 ：</p>
 * <ul>
 *     <li><strong>转化：</strong>"zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124</li>
 *     <li><strong>转换 #1：</strong>262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17</li>
 *     <li><strong>转换 #2：</strong>17 ➝ 1 + 7 ➝ 8</li>
 * </ul>
 * <p>返回执行上述操作后得到的结果整数。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：s = "iiii", k = 1
 *     输出：36
 *     解释：操作如下：
 *     - 转化："iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
 *     - 转换 #1：9999 ➝ 9 + 9 + 9 + 9 ➝ 36
 *     因此，结果整数为 36 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "leetcode", k = 2
 *     输出：6
 *     解释：操作如下：
 *     - 转化："leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
 *     - 转换 #1：12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
 *     - 转换 #2：33 ➝ 3 + 3 ➝ 6
 *     因此，结果整数为 6 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= s.length <= 100</li>
 *     <li>1 <= k <= 10</li>
 *     <li>s 由小写英文字母组成</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/sum-of-digits-of-string-after-convert/">https://leetcode.cn/problems/sum-of-digits-of-string-after-convert/</a>
 */
public class Topic1945GetLucky {

    public int getLucky(String s, int k) {
        StringBuilder strs = new StringBuilder();
        for (char c : s.toCharArray()) {
            strs.append(c - 96);
        }
        String strNumb = strs.toString();
        while (k > 0) {
            int sum = 0;
            for (char c : strNumb.toCharArray()) {
                sum += c - '0';
            }
            strNumb = sum + "";
            k--;
        }
        return Integer.parseInt(strNumb);
    }

}
