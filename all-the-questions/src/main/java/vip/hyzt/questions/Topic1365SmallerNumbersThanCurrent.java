package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>1365. 有多少小于当前数字的数字</h3>
 * <p>给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。</p>
 * <p>换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。</p>
 * <p>以数组形式返回答案。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [8,1,2,2,3]
 *     输出：[4,0,1,1,3]
 *     解释：
 *     对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
 *     对于 nums[1]=1 不存在比它小的数字。
 *     对于 nums[2]=2 存在一个比它小的数字：（1）。
 *     对于 nums[3]=2 存在一个比它小的数字：（1）。
 *     对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [6,5,4,8]
 *     输出：[2,1,0,3]
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：nums = [7,7,7,7]
 *     输出：[0,0,0,0]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>2 <= nums.length <= 500</li>
 *     <li>0 <= nums[i] <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/how-many-numbers-are-smaller-than-the-current-number/">https://leetcode.cn/problems/how-many-numbers-are-smaller-than-the-current-number/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1365SmallerNumbersThanCurrent {

    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[j] < nums[i]) {
                    cnt++;
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }

    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] cnt = new int[101];
        for (int num : nums) {
            cnt[num]++;
        }
        for (int i = 1; i < cnt.length; i++) {
            cnt[i] = cnt[i] + cnt[i - 1];
        }
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans[i] = cnt[nums[i] - 1];
            }
        }
        return ans;
    }

}
