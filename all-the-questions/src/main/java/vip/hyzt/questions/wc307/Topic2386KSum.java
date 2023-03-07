package vip.hyzt.questions.wc307;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * <h3>2386. 找出数组的第 K 大和</h3>
 * <p>给你一个整数数组 nums 和一个 <strong>正</strong> 整数 k 。你可以选择数组的任一 <strong>子序列</strong> 并且对其全部元素求和。</p>
 * <p>数组的 <strong>第 k 大和</strong> 定义为：可以获得的第 k 个 <strong>最大</strong> 子序列和（子序列和允许出现重复）</p>
 * <p>返回数组的 <strong>第 k 大和</strong> 。</p>
 * <p>子序列是一个可以由其他数组删除某些或不删除元素排生而来的数组，且派生过程不改变剩余元素的顺序。</p>
 * <p><strong>注意：</strong>空子序列的和视作 0 。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：nums = [2,4,-2], k = 5
 *     输出：2
 *     解释：所有可能获得的子序列和列出如下，按递减顺序排列：
 *     -6、4、4、2、2、0、0、-2
 *     数组的第 5 大和是 2 。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *    输入：nums = [1,-2,3,4,-10,12], k = 16
 *    输出：10
 *    解释：数组的第 16 大和是 10 。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>n == nums.length</li>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 *     <li>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></li>
 *     <li>1 <= k <= min(2000, 2<sup>n</sup>)</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/find-the-k-sum-of-an-array/">https://leetcode.cn/problems/find-the-k-sum-of-an-array/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2386KSum {

    public long kSum(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.max(0, nums[i]);
            nums[i] = Math.abs(nums[i]);
        }
        if (k == 1) {
            return sum;
        }
        Arrays.sort(nums);
        PriorityQueue<long[]> queue = new PriorityQueue<>((o, p) -> Long.compare(p[0], o[0]));
        queue.offer(new long[] { sum - nums[0], 0 });
        for (int i = 2; i < k; i++) {
            long[] poll = queue.poll();
            if (poll[1] < nums.length - 1) {
                queue.offer(new long[] { poll[0] + nums[(int) poll[1]] - nums[(int) poll[1] + 1], poll[1] + 1 });
                queue.offer(new long[] { poll[0] - nums[(int) poll[1] + 1], poll[1] + 1 });
            }
        }
        return queue.peek()[0];
    }

}
