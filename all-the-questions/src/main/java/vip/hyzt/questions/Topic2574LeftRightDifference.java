package vip.hyzt.questions;

/**
 * <h1>6369. 左右元素和的差值</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/left-and-right-sum-differences/description/">https://leetcode.cn/problems/left-and-right-sum-differences/description/</a>
 */
public class Topic2574LeftRightDifference {

    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n], right = new int[n], res = new int[n];
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = Math.abs(left[i] - right[i]);
        }
        return res;
    }

}
