package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h2>662. 二叉树最大宽度</h2>
 * <p>给你一棵二叉树的根节点 root ，返回树的 <strong>最大宽度</strong> 。</p>
 * <p>树的 <strong>最大宽度</strong> 是所有层中最大的 <strong>宽度</strong> 。</p>
 * <p>每一层的 <strong>宽度</strong> 被定义为该层最左和最右的非空节点（即，两个端点）之间的长度。将这个二叉树视作与满二叉树结构相同，两端点间会出现一些延伸到这一层的 null 节点，这些 null 节点也计入长度。</p>
 * <p>题目数据保证答案将会在 <strong>32 位</strong> 带符号整数范围内。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2021/05/03/width1-tree.jpg">
 * <pre>
 *     输入：root = [1,3,2,5,3,null,9]
 *     输出：4
 *     解释：最大宽度出现在树的第 3 层，宽度为 4 (5,3,null,9) 。
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/03/14/maximum-width-of-binary-tree-v3.jpg">
 * <pre>
 *     输入：root = [1,3,2,5,null,null,9,6,null,7]
 *     输出：7
 *     解释：最大宽度出现在树的第 4 层，宽度为 7 (6,null,null,null,null,null,7) 。
 * </pre>
 * <h3>示例 3：</h3>
 * <img src="https://assets.leetcode.com/uploads/2021/05/03/width3-tree.jpg">
 * <pre>
 *     输入：root = [1,3,2,5]
 *     输出：2
 *     解释：最大宽度出现在树的第 2 层，宽度为 2 (3,2) 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>树中节点的数目范围是 [1, 3000]</li>
 *     <li>-100 <= Node.val <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/maximum-width-of-binary-tree">https://leetcode.cn/problems/maximum-width-of-binary-tree</a>
 * @author 来源：力扣（LeetCode）
 * @author hy
 */
public class Topic662WidthOfBinaryTree {

    Map<Integer, Integer> map = new HashMap<>();
    int ans;

    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 1, 0);
        return ans;
    }

    void dfs(TreeNode root, int index, int depth) {
        if (root == null) {
            return;
        }
        if (!map.containsKey(depth)) {
            map.put(depth, index);
        }
        ans = Math.max(ans, index - map.get(depth) + 1);
        dfs(root.left, index << 1, depth + 1);
        dfs(root.right, index << 1 | 1, depth + 1);
    }

}
