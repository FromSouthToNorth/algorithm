package vip.hyzt.questions;

/**
 * <h1>795. 区间子数组个数</h1>
 * <p>给你一个整数数组 nums 和两个整数：left 及 right 。找出 nums 中连续、非空且其中最大元素在范围 [left, right] 内的子数组，并返回满足条件的子数组的个数。</p>
 * <p>生成的测试用例保证结果符合 <strong>32-bit</strong> 整数范围。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [2,1,4,3], left = 2, right = 3
 *     输出：3
 *     解释：满足条件的三个子数组：[2], [2, 1], [3]
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [2,9,2,5,6], left = 2, right = 8
 *     输出：7
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>0 <= nums[i] <= 10<sup>9</sup></li>
 *     <li>0 <= left <= right <= 10<sup>9</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/number-of-subarrays-with-bounded-maximum/description/">https://leetcode.cn/problems/number-of-subarrays-with-bounded-maximum/description/</a>
 */
public class Topic795NumSubarrayBoundedMax {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length, res = 0, index1 = -1, index2 = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > right) {
                index1 = i;
            }
            if (nums[i] >= left) {
                index2 = i;
            }
            res += index2 - index1;
        }
        return res;
    }

}
