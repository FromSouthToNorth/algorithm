package vip.hyzt.questions;

/**
 * <h2>687. 最长同值路径</h2>
 * <p>给定一个二叉树的 root ，返回 <i>最长的路径的长度</i> ，这个路径中的 每个节点具有相同值 。 这条路径可以经过也可以不经过根节点。</p>
 * <p><strong>两个节点之间的路径长度</strong> 由它们之间的边数表示。</p>
 * <h3>示例 1:</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/10/13/ex1.jpg">
 * <pre>
 *     输入：root = [5,4,5,1,1,5]
 *     输出：2
 * </pre>
 * <h3>示例 2:</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/10/13/ex2.jpg">
 * <pre>
 *     输入：root = [1,4,5,4,4,5]
 *     输出：2
 * </pre>
 * <ul>
 *     <li>树的节点数的范围是 [0, 10<sup>4</sup>] </li>
 *     <li>-1000 <= Node.val <= 1000</li>
 *     <li>树的深度将不超过 1000 </li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/longest-univalue-path/"></a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic687LongestUnivaluePath {

    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }
    int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0, cur = 0, l = dfs(root.left), r = dfs(root.right);
        if (root.left != null && root.left.val == root.val) {
            ans = l + 1; cur += l + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            ans = Math.max(ans, r + 1); cur += r + 1;
        }
        max = Math.max(max, cur);
        return ans;
    }

}
