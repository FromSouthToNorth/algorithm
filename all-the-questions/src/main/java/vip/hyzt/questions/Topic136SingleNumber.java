package vip.hyzt.questions;

import vip.hyzt.bitArithmetic.BitArithmetic;

/**
 * <h2>136. 只出现一次的数字</h2>
 * <p>给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。</p>
 * <p><strong>说明：</strong></p>
 * <p>你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？</p>
 * <h3>示例 1:</h3>
 * <pre>
 *     输入: [2,2,1]
 *     输出: 1
 * </pre>
 * <h3>示例 2:</h3>
 * <pre>
 *     输入: [4,1,2,1,2]
 *     输出: 4
 * </pre>
 * @see <a href="https://leetcode.cn/problems/single-number/">https://leetcode.cn/problems/single-number/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic136SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = BitArithmetic.bitXOR(result, num);
        }
        return result;
    }

}
