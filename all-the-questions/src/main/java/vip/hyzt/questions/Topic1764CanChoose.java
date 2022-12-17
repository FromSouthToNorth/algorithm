package vip.hyzt.questions;

/**
 * <h1>1764. 通过连接另一个数组的子数组得到一个数组</h1>
 * <p>给你一个长度为 n 的二维整数数组 groups ，同时给你一个整数数组 nums 。</p>
 * <p>你是否可以从 nums 中选出 n 个 <strong>不相交</strong> 的子数组，使得第 i 个子数组与 groups[i] （下标从 <strong>0</strong> 开始）完全相同，且如果 i > 0 ，那么第 (i-1) 个子数组在 nums 中出现的位置在第 i 个子数组前面。（也就是说，这些子数组在 nums 中出现的顺序需要与 groups 顺序相同）</p>
 * <p>如果你可以找出这样的 n 个子数组，请你返回 true ，否则返回 false 。</p>
 * <p>如果不存在下标为 k 的元素 nums[k] 属于不止一个子数组，就称这些子数组是 <strong>不相交</strong> 的。子数组指的是原数组中连续元素组成的一个序列。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：groups = [[1,-1,-1],[3,-2,0]], nums = [1,-1,0,1,-1,-1,3,-2,0]
 *     输出：true
 *     解释：你可以分别在 nums 中选出第 0 个子数组 [1,-1,0,<strong>1,-1,-1</strong>,3,-2,0] 和第 1 个子数组 [1,-1,0,1,-1,-1,<strong>3,-2,0</strong>] 。
 *     这两个子数组是不相交的，因为它们没有任何共同的元素。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：groups = [[10,-2],[1,2,3,4]], nums = [1,2,3,4,10,-2]
 *     输出：false
 *     解释：选择子数组 [<strong>1,2,3,4</strong>,10,-2] 和 [1,2,3,4,<strong>10,-2</strong>] 是不正确的，因为它们出现的顺序与 groups 中顺序不同。
 *     [10,-2] 必须出现在 [1,2,3,4] 之前。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：groups = [[1,2,3],[3,4]], nums = [7,7,1,2,3,4,7,7]
 *     输出：false
 *     解释：选择子数组 [7,7,<strong>1,2,3</strong>,4,7,7] 和 [7,7,1,2,<strong>3,4</strong>,7,7] 是不正确的，因为它们不是不相交子数组。
 *     它们有一个共同的元素 nums[4] （下标从 0 开始）。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>roups.length == n</li>
 *     <li>1 <= n <= 10<sup>3</sup></li>
 *     <li>1 <= groups[i].length, sum(groups[i].length) <= 10<sup>3</sup></li>
 *     <li>1 <= nums.length <= 10<sup>3</sup></li>
 *     <li>-10<sup>7</sup> <= groups[i][j], nums[k] <= 10<sup>7</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/form-array-by-concatenating-subarrays-of-another-array/description/">https://leetcode.cn/problems/form-array-by-concatenating-subarrays-of-another-array/description/</a>
 */
public class Topic1764CanChoose {

    public boolean canChoose(int[][] groups, int[] nums) {
        int k = 0;
        for (int[] group : groups) {
            k = canChoose(nums, k, group);
            if (k == -1) {
                return false;
            }
            k += group.length;
        }
        return true;
    }

    private int canChoose(int[] nums, int k, int[] g) {
        int m = g.length, n = nums.length;
        if (k + g.length > nums.length) {
            return -1;
        }
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && g[i] != g[j]) {
                j = pi[j - 1];
            }
            if (g[i] == g[j]) {
                j++;
            }
            pi[i] = j;
        }

        for (int i = k, j = 0; i < n; i++) {
            while (j > 0 && nums[i] != g[j]) {
                j = pi[j - 1];
            }
            if (nums[i] == g[j]) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

}
