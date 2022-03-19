package vip.hyzt.questions;

import org.junit.Test;

public class Topic606Tree2strTests {

    @Test
    public void tree2str() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        String s = Topic606Tree2str.tree2str(root);
        System.out.println(s);
    }

}
