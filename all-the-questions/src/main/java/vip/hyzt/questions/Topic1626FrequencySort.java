package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * <h2>1636. 按照频率将数组升序排序</h2>
 * <p>给你一个整数数组 nums ，请你将数组按照每个值的频率 <strong>升序</strong> 排序。如果有多个值的频率相同，请你按照数值本身将它们 <strong>降序</strong> 排序。 </p>
 * <p>请你返回排序后的数组。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [1,1,2,2,2,3]
 *     输出：[3,1,1,2,2,2]
 *     解释：'3' 频率为 1，'1' 频率为 2，'2' 频率为 3 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [2,3,1,3,2]
 *     输出：[1,3,3,2,2]
 *     解释：'2' 和 '3' 频率都为 2 ，所以它们之间按照数值本身降序排序。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：nums = [-1,1,-6,4,5,-6,1,4,1]
 *     输出：[5,-1,4,4,-6,-6,1,1,1]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= nums.length <= 100</li>
 *     <li>-100 <= nums[i] <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/sort-array-by-increasing-frequency/">https://leetcode.cn/problems/sort-array-by-increasing-frequency/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1626FrequencySort {

    public int[] frequencySort(int[] nums) {
        int n =nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<int[]> ints = new ArrayList<>();
        for (Integer key : map.keySet()) {
            ints.add(new int[] { key, map.get(key) });
        }
        ints.sort((a, b) -> a[1] != b[1] ? a[1] - b[1] : b[0] - a[0]);
        int[] ans = new int[n];
        int index= 0;
        for (int[] anInt : ints) {
            int a = anInt[0], b = anInt[1];
            while (b-- > 0) {
                ans[index++] = a;
            }
        }
        return ans;
    }

}
