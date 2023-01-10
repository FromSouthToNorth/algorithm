package vip.hyzt.questions;

import java.util.PriorityQueue;

/**
 * <h1>2530. 执行 K 次操作后的最大分数</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组 nums 和一个整数 k 。你的 <strong>起始分数</strong> 为 0 </p>
 * <p>在一步 操作 中：</p>
 * <p>选出一个满足 0 <= i < nums.length 的下标 i ，</p>
 * <p>将你的 <strong>分数</strong> 增加 nums[i] ，并且</p>
 * <p>将 nums[i] 替换为 ceil(nums[i] / 3) 。</p>
 * <p>返回在 <strong>恰好</strong> 执行 k 次操作后，你可能获得的最大分数。</p>
 * <p>向上取整函数 ceil(val) 的结果是大于或等于 val 的最小整数。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [10,10,10,10,10], k = 5
 *     输出：50
 *     解释：对数组中每个元素执行一次操作。最后分数是 10 + 10 + 10 + 10 + 10 = 50 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,10,3,3,3], k = 3
 *     输出：17
 *     解释：可以执行下述操作：
 *     第 1 步操作：选中 i = 1 ，nums 变为 [1,<strong><em>4</em></strong>,3,3,3] 。分数增加 10 。
 *     第 2 步操作：选中 i = 1 ，nums 变为 [1,<strong><em>2</em></strong>,3,3,3] 。分数增加 4 。
 *     第 3 步操作：选中 i = 2 ，nums 变为 [1,1,<strong><em>1</em></strong>,3,3] 。分数增加 3 。
 *     最后分数是 10 + 4 + 3 = 17 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length, k <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>9</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximal-score-after-applying-k-operations/">https://leetcode.cn/problems/maximal-score-after-applying-k-operations/</a>
 */
public class Topic2530MaxKelements {

    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(-num);
        }
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum -= queue.peek();
            // 负数向上取整 ceil(num / 3) = (num - 2) / 3
            queue.offer((queue.poll() - 2) / 3);
        }
        return sum;
    }
}
