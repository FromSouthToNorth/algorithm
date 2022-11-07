package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <h2>513. 找树左下角的值</h2>
 * <p>给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。</p>
 * <p>假设二叉树中至少有一个节点。</p>
 * <h3>示例 1:</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/12/14/tree1.jpg" >
 * <pre>
 *     输入: root = [2,1,3]
 *     输出: 1
 * </pre>
 * <h3>示例 2:</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/12/14/tree2.jpg" >
 * <pre>
 *     输入: [1,2,3,4,null,5,6,null,null,7]
 *     输出: 7
 * </pre>
 * <h3>提示:</h3>
 * <ul>
 *     <li>二叉树的节点个数的范围是 [1,10<sup>4</sup>]</li>
 *     <li>-2<sup>31</sup> <= Node.val <= 2<sup>31</sup> - 1</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/find-bottom-left-tree-value/">https://leetcode.cn/problems/find-bottom-left-tree-value/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic513FindBottomLeftValue {

    public static int findBottomLeftValue1(TreeNode root) {
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        int ans = 0;
        while (!d.isEmpty()) {
            int sz = d.size();
            ans = d.peek().val;
            while (sz-- > 0) {
                TreeNode poll = d.pollFirst();
                if (poll.left != null) {
                    d.addLast(poll.left);
                }
                if (poll.right != null) {
                    d.addLast(poll.right);
                }
            }
        }
        return ans;
    }

    static int curVal;

    static int curHigh;

    public static int findBottomLeftValue2(TreeNode root) {
        dfs(root, 0);
        return curHigh;
    }

     static void dfs(TreeNode root, int high) {
        if (root == null) {
            return;
        }
        high++;
        dfs(root.left, high);
        dfs(root.right, high);
        if (high > curHigh) {
            curHigh = high;
            curVal = root.val;
        }
    }

}
