package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * <h1>2471. 逐层排序二叉树所需的最少操作数目</h1>
 * <p>给你一个 <strong>值互不相同</strong> 的二叉树的根节点 root 。</p>
 * <p>在一步操作中，你可以选择 <strong>同一层</strong> 上任意两个节点，交换这两个节点的值。</p>
 * <p>返回每一层按 <strong>严格递增顺序</strong> 排序所需的最少操作数目。</p>
 * <p>节点的 <strong>层数</strong> 是该节点和根节点之间的路径的边数。</p>
 * <h2>示例 1 ：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/09/18/image-20220918174006-2.png">
 * <pre>
 *     输入：root = [1,4,3,7,6,8,5,null,null,null,null,9,null,10]
 *     输出：3
 *     解释：
 *     - 交换 4 和 3 。第 2 层变为 [3,4] 。
 *     - 交换 7 和 5 。第 3 层变为 [5,6,8,7] 。
 *     - 交换 8 和 7 。第 3 层变为 [5,6,7,8] 。
 *     共计用了 3 步操作，所以返回 3 。
 *     可以证明 3 是需要的最少操作数目。
 * </pre>
 * <h2>示例 2 ：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/09/18/image-20220918174026-3.png">
 * <pre>
 *     输入：root = [1,3,2,7,6,5,4]
 *     输出：3
 *     解释：
 *     - 交换 3 和 2 。第 2 层变为 [2,3] 。
 *     - 交换 7 和 4 。第 3 层变为 [4,6,5,7] 。
 *     - 交换 6 和 5 。第 3 层变为 [4,5,6,7] 。
 *     共计用了 3 步操作，所以返回 3 。
 *     可以证明 3 是需要的最少操作数目。
 * </pre>
 * <h2>示例 3 ：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/09/18/image-20220918174052-4.png">
 * <pre>
 *     输入：root = [1,2,3,4,5,6]
 *     输出：0
 *     解释：每一层已经按递增顺序排序，所以返回 0 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>树中节点的数目在范围 [1, 105] 。</li>
 *     <li>1 <= Node.val <= 105</li>
 *     <li>树中的所有值 <strong>互不相同</strong> 。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level/">https://leetcode.cn/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level/</a>
 */
public class Topic2471MinimumOperations {

    public int minimumOperations(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>(List.of(root));
        int count = 0;
        while (!deque.isEmpty()) {
            int[] a = new int[deque.size()], b = new int[deque.size()];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < a.length; i++) {
                TreeNode node = deque.poll();
                map.put(a[i] = b[i] = node.val, i);
                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
            Arrays.sort(b);
            for (int i = 0; i < a.length; i++) {
                count += a[i] == b[i] ? 0 : 1;
                map.put(a[map.get(b[i])] = a[i], map.get(b[i]));
            }
        }
        return count;
    }

}
