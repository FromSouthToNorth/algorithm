package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h2>6176. 出现最频繁的偶数元素</h2>
 * <p>给你一个整数数组 nums ，返回出现最频繁的偶数元素。</p>
 * <p>如果存在多个满足条件的元素，只需要返回 <strong>最小</strong> 的一个。如果不存在这样的元素，返回 -1 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [0,1,2,2,4,4,1]
 *     输出：2
 *     解释：
 *     数组中的偶数元素为 0、2 和 4 ，在这些元素中，2 和 4 出现次数最多。
 *     返回最小的那个，即返回 2 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [4,4,4,9,2,4]
 *     输出：4
 *     解释：4 是出现最频繁的偶数元素。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：nums = [29,47,21,41,13,37,25,7]
 *     输出：-1
 *     解释：不存在偶数元素。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= nums.length <= 2000</li>
 *     <li>0 <= nums[i] <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/most-frequent-even-element/">https://leetcode.cn/problems/most-frequent-even-element/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6176MostFrequentEven {

    public int mostFrequentEven(int[] nums) {
        int count[] = new int[100001], result = 0;
        for (int num : nums) {
            count[num + 1]++;
        }
        for (int i = 1; i <= count.length - 1; i += 2) {
            result = count[i] > count[result] ? i : result;
        }
        return result - 1;
    }

}
