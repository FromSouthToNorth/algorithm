package vip.hyzt.questions;

/**
 * <h2>1592. 重新排列单词间的空格</h2>
 * <p>给你一个字符串 text ，该字符串由若干被空格包围的单词组成。每个单词由一个或者多个小写英文字母组成，并且两个单词之间至少存在一个空格。题目测试用例保证 text <strong>至少包含一个单词</strong> 。</p>
 * <p>请你重新排列空格，使每对相邻单词之间的空格数目都 相等 ，并尽可能 最大化 该数目。如果不能重新平均分配所有空格，请 将多余的空格放置在字符串末尾 ，这也意味着返回的字符串应当与原 text 字符串的长度相等。</p>
 * <p>返回 <strong>重新排列空格后的字符串</strong> 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：text = "  this   is  a sentence "
 *     输出："this   is   a   sentence"
 *     解释：总共有 9 个空格和 4 个单词。可以将 9 个空格平均分配到相邻单词之间，相邻单词间空格数为：9 / (4-1) = 3 个。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：text = " practice   makes   perfect"
 *     输出："practice   makes   perfect "
 *     解释：总共有 7 个空格和 3 个单词。7 / (3-1) = 3 个空格加上 1 个多余的空格。多余的空格需要放在字符串的末尾。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：text = "hello   world"
 *     输出："hello   world"
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入：text = "  walks  udp package   into  bar a"
 *     输出："walks  udp  package  into  bar  a "
 * </pre>
 * <h3>示例 5：</h3>
 * <pre>
 *     输入：text = "a"
 *     输出："a"
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= text.length <= 100</li>
 *     <li>text 由小写英文字母和 ' ' 组成</li>
 *     <li>text 中至少包含一个单词</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/rearrange-spaces-between-words">https://leetcode.cn/problems/rearrange-spaces-between-words</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1592ReorderSpaces {

    public String reorderSpaces(String text) {
        int n = text.length();
        String[] words = text.trim().split("\\s+");
        int spaceLength = n;
        int wordsLength = words.length;
        for (String word : words) {
            spaceLength -= word.length();
        }
        StringBuilder sb = new StringBuilder();
        if (wordsLength == 1) {
            sb.append(words[0]);
            sb.append(" ".repeat(Math.max(0, spaceLength)));
            return sb.toString();
        }
        int spacePer = spaceLength / (wordsLength - 1);
        int spaceRest = spaceLength % (wordsLength - 1);
        for (int i = 0; i < wordsLength; i++) {
            if (i > 0) {
                sb.append(" ".repeat(Math.max(0, spacePer)));
            }
            sb.append(words[i]);
        }
        sb.append(" ".repeat(Math.max(0, spaceRest)));
        return sb.toString();
    }

}
