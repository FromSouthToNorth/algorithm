package vip.hyzt.questions;

/**
 * <h3>747. 至少是其他数字两倍的最大数</h3>
 * <p>给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。</p>
 *
 * <p>请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。</p>
 *
 * <p>示例 1：</p>
 * <pre>
 *     <strong>输入：<strong/>nums = [3,6,1,0]
 *     <strong>输出：<strong/>1
 *     <strong>解释：<strong/>6 是最大的整数，对于数组中的其他整数，6 大于数组中其他元素的两倍。6 的下标是 1，所以返回 1。
 * </pre>
 *
 * <p>示例 2：</p>
 * <pre>
 *     <strong>输入：</strong>nums = [1,2,3,4]
 *     <strong>输出：</strong>-1
 *     <strong>解释：</strong>4 没有超过 3 的两倍大，所以返回 -1。
 * </pre>
 *
 * <p>示例 3：</p>
 * <pre>
 *     <strong>输入：</strong>nums = [1]
 *     <strong>输出：</strong>0
 *     <strong>解释：</strong>因为不存在其他数字，所以认为现有数字 1 至少是其他数字的两倍。
 * </pre>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others">链接：https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others</a>
 */
public abstract class Topic747DominantIndex {

    public static int dominantIndex(int[] nums) {
        int m1 = -1, m2 = -1;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
                index = i;
            }
            else if (nums[i] > m2) {
                m2 = nums[i];
            }
        }
        return m1 >= m2 * 2 ? index : -1;
    }

}
