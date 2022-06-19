package vip.hyzt.questions;

import org.junit.Test;

public class TopicOfferII029InsertTests {

    @Test
    public void insert() {
        ListNode head = new ListNode(3, new ListNode(4, new ListNode(2)));
        ListNode ans = TopicOfferII029Insert.insert(head, 2);
    }

}
