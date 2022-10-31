package vip.hyzt.questions;

import java.util.stream.IntStream;

/**
 * <h1>2455. 可被三整除的偶数的平均值</h1>
 * <p>给你一个由正整数组成的整数数组 nums ，返回其中可被 3 整除的所有偶数的平均值。</p>
 * <p>注意：n 个元素的平均值等于 n 个元素 <strong>求和</strong> 再除以 n ，结果 <strong>向下取整</strong> 到最接近的整数。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,3,6,10,12,15]
 *     输出：9
 *     解释：6 和 12 是可以被 3 整除的偶数。(6 + 12) / 2 = 9 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,2,4,7,10]
 *     输出：0
 *     解释：不存在满足题目要求的整数，所以返回 0 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 1000</li>
 *     <li>1 <= nums[i] <= 1000</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/average-value-of-even-numbers-that-are-divisible-by-three/">https://leetcode.cn/problems/average-value-of-even-numbers-that-are-divisible-by-three/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2455AverageValue {

    public int averageValue(int[] nums) {
//        return (int) IntStream.of(nums).filter(t -> t % 6 == 0).average().orElseGet(() -> 0);
        int cur = 0, sum = 0;
        for (int num : nums) {
            if (num % 6 == 0) {
                sum += num;
                cur++;
            }
        }
        return cur == 0 ? cur : sum / cur;
    }

}
