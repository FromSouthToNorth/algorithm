package vip.hyzt.questions;

/**
 * <h1>82. 删除排序链表中的重复元素 II</h1>
 * <p>给定一个已排序的链表的头 head ，<em>删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。</em></p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2021/01/04/linkedlist1.jpg">
 * <pre>
 *     输入：head = [1,2,3,3,4,4,5]
 *     输出：[1,2,5]
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2021/01/04/linkedlist2.jpg">
 * <pre>
 *     输入：head = [1,1,1,2,3]
 *     输出：[2,3]
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>链表中节点数目在范围 [0, 300] 内</li>
 *     <li>-100 <= Node.val <= 100</li>
 *     <li>题目数据保证链表已经按升序 <strong>排列</strong></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/">https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/</a>
 */
public class Topic82DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(0, head);
        ListNode cur = pre;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int val = cur.next.val;
                while (cur.next != null && cur.next.val == val) {
                    cur.next = cur.next.next;
                }
            }
            else {
                cur = cur.next;
            }
        }
        return pre.next;
    }

}
