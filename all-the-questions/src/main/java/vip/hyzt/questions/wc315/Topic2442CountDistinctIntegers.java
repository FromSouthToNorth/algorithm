package vip.hyzt.questions.wc315;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>6205. 反转之后不同整数的数目</h1>
 * <p>给你一个由 <strong>正</strong> 整数组成的数组 nums 。</p>
 * <p>你必须取出数组中的每个整数，<strong>反转其中每个数位</strong>，并将反转后得到的数字添加到数组的末尾。这一操作只针对 nums 中原有的整数执行。</p>
 * <p>返回结果数组中 <strong>不同</strong> 整数的数目。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [1,13,10,12,31]
 *     输出：6
 *     解释：反转每个数字后，结果数组是 [1,13,10,12,31,1,31,1,21,13] 。
 *     反转后得到的数字添加到数组的末尾并按斜体加粗表示。注意对于整数 10 ，反转之后会变成 01 ，即 1 。
 *     数组中不同整数的数目为 6（数字 1、10、12、13、21 和 31）。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [2,2,2]
 *     输出：1
 *     解释：反转每个数字后，结果数组是 [2,2,2,2,2,2] 。
 *     数组中不同整数的数目为 1（数字 2）。
 * </pre>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>1 <= nums[i] <= 10<sup>6</sup></li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * const countDistinctIntegers = function(nums) {
 *   const set = new Set();
 *   for (const num of nums) {
 *     set.add(num);
 *     set.add(Number((''+num).split('').reverse().join('')));
 *   }
 *   return set.size;
 * }
 * const nums = [[1,13,10,12,31],[2,2,2],[2,15,51,66,77,90]];
 * for (let num of nums) {
 *   console.log("%s 反转之后不同整数的数目: %d\n", num, countDistinctIntegers(num));
 * }
 * </pre>
 * @see <a href="https://leetcode.cn/problems/count-number-of-distinct-integers-after-reverse-operations/">https://leetcode.cn/problems/count-number-of-distinct-integers-after-reverse-operations/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2442CountDistinctIntegers {

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(Integer.parseInt("" + new StringBuilder("" + num).reverse()));
        }
        return set.size();
    }

}
