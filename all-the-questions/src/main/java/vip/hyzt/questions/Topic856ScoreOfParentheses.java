package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <h2>856. 括号的分数</h2>
 * <p>给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：</p>
 * <ul>
 *     <li>() 得 1 分。</li>
 *     <li>AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。</li>
 *     <li>(A) 得 2 * A 分，其中 A 是平衡括号字符串。</li>
 * </ul>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入： "()"
 *     输出： 1
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入： "(())"
 *     输出： 2
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入： "()()"
 *     输出： 2
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入： "(()(()))"
 *     输出： 6
 * </pre>
 * <h3>提示：</h3>
 * <ol>
 *     <li>S 是平衡括号字符串，且只含有 ( 和 ) 。</li>
 *     <li>2 <= S.length <= 50</li>
 * </ol>
 * <h3>js</h3>
 * <pre>
 * const scoreOfParentheses = function(s) {
 *   const deque = [];
 *   deque.push(0);
 *   for (const c of [...s]) {
 *     if (c === '(') {
 *       deque.push(0);
 *     }
 *     else {
 *       let cur = deque.pop();
 *       deque.push(deque.pop() + Math.max(cur * 2, 1));
 *     }
 *   }
 *   return deque.pop();
 * }
 * const s = ["()", "(())", "()()", "(()(()))"];
 * for (const s1 of s) {
 *   console.log(scoreOfParentheses(s1));
 * }
 * </pre>
 * @see <a href="https://leetcode.cn/problems/score-of-parentheses/">https://leetcode.cn/problems/score-of-parentheses/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic856ScoreOfParentheses {

    public int scoreOfParentheses(String s) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                deque.addLast(0);
            }
            else {
                int cur = deque.pollLast();
                deque.addLast(deque.pollLast() + Math.max(cur * 2, 1));
            }
        }
        return deque.peekLast();
    }

}
