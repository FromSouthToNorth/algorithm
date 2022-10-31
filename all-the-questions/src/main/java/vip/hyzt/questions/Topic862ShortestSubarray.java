package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <h1>862. 和至少为 K 的最短子数组</h1>
 * <p>给你一个整数数组 nums 和一个整数 k ，找出 nums 中和至少为 k 的 <strong>最短非空子数组</strong> ，并返回该子数组的长度。如果不存在这样的 <strong>子数组</strong> ，返回 -1 。</p>
 * <p><strong>子数组</strong> 是数组中 <strong>连续</strong> 的一部分。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1], k = 1
 *     输出：1
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,2], k = 4
 *     输出：-1
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：nums = [2,-1,2], k = 3
 *     输出：3
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup></li>
 *     <li>1 <= k <= 10<sup>9</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/shortest-subarray-with-sum-at-least-k/description/">https://leetcode.cn/problems/shortest-subarray-with-sum-at-least-k/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic862ShortestSubarray {

    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] preSumArr = new long[n + 1];
        for (int i = 0; i < n; i++) {
            preSumArr[i + 1] = preSumArr[i] + nums[i];
        }
        int res = n + 1;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            long curSum = preSumArr[i];
            while (!deque.isEmpty() && curSum - preSumArr[deque.peekFirst()] >= k) {
                res = Math.min(res, i - deque.pollFirst());
            }
            while (!deque.isEmpty() && preSumArr[deque.peekLast()] >= curSum) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        return res < n + 1 ? res : -1;
    }

}
