package vip.hyzt.questions;

/**
 * <h3>剑指 Offer 11. 旋转数组的最小数字</h3>
 * <p>把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。</p>
 * <p>给你一个可能存在<strong>重复</strong>元素值的数组 numbers，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。请返回旋转数组的<strong>最小元素</strong>。例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为 1。</p>
 * <p>注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：numbers = [3,4,5,1,2]
 *     输出：1
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：numbers = [2,2,2,0,1]
 *     输出：0
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>n == numbers.length</li>
 *     <li>1 <= n <= 5000</li>
 *     <li>-5000 <= numbers[i] <= 5000</li>
 *     <li>numbers 原来是一个升序排序的数组，并进行了 1 至 n 次旋转</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof">https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class TopicOffer11MinArray {

    public int minArray(int[] nums) {
        int len = nums.length;
        return minArray(nums, 0, len - 1);
    }

    private int minArray(int[] nums, int left, int right) {
        if (left + 1 >= right) {
            return Math.min(nums[left], nums[right]);
        }

        if (nums[left] < nums[right]) {
            return nums[left];
        }
        int mid = left + (right - left) / 2;
        return Math.min(minArray(nums, left, mid - 1), minArray(nums, mid, right));
    }

}
