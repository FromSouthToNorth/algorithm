package vip.hyzt.questions.wc335;

/**
 * <h1>2584. 分割数组使乘积互质</h1>
 * <p></p>
 * <p>给你一个长度为 n 的整数数组 nums ，下标从 <strong>0</strong> 开始。</p>
 * <p>如果在下标 i 处 <strong>分割</strong> 数组，其中 0 <= i <= n - 2 ，使前 i + 1 个元素的乘积和剩余元素的乘积互质，则认为该分割 <strong>有效</strong> 。</p>
 * <ul>
 *     <li>例如，如果 nums = [2, 3, 3] ，那么在下标 i = 0 处的分割有效，因为 2 和 9 互质，而在下标 i = 1 处的分割无效，因为 6 和 3 不互质。在下标 i = 2 处的分割也无效，因为 i == n - 1 。</li>
 * </ul>
 * <p>返回可以有效分割数组的最小下标 i ，如果不存在有效分割，则返回 -1 。</p>
 * <p>当且仅当 gcd(val1, val2) == 1 成立时，val1 和 val2 这两个值才是互质的，其中 gcd(val1, val2) 表示 val1 和 val2 的最大公约数。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/12/14/second.PNG">
 * <pre>
 *     输入：nums = [4,7,8,15,3,5]
 *     输出：2
 *     解释：上表展示了每个下标 i 处的前 i + 1 个元素的乘积、剩余元素的乘积和它们的最大公约数的值。
 *     唯一一个有效分割位于下标 2 。
 * </pre>
 * <p>示例 2：</p>
 * <img src="https://assets.leetcode.com/uploads/2022/12/14/capture.PNG">
 * <pre>
 *     输入：nums = [4,7,15,8,3,5]
 *     输出：-1
 *     解释：上表展示了每个下标 i 处的前 i + 1 个元素的乘积、剩余元素的乘积和它们的最大公约数的值。
 *     不存在有效分割。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>n == nums.length</li>
 *     <li>1 <= n <= 10<sup>4</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>6</sup></li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/split-the-array-to-make-coprime-products/">https://leetcode.cn/problems/split-the-array-to-make-coprime-products/</a>
 */
public class Topic2584FindValidSplit {

    public int findValidSplit(int[] nums) {
        int left[] = new int[1000000], right[] = new int[1000000], count = 0;
        for (int i = 0, j, k; i < nums.length; i++, right[k]++) {
            for (j = 2, k = nums[i]; j * j <= k; j++) {
                for (; k % j == 0; k /= j) {
                    right[j]++;
                }
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 2; j * j <= nums[i]; j++) {
                for (; nums[i] % j == 0; nums[i] /= j) {
                    count += (left[j]++ > 0 ? 0 : 1) - (--right[j] > 0 ? 0 : 1);
                }
            }
            if (nums[i] > 1) {
                count += (left[nums[i]]++ > 0 ? 0 : 1) - (--right[nums[i]] > 0 ? 0 : 1);
            }
            if (count == 0) {
                return i;
            }
        }
        return -1;
    }

}
