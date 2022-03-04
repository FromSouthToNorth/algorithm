package vip.hyzt.questions;

import org.junit.Test;

public class Topic2104SubArrayRangesTests {

    @Test
    public void subArrayRanges() {
        int[] nums = {1, 2, 3};
        long ans = Topic2104SubArrayRanges.subArrayRanges(nums);
        System.out.println(ans);
    }

    @Test
    public void enumSubArrayRanges() {
        int[] nums = {1, 3, 3};
        long ans = Topic2104SubArrayRanges.enumSubArrayRanges(nums);
        System.out.println(ans);
    }

    @Test
    public void dequeSubArrayRanges() {
        int[] nums = {4,-2,-3,4,1};
        long ans = Topic2104SubArrayRanges.dequeSubArrayRanges(nums);
        System.out.println(ans);
    }

}
