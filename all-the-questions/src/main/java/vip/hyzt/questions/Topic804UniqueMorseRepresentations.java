package vip.hyzt.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>804.唯一摩尔斯密码词</h3>
 * <p>国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串，比如:</p>
 * <ul>
 *     <li>'a' 对应 ".-" ，       </li>
 *     <li>'b' 对应 "-..." ，     </li>
 *     <li>'c' 对应 "-.-." ，以此类推。</li>
 * </ul>
 * <p>为了方便，所有 `26` 个英文字母的摩尔斯密码表如下：</p>
 * <pre>
 *     [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * </pre>
 * <p>给你一个字符串数字 `words`，每个单词可以写成每一个字母对应摩尔斯密码的组合。</p>
 * <ul>
 *     <li>例如，"cab" 可以写成 "-.-..--..."，（即 "-.-." + ".-" + "-..." 字符串的结合）。我们将这样一个连接过程称作 <b>单词翻译</b>。</li>
 * </ul>
 * <p>对 `words` 中所有单词进行翻译，返回不同 <b>单词翻译</b> 的数量。</p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>words = ["gin", "zen", "gig", "msg"]
 *     <strong>输出：</strong>2
 *     <strong>解释：</strong>个单词翻译如下：
 *     "gin" -> "--...-."
 *     "zen" -> "--...-."
 *     "gig" -> "--...--."
 *     "msg" -> "--...--."
 *     共有 2 种不同的翻译，"--...-." 和 "--...--."。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>words = ["a"]
 *     <strong>输出：</strong>1
 * </pre>
 * <p><b>提示：</b></p>
 * <ul>
 *     <li>1 <= words.length <= 100</li>
 *     <li>1 <= words[i].length <= 12</li>
 *     <li>words[i] 由小写英文字母组成</li>
 * </ul>
 * @see <a href="https://leetcode-cn.com/problems/unique-morse-code-words">链接：https://leetcode-cn.com/problems/unique-morse-code-words</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic804UniqueMorseRepresentations {

    private static final String[] CODE = { ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(CODE[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }


}
