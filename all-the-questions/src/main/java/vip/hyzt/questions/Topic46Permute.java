package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>46. 全排列</h2>
 * <p>给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 <strong>按任意顺序</strong> 返回答案。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [1,2,3]
 *     输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [0,1]
 *     输出：[[0,1],[1,0]]
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：nums = [1]
 *     输出：[[1]]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= nums.length <= 6</li>
 *     <li>-10 <= nums[i] <= 10</li>
 *     <li>nums 中的所有整数 <strong>互不相同</strong></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/permutations/">https://leetcode.cn/problems/permutations/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic46Permute {

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }

        boolean[] used = new boolean[n];
        List<Integer> path = new ArrayList<>();
        permute(nums, n, 0, path, used, res);
        return res;
    }

    private void permute(int[] nums, int n, int depth, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == n) {
            res.add(path);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(nums[i]);
                boolean[] newUsed = new boolean[n];
                System.arraycopy(used, 0, newUsed, 0, n);
                newUsed[i] = true;

                permute(nums, n, depth + 1, newPath, newUsed, res);
            }
        }
    }

}
