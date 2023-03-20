package vip.hyzt.questions.wc337;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <h1>2597. 美丽子集的数目</h1>
 * <p></p>
 * <p>给你一个由正整数组成的数组 nums 和一个 正 整数 k 。</p>
 * <p>如果 nums 的子集中，任意两个整数的绝对差均不等于 k ，则认为该子数组是一个 <strong>美丽</strong> 子集。</p>
 * <p>返回数组 nums 中 <strong>非空</strong> 且 <strong>美丽</strong> 的子集数目。</p>
 * <p>nums 的子集定义为：可以经由 nums 删除某些元素（也可能不删除）得到的一个数组。只有在删除元素时选择的索引不同的情况下，两个子集才会被视作是不同的子集。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [2,4,6], k = 2
 *     输出：4
 *     解释：数组 nums 中的美丽子集有：[2], [4], [6], [2, 6] 。
 *     可以证明数组 [2,4,6] 中只存在 4 个美丽子集。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1], k = 1
 *     输出：1
 *     解释：数组 nums 中的美丽数组有：[1] 。
 *     可以证明数组 [1] 中只存在 1 个美丽子集。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 20</li>
 *     <li>1 <= nums[i], k <= 1000</li>
 * </ul>
 * <p></p>
 * <h2>JavaScript</h2>
 * <pre>
 *     var beautifulSubsets = function (nums, k) {
 *       nums.sort((a, b) => a - b);
 *       const map = new Array(1001).fill(0);
 *       return dfs(0) - 1;
 *
 *       function dfs(index) {
 *         if (index === nums.length) {
 *           return 1;
 *         }
 *         let count = dfs(index + 1);
 *         if (nums[index] <= k || map[nums[index] - k] === 0) {
 *           map[nums[index]]++;
 *           count += dfs(index + 1);
 *           map[nums[index]]--;
 *         }
 *
 *         return count;
 *       }
 *     };
 *
 *     console.log(beautifulSubsets([2, 4, 6], 2));
 *     console.log(beautifulSubsets([1], 1));
 *     console.log(beautifulSubsets([10, 4, 5, 7, 2, 1], 5));
 * </pre>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/the-number-of-beautiful-subsets/">https://leetcode.cn/problems/the-number-of-beautiful-subsets/</a>
 */
public class Topic2597BeautifulSubsets {

    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return beautifulSubsets(0, new HashMap<>(), nums, k) - 1;
    }

    private int beautifulSubsets(int index, HashMap<Integer, Integer> map, int[] nums, int k) {
        if (index == nums.length) {
            return 1;
        }
        int count = beautifulSubsets(index + 1, map, nums, k);
        if (map.getOrDefault(nums[index] - k, 0) == 0) {
            map.put(nums[index], map.getOrDefault(nums[index], 0) + 1);
            count += beautifulSubsets(index + 1, map, nums, k);
            map.put(nums[index], map.get(nums[index]) - 1);
        }
        return count;
    }
}
