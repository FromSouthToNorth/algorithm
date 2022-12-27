package vip.hyzt.questions;

import org.junit.Test;

public class Topic1518CountPartitionsTests {

    @Test
    public void countPartitions() {
        Topic1518CountPartitions topic1518CountPartitions = new Topic1518CountPartitions();
        System.out.printf("res: %d\n", topic1518CountPartitions.countPartitions(new int[]{1, 2, 3, 4}, 4));
        System.out.printf("res: %d\n", topic1518CountPartitions.countPartitions(new int[]{3, 3, 3}, 4));
        System.out.printf("res: %d\n", topic1518CountPartitions.countPartitions(new int[]{6, 6}, 2));
    }

}
