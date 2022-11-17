package vip.hyzt.questions;

/**
 * <h1>153. 寻找旋转排序数组中的最小值</h1>
 * <p>已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 <strong>旋转</strong> 后，得到输入数组。例如，原数组 nums = [0,1,2,4,5,6,7] 在变化后可能得到：</p>
 * <ul>
 *     <li>若旋转 4 次，则可以得到 [4,5,6,7,0,1,2]</li>
 *     <li>若旋转 7 次，则可以得到 [0,1,2,4,5,6,7]</li>
 * </ul>
 * <p>注意，数组 [a[0], a[1], a[2], ..., a[n-1]] <strong>旋转一次</strong> 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。</p>
 * <p>给你一个元素值 <strong>互不相同</strong> 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 <strong>最小元素</strong> 。</p>
 * <p>你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [3,4,5,1,2]
 *     输出：1
 *     解释：原数组为 [1,2,3,4,5] ，旋转 3 次得到输入数组。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [4,5,6,7,0,1,2]
 *     输出：0
 *     解释：原数组为 [0,1,2,4,5,6,7] ，旋转 4 次得到输入数组。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：nums = [11,13,15,17]
 *     输出：11
 *     解释：原数组为 [11,13,15,17] ，旋转 4 次得到输入数组。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>n == nums.length</li>
 *     <li>1 <= n <= 5000</li>
 *     <li>-5000 <= nums[i] <= 5000</li>
 *     <li>nums 中的所有整数 <strong>互不相同</strong></li>
 *     <li>nums 原来是一个升序排序的数组，并进行了 1 至 n 次旋转</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array">https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array</a>
 */
public class Topic153FindMin {

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < nums[right]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

}
