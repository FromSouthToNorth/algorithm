package vip.hyzt.questions.wc337;

/**
 * <h1>2598. 执行操作后的最大 MEX</h1>
 * <p></p>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组 nums 和一个整数 value 。</p>
 * <p>在一步操作中，你可以对 nums 中的任一元素加上或减去 value 。</p>
 * <ul>
 *     <li>例如，如果 nums = [1,2,3] 且 value = 2 ，你可以选择 nums[0] 减去 value ，得到 nums = [-1,2,3] 。</li>
 *     <li>数组的 MEX (minimum excluded) 是指其中数组中缺失的最小非负整数。</li>
 * </ul>
 * <p>返回在执行上述操作 <strong>任意次</strong> 后，nums 的最大 MEX 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,-10,7,13,6,8], value = 5
 *     输出：4
 *     解释：执行下述操作可以得到这一结果：
 *     - nums[1] 加上 value 两次，nums = [1,0,7,13,6,8]
 *     - nums[2] 减去 value 一次，nums = [1,0,2,13,6,8]
 *     - nums[3] 减去 value 两次，nums = [1,0,2,3,6,8]
 *     nums 的 MEX 是 4 。可以证明 4 是可以取到的最大 MEX 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [1,-10,7,13,6,8], value = 7
 *     输出：2
 *     解释：执行下述操作可以得到这一结果：
 *     - nums[2] 减去 value 一次，nums = [1,-10,0,13,6,8]
 *     nums 的 MEX 是 2 。可以证明 2 是可以取到的最大 MEX 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length, value <= 10<sup>5</sup></li>
 *     <li>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></li>
 * </ul>
 * <p></p>
 * <h2>JavaScript</h2>
 * <pre>
 *     var findSmallestInteger = function(nums, value) {
 *        const count = new Array(value).fill(0);
 *        for (let num of nums) {
 *          count[(num % value + value) % value]++;
 *        }
 *        for (let i = 0;; i++) {
 *          if (--count[i % value] < 0) {
 *            return i;
 *          }
 *        }
 *     };
 *
 *     console.log(findSmallestInteger([1,-10,7,13,6,8], 5));
 *     console.log(findSmallestInteger([1,-10,7,13,6,8], 7));
 * </pre>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/smallest-missing-non-negative-integer-after-operations/description/">https://leetcode.cn/problems/smallest-missing-non-negative-integer-after-operations/description/</a>
 */
public class Topic2598FindSmallestInteger {

    public int findSmallestInteger(int[] nums, int value) {
        int[] count = new int[value];
        for (int num : nums) {
            count[(num % value + value) % value]++;
        }
        for (int i = 0; ; i++) {
            if (--count[i % value] < 0) {
                return i;
            }
        }
    }

}
