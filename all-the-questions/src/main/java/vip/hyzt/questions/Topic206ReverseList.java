package vip.hyzt.questions;

/**
 * <h2>206. 反转链表</h2>
 * <p>给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex1.jpg">
 * <pre>
 *     输入：head = [1,2,3,4,5]
 *     输出：[5,4,3,2,1]
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex2.jpg">
 * <pre>
 *     输入：head = [1,2]
 *     输出：[2,1]
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：head = []
 *     输出：[]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>链表中节点的数目范围是 [0, 5000]</li>
 *     <li>-5000 <= Node.val <= 5000</li>
 * </ul>
 * @author hy
 */
public class Topic206ReverseList {

    /**
     * <pre>
     *     prev curr
     *      ↓    ↓
     *     null  1 → 2 → 3 → 4 → 5 → null
     *
     *           prev curr
     *            ↓    ↓
     *     null ← 1    2 → 3 → 4 → 5 → null
     *
     *              prev curr
     *                ↓   ↓
     *     null ← 1 ← 2   3 → 4 → 5
     *
     *                  prev curr
     *                    ↓   ↓
     *     null ← 1 ← 2 ← 3   4 →  → 5 → null
     *
     *
     *                      prev curr
     *                        ↓   ↓
     *     null ← 1 ← 2 ← 3 ← 4   5 → null
     *
     *                          prev curr
     *                            ↓   ↓
     *     null ← 1 ← 2 ← 3 ← 4 ← 5  null
     * </pre>
     */
    public ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
