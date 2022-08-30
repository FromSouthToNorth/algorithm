package vip.hyzt.questions;

/**
 * <h2>998. 最大二叉树 II</h2>
 * <p><strong>最大树</strong> 定义：一棵树，并满足：其中每个节点的值都大于其子树中的任何其他值。</p>
 * <p>给你最大树的根节点 root 和一个整数 val 。</p>
 * <p>就像 <a href="https://leetcode.cn/problems/maximum-binary-tree/">之前的问题</a> 那样，给定的树是利用 Construct(a) 例程从列表 a（root = Construct(a)）递归地构建的：</p>
 * <ul>
 *     <li>如果 a 为空，返回 null 。</li>
 *     <li>否则，令 a[i] 作为 a 的最大元素。创建一个值为 a[i] 的根节点 root 。</li>
 *     <li>root 的左子树将被构建为 Construct([a[0], a[1], ..., a[i - 1]]) 。</li>
 *     <li>root 的右子树将被构建为 Construct([a[i + 1], a[i + 2], ..., a[a.length - 1]]) 。</li>
 *     <li>返回 root 。</li>
 * </ul>
 * <p>请注意，题目没有直接给出 a ，只是给出一个根节点 root = Construct(a) 。</p>
 * <p>假设 b 是 a 的副本，并在末尾附加值 val。题目数据保证 b 中的值互不相同。</p>
 * <p>返回 Construct(b) 。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/maximum-binary-tree-1-1.png">
 * <pre>
 *     输入：root = [4,1,3,null,null,2], val = 5
 *     输出：[5,4,null,1,3,null,null,2]
 *     解释：a = [1,4,2,3], b = [1,4,2,3,5]
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/maximum-binary-tree-2-1.png">
 * <pre>
 *     输入：root = [5,2,4,null,1], val = 3
 *     输出：[5,2,4,null,1,null,3]
 *     解释：a = [2,1,5,4], b = [2,1,5,4,3]
 * </pre>
 * <h3>示例 3：</h3>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/maximum-binary-tree-3-1.png">
 * <pre>
 *     输入：root = [5,2,3,null,1], val = 4
 *     输出：[5,2,4,null,1,3]
 *     解释：a = [2,1,5,3], b = [2,1,5,3,4]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>树中节点数目在范围 [1, 100] 内</li>
 *     <li>1 <= Node.val <= 100</li>
 *     <li>树中的所有值 <strong>互不相同</strong></li>
 *     <li>1 <= val <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/maximum-binary-tree-ii">https://leetcode.cn/problems/maximum-binary-tree-ii</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic998InsertIntoMaxTree {

    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        TreeNode prev = null, cur = root;
        while (cur != null && cur.val > val) {
            prev = cur;
            cur = cur.right;
        }
        if (prev == null) {
            node.left = cur;
            return node;
        }
        else {
            prev.right = node;
            node.left = cur;
            return root;
        }
    }

}
