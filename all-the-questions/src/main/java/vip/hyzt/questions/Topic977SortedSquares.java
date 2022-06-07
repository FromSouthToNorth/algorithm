package vip.hyzt.questions;

/**
 * <h3>977. 有序数组的平方</h3>
 * <p>给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [-4,-1,0,3,10]
 *     输出：[0,1,9,16,100]
 *     解释：平方后，数组变为 [16,1,0,9,100]
 *     排序后，数组变为 [0,1,9,16,100]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [-7,-3,2,3,11]
 *     输出：[4,9,9,49,121]
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= nums.length <= 10<sup>4</sup></li>
 * <li>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></li>
 * <li>nums 已按 非递减顺序 排序</li>
 * @see <a href="https://leetcode.cn/problems/squares-of-a-sorted-array/">https://leetcode.cn/problems/squares-of-a-sorted-array/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic977SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; pos--) {
            int a = nums[i] * nums[i], b = nums[j] * nums[j];
            if (a > b) {
                ans[pos] = a;
                i++;
            }
            else {
                ans[pos] = b;
                j--;
            }
        }
        return ans;
    }

}
