package vip.hyzt.questions;

import org.junit.Test;

public class Topic21MergeTwoListsTests {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5, new ListNode(7)))));
        ListNode node = Topic21MergeTwoLists.mergeTwoLists(l1, l2);
        while (node != null) {
            System.out.printf("(%d)", node.val);
            node = node.next;
            if (node != null) {
                System.out.printf(" %s ", "→");
            }
        }
    }

}
