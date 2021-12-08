package vip.hyzt.questions;

import org.junit.Test;

public class TheTwoTogether2Test {

    @Test
    public void addTwoNumbersTest() {
        ListNode l1 = new ListNode(1, new ListNode(9, new ListNode(2, null)));
        ListNode l2 = new ListNode(3, new ListNode(1, new ListNode(6, null)));
        // (2 -> 9 -> 1) + (6 -> 1 -> 3)  = 904
        ListNode listNode = TheTwoTogether2.addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
