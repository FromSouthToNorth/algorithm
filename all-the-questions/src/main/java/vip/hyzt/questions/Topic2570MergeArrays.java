package vip.hyzt.questions;

import java.util.Map;
import java.util.TreeMap;

/**
 * <h1>2570. 合并两个二维数组 - 求和法</h1>
 * <p></p>
 * <p>给你两个 <strong>二维</strong> 整数数组 nums1 和 nums2.</p>
 * <ul>
 *     <li>nums1[i] = [id<sub>i</sub>, val<sub>i</sub>] 表示编号为 id<sub>i</sub> 的数字对应的值等于 val<sub>i</sub> 。</li>
 *     <li>nums2[i] = [id<sub>i</sub>, val<sub>i</sub>] 表示编号为 id<sub>i</sub> 的数字对应的值等于 val<sub>i</sub> 。</li>
 * </ul>
 * <p>每个数组都包含 <strong>互不相同</strong> 的 id ，并按 id 以 <strong>递增</strong> 顺序排列。</p>
 * <ul>
 *     <li>只有在两个数组中至少出现过一次的 id 才能包含在结果数组内。</li>
 *     <li>每个 id 在结果数组中 <strong>只能出现一次</strong> ，并且其对应的值等于两个数组中该 id 所对应的值求和。如果某个数组中不存在该 id ，则认为其对应的值等于 0 。</li>
 * </ul>
 * <p>返回结果数组。返回的数组需要按 id 以递增顺序排列。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
 *     输出：[[1,6],[2,3],[3,2],[4,6]]
 *     解释：结果数组中包含以下元素：
 *     - id = 1 ，对应的值等于 2 + 4 = 6 。
 *     - id = 2 ，对应的值等于 3 。
 *     - id = 3 ，对应的值等于 2 。
 *     - id = 4 ，对应的值等于5 + 1 = 6 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
 *     输出：[[1,3],[2,4],[3,6],[4,3],[5,5]]
 *     解释：不存在共同 id ，在结果数组中只需要包含每个 id 和其对应的值。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums1.length, nums2.length <= 200</li>
 *     <li>nums1[i].length == nums2[j].length == 2</li>
 *     <li>1 <= id<sub>i</sub>, val<sub>i</sub> <= 1000</li>
 *     <li>数组中的 id 互不相同</li>
 *     <li>数据均按 id 以严格递增顺序排列</li>
 * </ul>
 * <pre>
 * var mergeArrays = function(nums1, nums2) {
 *   let map = new Map(nums1);
 *   for (let [k, v] of nums2) {
 *     let o = map.get(k) || 0;
 *     map.set(k, o + v);
 *   }
 *   return [...map.entries()].sort((a, b) => a[0]  - b[0]);
 * };
 * </pre>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/merge-two-2d-arrays-by-summing-values/description/">https://leetcode.cn/problems/merge-two-2d-arrays-by-summing-values/description/</a>
 */
public class Topic2570MergeArrays {

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] nums : nums1) {
            map.put(nums[0], nums[1]);
        }
        for (int[] nums : nums2) {
            map.put(nums[0], map.getOrDefault(nums[0], 0) + nums[1]);
        }
        int[][] result = new int[map.size()][];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i++] = new int[] { entry.getKey(), entry.getValue() };
        }
        return result;
    }

}
