package vip.hyzt.questions.wc312;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>6190. 找到所有好下标</h2>
 * <p>给你一个大小为 n 下标从 <strong>0</strong> 开始的整数数组 nums 和一个正整数 k 。</p>
 * <p>对于 k <= i < n - k 之间的一个下标 i ，如果它满足以下条件，我们就称它为一个 <strong>好</strong> 下标：</p>
 * <ul>
 *     <li>下标 i <strong>之前</strong> 的 k 个元素是 <strong>非递增的</strong> 。</li>
 *     <li>下标 i <strong>之后</strong> 的 k 个元素是 <strong>非递减的</strong> 。</li>
 * </ul>
 * <p>按 <strong>升序</strong> 返回所有好下标。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [2,1,1,1,3,4,1], k = 2
 *     输出：[2,3]
 *     解释：数组中有两个好下标：
 *     - 下标 2 。子数组 [2,1] 是非递增的，子数组 [1,3] 是非递减的。
 *     - 下标 3 。子数组 [1,1] 是非递增的，子数组 [3,4] 是非递减的。
 *     注意，下标 4 不是好下标，因为 [4,1] 不是非递减的。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [2,1,1,2], k = 2
 *     输出：[]
 *     解释：数组中没有好下标。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>n == nums.length</li>
 *     <li>3 <= n <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>6</sup></li>
 *     <li>1 <= k <= n / 2</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/find-all-good-indices/">https://leetcode.cn/problems/find-all-good-indices/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2420GoodIndices {

    public List<Integer> goodIndices(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n], right = new int[n];
        for (int i = 2; i < n; i++) {
            right[i] = nums[i - 1] > nums[i - 2] ? 0 : right[i - 1] + 1;
        }
        for (int i = n - 3; i >= 0; i--) {
            left[i] = nums[i + 1] > nums[i + 2] ? 0 : left[i + 1] + 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n - 1; ++i) {
            int s = k - 1;
            if (left[i] >= s && right[i] >= s) {
                list.add(i);
            }
        }
        return list;
    }

}
