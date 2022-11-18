package vip.hyzt.questions;

import org.junit.Test;

public class Topic82DeleteDuplicatesTests {

    @Test
    public void deleteDuplicates() {
        Topic82DeleteDuplicates topic82DeleteDuplicates = new Topic82DeleteDuplicates();
        ListNode head1 =
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(3)))));
        ListNode res1 = topic82DeleteDuplicates.deleteDuplicates(head1);
        while (res1 != null) {
            System.out.printf("%d", res1.val);
            res1 = res1.next;
            if(res1 == null) {
                System.out.print("\n");
            }
            else {
                System.out.print(" → ");
            }
        }
        ListNode node = topic82DeleteDuplicates.deleteDuplicates(null);
        System.out.printf("%s\n", node);
    }

}
