package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <h2>946. 验证栈序列</h2>
 * <p>给定 pushed 和 popped 两个序列，每个序列中的 <strong>值都不重复</strong>，只有当它们可能是在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，返回 true；否则，返回 false 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 *     输出：true
 *     解释：我们可以按以下顺序执行：
 *     push(1), push(2), push(3), push(4), pop() -> 4,
 *     push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 *     输出：false
 *     解释：1 不能在 2 之前弹出。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= pushed.length <= 1000</li>
 *     <li>0 <= pushed[i] <= 1000</li>
 *     <li>pushed 的所有元素 <strong>互不相同</strong></li>
 *     <li>popped.length == pushed.length</li>
 *     <li>popped 是 pushed 的一个排列</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/validate-stack-sequences">https://leetcode.cn/problems/validate-stack-sequences</a>
 * @author 来源：力扣（LeetCode）
 * @author hy
 */
public class Topic946ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = pushed.length;
        for (int i = 0, j = 0; i < n; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.poll();
                j++;
            }
        }
        return stack.isEmpty();
    }

}
