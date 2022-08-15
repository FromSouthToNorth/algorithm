package vip.hyzt.weeks.weeks_306;

/**
 * <h3>6150. 根据模式串构造最小数字</h3>
 * <p>给你下标从 <strong>0</strong> 开始、长度为 n 的字符串 pattern ，它包含两种字符，'I' 表示 <strong>上升</strong> ，'D' 表示 <strong>下降</strong> 。</p>
 * <p>你需要构造一个下标从 <strong>0</strong> 开始长度为 n + 1 的字符串，且它要满足以下条件：</p>
 * <ul>
 *     <li>num包含数字'1'到'9'，其中每个数字至多使用一次。</li>
 *     <li>如果pattern[i] == 'I'，那么num[i] < num[i + 1]。</li>
 *     <li>如果pattern[i] == 'D'，那么num[i] > num[i + 1。</li>
 * </ul>
 * <p>请你返回满足上述条件字典序 <strong>最小</strong> 的字符串 num。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：pattern = "IIIDIDDD"
 *     输出："123549876"
 *     解释：
 *     下标 0 ，1 ，2 和 4 处，我们需要使 num[i] < num[i+1] 。
 *     下标 3 ，5 ，6 和 7 处，我们需要使 num[i] > num[i+1] 。
 *     一些可能的 num 的值为 "245639871" ，"135749862" 和 "123849765" 。
 *     "123549876" 是满足条件最小的数字。
 *     注意，"123414321" 不是可行解因为数字 '1' 使用次数超过 1 次。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：pattern = "DDD"
 *     输出："4321"
 *     解释：
 *     一些可能的 num 的值为 "9876" ，"7321" 和 "8742" 。
 *     "4321" 是满足条件最小的数字。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= pattern.length <= 8</li>
 *     <li>pattern 只包含字符 'I' 和 'D' 。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/construct-smallest-number-from-di-string">https://leetcode.cn/problems/construct-smallest-number-from-di-string</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class SmallestNumber_03 {

    public String smallestNumber(String pattern) {
        for (int i = 1;; i++) {
            boolean[] visited = new boolean[10];
            visited[i] = true;
            String s = smallestNumber(0, i, pattern, visited);
            if (s != null) {
                return i + s;
            }
        }
    }

    public String smallestNumber(int index, int prev, String pattern, boolean[] visited) {
        if (index == pattern.length()) {
            return "";
        }
        for (int i = prev; i > 0 && i < 10; i += pattern.charAt(index) == 'I' ? 1 : -1) {
            if (!visited[i]) {
                visited[i] = true;
                String s = smallestNumber(index + 1, i, pattern, visited);
                if (s != null) {
                    return i + s;
                }
                visited[i] = false;
            }
        }
        return null;
    }

}
