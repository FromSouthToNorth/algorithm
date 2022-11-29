package vip.hyzt.questions;

/**
 * <h1>2487. 从链表中移除节点</h1>
 * <p>给你一个链表的头节点 head 。</p>
 * <p>对于列表中的每个节点 node ，如果其右侧存在一个具有 <strong>严格更大</strong> 值的节点，则移除 node 。</p>
 * <p>返回修改后链表的头节点 head 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/10/02/drawio.png">
 * <pre>
 *     输入：head = [5,2,13,3,8]
 *     输出：[13,8]
 *     解释：需要移除的节点是 5 ，2 和 3 。
 *     - 节点 13 在节点 5 右侧。
 *     - 节点 13 在节点 2 右侧。
 *     - 节点 8 在节点 3 右侧。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：head = [1,1,1,1]
 *     输出：[1,1,1,1]
 *     解释：每个节点的值都是 1 ，所以没有需要移除的节点。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>给定列表中的节点数目在范围 [1, 10<sup>5</sup>] 内</li>
 *     <li>1 <= Node.val <= 10<sup>5</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/remove-nodes-from-linked-list/">https://leetcode.cn/problems/remove-nodes-from-linked-list/</a>
 */
public class Topic2487RemoveNodes {

    private int max;

    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        head.next = removeNodes(head.next);
        return head.val < (max = Math.max(max, head.val)) ? head.next : head;
    }

}
