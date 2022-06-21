package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>2089. 找出数组排序后的目标下标</h3>
 * <p>给你一个下标从 0 开始的整数数组 nums 以及一个目标元素 target 。</p>
 * <p>目标下标 是一个满足 nums[i] == target 的下标 i 。</p>
 * <p>将 nums 按 非递减 顺序排序后，返回由 nums 中目标下标组成的列表。如果不存在目标下标，返回一个 空 列表。返回的列表必须按 递增 顺序排列。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [1,2,5,2,3], target = 2
 *     输出：[1,2]
 *     解释：排序后，nums 变为 [1,2,2,3,5] 。
 *     满足 nums[i] == 2 的下标是 1 和 2 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [1,2,5,2,3], target = 3
 *     输出：[3]
 *     解释：排序后，nums 变为 [1,2,2,3,5] 。
 *     满足 nums[i] == 3 的下标是 3 。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：nums = [1,2,5,2,3], target = 5
 *     输出：[4]
 *     解释：排序后，nums 变为 [1,2,2,3,5] 。
 *     满足 nums[i] == 5 的下标是 4 。
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入：nums = [1,2,5,2,3], target = 4
 *     输出：[]
 *     解释：nums 中不含值为 4 的元素。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= nums.length <= 100</li>
 *     <li>1 <= nums[i], target <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/find-target-indices-after-sorting-array/">https://leetcode.cn/problems/find-target-indices-after-sorting-array/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2089TargetIndices {


    public static List<Integer> targetIndices1(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static List<Integer> targetIndices2(int[] nums, int target) {
        int cnt1 = 0;
        int cnt2 = 0;
        for (int num : nums) {
            if (target > num) {
                cnt1++;
            }
            else if (target == num) {
                cnt2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = cnt1; i < cnt1 + cnt2; i++) {
            ans.add(i);
        }
        return ans;
    }

}
