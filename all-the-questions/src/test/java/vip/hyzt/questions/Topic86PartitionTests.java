package vip.hyzt.questions;

import org.junit.Test;

public class Topic86PartitionTests {

    @Test
    public void partition() {
        ListNode node =
                new ListNode(1,
                new ListNode(2,
                new ListNode(4,
                new ListNode(3,
                new ListNode(5,
                new ListNode(2,
                new ListNode(1)))))));
        Topic86Partition topic86Partition = new Topic86Partition();
        ListNode partition = topic86Partition.partition(node, 4);
        while (partition != null) {
            System.out.printf("(%d)", partition.val);
            partition = partition.next;
            if (partition != null) {
                System.out.printf("%s", "→");
            }
        }
    }

}
