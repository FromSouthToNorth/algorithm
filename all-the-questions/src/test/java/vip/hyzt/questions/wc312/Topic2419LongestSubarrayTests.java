package vip.hyzt.questions.wc312;

import org.junit.Test;
import vip.hyzt.questions.wc312.Topic2419LongestSubarray;

public class Topic2419LongestSubarrayTests {

    @Test
    public void longestSubarray() {
        Topic2419LongestSubarray topic2419LongestSubarray = new Topic2419LongestSubarray();
        int[][] nums = {{1, 2, 3, 4}, {1, 2, 3, 3, 2, 2}};
        for (int[] num : nums) {
            System.out.printf("res: %d\n", topic2419LongestSubarray.longestSubarray(num));
        }
    }

}
