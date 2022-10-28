package vip.hyzt.questions;

/**
 * <h1>1822. 数组元素积的符号</h1>
 * <p>已知函数 signFunc(x) 将会根据 x 的正负返回特定值：</p>
 * <ul>
 *     <li>如果 x 是正数，返回 1 。</li>
 *     <li>如果 x 是负数，返回 -1 。</li>
 *     <li>如果 x 是等于 0 ，返回 0 。</li>
 * </ul>
 * <p>给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。</p>
 * <p>返回 signFunc(product) 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [-1,-2,-3,-4,3,2,1]
 *     输出：1
 *     解释：数组中所有值的乘积是 144 ，且 signFunc(144) = 1
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,5,0,2,-3]
 *     输出：0
 *     解释：数组中所有值的乘积是 0 ，且 signFunc(0) = 0
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：nums = [-1,1,-1,1,-1]
 *     输出：-1
 *     解释：数组中所有值的乘积是 -1 ，且 signFunc(-1) = -1
 * </pre>
 * @see <a href="https://leetcode.cn/problems/sign-of-the-product-of-an-array/description/">https://leetcode.cn/problems/sign-of-the-product-of-an-array/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1822ArraySign {

    public int arraySign(int[] nums) {
        int res = -1, cur = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            res = cur *= num > 0 ? 1 : -1;
        }
        return res;
    }

}
