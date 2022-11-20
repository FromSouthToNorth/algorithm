package vip.hyzt.questions;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * <h1>6242. 二叉搜索树最近节点查询</h1>
 * <p>给你一个 <strong>二叉搜索树</strong> 的根节点 root ，和一个由正整数组成、长度为 n 的数组 queries 。</p>
 * <p>请你找出一个长度为 n 的 <strong>二维</strong> 答案数组 answer ，其中 answer[i] = [min<sub>i</sub>, max<sub>i</sub>] ：</p>
 * <ul>
 *     <li>mini 是树中小于等于 queries[i] 的 最大值 。如果不存在这样的值，则使用 -1 代替。</li>
 *     <li>maxi 是树中大于等于 queries[i] 的 最小值 。如果不存在这样的值，则使用 -1 代替。</li>
 * </ul>
 * <p>返回数组 answer 。</p>
 * <p></p>
 * <h2>示例 1 ：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/09/28/bstreeedrawioo.png">
 * <pre>
 *     输入：root = [6,2,13,1,4,9,15,null,null,null,null,null,null,14], queries = [2,5,16]
 *     输出：[[2,2],[4,6],[15,-1]]
 *     解释：按下面的描述找出并返回查询的答案：
 *     - 树中小于等于 2 的最大值是 2 ，且大于等于 2 的最小值也是 2 。所以第一个查询的答案是 [2,2] 。
 *     - 树中小于等于 5 的最大值是 4 ，且大于等于 5 的最小值是 6 。所以第二个查询的答案是 [4,6] 。
 *     - 树中小于等于 16 的最大值是 15 ，且大于等于 16 的最小值不存在。所以第三个查询的答案是 [15,-1] 。
 * </pre>
 * <h2>示例 2 ：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/09/28/bstttreee.png">
 * <pre>
 *     输入：root = [4,null,9], queries = [3]
 *     输出：[[-1,4]]
 *     解释：树中不存在小于等于 3 的最大值，且大于等于 3 的最小值是 4 。所以查询的答案是 [-1,4] 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>树中节点的数目在范围 [2, 10<sup>5</sup>] 内</li>
 *     <li>1 <= Node.val <= 10<sup>6</sup></li>
 *     <li>n == queries.length</li>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 *     <li>1 <= queries[i] <= 10<sup>6</sup></li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/closest-nodes-queries-in-a-binary-search-tree/">https://leetcode.cn/problems/closest-nodes-queries-in-a-binary-search-tree/</a>
 */
public class Topic2474ClosestNodes {

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        TreeSet<Integer> set = new TreeSet<>(Set.of(-1));
        closestNodes(root, set);
        return queries.stream().map(t ->
                List.of(set.floor(t), set.ceiling(t) == null
                        ? -1 : set.ceiling(t))).toList();
    }

    private void closestNodes(TreeNode root, TreeSet<Integer> set) {
        if (root != null) {
            set.add(root.val);
            closestNodes(root.left, set);
            closestNodes(root.right, set);
        }
    }

}
