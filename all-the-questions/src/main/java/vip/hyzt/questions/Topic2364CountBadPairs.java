package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>2364. 统计坏数对的数目</h3>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组nums。如果 i < j且j - i != nums[j] - nums[i]，那么我们称(i, j)是一个 <strong>坏数对</strong>。</p>
 * <p>请你返回 nums 中 <strong>坏数对</strong> 的总数目。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：nums = [4,1,3,3]
 *     输出：5
 *     解释：数对 (0, 1) 是坏数对，因为 1 - 0 != 1 - 4 。
 *     数对 (0, 2) 是坏数对，因为 2 - 0 != 3 - 4, 2 != -1 。
 *     数对 (0, 3) 是坏数对，因为 3 - 0 != 3 - 4, 3 != -1 。
 *     数对 (1, 2) 是坏数对，因为 2 - 1 != 3 - 1, 1 != 2 。
 *     数对 (2, 3) 是坏数对，因为 3 - 2 != 3 - 3, 1 != 0 。
 *     总共有 5 个坏数对，所以我们返回 5 。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：nums = [1,2,3,4,5]
 *     输出：0
 *     解释：没有坏数对。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>9</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/count-number-of-bad-pairs/">https://leetcode.cn/problems/count-number-of-bad-pairs/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2364CountBadPairs {
// ----------------- 会超时 --------------------------------
//    public long countBadPairs(int[] nums) {
//        long result = 0L;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                if (j - i != nums[j] - nums[i]) {
//                    result++;
//                }
//            }
//        }
//        return result;
//    }

    public long countBadPairs(int[] nums) {
        long result = 0L;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = i - nums[i];
            int same = map.getOrDefault(val, 0);
            result += i - same;
            map.put(val, same + 1);
        }
        return result;
    }

}
