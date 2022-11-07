package vip.hyzt.questions;

import java.util.*;

/**
 * <h3>450. 删除二叉搜索树中的节点</h3>
 * <p>给定一个二叉搜索树的根节点 <strong>root</strong> 和一个值 <strong>key</strong>，删除二叉搜索树中的 <strong>key</strong> 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。</p>
 * <p>一般来说，删除节点可分为两个步骤：</p>
 * <ol>
 *     <li>首先找到需要删除的节点；</li>
 *     <li>如果找到了，删除它。</li>
 * </ol>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/09/04/del_node_1.jpg" >
 * <pre>
 *     输入：root = [5,3,6,2,4,null,7], key = 3
 *     输出：[5,4,6,2,null,null,7]
 *     解释：给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
 *     一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
 *     另一个正确答案是 [5,2,6,null,4,null,7]。
 *     <img src="https://assets.leetcode.com/uploads/2020/09/04/del_node_supp.jpg">
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入: root = [5,3,6,2,4,null,7], key = 0
 *     输出: [5,3,6,2,4,null,7]
 *     解释: 二叉树不包含值为 0 的节点
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入: root = [], key = 0
 *     输出: []
 * </pre>
 * <h3>提示：</h3>
 * <li>节点数的范围 [0, 10<sup>4</sup>].</li>
 * <li>-10<sup>5</sup> <= Node.val <= 10<sup>5</sup></li>
 * <li>节点值唯一</li>
 * <li>root 是合法的二叉搜索树</li>
 * <li>-10<sup>5</sup> <= key <= 10<sup>5</sup></li>
 * @see <a href="https://leetcode.cn/problems/delete-node-in-a-bst">链接：https://leetcode.cn/problems/delete-node-in-a-bst</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic450DeleteNode {

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left  == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            TreeNode t = root.left;
            while (t.right != null) {
                t = t.right;
            }
            t.right = root.right;
            return root.left;
        }
        else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        else {
            root.left = deleteNode(root.left, key);
        }
        return root;
    }

}
