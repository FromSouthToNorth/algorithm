package vip.hyzt.questions;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * <h3>二叉树遍历</h3>
 *
 * @author hy
 */
public abstract class BinaryTree {

    /**
     * 前序遍历
     */
    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    /**
     * 中序遍历
     */
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.val);
        inorderTraversal(root.right);
    }

    /**
     * 后序遍历
     */
    public static void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.val);
    }

    /**
     * 前序迭代
     */
    public static void iteratePreorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                System.out.println(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
    }

    /**
     * 广度优先搜索
     */
    public static void bfsTree(TreeNode root) {
        if (root == null) {
            return;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                System.out.print(node.val + "\t");
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
    }

}
