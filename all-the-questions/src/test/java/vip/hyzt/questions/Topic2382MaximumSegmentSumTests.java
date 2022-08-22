package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2382MaximumSegmentSumTests {

    @Test
    public void maximumSegmentSum() {
        Topic2382MaximumSegmentSum topic2382MaximumSegmentSum = new Topic2382MaximumSegmentSum();
        int[] nums = {3,2,11,1}, removeQueries = {3,2,1,0};
        long[] longs = topic2382MaximumSegmentSum.maximumSegmentSum(nums, removeQueries);
        System.out.println(Arrays.toString(longs));
    }

}
