package vip.hyzt.questions;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        int[] nums = new int[] {2, 5, 6, 7, 9, 10, 45, 78};
        int target = 45;
        int result = BinarySearch.binarySearch(nums, target);
        System.out.println(result);
    }

}
