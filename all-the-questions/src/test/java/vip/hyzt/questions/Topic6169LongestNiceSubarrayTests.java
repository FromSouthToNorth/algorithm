package vip.hyzt.questions;

import org.junit.Test;

public class Topic6169LongestNiceSubarrayTests {

    @Test
    public void longestNiceSubarray() {
        Topic6169LongestNiceSubarray topic6169LongestNiceSubarray = new Topic6169LongestNiceSubarray();
        int[] nums1 = {1, 3, 8, 48, 10};
        int[] nums2 = {3, 1, 5, 11, 13};
        int[] nums3 = {744437702, 379056602, 145555074, 392756761, 560864007, 934981918, 113312475, 1090, 16384, 33, 217313281, 117883195, 978927664};
        System.out.printf("res %d\n", topic6169LongestNiceSubarray.longestNiceSubarray(nums1));
        System.out.printf("res %d\n", topic6169LongestNiceSubarray.longestNiceSubarray(nums2));
        System.out.printf("res %d\n", topic6169LongestNiceSubarray.longestNiceSubarray(nums3));
    }

}
