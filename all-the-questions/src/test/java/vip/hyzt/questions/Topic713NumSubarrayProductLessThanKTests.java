package vip.hyzt.questions;

import org.junit.Test;

public class Topic713NumSubarrayProductLessThanKTests {

    @Test
    public void numSubarrayProductLessThanK() {
        int k = 1;
        int[] nums = {1,1,1};
        int ans = Topic713NumSubarrayProductLessThanK.numSubarrayProductLessThanK(nums, k);
        System.out.printf("%d \n", ans);
    }

}
