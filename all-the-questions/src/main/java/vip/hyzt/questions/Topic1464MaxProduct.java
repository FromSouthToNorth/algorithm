package vip.hyzt.questions;

/**
 * <h3>1464.数组中两元素的最大乘积</h3>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1464MaxProduct {

    public static int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            }
            else if (num > max2) {
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }

}
