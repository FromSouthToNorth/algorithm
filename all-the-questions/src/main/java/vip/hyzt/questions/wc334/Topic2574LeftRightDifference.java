package vip.hyzt.questions.wc334;

/**
 * <h1>2574. 左右元素和的差值</h1>
 * <p></p>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组 nums ，请你找出一个下标从 <strong>0</strong> 开始的整数数组 answer ，其中：</p>
 * <ul>
 *     <li>answer.length == nums.length</li>
 *     <li>answer[i] = |leftSum[i] - rightSum[i]|</li>
 * </ul>
 * <p>其中：</p>
 * <ul>
 *     <li>leftSum[i] 是数组 nums 中下标 i 左侧元素之和。如果不存在对应的元素，leftSum[i] = 0 。</li>
 *     <li>rightSum[i] 是数组 nums 中下标 i 右侧元素之和。如果不存在对应的元素，rightSum[i] = 0 。</li>
 * </ul>
 * <p>返回数组 answer 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [10,4,8,3]
 *     输出：[15,1,11,22]
 *     解释：数组 leftSum 为 [0,10,14,22] 且数组 rightSum 为 [15,11,3,0] 。
 *     数组 answer 为 [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22] 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1]
 *     输出：[0]
 *     解释：数组 leftSum 为 [0] 且数组 rightSum 为 [0] 。
 *     数组 answer 为 [|0 - 0|] = [0] 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 1000</li>
 *     <li>1 <= nums[i] <= 10<sup>5</sup></li>
 * </ul>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/left-and-right-sum-differences/discussion/">https://leetcode.cn/problems/left-and-right-sum-differences/discussion/</a>
 */
public class Topic2574LeftRightDifference {

    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        for (int i = n - 1, j = 0; i > 0; i--) {
            sum[i - 1] = Math.abs(sum[i - 1] - (j += nums[i]));
        }
        return sum;
    }

}
