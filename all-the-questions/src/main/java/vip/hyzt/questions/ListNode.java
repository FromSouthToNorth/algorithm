package vip.hyzt.questions;

/**
 * <h3>链表节点</h3>
 * <pre>
 *    head  next  next  next<sub>n</sub>
 *     1  →  2  →  3  →  N... → null
 * </pre>
 * @author hy
 */
public class ListNode {

    /**
     * 链表值
     */
    int val;

    /**
     * 链表指向的下一个节点
     */
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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

}
