package vip.hyzt.questions;

/**
 * <h3>二叉树节点</h3>
 * <pre>
 *       root
 *        0
 *      /   \
 *     6     7
 *   left  right
 * </pre>
 * @author hy
 */
public class TreeNode {

    /**
     * 节点值
     */
    public int val;

    /**
     * 二叉树左节点
     */
    public TreeNode left;

    /**
     * 二叉树右节点
     */
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
