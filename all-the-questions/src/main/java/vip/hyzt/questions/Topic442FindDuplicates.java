package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>442.数组中重复的数据</h3>
 * <p>给你一个长度为 `n` 的整数数组 `nums`，其中 `nums` 的所有整数都在范围 `[1,n]` 内，且每一个整数会出现 <strong>一次</strong> 或 <strong>两次</strong>。请你找出所有出现 两次 的整数，并以数组形式返回。</p>
 * <p>你必须设计实现一个时间复杂度为 `O(n)` 且仅使用常量额外空间的算法解决此问题。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [4,3,2,7,8,2,3,1]
 *     <strong>输出：</strong>[2,3]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [1,1,2]
 *     <strong>输出：</strong>[1]
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     <strong>输入：</strong>nums = [1]
 *     <strong>输出：</strong>[]
 * </pre>
 * <h3>提示：</h3>
 * <li>n == nums.length</li>
 * <li>1 <= n <= 10<sup>5</sup></=></li>
 * <li>1 <= nums[i] <= n</li>
 * <li>nums 中的每个元素出现 一次 或两次</li>
 * @author LeetCode
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/">链接 https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/</a>
 */
public class Topic442FindDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            if (t < 0 || t - 1 == i) {
                continue;
            }
            if (nums[t - 1] == t) {
                ans.add(t);
                nums[i] *= -1;
            }
            else {
                int c = nums[t - 1];
                nums[t - 1] = t;
                nums[i--] = c;
            }
        }
        return ans;
    }

}
