package vip.hyzt.questions.wc307;

import org.junit.Test;
import vip.hyzt.questions.TreeNode;
import vip.hyzt.questions.wc307.Topic2385AmountOfTime;

public class Topic2385AmountOfTimeTests {

    @Test
    public void amountOfTime() {
        Topic2385AmountOfTime topic2385AmountOfTime = new Topic2385AmountOfTime();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(5);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(9);
        root.left.right.right = new TreeNode(2);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(6);

        int res1 = topic2385AmountOfTime.amountOfTime(root, 3);
        System.out.printf("%d\n", res1);
    }

}
