package vip.hyzt.questions;

/**
 * <p>两数相加</p>
 * <P>给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。</P>
 *
 * <p>请你将两个数相加，并以相同形式返回一个表示和的链表。</p>
 *
 * <p>你可以假设除了数字 0 之外，这两个数都不会以 0开头。</p>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/add-two-numbers">链接：https://leetcode-cn.com/problems/add-two-numbers</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TheTwoTogether2 {

    /**
     * 两数相加
     * 果声明返回结链表的头部(head)及尾部(tail) 及 进位的变量(carry)
     * 迭代参数链表 l1, l2
     * 取出l1,l2中的 val 数字和进位(carry)相加 sum
     * 当第一次返回的结果链表头部为null时，将其 sum 变量存入 尾部加以存入头部
     *
     * @param l1 第一个链表 (2 -> 4 -> 3)
     * @param l2 第二个链表 (5 -> 6 -> 4)
     * @return 两个链表倒序相加的和 (7 -> 0 -> 8)
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 声明链表头部, 及尾部
        ListNode head = null, tail = null;

        // 进位的数 (6 + 4 进 1)
        int carry = 0;

        // 循环链表直至没有下一个元素
        while (l1 !=null || l2 != null) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int sum = num1 + num2 + carry;
            // 当第一次链表头部为 null 时初始链表化头部
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            }
            else {
                // 继续添加接下的元素
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            // 进行迭代第一个链表
            if (l1 != null) {
                l1 = l1.next;
            }
            // 进行迭代第二个链表
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        // 当进位大于 0 则在链表尾部添加下一个元素
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

}

class ListNode {

    int val;

    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
