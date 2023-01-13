package vip.hyzt.questions;

import java.util.HashMap;
import java.util.List;

/**
 * <h1>1807. 替换字符串中的括号内容</h1>
 * <p>给你一个字符串 s ，它包含一些括号对，每个括号中包含一个 非空 的键。</p>
 * <ul>
 *     <li>比方说，字符串 "(name)is(age)yearsold" 中，有 两个 括号对，分别包含键 "name" 和 "age" 。</li>
 * </ul>
 * <p>你知道许多键对应的值，这些关系由二维字符串数组 knowledge 表示，其中 knowledge[i] = [key<sub>i</sub>, value<sub>i</sub>] ，表示键 key<sub>i</sub> 对应的值为 value<sub>i</sub> 。</p>
 * <p>你需要替换 <strong>所有</strong> 的括号对。当你替换一个括号对，且它包含的键为 key<sub>i</sub> 时，你需要：</p>
 * <ul>
 *     <li>将 keyi 和括号用对应的值 value<sub>i</sub> 替换。</li>
 *     <li>如果从 knowledge 中无法得知某个键对应的值，你需要将 key<sub>i</sub> 和括号用问号 "?" 替换（不需要引号）。</li>
 * </ul>
 * <p>knowledge 中每个键最多只会出现一次。s 中不会有嵌套的括号。</p>
 * <p>请你返回替换 <strong>所有</strong> 括号对后的结果字符串。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：s = "(name)is(age)yearsold", knowledge = [["name","bob"],["age","two"]]
 *     输出："bobistwoyearsold"
 *     解释：
 *     键 "name" 对应的值为 "bob" ，所以将 "(name)" 替换为 "bob" 。
 *     键 "age" 对应的值为 "two" ，所以将 "(age)" 替换为 "two" 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：s = "hi(name)", knowledge = [["a","b"]]
 *     输出："hi?"
 *     解释：由于不知道键 "name" 对应的值，所以用 "?" 替换 "(name)" 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：s = "(a)(a)(a)aaa", knowledge = [["a","yes"]]
 *     输出："yesyesyesaaa"
 *     解释：相同的键在 s 中可能会出现多次。
 *     键 "a" 对应的值为 "yes" ，所以将所有的 "(a)" 替换为 "yes" 。
 *     注意，不在括号里的 "a" 不需要被替换。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= s.length <= 10<sup>5</sup></li>
 *     <li>0 <= knowledge.length <= 10<sup>5</sup></li>
 *     <li>knowledge[i].length == 2</li>
 *     <li>1 <= key<sub>i</sub>.length, value<sub>i</sub>.length <= 10</li>
 *     <li>s 只包含小写英文字母和圆括号 '(' 和 ')' 。</li>
 *     <li>s 中每一个左圆括号 '(' 都有对应的右圆括号 ')' 。</li>
 *     <li>s 中每对括号内的键都不会为空。</li>
 *     <li>s 中不会有嵌套括号对。</li>
 *     <li>key<sub>i</sub> 和 value<sub>i</sub> 只包含小写英文字母。</li>
 *     <li>knowledge 中的 key<sub>i</sub> 不会重复。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/evaluate-the-bracket-pairs-of-a-string/">https://leetcode.cn/problems/evaluate-the-bracket-pairs-of-a-string/</a>
 */
public class Topic1807Evaluate {

    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> map = new HashMap<>();
        for (List<String> strings : knowledge) {
            map.put(strings.get(0), strings.get(1));
        }

        StringBuilder keys = new StringBuilder();
        StringBuilder res = new StringBuilder();
        boolean addKey = false;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                addKey = true;
            }
            else if (c == ')') {
                String key = keys.toString();
                res.append(map.containsKey(key) ? map.get(keys.toString()) : '?');
                addKey = false;
                keys.setLength(0);
            }
            else {
                if (addKey) {
                    keys.append(c);
                }
                else {
                    res.append(c);
                }
            }
        }
        return res.toString();
    }

}
