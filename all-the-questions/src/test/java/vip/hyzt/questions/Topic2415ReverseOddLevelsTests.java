package vip.hyzt.questions;

import org.junit.Test;

import java.util.List;

public class Topic2415ReverseOddLevelsTests {

    @Test
    public void reverseOddLevels() {
        Topic2415ReverseOddLevels topic2415ReverseOddLevels = new Topic2415ReverseOddLevels();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(13);

        root.right = new TreeNode(5);
        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(34);

        TreeNode node = topic2415ReverseOddLevels.reverseOddLevels(root);
        List<Integer> list = BinaryTree.iteratePreorderTraversal(node);
        for (Integer integer : list) {
            System.out.printf("%d ", integer);
        }
    }

}
