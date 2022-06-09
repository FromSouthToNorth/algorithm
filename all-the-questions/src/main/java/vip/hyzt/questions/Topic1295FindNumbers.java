package vip.hyzt.questions;

/**
 * <h3>1295. 统计位数为偶数的数字</h3>
 * <p>给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [12,345,2,6,7896]
 *     输出：2
 *     解释：
 *     12 是 2 位数字（位数为偶数）
 *     345 是 3 位数字（位数为奇数）
 *     2 是 1 位数字（位数为奇数）
 *     6 是 1 位数字 位数为奇数）
 *     7896 是 4 位数字（位数为偶数）
 *     因此只有 12 和 7896 是位数为偶数的数字
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [555,901,482,1771]
 *     输出：1
 *     解释：
 *     只有 1771 是位数为偶数的数字。
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= nums.length <= 500</li>
 * <li>1 <= nums[i] <= 10^5</li>
 * @see <a href="https://leetcode.cn/problems/find-numbers-with-even-number-of-digits/">https://leetcode.cn/problems/find-numbers-with-even-number-of-digits/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1295FindNumbers {

    public static int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) ans++;
        }
        return ans;
    }

}
