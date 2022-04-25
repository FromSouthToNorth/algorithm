package vip.hyzt.questions;

/**
 * <h3>824.山羊拉丁文</h3>
 * <p>给你一个由若干单词组成的句子`sentence` ，单词间由空格分隔。每个单词仅由大写和小写英文字母组成。</p>
 * <p>请你将句子转换为 “山羊拉丁文（Goat Latin）”（一种类似于 猪拉丁文- Pig Latin 的虚构语言）。山羊拉丁文的规则如下：</p>
 * <ul>
 *     <li>如果单词以元音开头（'a', 'e', 'i', 'o', 'u'），在单词后添加"ma"。
 *     <ul><li>例如，单词 "apple" 变为 "applema" 。</li></ul>
 *     </li>
 *
 *     <li>如果单词以辅音字母开头（即，非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 *     <ul>
 *        <li>例如，单词 "goat" 变为 "oatgma" 。</li>
 *     </ul>
 *     </li>
 *
 *     <li>根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从 1 开始。
 *     <ul>
 *         <li>例如，在第一个单词后添加 "a" ，在第二个单词后添加 "aa" ，以此类推。</li>
 *     </ul>
 *     </li>
 * </ul>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>sentence = "I speak Goat Latin"
 *     <strong>输出：</strong>"Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>sentence = "The quick brown fox jumped over the lazy dog"
 *     <strong>输出：</strong>"heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 * </pre>
 * <p><b>提示：</b></p>
 * <li>1 <= sentence.length <= 150</li>
 * <li>sentence 由英文字母和空格组成</li>
 * <li>sentence 不含前导或尾随空格</li>
 * <li>sentence 中的所有单词由单个空格分隔</li>
 * @see <a href="https://leetcode-cn.com/problems/goat-latin">链接：https://leetcode-cn.com/problems/goat-latin</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic824ToGoatLatin {

    public static String toGoatLatin(String s) {
       int n = s.length();
       String lat = "a";
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n;) {
            int j = i;
            while (j < n && s.charAt(j) != ' ') j++;
            if ("aeiouAEIOU".indexOf(s.charAt(i)) >= 0) {
                sb.append(s, i, j).append("ma");
            }
            else {
                sb.append(s, i + 1, j).append(s.charAt(i)).append("ma");
            }
            sb.append(lat);
            lat += "a";
            i = j + 1;
            if (i < n) sb.append(" ");
        }
       return sb.toString();
    }

}
