package vip.hyzt.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>653.两数之和 IV - 输入 BST</h3>
 * <p>给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。</p>
 * <p><b>示例 1：</b></p>
 * <img src="https://assets.leetcode.com/uploads/2020/09/21/sum_tree_1.jpg">
 * <pre>
 *     <strong>输入：</strong>root = [5,3,6,2,4,null,7], k = 9
 *     <strong>输出：</strong>true
 * </pre>
 * <p><b>示例 1：</b></p>
 * <img src="https://assets.leetcode.com/uploads/2020/09/21/sum_tree_2.jpg">
 * <pre>
 *     <strong>输入：</strong>root = [5,3,6,2,4,null,7], k = 28
 *     <strong>输出：</strong>false
 * </pre>
 *
 * @see <a href="https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/">653.两数之和 IV - 输入 BST</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic653FindTarget {

    private static Set<Integer> set = new HashSet<>();
    public static boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }

}
