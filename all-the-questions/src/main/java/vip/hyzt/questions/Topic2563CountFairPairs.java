package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>6355. 统计公平数对的数目</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-fair-pairs/">https://leetcode.cn/problems/count-the-number-of-fair-pairs/</a>
 */
public class Topic2563CountFairPairs {

    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        Arrays.sort(nums);
        long count = 0;
        for (int i = 0, j = n - 1, k = n - 1; i < n; i++) {
            for (; j >= 0 && nums[i] + nums[j] >= lower; j--) {

            }
            for (; k >= 0 && nums[i] + nums[k] > upper; k--) {

            }
            count += k - j - (i > j && i <= k ? 1 : 0);
        }
        return count / 2;
    }

}
