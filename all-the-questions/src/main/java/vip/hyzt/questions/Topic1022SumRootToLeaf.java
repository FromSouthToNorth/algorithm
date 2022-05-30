package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <h3>1022. 从根到叶的二进制数之和</h3>
 * <p>给出一棵二叉树，其上每个结点的值都是 `0` 或 `1` 。每一条从根到叶的路径都代表一个从最高有效位开始的二进制数。</p>
 * <li>例如，如果路径为 `0 -> 1 -> 1 -> 0 -> 1`，那么它表示二进制数 `01101`，也就是 `13` 。</li>
 * <p>对树上的每一片叶子，我们都要找出从根到该叶子的路径所表示的数字。</p>
 * <p>返回这些数字之和。题目数据保证答案是一个 <strong>32 位</strong> 整数。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2019/04/04/sum-of-root-to-leaf-binary-numbers.png" >
 * <pre>
 *     输入：root = [1,0,1,0,1,0,1]
 *     输出：22
 *     解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：root = [0]
 *     输出：0
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>树中的节点数在 `[1, 1000]` 范围内</li>
 *     <li>`Node.val` 仅为 `0` 或 `1`</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/sum-of-root-to-leaf-binary-numbers/">https://leetcode.cn/problems/sum-of-root-to-leaf-binary-numbers/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1022SumRootToLeaf {

    public static int sumRootToLeaf1(TreeNode node) {
        return dfs(node, 0);
    }

    static int dfs(TreeNode root, int cur) {
        int ans = 0, ncur = (cur << 1) + root.val;
        if (root.left != null) ans += dfs(root.left, ncur);
        if (root.right != null) ans += dfs(root.right, ncur);
        return root.left == null && root.right == null ? ncur : ans;
    }

    public static int sumRootToLeaf2(TreeNode node) {
        int ans = 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.addLast(node);
        while (!stack.isEmpty()) {
            TreeNode poll = stack.pollFirst();
            if (poll.left != null) {
                poll.left.val = (poll.val << 1) + poll.left.val;
                stack.addLast(poll.left);
            }
            if (poll.right != null) {
                poll.right.val = (poll.val << 1) + poll.right.val;
                stack.addLast(poll.right);
            }
            if (poll.left == null && poll.right == null) ans += poll.val;
        }
        return ans;
    }

}
