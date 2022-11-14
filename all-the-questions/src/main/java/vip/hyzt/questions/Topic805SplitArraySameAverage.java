package vip.hyzt.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <h1>805. 数组的均值分割</h1>
 * <p>给定你一个整数数组 nums</p>
 * <p>我们要将 nums 数组中的每个元素移动到 A 数组 或者 B 数组中，使得 A 数组和 B 数组不为空，并且 average(A) == average(B) 。</p>
 * <p>如果可以完成则返回 true， 否则返回 false。</p>
 * <p><strong>注意：</strong>对于数组 arr ,  average(arr) 是 arr 的所有元素除以 arr 长度的和。</p>
 * <h2>示例 1:</h2>
 * <pre>
 *     输入: nums = [1,2,3,4,5,6,7,8]
 *     输出: true
 *     解释: 我们可以将数组分割为 [1,4,5,8] 和 [2,3,6,7], 他们的平均值都是4.5。
 * </pre>
 * <h2>示例 2:</h2>
 * <pre>
 *     输入: nums = [3,1]
 *     输出: false
 * </pre>
 * <h2>提示:</h2>
 * <ul>
 *     <li>1 <= nums.length <= 30</li>
 *     <li>0 <= nums[i] <= 10<sup>4</sup></li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/split-array-with-same-average/">https://leetcode.cn/problems/split-array-with-same-average/</a>
 */
public class Topic805SplitArraySameAverage {

    public boolean splitArraySameAverage(int[] nums) {
        int n = nums.length, m = n / 2, sum = 0;
        for (int x : nums) {
            sum += x;
        }
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int s = 0; s < (1 << m); s++) {
            int tot = 0, cnt = 0;
            for (int i = 0; i < m; i++) {
                if (((s >> i) & 1) == 1) {
                    tot += nums[i];
                    cnt++;
                }
            }
            Set<Integer> set = map.getOrDefault(tot, new HashSet<>());
            set.add(cnt);
            map.put(tot, set);
        }
        for (int s = 0; s < (1 << (n - m)); s++) {
            int tot = 0, cnt = 0;
            for (int i = 0; i < (n - m); i++) {
                if (((s >> i) & 1) == 1) {
                    tot += nums[i + m];
                    cnt++;
                }
            }
            for (int k = Math.max(1, cnt); k < n; k++) {
                if (k * sum % n != 0) {
                    continue;
                }
                int t = k * sum / n;
                if (!map.containsKey(t - tot)) {
                    continue;
                }
                if (!map.get(t - tot).contains(k - cnt)) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }


}
