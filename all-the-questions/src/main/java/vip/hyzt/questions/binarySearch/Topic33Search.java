package vip.hyzt.questions.binarySearch;

public class Topic33Search {

    public static int search(int[] nums, int target) {
        int n = nums.length, left = 0, right = n - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[0] <= nums[middle]) {
                if (nums[0] <= target && target < nums[middle]) {
                    right = middle - 1;
                }
                else {
                    left = middle + 1;
                }
            }
            else {
                if (nums[middle] < target && target <= nums[n - 1]) {
                    left = middle + 1;
                }
                else {
                    right = middle - 1;
                }
            }
        }

        return -1;
    }

}
