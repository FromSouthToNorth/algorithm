package vip.hyzt.theSorting;

/**
 * 插入排序
 * @author hy
 */
public class InsertionSort {


    public static int[] sortArray(int[] nums) {
        int n = nums.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && nums[j] < nums[j - 1]; j--) {
                swap(nums, j,j - 1);
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
