package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>6108. 解密消息</h3>
 * <p>给你字符串 key 和 message ，分别表示一个加密密钥和一段加密消息。解密 message 的步骤如下：</p>
 * <ol>
 *     <li>使用 key 中 26 个英文小写字母第一次出现的顺序作为替换表中的字母 顺序 。</li>
 *     <li>将替换表与普通英文字母表对齐，形成对照表。</li>
 *     <li>按照对照表 替换 message 中的每个字母。</li>
 *     <li>空格 ' ' 保持不变。</li>
 *     <ul>
 *         <li>例如，key = "happy boy"（实际的加密密钥会包含字母表中每个字母 至少一次），据此，可以得到部分对照表（'h' -> 'a'、'a' -> 'b'、'p' -> 'c'、'y' -> 'd'、'b' -> 'e'、'o' -> 'f'）。</li>
 *     </ul>
 * </ol>
 * @see <a href="https://leetcode.cn/problems/decode-the-message/">https://leetcode.cn/problems/decode-the-message/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6108DecodeMessage {

    public static String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        for (char c : key.toCharArray()) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, (char) (map.size() + 'a')));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : message.toCharArray()) {
            ans.append(map.getOrDefault(c, ' '));
        }
        return ans.toString();
    }

}
