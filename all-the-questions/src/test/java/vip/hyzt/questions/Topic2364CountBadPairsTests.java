package vip.hyzt.questions;

import org.junit.Test;

public class Topic2364CountBadPairsTests {

    @Test
    public void countBadPairs() {
        int[] nums = {4,1,3,3};
        Topic2364CountBadPairs topic2364CountBadPairs = new Topic2364CountBadPairs();
        long l = topic2364CountBadPairs.countBadPairs(nums);
        System.out.println(l);
    }

}
