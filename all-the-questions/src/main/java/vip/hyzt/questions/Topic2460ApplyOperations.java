package vip.hyzt.questions;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>2460. 对数组执行操作</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始的数组 nums ，数组大小为 n ，且由 <strong>非负</strong> 整数组成。</p>
 * <p>你需要对数组执行 n - 1 步操作，其中第 i 步操作（从 <strong>0</strong> 开始计数）要求对 nums 中第 i 个元素执行下述指令：</p>
 * <ul>
 *     <li>如果 nums[i] == nums[i + 1] ，则 nums[i] 的值变成原来的 2 倍，nums[i + 1] 的值变成 0 。否则，跳过这步操作。</li>
 * </ul>
 * <p>在执行完 <strong>全部</strong> 操作后，将所有 0 <strong>移动</strong> 到数组的 <strong>末尾</strong> 。</p>
 * <ul>
 *     <li>例如，数组 [1,0,2,0,0,1] 将所有 0 移动到末尾后变为 [1,2,1,0,0,0] 。</li>
 * </ul>
 * <p>返回结果数组。</p>
 * <p><strong>注意</strong> 操作应当 <strong>依次有序</strong> 执行，而不是一次性全部执行。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,2,2,1,1,0]
 *     输出：[1,4,2,0,0,0]
 *     解释：执行以下操作：
 *     - i = 0: nums[0] 和 nums[1] 不相等，跳过这步操作。
 *     - i = 1: nums[1] 和 nums[2] 相等，nums[1] 的值变成原来的 2 倍，nums[2] 的值变成 0 。数组变成 [1,4,0,1,1,0] 。
 *     - i = 2: nums[2] 和 nums[3] 不相等，所以跳过这步操作。
 *     - i = 3: nums[3] 和 nums[4] 相等，nums[3] 的值变成原来的 2 倍，nums[4] 的值变成 0 。数组变成 [1,4,0,2,0,0] 。
 *     - i = 4: nums[4] 和 nums[5] 相等，nums[4] 的值变成原来的 2 倍，nums[5] 的值变成 0 。数组变成 [1,4,0,2,0,0] 。
 *     执行完所有操作后，将 0 全部移动到数组末尾，得到结果数组 [1,4,2,0,0,0] 。
 * </pre>
 * <h2>示例 2：</h2>
 * <per>
 *     输入：nums = [0,1]
 *     输出：[1,0]
 *     解释：无法执行任何操作，只需要将 0 移动到末尾。
 * </per>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= nums.length <= 2000</li>
 *     <li>0 <= nums[i] <= 1000</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/apply-operations-to-an-array/">https://leetcode.cn/problems/apply-operations-to-an-array/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2460ApplyOperations {

    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                nums[i - 1] *= 2;
                nums[i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n && nums[i] == 0; j++) {
                if (nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
        return nums;
    }

}
