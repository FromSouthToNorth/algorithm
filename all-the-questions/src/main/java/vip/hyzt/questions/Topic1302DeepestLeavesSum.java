package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * <h3>1302. 层数最深叶子节点的和</h3>
 * <p>给你一棵二叉树的根节点 root ，请你返回 <strong>层数最深的叶子节点的和</strong> 。</p>
 * <h4>示例1：</h4>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/12/28/1483_ex1.png">
 * <pre>
 *     输入：root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 *     输出：15
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 *     输出：19
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>树中节点数目在范围 [1, 10<sup>4</sup>] 之间。</li>
 *     <li>1 <= Node.val <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/deepest-leaves-sum/">https://leetcode.cn/problems/deepest-leaves-sum/</a>
 * @author hy
 */
public class Topic1302DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        int depth = 0;
        while (!d.isEmpty()) {
            int size = d.size();
            while (size -- > 0) {
                TreeNode node = d.pollFirst();
                map.put(depth, map.getOrDefault(depth, 0) + node.val);
                if (node.left != null) {
                    d.addLast(node.left);
                }
                if (node.right != null) {
                    d.addLast(node.right);
                }
            }
            depth++;
        }
        return map.get(depth - 1);
    }

}
