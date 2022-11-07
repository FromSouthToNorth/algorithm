package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h3>937.重新排列日志文件</h3>
 * <p>有两种不同的日志类型：</p>
 * <ul>
 *     <li><strong>日志类型：</strong>除标识符之外，所有字均由小写字母组成</li>
 *     <li><strong>数字日志：</strong>除标识符之外，所有字均由数字组成</li>
 * </ul>
 * <p>请按照下述规则日志重新排序：</p>
 * <ul>
 *     <li>所有 <strong>字母日志</strong> 都排在 <strong>数字日志</strong> 之前。</li>
 *     <li><strong>数字日志</strong> 在内容不同时，忽略标识符后，按内容字母顺序排序；在内容相同时，按标识符排序。</li>
 *     <li><strong>数字日志</strong> 应该保留原来的相对排序。</li>
 * </ul>
 * <p>返回日志的最终顺序。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     <strong>输入：</strong>logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let own kit dig","let3 art zero"]
 *     <strong>输出：</strong>["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
 *     <strong>解释：</strong>
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入：</strong>logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 *     <strong>输出：</strong>["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]。
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= logs.length <= 100</li>
 * <li>3 <= logs[i].length <= 100</li>
 * <li>logs[i] 中，字与字之间都用 单个 空格分隔</li>
 * <li>题目数据保证 logs[i] 都有一个标识符，并且在标识符之后至少存在一个字</li>
 * @see <a href="https://leetcode-cn.com/problems/reorder-data-in-log-files/">链接：https://leetcode-cn.com/problems/reorder-data-in-log-files/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic937ReorderLogFiles {

    class Log {
        int type, idx;
        String ori, sign, content;
        Log(String s, int _idx) {
            idx = _idx;
            int n = s.length(), i = 0;
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }
            sign = s.substring(0, i);
            content = s.substring(i + 1);
            ori = s;
            type = Character.isDigit(content.charAt(0)) ? 1 : 0;
        }
    }
    public String[] reorderLogFiles(String[] logs) {
        int n = logs.length;
        List<Log> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Log(logs[i], i));
        }
        Collections.sort(list, (a, b) -> {
            if (a.type != b.type) {
                return a.type - b.type;
            }
            if (a.type == 1) {
                return  a.idx - b.idx;
            }
            return !a.content.equals(b.content) ? a.content.compareTo(b.content) : a.sign.compareTo(b.sign);
        });
        String[] ans = new String[n];
        for (int i = 0; i < n; i ++) {
            ans[i] = list.get(i).ori;
        }
        return ans;
    }

}
