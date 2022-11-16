package vip.hyzt.questions;

/**
 * <h1>775. 全局倒置与局部倒置</h1>
 * <p>给你一个长度为 n 的整数数组 nums ，表示由范围 [0, n - 1] 内所有整数组成的一个排列。</p>
 * <p><strong>全局倒置</strong> 的数目等于满足下述条件不同下标对 (i, j) 的数目：</p>
 * <ul>
 *     <li>0 <= i < j < n</li>
 *     <li>nums[i] > nums[j]</li>
 * </ul>
 * <p><strong>局部倒置</strong> 的数目等于满足下述条件的下标 i 的数目：</p>
 * <ul>
 *     <li>0 <= i < n - 1</li>
 *     <li>nums[i] > nums[i + 1]</li>
 * </ul>
 * <p>当数组 nums 中 <strong>全局倒置</strong> 的数量等于 <strong>局部倒置</strong> 的数量时，返回 true ；否则，返回 false 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,0,2]
 *     输出：true
 *     解释：有 1 个全局倒置，和 1 个局部倒置。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,2,0]
 *     输出：false
 *     解释：有 2 个全局倒置，和 1 个局部倒置。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>n == nums.length</li>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 *     <li>0 <= nums[i] < n</li>
 *     <li>nums 中的所有整数 <strong>互不相同</strong></li>
 *     <li>nums 是范围 [0, n - 1] 内所有数字组成的一个排列</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/global-and-local-inversions/">https://leetcode.cn/problems/global-and-local-inversions/</a>
 */
public class Topic775IsIdealPermutation {

    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }

}
