package vip.hyzt.questions.wcb86;

import java.util.HashSet;
import java.util.Set;

/**
 * <h2>2395. 和相等的子数组</h2>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组 nums ，判断是否存在 <strong>两个</strong> 长度为 2 的子数组且它们的 和 相等。注意，这两个子数组起始位置的下标必须 <strong>不相同</strong> 。</p>
 * <p>如果这样的子数组存在，请返回 true，否则返回 false 。</p>
 * <p><strong>子数组</strong> 是一个数组中一段连续非空的元素组成的序列。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [4,2,4]
 *     输出：true
 *     解释：元素为 [4,2] 和 [2,4] 的子数组有相同的和 6 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [1,2,3,4,5]
 *     输出：false
 *     解释：没有长度为 2 的两个子数组和相等。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：nums = [0,0,0]
 *     输出：true
 *     解释：子数组 [nums[0],nums[1]] 和 [nums[1],nums[2]] 的和相等，都为 0 。
 *     注意即使子数组的元素相同，这两个子数组也视为不相同的子数组，因为它们在原数组中的起始位置不同。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>2 <= nums.length <= 1000</li>
 *     <li>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/find-subarrays-with-equal-sum">https://leetcode.cn/problems/find-subarrays-with-equal-sum</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2395FindSubarrays {

    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int num = nums[i] + nums[i + 1];
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

}
