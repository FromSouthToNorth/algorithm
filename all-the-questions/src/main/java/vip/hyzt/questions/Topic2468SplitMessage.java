package vip.hyzt.questions;

/**
 * <h1>2468. 根据限制分割消息</h1>
 * <p>给你一个字符串 message 和一个正整数 limit 。</p>
 * <p>你需要根据 limit 将 message <strong>分割</strong> 成一个或多个 <strong>部分</strong> 。每个部分的结尾都是 "<a/b>" ，其中 "b" 用分割出来的总数 <strong>替换</strong>， "a" 用当前部分所在的编号 <strong>替换</strong> ，编号从 1 到 b 依次编号。除此以外，除了最后一部分长度 <strong>小于等于</strong> limit 以外，其他每一部分（包括结尾部分）的长度都应该 <strong>等于</strong> limit 。</p>
 * <p>你需要确保分割后的结果数组，删掉每部分的结尾并 <strong>按顺序</strong> 连起来后，能够得到 message 。同时，结果数组越短越好。</p>
 * <p>请你返回 message  分割后得到的结果数组。如果无法按要求分割 message ，返回一个空数组。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：message = "this is really a very awesome message", limit = 9
 *     输出：["thi<1/14>","s i<2/14>","s r<3/14>","eal<4/14>","ly <5/14>","a v<6/14>","ery<7/14>"," aw<8/14>","eso<9/14>","me<10/14>"," m<11/14>","es<12/14>","sa<13/14>","ge<14/14>"]
 *     解释：
 *     前面 9 个部分分别从 message 中得到 3 个字符。
 *     接下来的 5 个部分分别从 message 中得到 2 个字符。
 *     这个例子中，包含最后一个部分在内，每个部分的长度都为 9 。
 *     可以证明没有办法分割成少于 14 个部分。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：message = "short message", limit = 15
 *     输出：["short mess<1/2>","age<2/2>"]
 *     解释：
 *     在给定限制下，字符串可以分成两个部分：
 *     - 第一个部分包含 10 个字符，长度为 15 。
 *     - 第二个部分包含 3 个字符，长度为 8 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= message.length <= 10<sup>4</sup></li>
 *     <li>message 只包含小写英文字母和 ' ' 。</li>
 *     <li>1 <= limit <= 10<sup>4</sup></li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/split-message-based-on-limit/">https://leetcode.cn/problems/split-message-based-on-limit/</a>
 */
public class Topic2468SplitMessage {

    public String[] splitMessage(String message, int limit) {
        for (int i = 1, j = 1; i <= message.length(); j += ("" + ++i).length()) {
            if ((3 + ("" + i).length()) * i + j + message.length() <= limit * i) {
                String[] result = new String[i];
                for (int k = 1, m = 0; k <= i; k++) {
                    result[k - 1] = message.substring(m, Math.min(message.length(), m += Math.max(0, limit - 3 - ("" + i + k).length()))) + '<' + k + '/' + i + '>';
                }
                return result;
            }
        }
        return new String[0];
    }

}
