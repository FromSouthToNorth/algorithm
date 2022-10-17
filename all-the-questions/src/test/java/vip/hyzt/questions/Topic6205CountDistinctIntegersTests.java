package vip.hyzt.questions;

import org.junit.Test;

public class Topic6205CountDistinctIntegersTests {

    @Test
    public void countDistinctIntegers() {
        Topic6205CountDistinctIntegers topic6205CountDistinctIntegers = new Topic6205CountDistinctIntegers();
        int[][] nums = {{1, 13, 10, 12, 31}, {2, 2, 2}, {1, 10, 11, 21}};
        for (int[] num : nums) {
            System.out.printf("res: %d\n", topic6205CountDistinctIntegers.countDistinctIntegers(num));
        }
    }

}
