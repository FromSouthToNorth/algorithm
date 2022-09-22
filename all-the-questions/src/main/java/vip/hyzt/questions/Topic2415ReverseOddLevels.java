package vip.hyzt.questions;

/**
 * <h2>2415. 反转二叉树的奇数层</h2>
 * <p>给你一棵 <strong>完美</strong> 二叉树的根节点 root ，请你反转这棵树中每个 <strong>奇数</strong> 层的节点值。</p>
 * <ul>
 *     <li>例如，假设第 3 层的节点值是 [2,1,3,4,7,11,29,18] ，那么反转后它应该变成 [18,29,11,7,4,3,1,2] 。</li>
 * </ul>
 * <p>反转后，返回树的根节点。</p>
 * <p><strong>完美</strong> 二叉树需满足：二叉树的所有父节点都有两个子节点，且所有叶子节点都在同一层。</p>
 * <p>节点的 <strong>层数</strong> 等于该节点到根节点之间的边数。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/07/28/first_case1.png">
 * <pre>
 *     输入：root = [2,3,5,8,13,21,34]
 *     输出：[2,5,3,8,13,21,34]
 *     解释：
 *     这棵树只有一个奇数层。
 *     在第 1 层的节点分别是 3、5 ，反转后为 5、3 。
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/07/28/second_case3.png">
 * <pre>
 *     输入：root = [7,13,11]
 *     输出：[7,11,13]
 *     解释：
 *     在第 1 层的节点分别是 13、11 ，反转后为 11、13 。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：root = [0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]
 *     输出：[0,2,1,0,0,0,0,2,2,2,2,1,1,1,1]
 *     解释：奇数层由非零值组成。
 *     在第 1 层的节点分别是 1、2 ，反转后为 2、1 。
 *     在第 3 层的节点分别是 1、1、1、1、2、2、2、2 ，反转后为 2、2、2、2、1、1、1、1 。
 * </pre>
 * @see <a href="https://leetcode.cn/problems/reverse-odd-levels-of-binary-tree">https://leetcode.cn/problems/reverse-odd-levels-of-binary-tree</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2415ReverseOddLevels {

    public TreeNode reverseOddLevels(TreeNode root) {
        reverseOddLevels(root.left, root.right, true);
        return root;
    }

    private void reverseOddLevels(TreeNode left, TreeNode right, boolean flag) {
        if (left != null) {
            if (flag) {
                left.val ^= right.val ^ (right.val = left.val);
            }
            reverseOddLevels(left.left, right.right, !flag);
            reverseOddLevels(left.right, right.left, !flag);
        }
    }

}
