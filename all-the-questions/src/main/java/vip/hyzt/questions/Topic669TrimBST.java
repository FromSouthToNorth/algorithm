package vip.hyzt.questions;

/**
 * <h2>669. 修剪二叉搜索树</h2>
 * <p>给你二叉搜索树的根节点 root ，同时给定最小边界low 和最大边界 high。通过修剪二叉搜索树，使得所有节点的值在[low, high]中。修剪树 <strong>不应该</strong> 改变保留在树中的元素的相对结构 (即，如果没有被移除，原有的父代子代关系都应当保留)。 可以证明，存在 <strong>唯一的答案</strong> 。</p>
 * <p>所以结果应当返回修剪好的二叉搜索树的新的根节点。注意，根节点可能会根据给定的边界发生改变。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/09/09/trim1.jpg">
 * <pre>
 *     输入：root = [1,0,2], low = 1, high = 2
 *     输出：[1,null,2]
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/09/09/trim2.jpg">
 * <pre>
 *     输入：root = [3,0,4,null,2,null,null,1], low = 1, high = 3
 *     输出：[3,2,null,1]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>树中节点数在范围 [1, 10<sup>4</sup>] 内</li>
 *     <li>0 <= Node.val <= 10<sup>4</sup></li>
 *     <li>树中每个节点的值都是 唯一 的</li>
 *     <li>题目数据保证输入是一棵有效的二叉搜索树</li>
 *     <li>0 <= low <= high <= 10<sup>4</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/trim-a-binary-search-tree">https://leetcode.cn/problems/trim-a-binary-search-tree</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic669TrimBST {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        while (root != null && (root.val < low || root.val > high)) {
            root = root.val < low ? root.right : root.left;
        }
        TreeNode node = root;
        while (root != null) {
            while (root.left != null && root.left.val < low) {
                root.left = root.left.right;
            }
            root = root.left;
        }
        root = node;
        while (root != null) {
            while (root.right != null && root.right.val > high) {
                root.right = root.right.left;
            }
            root = root.right;
        }
        return node;
    }

}
