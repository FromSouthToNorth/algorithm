package vip.hyzt.questions;

/**
 * <h3>1929. 数组串联</h3>
 * <p>给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，对于所有0 <= i < n 的 i ，满足下述所有要求：</p>
 * <ul>
 *     <li>ans[i] == nums[i]</li>
 *     <li>ans[i + n] == nums[i]</li>
 * </ul>
 * <p>具体而言，ans 由两个 nums 数组 串联 形成。</p>
 * <p>返回数组 ans 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [1,2,1]
 *     输出：[1,2,1,1,2,1]
 *     解释：数组 ans 按下述方式形成：
 *     - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 *     - ans = [1,2,1,1,2,1]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [1,3,2,1]
 *     输出：[1,3,2,1,1,3,2,1]
 *     解释：数组 ans 按下述方式形成：
 *     - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
 *     - ans = [1,3,2,1,1,3,2,1]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>n == nums.length</li>
 *     <li>1 <= n <= 1000</li>
 *     <li>1 <= nums[i] <= 1000</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/concatenation-of-array/">https://leetcode.cn/problems/concatenation-of-array/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1929GetConcatenation {

    /**
     * 模拟即可
     * @param nums [1,2,1]
     * @return
     * <pre>
     * ans:
     * length: nums.length * 2
     * [1<sub>0</sub>,2<sub>1</sub>,1<sub>2</sub>,1<sub>n+0</sub>,2<sub>n+1</sub>,1<sub>n+2</sub>,]
     * </pre>
     */
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i]     = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

}
