package vip.hyzt.questions.wc335;

import vip.hyzt.questions.TreeNode;

import java.util.*;

/**
 * <h1>2583. 二叉树中的第 K 大层和</h1>
 * <p></p>
 * <p>给你一棵二叉树的根节点 root 和一个正整数 k 。</p>
 * <p>树中的 <strong>层和</strong> 是指 <strong>同一层</strong> 上节点值的总和。</p>
 * <p>返回树中第 k 大的层和（不一定不同）。如果树少于 k 层，则返回 -1 。</p>
 * <p><strong>注意，</strong>如果两个节点与根节点的距离相同，则认为它们在同一层。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/12/14/binaryytreeedrawio-2.png">
 * <pre>
 *     输入：root = [5,8,9,2,1,3,7,4,6], k = 2
 *     输出：13
 *     解释：树中每一层的层和分别是：
 *     - Level 1: 5
 *     - Level 2: 8 + 9 = 17
 *     - Level 3: 2 + 1 + 3 + 7 = 13
 *     - Level 4: 4 + 6 = 10
 *     第 2 大的层和等于 13 。
 * </pre>
 * <h2>示例 2：</h2
 * <img src="https://assets.leetcode.com/uploads/2022/12/14/treedrawio-3.png">
 * <pre>
 *     输入：root = [1,2,null,3], k = 1
 *     输出：3
 *     解释：最大的层和是 3 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>树中的节点数为 n</li>
 *     <li>2 <= n <= 10<sup>5</sup></li>
 *     <li>1 <= Node.val <= 10<sup>6</sup></li>
 *     <li>1 <= k <= n</li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/kth-largest-sum-in-a-binary-tree/">https://leetcode.cn/problems/kth-largest-sum-in-a-binary-tree/</a>
 */
public class Topic2583KthLargestLevelSum {

    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        PriorityQueue<Long> max = new PriorityQueue<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                sum += poll.val;
            }
            max.add(sum);
            if (max.size() > k) {
                max.poll();
            }
        }
        return max.size() == k ? max.poll() : -1;
    }

}
