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
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ') {
                map.put(key.charAt(i), map.getOrDefault(key.charAt(i), (char) (map.size() + 'a')));
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            res.append(map.getOrDefault(message.charAt(i), ' '));
        }
        return res.toString();
    }

}
