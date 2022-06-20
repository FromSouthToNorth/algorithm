package vip.hyzt.questions;

/**
 * <h3>剑指 Offer II 029. 排序的循环链表</h3>
 * <p>给定循环单调非递减列表中的一个点，写一个函数向这个列表中插入一个新元素 insertVal ，使这个列表仍然是循环升序的。</p>
 * <p>给定的可以是这个列表中任意一个顶点的指针，并不一定是这个列表中最小元素的指针。</p>
 * <p>如果有多个满足条件的插入位置，可以选择任意一个位置插入新的值，插入后整个列表仍然保持有序。</p>
 * <p>如果列表为空（给定的节点是 null），需要创建一个循环有序列表并返回这个节点。否则。请返回原先给定的节点。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2019/01/19/example_1_before_65p.jpg" >
 * <pre>
 *     输入：head = [3,4,1], insertVal = 2
 *     输出：[3,4,1,2]
 *     解释：在上图中，有一个包含三个元素的循环有序列表，你获得值为 3 的节点的指针，我们需要向表中插入元素 2 。新插入的节点应该在 1 和 3 之间，插入之后，整个列表如上图所示，最后返回节点 3 。
 *     <img src="https://assets.leetcode.com/uploads/2019/01/19/example_1_after_65p.jpg">
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：head = [], insertVal = 1
 *     输出：[1]
 *     解释：列表为空（给定的节点是 null），创建一个循环有序列表并返回这个节点。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：head = [1], insertVal = 0
 *     输出：[1,0]
 * </pre>
 * <h3>提示：</h3>
 * <li>0 <= Number of Nodes <= 5 * 10^4</li>
 * <li>-10^6 <= ListNode.val <= 10^6</li>
 * <li>-10^6 <= insertVal <= 10^6</li>
 * @see <a href="https://leetcode.cn/problems/4ueAj6/">https://leetcode.cn/problems/4ueAj6/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class TopicOfferII029Insert {

    public static ListNode insert(ListNode head, int insertVal) {
        ListNode node = new ListNode(insertVal);
        if (head == null) {
            node.next = node;
            return node;
        }
        if (head.next == head) {
            head.next = node;
            node.next = head;
            return head;
        }
        ListNode curr = head, next = head.next;
        while (next != head) {
            if (insertVal >= curr.val && insertVal <= next.val) {
                break;
            }
            if (curr.val > next.val) {
                if (insertVal > curr.val || insertVal < next.val) {
                    break;
                }
            }
            curr = curr.next;
            next = next.next;
        }
        curr.next = node;
        node.next = next;
        return head;
    }

}
