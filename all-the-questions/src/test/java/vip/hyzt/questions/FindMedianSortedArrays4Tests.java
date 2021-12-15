package vip.hyzt.questions;

import org.junit.Test;

public class FindMedianSortedArrays4Tests {

    @Test
    public void binarySearch() {
        int[] nums1 = {1, 3, 4, 7, 10};
        int[] nums2 = {2, 8, 9};
        double v = FindMedianSortedArrays4.binarySearch(nums1, nums2);
        System.out.println(v);
    }

}
