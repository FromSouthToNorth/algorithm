package vip.hyzt.questions.wc308;

import java.util.Arrays;

/**
 * <h2>6160. 和有限的最长子序列</h2>
 * <p>给你一个长度为 n 的整数数组 nums ，和一个长度为 m 的整数数组 queries 。</p>
 * <p>返回一个长度为 m 的数组 answer ，其中 answer[i] 是 nums 中 元素之和小于等于 queries[i] 的 <strong>子序列</strong> 的 <strong>最大</strong> 长度  。</p>
 * <p><strong>子序列</strong> 是由一个数组删除某些元素（也可以不删除）但不改变剩余元素顺序得到的一个数组。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [4,5,2,1], queries = [3,10,21]
 *     输出：[2,3,4]
 *     解释：queries 对应的 answer 如下：
 *     - 子序列 [2,1] 的和小于或等于 3 。可以证明满足题目要求的子序列的最大长度是 2 ，所以 answer[0] = 2 。
 *     - 子序列 [4,5,1] 的和小于或等于 10 。可以证明满足题目要求的子序列的最大长度是 3 ，所以 answer[1] = 3 。
 *     - 子序列 [4,5,2,1] 的和小于或等于 21 。可以证明满足题目要求的子序列的最大长度是 4 ，所以 answer[2] = 4 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [2,3,4,5], queries = [1]
 *     输出：[0]
 *     解释：空子序列是唯一一个满足元素和小于或等于 1 的子序列，所以 answer[0] = 0 。
 * </pre>
 * <ul>
 *     <li>n == nums.length</li>
 *     <li>m == queries.length</li>
 *     <li>1 <= n, m <= 1000</li>
 *     <li>1 <= nums[i], queries[i] <= 10<sup>6</sup></li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/longest-subsequence-with-limited-sum">https://leetcode.cn/problems/longest-subsequence-with-limited-sum</a>
 */
public class Topic2389AnswerQueries {

    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = queries.length, res[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            for (int num : nums) {
//                if ((queries[i] -= num) >= 0) {
//                    res[i]++;
//                }
//            }
//        }
        for (int i = 0; i < n; i++) {
            while (res[i] < nums.length &&
                    (queries[i] -= nums[res[i]]) >= 0) {
                res[i]++;
            }
        }
        return res;
    }

}
