package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>890. 查找和替换模式</h3>
 * <p>你有一个单词列表 words 和一个模式  pattern，你想知道 words 中的哪些单词与模式匹配。</p>
 * <p>如果存在字母的排列 p ，使得将模式中的每个字母 x 替换为 p(x) 之后，我们就得到了所需的单词，那么单词与模式是匹配的。</p>
 * <p>（回想一下，字母的排列是从字母到字母的双射：每个字母映射到另一个字母，没有两个字母映射到同一个字母。）</p>
 * <p>返回 words 中与给定模式匹配的单词列表。</p>
 * <p>你可以按任何顺序返回答案。</p>
 * <h3>示例：</h3>
 * <pre>
 *     输入：words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 *     输出：["mee","aqq"]
 *     解释：
 *     "mee" 与模式匹配，因为存在排列 {a -> m, b -> e, ...}。
 *     "ccc" 与模式不匹配，因为 {a -> c, b -> c, ...} 不是排列。
 *     因为 a 和 b 映射到同一个字母。
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= words.length <= 50</li>
 * <li>1 <= pattern.length = words[i].length <= 20</li>
 * @see <a href="https://leetcode.cn/problems/find-and-replace-pattern/">https://leetcode.cn/problems/find-and-replace-pattern/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic890FindAndReplacePattern {

    public static List<String> findAndReplacePattern(String[] ws, String pe) {
        List<String> ans = new ArrayList<>();
        int[] map = new int[26], vis = new int[26];
        for (String w : ws) {
            Arrays.fill(map, -1);
            Arrays.fill(vis, 0);
            boolean ok = true;
            for (int i = 0; i< pe.length() && ok; i++) {
                int c1 = w.charAt(i) - 'a', c2 = pe.charAt(i) - 'a';
                if (map[c1] == -1 && vis[c2] == 0) {
                    map[c1] = c2; vis[c2] = 1;
                }
                else if (map[c1] != c2) ok = false;
            }
            if (ok) ans.add(w);
        }
        return ans;
    }

}
