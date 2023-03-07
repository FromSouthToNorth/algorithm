package vip.hyzt.questions.wc310;

/**
 * <h2>6206. 最长递增子序列 II</h2>
 * <p>给你一个整数数组 nums 和一个整数 k 。</p>
 * <p>找到 nums 中满足以下要求的最长子序列：</p>
 * <ul>
 *     <li>子序列 <strong>严格递增</strong></li>
 *     <li>子序列中相邻元素的差值 <strong>不超过</strong> k 。</li>
 * </ul>
 * <p>请你返回满足上述要求的 <strong>最长子序列</strong> 的长度。</p>
 * <p><strong>子序列</strong> 是从一个数组中删除部分元素后，剩余元素不改变顺序得到的数组。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [4,2,1,4,3,4,5,8,15], k = 3
 *     输出：5
 *     解释：
 *     满足要求的最长子序列是 [1,3,4,5,8] 。
 *     子序列长度为 5 ，所以我们返回 5 。
 *     注意子序列 [1,3,4,5,8,15] 不满足要求，因为 15 - 8 = 7 大于 3 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [7,4,5,1,8,12,4,7], k = 5
 *     输出：4
 *     解释：
 *     满足要求的最长子序列是 [4,5,8,12] 。
 *     子序列长度为 4 ，所以我们返回 4 。
 * </pre>
 * <h3>示例 3：</h3>
 * <per>
 *     输入：nums = [1,5], k = 1
 *     输出：1
 *     解释：
 *     满足要求的最长子序列是 [1] 。
 *     子序列长度为 1 ，所以我们返回 1 。
 * </per>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i], k <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/longest-increasing-subsequence-ii">https://leetcode.cn/problems/longest-increasing-subsequence-ii</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2407LengthOfLIS {

    public int lengthOfLIS(int[] nums, int k) {
        NumArray array = new NumArray(new int[1000001]);
        for (int num : nums) {
            array.update(num, 1 + array.sumRange(num - k, num - 1));
        }
        return array.sumRange(0, 1000000);
    }

    class NumArray {

        int[] tree;
        int n;

        public NumArray(int[] nums) {
            if (nums.length > 0) {
                n = nums.length;
                tree = new int[n * 2];
                buildTree(nums);
            }
        }

        private void buildTree(int[] nums) {
            for (int i = n, j = 0; i < 2 * n; i++, j++) {
                tree[i] = nums[j];
            }
            for (int i = n - 1; i > 0; --i) {
                tree[i] = tree[i * 2] + tree[i * 2 + 1];
            }
        }

        void update(int pos, int val) {
            pos += n;
            tree[pos] = val;
            while (pos > 0) {
                int left = pos;
                int right = pos;
                if ((pos & 1) == 0) {
                    right = pos + 1;
                }
                else {
                    left = pos - 1;
                }
                tree[pos / 2] = Math.max(tree[left], tree[right]);
                pos /= 2;
            }
        }

        public int sumRange(int left, int right) {
            left += n;
            right += n;
            int sum = 0;
            while (left <= right) {
                if ((left & 1) == 1) {
                    sum = Math.max(sum, tree[left]);
                    left++;
                }
                if ((right & 1) == 0) {
                    sum = Math.max(sum, tree[right]);
                    right--;
                }
                left /= 2;
                right /= 2;
            }
            return sum;
        }
    }

}
