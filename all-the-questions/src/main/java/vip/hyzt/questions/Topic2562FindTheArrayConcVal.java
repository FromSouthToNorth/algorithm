package vip.hyzt.questions;

/**
 * <h1>6354. 找出数组的串联值</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-the-array-concatenation-value/description/">https://leetcode.cn/problems/find-the-array-concatenation-value/description/</a>
 */
public class Topic2562FindTheArrayConcVal {

    public long findTheArrayConcVal(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            sum += i < j ? Integer.parseInt("" + nums[i] + nums[j]) : nums[i];
        }
        return sum;
    }

}
