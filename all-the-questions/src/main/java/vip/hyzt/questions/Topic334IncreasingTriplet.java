package vip.hyzt.questions;

/**
 * <h3>334. 递增的三元子序列</h3>
 *
 * <p>给你一个整数数组nums ，判断这个数组中是否存在长度为 3 的递增子序列。</p>
 *
 * <p>如果存在这样的三元组下标 (i, j, k)且满足 i < j < k ，使得nums[i] < nums[j] < nums[k] ，返回 true ；否则，返回 false 。</p>
 *
 * <p>示例 1：</p>
 * <pre>
 *     <strong>输入：</strong>nums = [1,2,3,4,5]
 *     <strong>输出：</strong>true
 *     <strong>解释：</strong>任何 i < j < k 的三元组都满足题意
 * </pre>
 *
 * <p>示例 2：</p>
 * <pre>
 *     <strong>输入：</strong>nums = [5,4,3,2,1]
 *     <strong>输出：</strong>false
 *     <strong>解释：</strong>不存在满足题意的三元组
 * </pre>
 *
 * <p>示例 3：</p>
 * <pre>
 *     <strong>输入：</strong>nums = [2,1,5,0,4,6]
 *     <strong>输出：</strong>true
 *     <strong>解释：</strong>三元组 (3, 4, 5) 满足题意，因为 nums[3] == 0 < nums[4] == 4 < nums[5] == 6
 * </pre>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see  <a href="https://leetcode-cn.com/problems/increasing-triplet-subsequence">链接：https://leetcode-cn.com/problems/increasing-triplet-subsequence</a>
 */
public abstract class Topic334IncreasingTriplet {

    public static boolean twoWayTraversal(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return false;
        }
        int[] leftMin = new int[length];
        for (int i = 1; i < length; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }
        int[] rightMax = new int[length];
        rightMax[length - 1] = nums[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }
        for (int i = 1; i < length - 1; i++) {
            if (nums[i] > leftMin[i - 1] && nums[i] < rightMax[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean greedy(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return false;
        }
        int first = nums[0], second = Integer.MAX_VALUE;
        for (int i = 1; i < length; i++) {
            int num = nums[i];
            if (num > second) {
                return true;
            }
            else if (num > first) {
                second = num;
            }
            else {
                first = num;
            }
        }
        return false;
    }

}
