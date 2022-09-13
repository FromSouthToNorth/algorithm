package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>670. 最大交换</h2>
 * <p>给定一个非负整数，你 <strong>至多</strong> 可以交换一次数字中的任意两位。返回你能得到的最大值。</p>
 * <h3>示例 1 :</h3>
 * <pre>
 *     输入: 2736
 *     输出: 7236
 *     解释: 交换数字2和数字7。
 * </pre>
 * <h3>示例 2 :</h3>
 * <per>
 *     输入: 9973
 *     输出: 9973
 *     解释: 不需要交换。
 * </per>
 * <h3>注意:</h3>
 * <ol>
 *     <li>给定数字的范围是 [0, 10<sup>8</sup>]</li>
 * </ol>
 * @see <a href="https://leetcode.cn/problems/maximum-swap/">https://leetcode.cn/problems/maximum-swap/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic670MaximumSwap {

    public int maximumSwap(int num) {
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        int n = list.size(), res = 0;
        int[] idx = new int[n];
        for (int i = 0, j = 0; i < n; i++) {
            if (list.get(i) > list.get(j)) {
                j = i;
            }
            idx[i] = j;
        }
        for (int i = n - 1; i >= 0; i--) {
            int index= idx[i];
            if (!list.get(index).equals(list.get(i))) {
                int c = list.get(index);
                list.set(index, list.get(i));
                list.set(i, c);
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            res = res * 10 + list.get(i);
        }
        return res;
    }

}
