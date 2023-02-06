package vip.hyzt.questions;

/**
 * <h1>2552. 统计上升四元组</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-increasing-quadruplets/">https://leetcode.cn/problems/count-increasing-quadruplets/</a>
 */
public class Topic2552CountQuadruplets {

    public long countQuadruplets(int[] nums) {
        int n = nums.length;
        int[][] left = new int[n][n], right = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                left[j + 1][i] = left[j][i] + (nums[j] < nums[i] ? 1 : 0);
            }
            for (int j = n - 1; j > i; j--) {
                right[i][j - 1] = right[i][j] + (nums[j] > nums[i] ? 1 : 0);
            }
        }
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                count += nums[i] > nums[j] ? (long) left[i + 1][j] * right[i][j - 1] : 0;
            }
        }
        return count;
    }

}
