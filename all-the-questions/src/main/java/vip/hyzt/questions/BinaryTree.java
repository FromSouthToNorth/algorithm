package vip.hyzt.questions;

import java.util.*;

/**
 * <h3>二叉树遍历</h3>
 * <h4>前序: </h4>
 * <pre>
 *          0
 *        ↙   ↘
 *       1     4
 *     ↙  ↘
 *    2   3
 *    <strong>result: </strong>
 *    [0, 1, 2, 3, 4]
 * </pre>
 * <h4>中序: </h4>
 * <pre>
 *           0
 *         ↗   ↘
 *        1     4
 *      ↗  ↘
 *     2    3
 *     <strong>result: </strong>
 *     [2, 1, 3, 0, 4]
 * </pre>
 * <h4>后序: </h4>
 * <pre>
 *           0
 *             ↖
 *        1  →  4
 *      ↗  ↘
 *     2    3
 *     <strong>result: </strong>
 *     [2, 1, 3, 4, 0]
 * </pre>
 * <img src="https://labuladong.github.io/algo/images/%e4%ba%8c%e5%8f%89%e6%a0%91%e6%94%b6%e5%ae%98/2.jpeg">
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
    public static List<Integer> iteratePreorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                result.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return result;
    }

    /**
     * 中序迭代
     */
    public static List<Integer> inOrderIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            result.add(node.val);
            node = node.right;
        }
        return result;
    }

    /**
     * 后序迭代
     */
    public static List<Integer> postorderDequeTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || prev == root.right) {
                result.add(root.val);
                prev = root;
                root = null;
            }
            else {
                stack.push(root);
                root = root.right;
            }
        }
        return result;
    }


    /**
     * 每个节点所在的对应位置
     */
    public static void levelNodeVal(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        // System.out.printf("节点 %s 在第 %d 层 \n", root, level);
        // levelNodeVal(root.left, level + 1);
        // levelNodeVal(root.right, level + 1);
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                System.out.printf("节点 %s 在第 %d 层 \n", node, level++);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
    }

    /**
     * 每个节点的左右子树各有多少节点
     */
    public static int levelNodeCount(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = levelNodeCount(root.left);
        int rightCount = levelNodeCount(root.right);
        System.out.printf("节点 %s 的左节点有 %d 个, 右节点有 %d 个 \n", root, leftCount, rightCount);
        return (leftCount + rightCount) + 1;
    }

    /**
     * 广度优先搜索
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> stack = new LinkedList<>();
        stack.offer(root);
        while (!stack.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int n = stack.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = stack.poll();
                level.add(node.val);
                if (node.left != null) {
                    stack.offer(node.left);
                }
                if (node.right != null) {
                    stack.offer(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }

}
