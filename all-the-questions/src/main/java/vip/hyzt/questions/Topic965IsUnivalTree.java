package vip.hyzt.questions;

/**
 * <h3>965. 单值二叉树</h3>
 * @see <a href="https://leetcode.cn/problems/univalued-binary-tree/">https://leetcode.cn/problems/univalued-binary-tree/</a>
 * @author hy
 */
public class Topic965IsUnivalTree {

    static int val = -1;

    public static boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (val == -1) {
            val = root.val;
        }
        if (root.val != val) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

}
