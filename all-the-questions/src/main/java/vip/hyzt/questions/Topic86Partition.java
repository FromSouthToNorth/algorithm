package vip.hyzt.questions;

/**
 * <h3>86. 分隔链表</h3>
 * <p>给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 <strong>小于</strong> x 的节点都出现在 <strong>大于或等于</strong> x 的节点之前。</p>
 * <p>你应当 <strong>保留</strong> 两个分区中每个节点的初始相对位置。</p>
 * <h4>示例 1：</h4>
 * <img src="https://assets.leetcode.com/uploads/2021/01/04/partition.jpg">
 * <pre>
 *     输入：head = [1,4,3,2,5,2], x = 3
 *     输出：[1,2,2,4,3,5]
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：head = [2,1], x = 2
 *     输出：[1,2]
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>链表中节点的数目在范围 [0, 200] 内</li>
 *     <li>-100 <= Node.val <= 100</li>
 *     <li>-200 <= x <= 200</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/partition-list/">https://leetcode.cn/problems/partition-list/</a>
 */
public class Topic86Partition {

    public ListNode partition(ListNode head, int x) {

        ListNode large = new ListNode(-1);
        ListNode largeHead = large;

        ListNode small = new ListNode(-1);
        ListNode smallHead = small;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            }
            else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }

        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;

    }

}
