package vip.hyzt.questions;

/**
 * <h3>905.按奇偶排序数组</h3>
 * <p>给你一个整数数组 `nums`，将 `nums` 中的所有偶数元素移动到数组的前面，后跟所有的奇数元素。</p>
 * <p>返回满足条件的 <b>任一数组</b> 作为答案。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [3,1,2,4]
 *     <strong>输出：</strong>[2,4,3,1]
 *     <strong>解释：</strong>[4,2,3,1],[2,4,1,3] 和 [4,2,1,3] 也会被视为正确答案。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [0]
 *     <strong>输出：</strong>[0]
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= nums.length <= 5000</li>
 * <li>0 <= nums[i] <= 5000</li>
 * @see <a href="https://leetcode-cn.com/problems/sort-array-by-parity/">链接：https://leetcode-cn.com/problems/sort-array-by-parity/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic905SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
//        int index = 0;
//        int[] ans = new int[n];
//        for (int num : nums) {
//            if (num % 2 == 0) {
//                ans[index++] = num;
//            }
//        }
//        for (int num : nums) {
//            if (num % 2 == 1) {
//                ans[index++] = num;
//            }
//        }
//        return ans;
///////////////////////////////////////////////////
        for (int i = 0, j = n - 1; i < j; i++) {
            if (nums[i] % 2 == 1) {
                int t = nums[j];
                nums[j--] = nums[i];
                nums[i--] = t;
            }
        }
///////////////////////////////////////////////////
        return nums;
    }

}
