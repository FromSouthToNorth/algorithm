package vip.hyzt.questions;

/**
 * <p>二分查找</p>
 *
 * @author hy
 */
public abstract class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int middleNum = nums[middle];
            if (target < middleNum) {
                end = middle - 1;
            }
            else if (target > middleNum) {
                start = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

}
