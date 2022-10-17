package vip.hyzt.questions;

import org.junit.Test;

public class Topic2442CountDistinctIntegersTests {

    @Test
    public void countDistinctIntegers() {
        Topic2442CountDistinctIntegers topic2442CountDistinctIntegers = new Topic2442CountDistinctIntegers();
        int[][] nums = {{1, 13, 10, 12, 31}, {2, 2, 2}, {1, 10, 11, 21}};
        for (int[] num : nums) {
            System.out.printf("res: %d\n", topic2442CountDistinctIntegers.countDistinctIntegers(num));
        }
    }

}
