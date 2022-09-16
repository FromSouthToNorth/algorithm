package vip.hyzt.questions;

/**
 * <h3>剑指 Offer 05. 替换空格</h3>
 * <p>请实现一个函数，把字符串 s 中的每个空格替换成"%20"。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "We are happy."
 *     输出："We%20are%20happy."
 * </pre>
 * @see <a href="https://leetcode.cn/problems/ti-huan-kong-ge-lcof/">https://leetcode.cn/problems/ti-huan-kong-ge-lcof/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class TopicOffer05ReplaceSpace {

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c == ' ' ? "%20" : c);
        }
        return sb.toString();
    }

}
