package vip.hyzt.questions.wc319;

import org.junit.Test;
import vip.hyzt.questions.TreeNode;
import vip.hyzt.questions.wc319.Topic2471MinimumOperations;

public class Topic2471MinimumOperationsTests {

    @Test
    public void minimumOperations() {
        Topic2471MinimumOperations topic2471MinimumOperations = new Topic2471MinimumOperations();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(6);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(8);
        root.right.left.left = new TreeNode(9);

        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(10);

        System.out.printf("res: %s\n", topic2471MinimumOperations.minimumOperations(root));
    }

}
