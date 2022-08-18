package vip.hyzt.questions;

import org.junit.Test;

import java.util.List;

public class BinaryTreeTests {


    /**
     * <pre>
     *     <strong>input: </strong>
     *           1
     *        /     \
     *       2       3
     *      / \     / \
     *     5   4   8   9
     *        / \
     *       6   7
     *             root  |---  left   ---|  |- right -|
     *     <strong>result: </strong>[ <span style="color:'#1890ff'">1</span> | <span style="color:'#fadb14'">2</span> | 5 | 4 | 6 | 7 | <span style="color:'#fadb14'">3</span> | 8 | 9 ]
     * </pre>
     */
    @Test
    public void iteratePreorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(9);
        List<Integer> result = BinaryTree.iteratePreorderTraversal(root);
        System.out.println(result);
    }

     /**
     * <pre>
     *     <strong>input: </strong>
     *           1
     *        /     \
     *       2       3
     *      / \     / \
     *     5   4   8   9
     *        / \
     *       6   7
     *                                  root
     *     <strong>result: </strong>[ 5 | 2 | 6 | 4 | 7 | 1 | 8 | 3 | 9 ]
     * </pre>
     */
    @Test
    public void inOrderIteration() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(9);
        List<Integer> result = BinaryTree.inOrderIteration(root);
        System.out.println(result);
    }

    /**
     * <pre>
     *     <strong>input: </strong>
     *        3
     *       / \
     *      9   4
     *     /   / \
     *    10  5   7
     *     <strong>result: </strong>
     *      |- left -|  |right| root
     *     [10 | 9 | 5 | 7 | 4 | 3 ]
     * </pre>
     */
    @Test
    public void postorderDequeTraversal() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(5);
        List<Integer> list = BinaryTree.postorderDequeTraversal(root);
        System.out.println(list);
    }

    @Test
    public void bfsTree() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(8);
        List<List<Integer>> lists = BinaryTree.levelOrder(root);
        System.out.println(lists);
    }

}
