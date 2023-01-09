package vip.hyzt.questions;

/**
 * <h1>2527. 查询数组 Xor 美丽值</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组 nums 。</p>
 * <p>三个下标 i ，j 和 k 的 <strong>有效值</strong> 定义为 ((nums[i] | nums[j]) & nums[k]) 。</p>
 * <p>个数组的 xor <strong>美丽值</strong> 是数组中所有满足 0 <= i, j, k < n <strong>的三元组</strong> (i, j, k) 的 <strong>有效值</strong> 的异或结果。</p>
 * <p>请你返回 nums 的 xor 美丽值。</p>
 * <p><strong>注意：</strong></p>
 * <ul>
 *     <li>val1 | val2 是 val1 和 val2 的按位或。</li>
 *     <li>val1 & val2 是 val1 和 val2 的按位与</li>
 * </ul>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,4]
 *     输出：5
 *     解释：
 *     三元组和它们对应的有效值如下：
 *     - (0,0,0) 有效值为 ((1 | 1) & 1) = 1
 *     - (0,0,1) 有效值为 ((1 | 1) & 4) = 0
 *     - (0,1,0) 有效值为 ((1 | 4) & 1) = 1
 *     - (0,1,1) 有效值为 ((1 | 4) & 4) = 4
 *     - (1,0,0) 有效值为 ((4 | 1) & 1) = 1
 *     - (1,0,1) 有效值为 ((4 | 1) & 4) = 4
 *     - (1,1,0) 有效值为 ((4 | 4) & 1) = 0
 *     - (1,1,1) 有效值为 ((4 | 4) & 4) = 4
 *     数组的 xor 美丽值为所有有效值的按位异或 1 ^ 0 ^ 1 ^ 4 ^ 1 ^ 4 ^ 0 ^ 4 = 5 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [15,45,20,2,34,35,5,44,32,30]
 *     输出：34
 *     解释：数组的 xor 美丽值为 34 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>9</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-xor-beauty-of-array/">https://leetcode.cn/problems/find-xor-beauty-of-array/</a>
 */
public class Topic2527XorBeauty {

    public int xorBeauty(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

}
