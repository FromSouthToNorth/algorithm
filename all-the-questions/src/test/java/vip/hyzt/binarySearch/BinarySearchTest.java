package vip.hyzt.binarySearch;

import org.junit.Test;
import vip.hyzt.binarySearch.BinarySearch;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        int[] nums = new int[] {2, 5, 6, 7, 9, 10, 45, 78};
        int target = 45;
        int result = BinarySearch.binarySearch(nums, target);
        System.out.println(result);
    }

}
