package vip.hyzt.questions;

/**
 * <h3>654. 最大二叉树</h3>
 * <p>给定一个不重复的整数数组 nums 。 <strong>最大二叉树</strong> 可以用下面的算法从 nums 递归地构建:</p>
 * <ol>
 *     <li>创建一个根节点，其值为 nums 中的最大值。</li>
 *     <li>递归地在最大值 <strong>左边</strong> 的 <strong>子数组前缀上</strong> 构建左子树。</li>
 *     <li>递归地在最大值 <strong>右边</strong> 的 <strong>子数组前缀上</strong> 构建右子树。</li>
 * </ol>
 * <p>返回 nums 构建的 <strong>最大二叉树</strong> 。</p>
 * <h4>示例 1：</h4>
 * <img src="https://assets.leetcode.com/uploads/2020/12/24/tree1.jpg">
 * <pre>
 *     输入：nums = [3,2,1,6,0,5]
 *     输出：[6,3,5,null,2,0,null,null,1]
 *     解释：递归调用如下所示：
 *     - [3,2,1,6,0,5] 中的最大值是 6 ，左边部分是 [3,2,1] ，右边部分是 [0,5] 。
 *         - [3,2,1] 中的最大值是 3 ，左边部分是 [] ，右边部分是 [2,1] 。
 *             - 空数组，无子节点。
 *             - [2,1] 中的最大值是 2 ，左边部分是 [] ，右边部分是 [1] 。
 *                 - 空数组，无子节点。
 *                 - 只有一个元素，所以子节点是一个值为 1 的节点。
 *         - [0,5] 中的最大值是 5 ，左边部分是 [0] ，右边部分是 [] 。
 *             - 只有一个元素，所以子节点是一个值为 0 的节点。
 *             - 空数组，无子节点。
 * </pre>
 * <h4>示例 2：</h4>
 * <img src="https://assets.leetcode.com/uploads/2020/12/24/tree2.jpg">
 * <pre>
 *     输入：nums = [3,2,1]
 *     输出：[3,null,2,null,1]
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= nums.length <= 1000</li>
 *     <li>0 <= nums[i] <= 1000</li>
 *     <li>nums 中的所有整数 互不相同</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/maximum-binary-tree">https://leetcode.cn/problems/maximum-binary-tree</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic654ConstructMaximumBinaryTree {

    static TreeNode[] stack = new TreeNode[1010];

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int he = 0, ta = 0;
        for (int num : nums) {
            TreeNode node = new TreeNode(num);
            while (he < ta && stack[ta - 1].val < num) {
                node.left = stack[--ta];
            }
            if (he < ta) {
                stack[ta - 1].right = node;
            }
            stack[ta++] = node;
        }
        return stack[0];
    }

}
