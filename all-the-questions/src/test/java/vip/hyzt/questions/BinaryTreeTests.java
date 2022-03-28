package vip.hyzt.questions;

import org.junit.Test;

public class BinaryTreeTests {

    @Test
    public void bfsTree() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(8);
        BinaryTree.bfsTree(root);
    }

}
