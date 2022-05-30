package vip.hyzt.questions;

/**
 * <h3>一维数组的动态和</h3>
 * <p>给你一个数组 nums。数组 动态和 的计算公式为：runningSum[i] = sum(nums[0]...nums[i])</p>
 * <p>请返回 nums 的动态和</p>
 * <h3>示例 1：</h3>
 * <pre>
 *    input:   nums = [1,2,3,4]
 *    output:  [1,3,6,10]
 *    explain: 动态和计算过程为：[1,1+2,1+2+3,1+2+3+4]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *    input:   nums = [1,1,1,1,1]
 *    output:  [1,2,3,4,5]
 *    explain: 动态和计算过程: [1,1+1,1+1+1,1+1+1+1,1+1+1+1]
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     input:   nums = [3,1,2,10,1]
 *     output:  [3,4,6,16,17]
 * </pre>
 * @see <a href="https://leetcode.cn/problems/running-sum-of-1d-array/">https://leetcode.cn/problems/running-sum-of-1d-array/</a>
 * @author hy
 */
public class Topic1480RunningSum {

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }

}
