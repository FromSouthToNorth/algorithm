package vip.hyzt.questions;

import org.junit.Test;

public class Topic6154AmountOfTimeTests {

    @Test
    public void amountOfTime() {
        Topic6154AmountOfTime topic6154AmountOfTime = new Topic6154AmountOfTime();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(5);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(9);
        root.left.right.right = new TreeNode(2);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(6);

        int res1 = topic6154AmountOfTime.amountOfTime(root, 3);
        System.out.printf("%d\n", res1);
    }

}
