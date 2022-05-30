package vip.hyzt.questions;

import org.junit.Test;

public class Topic1022SumRootToLeafTests {

    /**
     * <pre>
     *     input:
     *                 1
     *              /     \
     *             0       1
     *           /   \   /   \
     *          0    1  0     1
     *     result:
     *          22
     * </pre>
     */
    @Test
    public void sumRootToLeaf1() {
        TreeNode root = new TreeNode(1, new TreeNode(0, new TreeNode(0, null, null), new TreeNode(1, null, null)),
                new TreeNode(1, new TreeNode(0, null, null), new TreeNode(1, null, null)));
        int ans = Topic1022SumRootToLeaf.sumRootToLeaf1(root);
        System.out.println(ans);
    }

    /**
     * <pre>
     *     input:
     *                 1
     *              /     \
     *             0       1
     *           /   \   /   \
     *          0    1  0     1
     *     result:
     *          22
     * </pre>
     */
    @Test
    public void sumRootToLeaf2() {
        TreeNode root = new TreeNode(1, new TreeNode(0, new TreeNode(0, null, null), new TreeNode(1, null, null)),
                new TreeNode(1, new TreeNode(0, null, null), new TreeNode(1, null, null)));
        int ans = Topic1022SumRootToLeaf.sumRootToLeaf2(root);
        System.out.println(ans);
    }

}
