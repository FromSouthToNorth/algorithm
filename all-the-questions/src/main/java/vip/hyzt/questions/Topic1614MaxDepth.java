package vip.hyzt.questions;

/**
 * <p>1614. 括号的最大嵌套深度</p>
 *
 * <p>如果字符串满足以下条件之一，则可以称之为 有效括号字符串（valid parentheses string，可以简写为 VPS）：</p>
 *
 * <p>字符串是一个空字符串 ""，或者是一个不为 "(" 或 ")" 的单字符。</p>
 * <p>字符串可以写为 AB（A 与 B字符串连接），其中 A 和 B 都是 有效括号字符串 。</p>
 * <p>字符串可以写为 (A)，其中 A 是一个 有效括号字符串 。</p>
 * <p>类似地，可以定义任何有效括号字符串S 的 嵌套深度 depth(S)：</p>
 *
 * <p>depth("") = 0</p>
 * <p>depth(C) = 0，其中 C 是单个字符的字符串，且该字符不是 "(" 或者 ")"</p>
 * <p>depth(A + B) = max(depth(A), depth(B))，其中 A 和 B 都是 有效括号字符串</p>
 * <p>depth("(" + A + ")") = 1 + depth(A)，其中 A 是一个 有效括号字符串</p>
 * <p>例如：""、"()()"、"()(()())" 都是 有效括号字符串（嵌套深度分别为 0、1、2），而 ")(" 、"(()" 都不是 有效括号字符串 。</p>
 *
 * <p>给你一个 有效括号字符串 s，返回该字符串的 s 嵌套深度 。</p>
 *
 * <h3>示例 1：</h3>
 *
 * <ul>
 *     <li>输入：s = "(1+(2*3)+((8)/4))+1"</li>
 *     <li>输出：3</li>
 *     <li>解释：数字 8 在嵌套的 3 层括号中。</li>
 * </ul>
 *
 * <h3>示例 2：</h3>
 *
 * <ul>
 *     <li>输入：s = "(1)+((2))+(((3)))"</li>
 *     <li>输出：3</li>
 * </ul>
 *
 * <h3>示例 3：</h3>
 * <ul>
 *     <li>输入：s = "1+(2*3)/(2-1)"</li>
 *     <li>输出：1</li>
 * </ul>
 *
 * <h3>示例 4：</h3>
 *
 * <ul>
 *    <li>输入：s = "1"</li>
 *    <li>输出：0</li>
 * </ul>
 *
 * <h3>提示：</h3>
 *
 * <ul>
 *     <li> 1 <= s.length <= 100</li>
 *     <li> s 由数字 0-9 和字符 '+'、'-'、'*'、'/'、'('、')' 组成</li>
 *     <li> 题目数据保证括号表达式 s 是 有效的括号表达式</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @see <a href="https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses">链接：https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses<a/>
 */
public abstract class Topic1614MaxDepth {

    public static int traverse(String s) {
        int ans = 0, size = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                ++size;
                ans = Math.max(ans, size);
            }
            else if (c == ')') {
                --size;
            }
        }
        return ans;
    }

}
