package vip.hyzt.questions.wc356;

import java.util.HashSet;

/**
 * <h1>2799. 统计完全子数组的数目</h1>
 * <p></p>
 * <p>给你一个由 <strong>正</strong> 整数组成的数组 nums 。</p>
 * <p>如果数组中的某个子数组满足下述条件，则称之为 <strong>完全子数组</strong> ：</p>
 * <li>子数组中 <strong>不同</strong> 元素的数目等于整个数组不同元素的数目。</li>
 * <p>返回数组中 <strong>完全子数组</strong> 的数目。</p>
 * <p><strong>子数组</strong> 是数组中的一个连续非空序列。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,3,1,2,2]
 *     输出：4
 *     解释：完全子数组有：[1,3,1,2]、[1,3,1,2,2]、[3,1,2] 和 [3,1,2,2] 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [5,5,5,5]
 *     输出：10
 *     解释：数组仅由整数 5 组成，所以任意子数组都满足完全子数组的条件。子数组的总数为 10 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 1000</li>
 *     <li>1 <= nums[i] <= 2000</li>
 * </ul>
 * @author hy
 */
public class Topic2799CountCompleteSubarrays {

    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> curr = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                curr.add(nums[j]);
                count += curr.size() / set.size();
            }
        }
        return count;
    }

}
