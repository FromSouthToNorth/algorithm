package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>219. 存在重复元素 II</h3>
 * <p>
 *     给你一个整数数组nums 和一个整数k ，判断数组中是否存在两个 不同的索引i和j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。
 *     如果存在，返回 true ；否则，返回 false 。
 * </p>
 * <p>示例: 1</p>
 * <pre>
 *     <strong>输入：</strong>nums = [1,2,3,1], k = 3
 *     <strong>输出：</strong>true
 * </pre>
 * <p>示例: 2</p>
 * <pre>
 *     <strong>输入：</strong>nums = [1,0,1,1], k = 1
 *     <strong>输出：</strong>true
 * </pre>
 * <p>示例: 3</p>
 * <pre>
 *     <strong>输入：</strong>nums = [1,2,3,1,2,3], k = 2
 *     <strong>输出：</strong>false
 * </pre>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/contains-duplicate-ii">链接：https://leetcode-cn.com/problems/contains-duplicate-ii</a>
 */
public abstract class Topic219ContainsNearbyDuplicate {

    public static boolean hash(int[] nums, int k) {
        int length = nums.length;
        Map<Integer, Integer> hashMap = new HashMap<>(length - 1);
        hashMap.put(nums[0], 0);
        for (int i = 1; i < length; i++) {
            if (hashMap.containsKey(nums[i]) && (i - hashMap.get(nums[i]) <= k)) {
                return true;
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }

}
