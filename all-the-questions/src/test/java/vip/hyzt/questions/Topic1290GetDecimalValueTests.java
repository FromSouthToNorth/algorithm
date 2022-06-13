package vip.hyzt.questions;

import org.junit.Test;

public class Topic1290GetDecimalValueTests {

    @Test
    public void getDecimalValue() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1, null)));
        int ans = Topic1290GetDecimalValue.getDecimalValue(head);
        System.out.println(ans);
    }

}
