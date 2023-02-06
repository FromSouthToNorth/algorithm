package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>2541. 使数组中所有元素相等的最小操作数 II</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-operations-to-make-array-equal-ii/">https://leetcode.cn/problems/minimum-operations-to-make-array-equal-ii/</a>
 */
public class Topic2541MinOperations {

    public long minOperations(int[] nums1, int[] nums2, int k) {
       if (k == 0) {
           return Arrays.equals(nums1, nums2) ? 0 : -1;
       }
       long p = 0, m = 0;
       int n = nums1.length;
        for (int i = 0; i < n; i++) {
            int diff = nums1[i] - nums2[i];
            if (diff % k != 0) {
                return -1;
            }
            if (diff > 0) {
                p += diff / k;
            }
            else {
                m += diff / k;
            }
        }
        return p + m != 0 ? -1 : p;
    }

}
