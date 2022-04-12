package vip.hyzt.questions;

/**
 * <h3>21.合并两个有序链表</h3>
 * <p>将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。</p>
 * <p><b>示例 1：</b></p>
 * <img src="https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg" /
 * <pre>
 *     <strong>输入：</strong>l1 = [1,2,4], l2 = [1,3,4]
 *     <strong>输出：</strong>[1,1,2,3,4,4]
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>l1 = [], l2 = []
 *     <strong>输出：</strong>[]
 * </pre>
 * <p><b>示例 3：</b></p>
 * <pre>
 *      <strong>输入：</strong>l1 = [], l2 = [0]
 *      <strong>输出：</strong>[0]
 *  </pre>
 *  <p><b>提示：</b></p>
 *  <ul>
 *      <li>两个链表的节点数目范围是 [0, 50]</li>
 *      <li>-100 <= Node.val <= 100</li>
 *      <li>l1 和 l2 均按 非递减顺序 排列</li>
 *  </ul>
 * @see <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists">链接：https://leetcode-cn.com/problems/merge-two-sorted-lists</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic21MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            cur.next = l1;
            cur = cur.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            cur.next = l2;
            cur = cur.next;
            l2 = l2.next;
        }

        return dummy.next;
    }

}
