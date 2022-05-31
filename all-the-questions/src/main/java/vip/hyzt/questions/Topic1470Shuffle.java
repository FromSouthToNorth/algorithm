package vip.hyzt.questions;

/**
 * <h3>1470. 重新排列数组</h3>
 * <p>给你一个数组 nums ，数组中有 2n 个元素，按 [x<sub>1</sub>,x<sub>2</sub>,...,x<sub>n</sub>,y<sub>1</sub>,y<sub>2</sub>,...,y<sub>n</sub>] 的格式排列。</p>
 * <p>请你将数组按 [x<sub>1</sub>,y<sub>1</sub>,x<sub>2</sub>,y<sub>2</sub>,...,x<sub>n</sub>,y<sub>n</sub>] 格式重新排列，返回重排后的数组。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [2,5,1,3,4,7], n = 3
 *     输出：[2,3,5,4,1,7]
 *     解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [1,2,3,4,4,3,2,1], n = 4
 *     输出：[1,4,2,3,3,2,4,1]
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：nums = [1,1,2,2], n = 2
 *     输出：[1,2,1,2]
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= n <= 500</li>
 * <li>nums.length == 2n</li>
 * <li>1 <= nums[i] <= 10^3</li>
 * @see <a href="https://leetcode.cn/problems/shuffle-the-array/">https://leetcode.cn/problems/shuffle-the-array/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1470Shuffle {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }
        return ans;
    }

}
