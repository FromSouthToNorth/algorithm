package vip.hyzt.questions;

import java.util.HashMap;

/**
 * <h1>2537. 统计好子数组的数目</h1>
 * <p></p>
 * <p>给你一个整数数组 nums 和一个整数 k ，请你返回 nums 中 好 子数组的数目。</p>
 * <p>一个子数组 arr 如果有 <strong>至少</strong> k 对下标 (i, j) 满足 i < j 且 arr[i] == arr[j] ，那么称它是一个 好 子数组。</p>
 * <p><strong>子数组</strong> 是原数组中一段连续 非空 的元素序列。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,1,1,1,1], k = 10
 *     输出：1
 *     解释：唯一的好子数组是这个数组本身。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [3,1,4,3,2,2,4], k = 2
 *     输出：4
 *     解释：总共有 4 个不同的好子数组：
 *     - [3,1,4,3,2,2] 有 2 对。
 *     - [3,1,4,3,2,2,4] 有 3 对。
 *     - [1,4,3,2,2,4] 有 2 对。
 *     - [4,3,2,2,4] 有 2 对。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i], k <= 10<sup>9</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-good-subarrays/">https://leetcode.cn/problems/count-the-number-of-good-subarrays/</a>
 */
public class Topic2537CountGood {

    public long countGood(int[] nums, int k) {
        long count = 0, curr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < nums.length; i++, count += j) {
            curr += map.getOrDefault(nums[i], 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            for (; curr >= k; j++) {
                curr -= map.put(nums[j], map.get(nums[j]) - 1) - 1;
            }
        }
        return count;
    }

}
