package vip.hyzt.questions;

import org.junit.Test;

public class Topic2444CountSubarraysTests {

    @Test
    public void countSubarrays() {
        Topic2444CountSubarrays topic2444CountSubarrays = new Topic2444CountSubarrays();
        int[] nums = {1,3,5,2,7,5};
        int mink = 1, maxK = 5;
        System.out.printf("res: %d\n", topic2444CountSubarrays.countSubarrays(nums, mink, maxK));
    }

}
