package vip.hyzt.questions;

/**
 * <h1>2560. 打家劫舍 IV</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/house-robber-iv/">https://leetcode.cn/problems/house-robber-iv/</a>
 */
public class Topic2560MinCapability {

    public int minCapability(int[] nums, int k) {
        // 1 <= nums[i] <= 1000000000
        int left = 1, right = 1000000000;
        while (left < right) {
            int mid = (left + right) / 2, count = 0;
            for (int i = 0; i < nums.length; i += nums[i] > mid ? 1 : 2) {
                count += nums[i] > mid ? 0 : 1;
            }
            if (count < k) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

}
