package vip.hyzt.questions;

import org.junit.Test;

public class Topic2401LongestNiceSubarrayTests {

    @Test
    public void longestNiceSubarray() {
        Topic2401LongestNiceSubarray topic2401LongestNiceSubarray = new Topic2401LongestNiceSubarray();
        int[] nums1 = {1, 3, 8, 48, 10};
        int[] nums2 = {3, 1, 5, 11, 13};
        int[] nums3 = {744437702, 379056602, 145555074, 392756761, 560864007, 934981918, 113312475, 1090, 16384, 33, 217313281, 117883195, 978927664};
        System.out.printf("res %d\n", topic2401LongestNiceSubarray.longestNiceSubarray(nums1));
        System.out.printf("res %d\n", topic2401LongestNiceSubarray.longestNiceSubarray(nums2));
        System.out.printf("res %d\n", topic2401LongestNiceSubarray.longestNiceSubarray(nums3));
    }

}
