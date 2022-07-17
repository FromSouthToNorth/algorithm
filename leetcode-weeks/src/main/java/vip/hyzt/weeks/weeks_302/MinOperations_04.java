package vip.hyzt.weeks.weeks_302;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * <h3>6122. 使数组可以被整除的最少删除次数</h3>
 * @see <a href="https://leetcode.cn/problems/minimum-deletions-to-make-array-divisible/">https://leetcode.cn/problems/minimum-deletions-to-make-array-divisible/</a>
 * @author hy
 */
public class MinOperations_04 {

    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd = 0;
        for (int num : numsDivide) {
            gcd = BigInteger.valueOf(gcd).gcd(BigInteger.valueOf(num)).intValue();
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (gcd % nums[i] == 0) {
                return i;
            }
        }
        return -1;
    }

}
