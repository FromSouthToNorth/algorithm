package vip.hyzt.questions;

import org.junit.Test;

public class Topic6189LongestSubarrayTests {

    @Test
    public void longestSubarray() {
        Topic6189LongestSubarray topic6189LongestSubarray = new Topic6189LongestSubarray();
        int[][] nums = {{1, 2, 3, 4}, {1, 2, 3, 3, 2, 2}};
        for (int[] num : nums) {
            System.out.printf("res: %d\n", topic6189LongestSubarray.longestSubarray(num));
        }
    }

}
