package vip.hyzt.questions;

/**
 * <h3>922. 按奇偶排序数组 II</h3>
 * @see <a href="https://leetcode.cn/problems/sort-array-by-parity-ii/">https://leetcode.cn/problems/sort-array-by-parity-ii/</a>
 * @author hy
 */
public class Topic922SortArrayByParityII {

    public static int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0, j = 0, k = 1; i < nums.length; i++) {
            if ((nums[i] & 1) == 0) {
                nums[j] = nums[i];
                j += 2;
            }
            else {
                nums[k] = nums[i];
                k += 2;
            }
        }
        return res;
    }

}
