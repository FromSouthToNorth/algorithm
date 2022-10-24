package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>915. 分割数组</h1>
 * <p>给定一个数组 nums ，将其划分为两个连续子数组 left 和 right， 使得：</p>
 * <ul>
 *     <li>left 中的每个元素都小于或等于 right 中的每个元素。</li>
 *     <li>left 和 right 都是非空的。</li>
 *     <li>left 的长度要尽可能小。</li>
 * </ul>
 * <p><em>在完成这样的分组后返回 left 的 <strong>长度</strong> 。</em></p>
 * <p>用例可以保证存在这样的划分方法。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [5,0,3,8,6]
 *     输出：3
 *     解释：left = [5,0,3]，right = [8,6]
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,1,1,0,6,12]
 *     输出：4
 *     解释：left = [1,1,1,0]，right = [6,12]
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= nums.length <= 10<sup>5</sup></li>
 *     <li>0 <= nums[i] <= 10<sup>6</sup></li>
 *     <li>可以保证至少有一种方法能够按题目所描述的那样对 nums 进行划分。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/partition-array-into-disjoint-intervals/description/">https://leetcode.cn/problems/partition-array-into-disjoint-intervals/description/</a>
 * @author hy
 */
public class Topic915PartitionDisjoint {

    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] minRight = new int[n];
        minRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        }
        int maxLeft = 0;
        for (int i = 0; i < n - 1; i++) {
            maxLeft = Math.max(maxLeft, nums[i]);
            if (maxLeft <= minRight[i + 1]) {
                return i + 1;
            }
        }
        return n - 1;
    }

}
