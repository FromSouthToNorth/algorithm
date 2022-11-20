package vip.hyzt.questions;

import org.junit.Test;

import java.util.ArrayList;

public class Topic2474ClosestNodesTests {

    @Test
    public void closestNodes() {
        Topic2474ClosestNodes topic2474ClosestNodes = new Topic2474ClosestNodes();
        TreeNode root1 = new TreeNode(6);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(13);

        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(15);
        root1.right.right.left = new TreeNode(14);
        ArrayList<Integer> queries1 = new ArrayList<>();
        queries1.add(2);
        queries1.add(5);
        queries1.add(16);
        System.out.printf("res: %s\n", topic2474ClosestNodes.closestNodes(root1, queries1));

        TreeNode root2 = new TreeNode(4);
        root2.right = new TreeNode(9);
        ArrayList<Integer> queries2 = new ArrayList<>();
        queries2.add(3);
        System.out.printf("res: %s\n", topic2474ClosestNodes.closestNodes(root2, queries2));
    }

}
