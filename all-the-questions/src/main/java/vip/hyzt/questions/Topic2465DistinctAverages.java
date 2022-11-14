package vip.hyzt.questions;

import java.util.Arrays;
import java.util.HashSet;

/**
 * <h1>2465. 不同的平均值数目</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始长度为 <strong>偶数</strong> 的整数数组 nums 。</p>
 * <p>只要 nums <strong>不是</strong> 空数组，你就重复执行以下步骤：</p>
 * <ul>
 *     <li>找到 nums 中的最小值，并删除它。</li>
 *     <li>找到 nums 中的最大值，并删除它。</li>
 *     <li>计算删除两数的平均值。</li>
 * </ul>
 * <p>两数 a 和 b 的 <strong>平均值</strong> 为 (a + b) / 2 。</p>
 * <ul>
 *     <li>比方说，2 和 3 的平均值是 (2 + 3) / 2 = 2.5 。</li>
 * </ul>
 * <p>返回上述过程能得到的 不同 平均值的数目。</p>
 * <p><strong>注意</strong> ，如果最小值或者最大值有重复元素，可以删除任意一个。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [4,1,4,0,3,5]
 *     输出：2
 *     解释：
 *     1. 删除 0 和 5 ，平均值是 (0 + 5) / 2 = 2.5 ，现在 nums = [4,1,4,3] 。
 *     2. 删除 1 和 4 ，平均值是 (1 + 4) / 2 = 2.5 ，现在 nums = [4,3] 。
 *     3. 删除 3 和 4 ，平均值是 (3 + 4) / 2 = 3.5 。
 *     2.5 ，2.5 和 3.5 之中总共有 2 个不同的数，我们返回 2 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,100]
 *     输出：1
 *     解释：
 *     删除 1 和 100 后只有一个平均值，所以我们返回 1 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= nums.length <= 100</li>
 *     <li>nums.length 是偶数。</li>
 *     <li>0 <= nums[i] <= 100</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/number-of-distinct-averages/description/">https://leetcode.cn/problems/number-of-distinct-averages/description/</a>
 */
public class Topic2465DistinctAverages {

    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            set.add(nums[i] + nums[n - 1 - i]);
        }
        return set.size();
    }

}
