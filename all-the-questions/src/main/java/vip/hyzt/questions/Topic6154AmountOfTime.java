package vip.hyzt.questions;

import java.sql.Array;
import java.util.ArrayList;

/**
 * <h3>6154. 感染二叉树需要的总时间</h3>
 * <p>给你一棵二叉树的根节点 root ，二叉树中节点的值 <strong>互不相同</strong> 。另给你一个整数 start 。在第 0 分钟，<strong>感染</strong> 将会从值为 start 的节点开始爆发。</p>
 * <p>每分钟，如果节点满足以下全部条件，就会被感染：</p>
 * <ul>
 *     <li>节点此前还没有感染。</li>
 *     <li>节点与一个已感染节点相邻。</li>
 * </ul>
 * <p>返回感染整棵树需要的分钟数。</p>
 * <h4>示例 1：</h4>
 * <img src="https://assets.leetcode.com/uploads/2022/06/25/image-20220625231744-1.png">
 * <pre>
 *     输入：root = [1,5,3,null,4,10,6,9,2], start = 3
 *     输出：4
 *     解释：节点按以下过程被感染：
 *     - 第 0 分钟：节点 3
 *     - 第 1 分钟：节点 1、10、6
 *     - 第 2 分钟：节点5
 *     - 第 3 分钟：节点 4
 *     - 第 4 分钟：节点 9 和 2
 *     感染整棵树需要 4 分钟，所以返回 4 。
 * </pre>
 * <h4>示例 2：</h4>
 * <img src="https://assets.leetcode.com/uploads/2022/06/25/image-20220625231812-2.png">
 * <pre>
 *     输入：root = [1], start = 1
 *     输出：0
 *     解释：第 0 分钟，树中唯一一个节点处于感染状态，返回 0 。
 * </pre>
 * @see <a href="https://leetcode.cn/problems/amount-of-time-for-binary-tree-to-be-infected">https://leetcode.cn/problems/amount-of-time-for-binary-tree-to-be-infected</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6154AmountOfTime {

    public int amountOfTime(TreeNode root, int start) {
        ArrayList<Integer>[] list = new ArrayList[100001];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        amountOfTime(root, list);
        return amountOfTime(start, 0, list);
    }

    private void amountOfTime(TreeNode root, ArrayList<Integer>[] list) {
        if (root.left != null) {
            list[root.val].add(root.left.val);
            list[root.left.val].add(root.val);
            amountOfTime(root.left, list);
        }
        if (root.right != null) {
            list[root.val].add(root.right.val);
            list[root.right.val].add(root.val);
            amountOfTime(root.right, list);
        }
    }
    private int amountOfTime(int start, int parent, ArrayList<Integer>[] list) {
        int max = 0;
        for (int i : list[start]) {
            max = i == parent ? max : Math.max(max, 1 + amountOfTime(i, start, list));
        }
        return max;
    }

}
