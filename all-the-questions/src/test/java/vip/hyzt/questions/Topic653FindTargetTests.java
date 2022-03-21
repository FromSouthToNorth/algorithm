package vip.hyzt.questions;

import org.junit.Test;

public class Topic653FindTargetTests {

    @Test
    public void findTarget() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(Topic653FindTarget.findTarget(root, 10));
    }

}
