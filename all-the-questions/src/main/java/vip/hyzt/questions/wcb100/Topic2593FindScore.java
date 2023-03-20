package vip.hyzt.questions.wcb100;

import java.util.TreeSet;

/**
 * <h1>2593. 标记所有元素后数组的分数</h1>
 * <p></p>
 * <p>给你一个数组 nums ，它包含若干正整数。</p>
 * <p>一开始分数 score = 0 ，请你按照下面算法求出最后分数：</p>
 * <ul>
 *     <li>从数组中选择最小且没有被标记的整数。如果有相等元素，选择下标最小的一个。</li>
 *     <li>将选中的整数加到 score 中。</li>
 *     <li>标记 <strong>被选中元素</strong>，如果有相邻元素，则同时标记 <strong>与它相邻的两个元素</strong> 。</li>
 *     <li>重复此过程直到数组中所有元素都被标记。</li>
 * </ul>
 * <p>请你返回执行上述算法后最后的分数。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *    输入：nums = [2,1,3,4,5,2]
 *    输出：7
 *    解释：我们按照如下步骤标记元素：
 *    - 1 是最小未标记元素，所以标记它和相邻两个元素：[<strong><em>2,1,3</em></strong>,4,5,2] 。
 *    - 2 是最小未标记元素，所以标记它和左边相邻元素：[<strong><em>2,1,3</em></strong>,4,<strong><em>5,2</em></strong>] 。
 *    - 4 是仅剩唯一未标记的元素，所以我们标记它：[<strong><em>2,1,3,5,2</em></strong>] 。
 *    总得分为 1 + 2 + 4 = 7 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [2,3,5,1,3,2]
 *     输出：5
 *     解释：我们按照如下步骤标记元素：
 *     - 1 是最小未标记元素，所以标记它和相邻两个元素：[2,3,<strong><em>5,1,3</em></strong>,2] 。
 *     - 2 是最小未标记元素，由于有两个 2 ，我们选择最左边的一个 2 ，也就是下标为 0 处的 2 ，以及它右边相邻的元素：[<strong><em>2,3,5,1,3</em></strong>,2] 。
 *     - 2 是仅剩唯一未标记的元素，所以我们标记它：[<strong><em>2,3,5,1,3,2</em></strong>] 。
 *     总得分为 1 + 2 + 2 = 5 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>6</sup></li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-score-of-an-array-after-marking-all-elements/description/">https://leetcode.cn/problems/find-score-of-an-array-after-marking-all-elements/description/</a>
 */
public class Topic2593FindScore {

    public long findScore(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>((o, p) -> nums[o] == nums[p] ? o - p : nums[o] - nums[p]);
        for (int i = 0; i < nums.length; i++) {
            set.add(i);
        }
        long sum = 0;
        for (Integer i : set) {
            if (nums[i] > 0) {
                sum += nums[i];
                nums[i > 0 ? i - 1 : i] = nums[i < nums.length - 1 ? i + 1 : i] = 0;
            }
        }
        return sum;
    }

}
