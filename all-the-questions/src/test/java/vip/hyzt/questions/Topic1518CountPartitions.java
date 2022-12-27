package vip.hyzt.questions;

/**
 * <h1>2518. 好分区的数目</h1>
 * <p>给你一个正整数数组 nums 和一个整数 k 。</p>
 * <p><strong>分区</strong> 的定义是：将数组划分成两个有序的 <strong>组</strong> ，并满足每个元素 <strong>恰好</strong> 存在于 <strong>某一个</strong> 组中。如果分区中每个组的元素和都大于等于 k ，则认为分区是一个好分区。</p>
 * <p>返回 不同 的好分区的数目。由于答案可能很大，请返回对 10<sup>9</sup> + 7 <strong>取余</strong> 后的结果。</p>
 * <p>如果在两个分区中，存在某个元素 nums[i] 被分在不同的组中，则认为这两个分区不同。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,2,3,4], k = 4
 *     输出：6
 *     解释：好分区的情况是 ([1,2,3], [4]), ([1,3], [2,4]), ([1,4], [2,3]), ([2,3], [1,4]), ([2,4], [1,3]) 和 ([4], [1,2,3]) 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [3,3,3], k = 4
 *     输出：0
 *     解释：数组中不存在好分区。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：nums = [6,6], k = 2
 *     输出：2
 *     解释：可以将 nums[0] 放入第一个分区或第二个分区中。
 *     好分区的情况是 ([6], [6]) 和 ([6], [6]) 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length, k <= 1000</li>
 *     <li>1 <= nums[i] <= 10<sup>9</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/number-of-great-partitions/">https://leetcode.cn/problems/number-of-great-partitions/</a>
 */
public class Topic1518CountPartitions {

    private static final int MOD = 1000000007;

    public int countPartitions(int[] nums, int k) {
        int[][] dp = new int[nums.length + 1][k];
        int sum = 0, result = 1;
        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = 2;
        }
        for (int i = 0; i < nums.length; i++) {
            sum = Math.min(k * 2, sum + nums[i]);
            result = result * 2 % MOD;
            for (int j = 1; j < k; j++) {
                dp[i + 1][j] = (dp[i][j] + (j < nums[i] ? 0 : dp[i][j - nums[i]])) % MOD;
            }
        }
        for (int i = 0; i < k; i++) {
            result = (result + MOD - dp[nums.length][i]) % MOD;
        }
        return sum < k * 2 ? 0 : result;
    }

}
