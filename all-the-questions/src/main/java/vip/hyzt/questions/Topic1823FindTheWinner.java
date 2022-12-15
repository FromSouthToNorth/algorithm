package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * <h1>1823.找出游戏的获胜者</h1>
 * <p>共有 `n` 名小伙伴一起游戏。小伙伴们围成一圈，按 <strong>顺时针排序</strong> 从 `1` 到编号 `n` 编号。确切地说，从第 `i`  名小伙伴顺时针移动到达第 `(i+1)` 名小伙伴的位置，其中 `1 <= i < n`，从第 `n` 名小伙伴顺时针移动一位会回到第 `1` 名小伙伴的位置。</p>
 * <p>游戏遵循规则如下：</p>
 * <p>从第 `1` 名小伙伴所在的位置 <strong>开始</strong>。</p>
 * <p>沿着顺时针方向数 `k` 名小伙伴，计数时需要 <strong>包含</strong> 起始时的那位小伙伴。逐个绕圈进行计数，一些小伙伴可能会被数过不止一次。</p>
 * <p>你数到的最后一名小伙伴需要离开圈子，并视作输掉游戏。</p>
 * <p>如果圈子中仍然有不止一名小伙伴，从刚刚输掉的小伙伴的 <strong>顺时针下一位</strong> 小伙伴 <strong>开始</strong>，回到步骤 2 继续执行。</p>
 * <p>否则，圈子中最后一名小伙伴赢得游戏。</p>
 * <p>给你参与游戏的小伙伴总数 n ，和一个整数 k ，返回游戏的获胜者。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2021/03/25/ic234-q2-ex11.png">
 * <pre>
 *     输入：n = 5, k = 2
 *     输出：3
 *     解释：游戏运行步骤如下：
 *     1) 从小伙伴 1 开始。
 *     2) 顺时针数 2 名小伙伴，也就是小伙伴 1 和 2 。
 *     3) 小伙伴 2 离开圈子。下一次从小伙伴 3 开始。
 *     4) 顺时针数 2 名小伙伴，也就是小伙伴 3 和 4 。
 *     5) 小伙伴 4 离开圈子。下一次从小伙伴 5 开始。
 *     6) 顺时针数 2 名小伙伴，也就是小伙伴 5 和 1 。
 *     7) 小伙伴 1 离开圈子。下一次从小伙伴 3 开始。
 *     8) 顺时针数 2 名小伙伴，也就是小伙伴 3 和 5 。
 *     9) 小伙伴 5 离开圈子。只剩下小伙伴 3 。所以小伙伴 3 是游戏的获胜者。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 6, k = 5
 *     输出：1
 *     解释：小伙伴离开圈子的顺序：5、4、6、2、3 。小伙伴 1 是游戏的获胜者。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= k <= n <= 500</li>
 * </ul>
 * <p><strong>进阶：</strong>你能否使用线性时间复杂度和常数空间复杂度解决此问题？</p>
 * @see <a href="https://leetcode-cn.com/problems/find-the-winner-of-the-circular-game/">链接：https://leetcode-cn.com/problems/find-the-winner-of-the-circular-game/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1823FindTheWinner {

    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }

}
