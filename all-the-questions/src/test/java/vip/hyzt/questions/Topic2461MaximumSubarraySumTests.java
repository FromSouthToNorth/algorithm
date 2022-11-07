package vip.hyzt.questions;

import org.junit.Test;

public class Topic2461MaximumSubarraySumTests {

    @Test
    public void maximumSubarraySum() {
        Topic2461MaximumSubarraySum topic2461MaximumSubarraySum = new Topic2461MaximumSubarraySum();
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        System.out.printf("%d\n", topic2461MaximumSubarraySum.maximumSubarraySum(nums, 3));
    }

}
