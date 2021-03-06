package vip.hyzt.questions;

import org.junit.Test;

public class Topic4FindMedianSortedArraysTests {

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = {1, 3, 4, 7, 10};
        int[] nums2 = {2, 8, 9, 11};
        double result = Topic4FindMedianSortedArrays.simpleFindMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

    @Test
    public void binarySearch() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double medianSortedArrays = Topic4FindMedianSortedArrays.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    @Test
    public void binarySearchTest() {
        int target = 8;
        int[] array = new int[]{1, 3, 4, 6, 7, 8, 10, 23};
        int size = array.length - 1;
        int start = 0;
        int end = size;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int middleNum = array[middle];
            if (target == middleNum) {
                System.out.println("target index of: " + middle);
                break;
            }
            else if (target < middleNum) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
    }

}
