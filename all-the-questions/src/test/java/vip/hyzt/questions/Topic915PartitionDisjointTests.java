package vip.hyzt.questions;

import org.junit.Test;

public class Topic915PartitionDisjointTests {

    @Test
    public void partitionDisjoint() {
        Topic915PartitionDisjoint topic915PartitionDisjoint = new Topic915PartitionDisjoint();
        int[][] nums = {{5, 0, 3, 8, 6}, {1, 1, 1, 0, 6, 12}, {2, 2, 1, 3, 0, 9, 4, 9, 10, 11, 100}};
        for (int[] num : nums) {
            System.out.printf("res: %d\n", topic915PartitionDisjoint.partitionDisjoint(num));
        }
    }

}
