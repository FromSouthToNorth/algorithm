package vip.hyzt.questions.wc335;

import org.junit.Test;
import vip.hyzt.questions.TreeNode;

public class Topic2583KthLargestLevelSumTests {

    @Test
    public void kthLargestLevelSum() {
        Topic2583KthLargestLevelSum topic2583KthLargestLevelSum = new Topic2583KthLargestLevelSum();
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(8);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(1);
        root1.left.left.left = new TreeNode(4);
        root1.left.left.right = new TreeNode(6);

        root1.right = new TreeNode(9);
        root1.right.left = new TreeNode(3);
        root1.right.right = new TreeNode(7);

        System.out.printf("res: %d\n", topic2583KthLargestLevelSum.kthLargestLevelSum(root1, 2));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2).left = new TreeNode(3);
        System.out.printf("res: %d\n", topic2583KthLargestLevelSum.kthLargestLevelSum(root2, 1));
    }

}
