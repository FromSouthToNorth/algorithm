package vip.hyzt.questions;

import java.util.Map;
import java.util.TreeMap;

/**
 * <h3>2382. 删除操作后的最大子段和</h3>
 * <p>给你两个下标从 <strong>0</strong> 开始的整数数组 nums 和 removeQueries ，两者长度都为 n 。对于第 i 个查询，nums 中位于下标 removeQueries[i] 处的元素被删除，将 nums 分割成更小的子段。</p>
 * <p>一个 <strong>子段</strong> 是 nums 中连续 <strong>正</strong> 整数形成的序列。<strong>子段和</strong> 是子段中所有元素的和。</p>
 * <p>请你返回一个长度为 n 的整数数组 answer ，其中 answer[i]是第 i 次删除操作以后的 <strong>最大</strong> 子段和。</p>
 * <p><strong>注意：</strong>一个下标至多只会被删除一次。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：nums = [1,2,5,6,1], removeQueries = [0,3,2,4,1]
 *     输出：[14,7,2,2,0]
 *     解释：用 0 表示被删除的元素，答案如下所示：
 *     查询 1 ：删除第 0 个元素，nums 变成 [0,2,5,6,1] ，最大子段和为子段 [2,5,6,1] 的和 14 。
 *     查询 2 ：删除第 3 个元素，nums 变成 [0,2,5,0,1] ，最大子段和为子段 [2,5] 的和 7 。
 *     查询 3 ：删除第 2 个元素，nums 变成 [0,2,0,0,1] ，最大子段和为子段 [2] 的和 2 。
 *     查询 4 ：删除第 4 个元素，nums 变成 [0,2,0,0,0] ，最大子段和为子段 [2] 的和 2 。
 *     查询 5 ：删除第 1 个元素，nums 变成 [0,0,0,0,0] ，最大子段和为 0 ，因为没有任何子段存在。
 *     所以，我们返回 [14,7,2,2,0] 。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：nums = [3,2,11,1], removeQueries = [3,2,1,0]
 *     输出：[16,5,3,0]
 *     解释：用 0 表示被删除的元素，答案如下所示：
 *     查询 1 ：删除第 3 个元素，nums 变成 [3,2,11,0] ，最大子段和为子段 [3,2,11] 的和 16 。
 *     查询 2 ：删除第 2 个元素，nums 变成 [3,2,0,0] ，最大子段和为子段 [3,2] 的和 5 。
 *     查询 3 ：删除第 1 个元素，nums 变成 [3,0,0,0] ，最大子段和为子段 [3] 的和 3 。
 *     查询 5 ：删除第 0 个元素，nums 变成 [0,0,0,0] ，最大子段和为 0 ，因为没有任何子段存在。
 *     所以，我们返回 [16,5,3,0] 。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>n == nums.length == removeQueries.length</li>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>9</sup></li>
 *     <li>0 <= removeQueries[i] < n</li>
 *     <li>removeQueries 中所有数字 <strong>互不相同</strong> 。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/maximum-segment-sum-after-removals">https://leetcode.cn/problems/maximum-segment-sum-after-removals</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2382MaximumSegmentSum {

    public long[] maximumSegmentSum(int[] nums, int[] removeQueries) {
        long[] sum = new long[nums.length + 1], result = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        TreeMap<Long, Integer> map = new TreeMap<>(Map.of(0L, nums.length)),
                count = new TreeMap<>(Map.of(sum[nums.length], 1));
        for (int i = 0; i < removeQueries.length; i++) {
            Map.Entry<Long, Integer> entry = map.floorEntry((long) removeQueries[i]);
            count.put(sum[entry.getValue()] - sum[entry.getKey().intValue()],
                    count.get(sum[entry.getValue()] - sum[entry.getKey().intValue()]) - 1);
            if (count.get(sum[entry.getValue()] - sum[entry.getKey().intValue()]) == 0) {
                count.remove(sum[entry.getValue()] - sum[entry.getKey().intValue()]);
            }
            map.putAll(Map.of(entry.getKey(), removeQueries[i], removeQueries[i] + 1L, entry.getValue()));
            count.put(sum[removeQueries[i]] - sum[entry.getKey().intValue()],
                    count.getOrDefault(sum[removeQueries[i]] - sum[entry.getKey().intValue()], 0) + 1);
            count.put(sum[entry.getValue()] - sum[removeQueries[i] + 1],
                    count.getOrDefault(sum[entry.getValue()] - sum[removeQueries[i] + 1], 0 ) + 1);
            result[i] = count.lastKey();
        }
        return result;
    }

}
