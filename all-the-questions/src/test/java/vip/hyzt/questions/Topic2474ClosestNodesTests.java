package vip.hyzt.questions;

import org.junit.Test;

import java.util.ArrayList;

public class Topic2474ClosestNodesTests {

    @Test
    public void closestNodes() {
        Topic2474ClosestNodes topic2474ClosestNodes = new Topic2474ClosestNodes();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(15);
        root.right.right.left = new TreeNode(14);
        ArrayList<Integer> queries1 = new ArrayList<>();
        queries1.add(2);
        queries1.add(5);
        queries1.add(16);
        System.out.printf("res: %s\n", topic2474ClosestNodes.closestNodes(root, queries1));
    }

}
