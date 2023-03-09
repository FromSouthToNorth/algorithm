package vip.hyzt.questions.wc319;

import java.math.BigInteger;

/**
 * <h1>2470. 最小公倍数为 K 的子数组数目</h1>
 * <p>给你一个整数数组 nums 和一个整数 k ，请你统计并返回 nums 的 <strong>子数组</strong> 中满足 元素最小公倍数为 k 的子数组数目。</p>
 * <p><strong>子数组</strong> 是数组中一个连续非空的元素序列。</p>
 * <p><strong>数组的最小公倍数</strong> 是可被所有数组元素整除的最小正整数。</p>
 * <h2>示例 1 ：</h2>
 * <pre>
 *     输入：nums = [3,6,2,7,1], k = 6
 *     输出：4
 *     解释：以 6 为最小公倍数的子数组是：
 *     - [<em><strong>3,6</strong></em>,2,7,1]
 *     - [<em><strong>3,6,2</strong></em>,7,1]
 *     - [3,<em><strong>6</strong></em>,2,7,1]
 *     - [3,<em><strong>6,2</strong></em>,7,1]
 * </pre>
 * <h2>示例 2 ：</h2>
 * <pre>
 *     输入：nums = [3], k = 2
 *     输出：0
 *     解释：不存在以 2 为最小公倍数的子数组。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 1000</li>
 *     <li>1 <= nums[i], k <= 1000</li>
 * </ul>
 * @author hy
 * @author 力扣（LeetCode）
 * @see <a href="https://leetcode.cn/problems/number-of-subarrays-with-lcm-equal-to-k/">https://leetcode.cn/problems/number-of-subarrays-with-lcm-equal-to-k/</a>
 */
public class Topic2470SubarrayLCM {

    public int subarrayLCM(int[] nums, int k) {
        int n = nums.length, count = 0;
        for (int i = 0; i < n; i++) {
            BigInteger lcm = BigInteger.ONE;
            for (int j = i; j < n && lcm.intValue() <= k; j++, count += lcm.intValue() == k ? 1 : 0) {
                lcm = lcm.multiply(BigInteger.valueOf(nums[j])).divide(lcm.gcd(BigInteger.valueOf(nums[j])));
            }
        }
        return count;
    }

}
