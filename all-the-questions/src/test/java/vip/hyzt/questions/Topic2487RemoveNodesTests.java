package vip.hyzt.questions;

import org.junit.Test;

public class Topic2487RemoveNodesTests {

    @Test
    public void removeNodes() {
        Topic2487RemoveNodes topic2487RemoveNodes = new Topic2487RemoveNodes();
        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(13);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(8);
        ListNode res1 = topic2487RemoveNodes.removeNodes(head1);
        while (res1 != null) {
            System.out.printf("%d ", res1.val);
            res1 = res1.next;
        }
        System.out.println();

        Topic2487RemoveNodes topic2487RemoveNodes2 = new Topic2487RemoveNodes();
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(1);
        head2.next.next.next.next = new ListNode(1);
        ListNode res2 = topic2487RemoveNodes2.removeNodes(head2);
        while (res2 != null) {
            System.out.printf("%d ", res2.val);
            res2 = res2.next;
        }
        System.out.println();
    }

}
