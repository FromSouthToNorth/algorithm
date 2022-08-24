package vip.hyzt.questions;

/**
 * <h2>25. K 个一组翻转链表</h2>
 * <p>给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。</p>
 * <p>k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。</p>
 * <p>你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/10/03/reverse_ex1.jpg">
 * <pre>
 *     输入：head = [1,2,3,4,5], k = 2
 *     输出：[2,1,4,3,5]
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2020/10/03/reverse_ex2.jpg">
 * <pre>
 *     输入：head = [1,2,3,4,5], k = 3
 *     输出：[3,2,1,4,5]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>链表中的节点数目为 n</li>
 *     <li>1 <= k <= n <= 5000</li>
 *     <li>0 <= Node.val <= 1000</li>
 * </ul>
 * <p><strong>进阶：</strong>你可以设计一个只用 O(1) 额外内存空间的算法解决此问题吗？</p>
 * @see <a href="https://leetcode.cn/problems/reverse-nodes-in-k-group/">https://leetcode.cn/problems/reverse-nodes-in-k-group/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic25ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;

        while (head != null) {
            ListNode tail = pre;
            // 查看剩余部分长度是否大于等于 k
            for (int i = 0; i < k; ++i) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }
            ListNode nex = tail.next;
            ListNode[] reverse = reverseKGroup(head, tail);
            head = reverse[0];
            tail = reverse[1];
            // 把子链表重新接回原链表
            pre.next = head;
            tail.next = nex;
            pre = tail;
            head = tail.next;
        }

        return hair.next;
    }

    private ListNode[] reverseKGroup(ListNode head, ListNode tail) {
        ListNode prev = tail.next;
        ListNode p = head;
        while (prev != tail) {
            ListNode nex = p.next;
            p.next = prev;
            prev = p;
            p = nex;
        }
        return new ListNode[]{tail, head};
    }

}
