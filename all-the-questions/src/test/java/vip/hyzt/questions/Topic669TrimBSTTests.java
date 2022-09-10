package vip.hyzt.questions;

import org.junit.Test;

public class Topic669TrimBSTTests {

    @Test
    public void trimBST() {
        Topic669TrimBST topic669TrimBST = new Topic669TrimBST();
        TreeNode root;
        TreeNode treeNode;

        root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        treeNode = topic669TrimBST.trimBST(root, 1, 2);
        System.out.printf("res: %s\n", BinaryTree.inOrderIteration(treeNode));

        root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(4);

        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);

        treeNode = topic669TrimBST.trimBST(root, 1, 3);
        System.out.printf("res: %s \n", BinaryTree.inOrderIteration(treeNode));
    }

}
