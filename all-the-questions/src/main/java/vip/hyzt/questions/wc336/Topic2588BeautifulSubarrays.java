package vip.hyzt.questions.wc336;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>2588. 统计美丽子数组数目</h1>
 * <p></p>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组nums 。每次操作中，你可以：</p>
 * <ul>
 *     <li>选择两个满足 0 <= i, j < nums.length 的不同下标 i 和 j 。</li>
 *     <li>选择一个非负整数 k ，满足 nums[i] 和 nums[j] 在二进制下的第 k 位（下标编号从 0 开始）是 1 。</li>
 *     <li>将 nums[i] 和 nums[j] 都减去 2<sup>k</sup> 。</li>
 * </ul>
 * <p>如果一个子数组内执行上述操作若干次后，该子数组可以变成一个全为 0 的数组，那么我们称它是一个 <strong>美丽</strong> 的子数组。</p>
 * <p>请你返回数组 nums 中 <strong>美丽子数组</strong> 的数目。</p>
 * <p>子数组是一个数组中一段连续 <strong>非空</strong> 的元素序列。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [4,3,1,2,4]
 *     输出：2
 *     解释：nums 中有 2 个美丽子数组：[4,<strong><em>3,1,2</em></strong>,4] 和 [<strong><em>4,3,1,2,4</em></strong>] 。
 *     - 按照下述步骤，我们可以将子数组 [3,1,2] 中所有元素变成 0 ：
 *       - 选择 [<strong><em>3</em></strong>, 1, <strong><em>2</em></strong>] 和 k = 1 。将 2 个数字都减去 21 ，子数组变成 [1, 1, 0] 。
 *       - 选择 [<strong><em>1, 1</em></strong>, 0] 和 k = 0 。将 2 个数字都减去 20 ，子数组变成 [0, 0, 0] 。
 *     - 按照下述步骤，我们可以将子数组 [4,3,1,2,4] 中所有元素变成 0 ：
 *       - 选择 [<strong><em>4</em></strong>, 3, 1, 2, <strong><em>4</em></strong>] 和 k = 2 。将 2 个数字都减去 2<sup>2</sup> ，子数组变成 [0, 3, 1, 2, 0] 。
 *       - 选择 [0, <strong><em>3, 1</em></strong>, 2, 0] 和 k = 0 。将 2 个数字都减去 2<sup>0</sup> ，子数组变成 [0, 2, 0, 2, 0] 。
 *       - 选择 [0, <strong><em>2</em></strong>, 0, <strong><em>2</em></strong>, 0] 和 k = 1 。将 2 个数字都减去 2<sup>1</sup> ，子数组变成 [0, 0, 0, 0, 0] 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,10,4]
 *     输出：0
 *     解释：nums 中没有任何美丽子数组。
 * </pre>
 * <p></p>
 * <h2></h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>0 <= nums[i] <= 10<sup>6</sup></li>
 * </ul>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-beautiful-subarrays/description/">https://leetcode.cn/problems/count-the-number-of-beautiful-subarrays/description/</a>
 */
public class Topic2588BeautifulSubarrays {

    public long beautifulSubarrays(int[] nums) {
        long count = 0, map[] = new long[1 << 20];
        for (int i = 0, xor = 0; i < nums.length; i++) {
            map[xor]++;
            count += map[xor ^= nums[i]];
        }
        return count;
    }

}
