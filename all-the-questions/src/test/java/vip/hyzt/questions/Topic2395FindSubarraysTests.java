package vip.hyzt.questions;

import org.junit.Test;

public class Topic2395FindSubarraysTests {

    @Test
    public void findSubarrays() {
        int[][] nums = {{4, 2, 4}, {1, 2, 3, 4, 5}, {0, 0, 0}, {3, 6, 3}, {3, 7, 10, 5, 5}, {9, 1, 2, 12, 6, 6}};
        Topic2395FindSubarrays topic2395FindSubarrays = new Topic2395FindSubarrays();
        for (int[] num : nums) {
            System.out.printf("res: %b\n", topic2395FindSubarrays.findSubarrays(num));
        }
    }
}
