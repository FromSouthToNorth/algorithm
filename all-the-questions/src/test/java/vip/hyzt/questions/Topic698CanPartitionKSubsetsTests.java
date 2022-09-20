package vip.hyzt.questions;

import org.junit.Test;

public class Topic698CanPartitionKSubsetsTests {

    @Test
    public void canPartitionKSubsets() {
        Topic698CanPartitionKSubsets topic698CanPartitionKSubsets = new Topic698CanPartitionKSubsets();
        System.out.println("nums = [4, 3, 2, 3, 5, 2, 1], k = 4 \nres: " + topic698CanPartitionKSubsets.canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4));
        System.out.println("nums = [1, 2, 3, 4], k = 3 \nres: " + topic698CanPartitionKSubsets.canPartitionKSubsets(new int[]{1, 2, 3, 4}, 3));
        System.out.println("nums = [3, 3, 4, 2, 2, 2, 2, 4, 4, 4, 5, 1], k = 6 \nres: " + topic698CanPartitionKSubsets.canPartitionKSubsets(new int[]{3, 3, 4, 2, 2, 2, 2, 4, 4, 4, 5, 1}, 6));
        System.out.println("nums = [3, 3, 4, 2, 2, 2, 2, 4, 4, 6, 7, 4, 5, 1], k = 6 \nres: " + topic698CanPartitionKSubsets.canPartitionKSubsets(new int[]{3, 3, 4, 2, 2, 2, 2, 4, 4, 6, 7, 4, 5, 1}, 6));
    }

}
