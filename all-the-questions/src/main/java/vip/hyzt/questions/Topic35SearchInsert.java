package vip.hyzt.questions;

/**
 * <h2>35. 搜索插入位置</h2>
 * <p>给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。</p>
 * <p>请必须使用时间复杂度为 O(log n) 的算法。</p>
 * <h3>示例 1:</h3>
 * <pre>
 *     输入: nums = [1,3,5,6], target = 5
 *     输出: 2
 * </pre>
 * <h3>示例 2:</h3>
 * <pre>
 *     输入: nums = [1,3,5,6], target = 2
 *     输出: 1
 * </pre>
 * <h3>示例 3:</h3>
 * <pre>
 *     输入: nums = [1,3,5,6], target = 7
 *     输出: 4
 * </pre>
 * <h3>提示:</h3>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>4</sup></li>
 *     <li>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></li>
 *     <li>nums 为 无重复元素 的 升序 排列数组</li>
 *     <li>-10<sup>4</sup> <= target <= 10<sup>4</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/search-insert-position/">https://leetcode.cn/problems/search-insert-position/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic35SearchInsert {

    /**
     * <pre>
     *     nums = [1,3,5,6], target = 5
     *     [1,  3,  5,  6]
     *      ⬆  ⬆      ⬆
     *     left mid   right
     *     (target <= nums[mid]) false
     *     [1,  3,  5,  6]
     *             ↗⬆  ⬆
     *        left mid right
     *     (target <= nums[mid]) true
     *     ans = mid
     *     [1,  3,  5,  6]
     *             ↗⬆↖
     *        left mid right
     *    return ans
     * </pre>
     * <pre>
     *     nums = [1, 3, 5, 6, 10, 12], target = 11
     *     [1,  3,  5,  6,  10,  12]
     *      ⬆      ⬆            ⬆
     *     left    mid          right
     *     (target <= nums[mid]) false
     *     [1,  3,  5,  6,  10,  12]
     *                  ⬆   ⬆   ⬆
     *                 left mid right
     *     (target <= nums[mid]) true
     *     [1,  3,  5,  6,  10,  12]
     *                          ↗⬆↖
     *                     left mid right
     *     ans = mid
     *     left <= right false
     *     return ans
     * </pre>
     */
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = left + ((right - left) >> 1), num = nums[mid];
            if (target <= num) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
