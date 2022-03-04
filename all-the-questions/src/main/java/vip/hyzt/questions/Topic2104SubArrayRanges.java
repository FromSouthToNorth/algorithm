package vip.hyzt.questions;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

/**
 * <h3>2104. 子数组范围和</h3>
 * <p>给你一个整数数组 nums 。nums 中，子数组的 范围 是子数组中最大元素和最小元素的差值。</p>
 * <p>返回 nums 中 <b>所有</b> 子数组范围的 <b>和</b> 。</p>
 * <p>子数组是数组中一个连续 <b>非空</b> 的元素序列。</p>
 * <b>示例 1：</b>
 * <pre>
 *     <strong>输入：</strong>nums = [1,2,3]
 *     <strong>输出：</strong>4
 *     <strong>解释：</strong>nums 的子数组如下所示：
 *     [1]，范围 = 最大 - 最小 = 1 - 1 = 0
 *     [2]，范围 = 2 - 2 = 0
 *     [3]，范围 = 3 - 3 = 0
 *     [1,2]，范围 = 2- 1 = 1
 *     [2,3]，范围 = 3 - 2 = 1
 *     [1,2,3]，范围 = 3 - 1 = 2
 *     所以范围的和是 0 + 0 + 0 + 1 + 1 + 2 = 4
 * </pre>
 * <b>示例 2：</b>
 * <pre>
 *     <strong>输入：</strong> nums = [1,3,3]
 *     <strong>输出：</strong>4
 *     <strong>解释：</strong>nums 的 6 个子数组如下所示：
 *     [1]，范围 = 最大 - 最小 = 1 - 1 = 0
 *     [3]，范围 = 最大 - 最小 = 3 - 3 = 0
 *     [3]，范围 = 最大 - 最小 = 3 - 3 = 0
 *     [1,3]，范围 = 最大 - 最小 = 3 - 1 = 2
 *     [3,3]，范围 = 最大 - 最小 = 3 - 3 = 0
 *     [1,3,3]，范围 = 最大 - 最小 = 3 - 1 = 2
 *     所以范围的和是 0 + 0 + 0 + 2 + 0 + 2 = 4
 * </pre>
 * <b>示例 3：</b>
 * <pre>
 *     <strong>输入：</strong>nums = [4,-2,-3,4,1]
 *     <strong>输出：</strong>59
 *     <strong>解释：</strong>nums 中所有的子数范围的和是 59
 * </pre>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/sum-of-subarray-ranges"><tt>leetcod</tt> 2104.子数组范围和</a>
 */
public abstract class Topic2104SubArrayRanges {

    /**
     * <h3>区间 DP (预处理)</h3>
     */
    public static long subArrayRanges(int[] nums) {
        int n = nums.length;
        int[][][] f = new int[n][n][2];
        for (int i = 0; i < n; i++) f[i][i][0] = f[i][i][1] = nums[i];
        for (int len = 2; len <= n; len++) {
            for (int l = 0; l + len - 1 < n; l++) {
                int r = l + len - 1;
                f[l][r][0] = Math.min(nums[r], f[l][r - 1][0]);
                f[l][r][1] = Math.max(nums[r], f[l][r - 1][1]);
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans += f[i][j][1] - f[i][j][0];
            }
        }
        return ans;
    }

    /**
     * <h3>枚举</h3>
     */
    public static long enumSubArrayRanges(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int min = nums[i], max = nums[i];
            for (int j = i + 1; j < n; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                ans += max - min;
            }
        }
        return ans;
    }


    /**
     * 单调栈
     */
    public static long dequeSubArrayRanges(int[] nums) {
        n = nums.length;
        long[] min = getCnt(nums, true), max = getCnt(nums, false);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (max[i] - min[i]) * nums[i];
        }
        return ans;
    }

    static int n;

    public static long[] getCnt(int[] nums, boolean isMin) {
        int[] a = new int[n], b = new int[n];
        ArrayDeque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!d.isEmpty() && (isMin ? nums[d.peekLast()] > nums[i] : nums[d.peekLast()] < nums[i])) {
                d.pollLast();
            }
            a[i] = d.isEmpty() ? -1 : d.pollLast();
            d.addLast(i);
        }
        d.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!d.isEmpty() && (isMin ? nums[d.peekLast()] > nums[i] : nums[d.peekLast()] < nums[i])) {
                d.pollLast();
            }
            b[i] = d.isEmpty() ? n : d.peekLast();
            d.addLast(i);
        }
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            ans[i] = (long) (i - a[i]) * (b[i] - i);
        }
        return ans;
    }

}
