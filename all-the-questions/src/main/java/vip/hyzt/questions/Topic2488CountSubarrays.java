package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>2488. 统计中位数为 K 的子数组</h1>
 * <p>给你一个长度为 n 的数组 nums ，该数组由从 1 到 n 的 <strong>不同</strong> 整数组成。另给你一个正整数 k 。</p>
 * <p>统计并返回 num 中的 <strong>中位数</strong> 等于 k 的非空子数组的数目。</p>
 * <p><strong>注意：</strong></p>
 * <ul>
 *     <li>
 *         数组的中位数是按 <strong>递增</strong> 顺序排列后位于 <strong>中间</strong> 的那个元素，如果数组长度为偶数，则中位数是位于中间靠 左 的那个元素。
 *         <ul>
 *             <li>例如，[2,3,1,4] 的中位数是 2 ，[8,4,3,5,1] 的中位数是 4 。</li>
 *         </ul>
 *     </li>
 *     <li>子数组是数组中的一个连续部分。</li>
 * </ul>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [3,2,1,4,5], k = 4
 *     输出：3
 *     解释：中位数等于 4 的子数组有：[4]、[4,5] 和 [1,4,5] 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [2,3,1], k = 3
 *     输出：1
 *     解释：[3] 是唯一一个中位数等于 3 的子数组。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>n == nums.length</li>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i], k <= n</li>
 *     <li>nums 中的整数互不相同</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-subarrays-with-median-k/">https://leetcode.cn/problems/count-subarrays-with-median-k/</a>
 */
public class Topic2488CountSubarrays {

    public int countSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(Map.of(0, 1));
        int i = 0, curr = 0, count;
        for (; nums[i] != k; i++) {
            map.put(curr += nums[i] < k ? -1 : 1, map.getOrDefault(curr, 0) + 1);
        }
        for (count = map.getOrDefault(curr, 0) + map.getOrDefault(curr - 1, 0); ++i < nums.length;) {
            count += map.getOrDefault(curr += nums[i] < k ? -1 : 1, 0) + map.getOrDefault(curr - 1, 0);
        }
        return count;
    }

}
