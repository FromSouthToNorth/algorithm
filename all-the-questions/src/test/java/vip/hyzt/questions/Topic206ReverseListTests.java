package vip.hyzt.questions;

import org.junit.Test;

public class Topic206ReverseListTests {

    @Test
    public void reverseList() {
        Topic206ReverseList topic206ReverseList = new Topic206ReverseList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode node = topic206ReverseList.reverseList1(head);
        while (node != null) {
            System.out.printf("%s", node.val);
            node = node.next;
            if (node != null) {
                System.out.printf(" %s ", "→");
            }
        }

        System.out.println("\n");

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        ListNode node1 = topic206ReverseList.reverseList2(head2);
        while (node1 != null) {
            System.out.printf("%s", node1.val);
            node1 = node1.next;
            if (node1 != null) {
                System.out.printf(" %s ", "→");
            }
        }
    }

}
