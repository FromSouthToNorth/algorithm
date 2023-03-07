package vip.hyzt.questions.wc334;

import java.util.Arrays;

/**
 * <h1>2576. 求出最多标记下标</h1>
 * <p></p>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组 nums 。</p>
 * <p>一开始，所有下标都没有被标记。你可以执行以下操作任意次：</p>
 * <ul>
 *     <li>选择两个 <strong>互不相同且未标记</strong> 的下标 i 和 j ，满足 2 * nums[i] <= nums[j] ，标记下标 i 和 j 。</li>
 * </ul>
 * <p>请你执行上述操作任意次，返回 nums 中最多可以标记的下标数目。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [3,5,2,4]
 *     输出：2
 *     解释：第一次操作中，选择 i = 2 和 j = 1 ，操作可以执行的原因是 2 * nums[2] <= nums[1] ，标记下标 2 和 1 。
 *     没有其他更多可执行的操作，所以答案为 2 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [9,2,5,4]
 *     输出：4
 *     解释：第一次操作中，选择 i = 3 和 j = 0 ，操作可以执行的原因是 2 * nums[3] <= nums[0] ，标记下标 3 和 0 。
 *     第二次操作中，选择 i = 1 和 j = 2 ，操作可以执行的原因是 2 * nums[1] <= nums[2] ，标记下标 1 和 2 。
 *     没有其他更多可执行的操作，所以答案为 4 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：nums = [7,6,8]
 *     输出：0
 *     解释：没有任何可以执行的操作，所以答案为 0 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>9</sup></li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-the-maximum-number-of-marked-indices/">https://leetcode.cn/problems/find-the-maximum-number-of-marked-indices/</a>
 */
public class Topic2576MaxNumOfMarkedIndices {

    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length / 2;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (maxNumOfMarkedIndices(nums, mid)) {
                left = mid;
            }
            else {
                right = mid - 1;
            }
        }
        return left * 2;
    }

    private boolean maxNumOfMarkedIndices(int[] nums, int k) {
        if (k * 2 > nums.length) {
            return false;
        }
        int left = 0;
        int right = nums.length - k;
        for (int i = 0; i < k; i++, left++, right++) {
            if (nums[left] * 2 > nums[right]) {
                return false;
            }
        }
        return true;
    }

}
