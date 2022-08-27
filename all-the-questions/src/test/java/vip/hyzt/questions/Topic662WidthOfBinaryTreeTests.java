package vip.hyzt.questions;

import org.junit.Test;

public class Topic662WidthOfBinaryTreeTests {

    @Test
    public void widthOfBinaryTree() {
        Topic662WidthOfBinaryTree topic662WidthOfBinaryTree = new Topic662WidthOfBinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(2);
        root.right.right = new TreeNode(9);

        int i = topic662WidthOfBinaryTree.widthOfBinaryTree(root);
        System.out.println(i);
    }

}
