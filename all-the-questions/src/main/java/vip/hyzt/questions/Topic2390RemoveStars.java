package vip.hyzt.questions;

/**
 * <h2>6161. 从字符串中移除星号</h2>
 * <p>给你一个包含若干星号 * 的字符串 s 。</p>
 * <p>在一步操作中，你可以：</p>
 * <ul>
 *     <li>选中 s 中的一个星号。</li>
 *     <li>移除星号 <strong>左侧</strong> 最近的那个 <strong>非星号</strong> 字符，并移除该星号自身。</li>
 * </ul>
 * <p>返回移除 <strong>所有</strong> 星号之后的字符串。</p>
 * <p>注意：</p>
 * <ul>
 *     <li>生成的输入保证总是可以执行题面中描述的操作。</li>
 *     <li>可以证明结果字符串是唯一的。</li>
 * </ul>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "leet**cod*e"
 *     输出："lecoe"
 *     解释：从左到右执行移除操作：
 *     - 距离第 1 个星号最近的字符是 "leet**cod*e" 中的 't' ，s 变为 "lee*cod*e" 。
 *     - 距离第 2 个星号最近的字符是 "lee*cod*e" 中的 'e' ，s 变为 "lecod*e" 。
 *     - 距离第 3 个星号最近的字符是 "lecod*e" 中的 'd' ，s 变为 "lecoe" 。
 *     不存在其他星号，返回 "lecoe" 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s = "erase*****"
 *     输出：""
 *     解释：整个字符串都会被移除，所以返回空字符串。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= s.length <= 10<sup>5</sup></li>
 *     <li>s 由小写英文字母和星号 * 组成</li>
 *     <li>s 可以执行上述操作</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/removing-stars-from-a-string">https://leetcode.cn/problems/removing-stars-from-a-string</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2390RemoveStars {

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                sb.deleteCharAt(sb.length() - 1);
            }
            else {
                sb.append(c);
            }
        }
        return "" + sb;
    }

}
