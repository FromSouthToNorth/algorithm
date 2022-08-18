package vip.hyzt.questions;

/**
 * <h3>104. 二叉树的最大深度</h3>
 * <p>给定一个二叉树，找出其最大深度。</p>
 * <p>二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。</p>
 * <p><strong>说明:</strong> 叶子节点是指没有子节点的节点。</p>
 * @author hy
 */
public class Topic104MaxDepth {

    int maxPath = 0;

    int max = 0;

    public int maxDepth1(TreeNode root) {
        dfs(root);
        return max;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        maxPath++; // 进入节点的时候进行统计

        // 当没有后续节点取最大值
        if (root.left == null && root.right == null) {
            max = Math.max(maxPath, max);
        }
        dfs(root.left);
        dfs(root.right);
        maxPath--; // 退出节点时减去统计
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            int leftHeight = maxDepth2(root.left);
            int rightHeight = maxDepth2(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

}
