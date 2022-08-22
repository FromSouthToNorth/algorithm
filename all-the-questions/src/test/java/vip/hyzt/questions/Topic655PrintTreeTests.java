package vip.hyzt.questions;

import org.junit.Test;

import java.util.List;

public class Topic655PrintTreeTests {

    @Test
    public void printTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Topic655PrintTree topic655PrintTree = new Topic655PrintTree();
        List<List<String>> res = topic655PrintTree.printTree(root);
        System.out.println(res);

        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        List<List<String>> lists = topic655PrintTree.printTree(root);
        System.out.println(lists);
    }

}
