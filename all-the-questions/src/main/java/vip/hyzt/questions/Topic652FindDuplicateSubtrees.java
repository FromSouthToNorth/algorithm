package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h2>652. 寻找重复的子树</h2>
 * <p>给定一棵二叉树 root，<strong>返回所有重复的子树</strong>。</p>
 * <p>对于同一类的重复子树，你只需要返回其中任意<strong>一棵</strong>的根结点即可。</p>
 * <p>如果两棵树具有<strong>相同的结构</strong>和<strong>相同的结点值</strong>，则它们是<strong>重复</strong>的。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/08/16/e1.jpg">
 * <pre>
 *     输入：root = [1,2,3,4,null,2,4,null,null,4]
 *     输出：[[2,4],[4]]
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/08/16/e2.jpg">
 * <pre>
 *     输入：root = [2,1,1]
 *     输出：[[1]]
 * </pre>
 * <h3>示例 3：</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/08/16/e33.jpg">
 * <pre>
 *     输入：root = [2,2,2,3,null,3,null]
 *     输出：[[2,3],[3]]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>树中的结点数在[1,10^4]范围内。</li>
 *     <li>-200 <= Node.val <= 200</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/find-duplicate-subtrees/">https://leetcode.cn/problems/find-duplicate-subtrees/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic652FindDuplicateSubtrees {

    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> ans = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return ans;
    }
    String dfs(TreeNode root) {
        if (root == null) {
            return " ";
        }
        String key = root.val + "_" +
                dfs(root.left) + dfs(root.right);
        map.put(key, map.getOrDefault(key, 0) + 1);
        if (map.get(key) == 2) {
            ans.add(root);
        }
        return key;
    }

}
