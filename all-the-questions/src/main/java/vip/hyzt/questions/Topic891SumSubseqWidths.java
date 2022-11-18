package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>891. 子序列宽度之和</h1>
 * <p>一个序列的 <strong>宽度</strong> 定义为该序列中最大元素和最小元素的差值。</p>
 * <p>给你一个整数数组 nums ，返回 nums 的所有非空 <strong>子序列</strong> 的 <strong>宽度之和</strong> 。由于答案可能非常大，请返回对 109 + 7 <strong>取余</strong> 后的结果。</p>
 * <p><strong>子序列</strong> 定义为从一个数组里删除一些（或者不删除）元素，但不改变剩下元素的顺序得到的数组。例如，[3,6,2,7] 就是数组 [0,3,1,6,2,2,7] 的一个子序列。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [2,1,3]
 *     输出：6
 *     解释：子序列为 [1], [2], [3], [2,1], [2,3], [1,3], [2,1,3] 。
 *     相应的宽度是 0, 0, 0, 1, 1, 2, 2 。
 *     宽度之和是 6 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [2]
 *     输出：0
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>5</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/sum-of-subsequence-widths/description/">https://leetcode.cn/problems/sum-of-subsequence-widths/description/</a>
 */
public class Topic891SumSubseqWidths {

    public int sumSubseqWidths(int[] nums) {
        Arrays.sort(nums);
        final int mod = 1000000007;
        int n = nums.length;
        long res = 0L, power = 1L;
        for (int i = 0; i < n; i++) {
           res = (res + power * (nums[i] - nums[n - 1 - i])) % mod;
           power = (power << 1) % mod;
        }
        return (int) res;
    }

}
