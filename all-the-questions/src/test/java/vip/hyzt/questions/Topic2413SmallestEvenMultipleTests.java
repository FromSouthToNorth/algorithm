package vip.hyzt.questions;

import org.junit.Test;

public class Topic2413SmallestEvenMultipleTests {

    @Test
    public void smallestEvenMultiple() {
        Topic2413SmallestEvenMultiple topic2413SmallestEvenMultiple = new Topic2413SmallestEvenMultiple();
        int[] nums = { 1, 6, 9, 8, 10, 11, 12, 13, 150 };
        for (int num : nums) {
            System.out.printf("%d 最小偶倍数: %d \n", num, topic2413SmallestEvenMultiple.smallestEvenMultiple(num));
        }
    }

}
