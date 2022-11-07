package vip.hyzt.questions;

/**
 * <h3>713.乘积小于 k 的子数组</h3>
 * <p>给你一个整数数组 `nums` 和一个整数 `k`，请返回子数组内所以元素的乘积严格小于 `k` 的连续子数组的数目。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [10,5,2,6], k = 100
 *     <strong>输出：</strong>8
 *     <strong>解释：</strong>8 个乘积小于 100 的子数组分别为：[10],[5],[2],[6],[10,5],[5,2],[2,6],[5,2,6]。
 *     需要注意的是 [10,5,2] 并不是乘积小于 100 的子数组。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [1,2,3], k = 0
 *     <strong>输出：</strong>0
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= nums.length <= 3 * 10<sup>4</sup></li>
 * <li>1 <= nums[i] <= 1000</li>
 * <li>0 <= k <= 10<sup>6</sup></li>
 * @see <a href="https://leetcode-cn.com/problems/subarray-product-less-than-k/">链接: https://leetcode-cn.com/problems/subarray-product-less-than-k/</a>
 * @author  力扣（LeetCode）
 * @author hy
 */
public class Topic713NumSubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, ans = 0, cur = 1;
        if (k <= 1) {
            return 0;
        }
        for (int i = 0, j = 0; i < n; i++) {
             cur *= nums[i];
             while (cur >= k) {
                 cur /= nums[j++];
             }
             ans += i - j + 1;
        }
        return ans;
    }

}
