package vip.hyzt.questions;

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
     * 后序迭代
     */
    public static List<Integer> postorderDequeTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || prev == root.right) {
                res.add(root.val);
                prev = root;
                root = null;
            }
            else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }

    /**
     * 广度优先搜索
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        while (!stack.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int n = stack.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = stack.poll();
                level.add(node.val);
                if (node.left != null) stack.offer(node.left);
                if (node.right != null) stack.offer(node.right);
            }
            res.add(level);
        }
        return res;
    }

}
