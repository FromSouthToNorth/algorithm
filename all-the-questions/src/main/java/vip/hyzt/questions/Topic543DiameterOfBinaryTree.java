package vip.hyzt.questions;

/**
 * <h3>543. 二叉树的直径</h3>
 * <p>给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。</p>
 * <h4>示例: </h4>
 * <p>给定二叉树</p>
 * <pre>
 *         1
 *        / \
 *       2   3
 *      / \
 *     4   5
 * </pre>
 * <p>返回 <strong>3</strong>, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。</p>
 * <p><strong>注意：</strong>两结点之间的路径长度是以它们之间边的数目表示。</p>
 * @author hy
 */
public class Topic543DiameterOfBinaryTree {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        int diameter = leftMax + rightMax;
        max = Math.max(max, diameter);
        return (Math.max(leftMax, rightMax)) + 1;
    }

}
