package vip.hyzt.questions;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * <h2>面试题 17.09. 第 k 个数</h2>
 * <p>有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。注意，不是必须有这些素因子，而是必须不包含其他的素因子。例如，前几个数按顺序应该是 1，3，5，7，9，15，21。</p>
 * <h3>示例 1:</h3>
 * <pre>
 *     输入: k = 5
 *
 *     输出: 9
 * </pre>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/get-kth-magic-number-lcci">https://leetcode.cn/problems/get-kth-magic-number-lcci</a>
 */
public class TopicInterview17_09GetKthMagicNumber {

    public int getKthMagicNumber(int k) {
//        int[] nums = new int[]{3, 5, 7};
//        PriorityQueue<Long> queue = new PriorityQueue<>();
//        Set<Long> set = new HashSet<>();
//        queue.add(1L);
//        set.add(1L);
//        while (!queue.isEmpty()) {
//            long t = queue.poll();
//            if (--k == 0) {
//                return (int) t;
//            }
//            for (int num : nums) {
//                if (!set.contains(num * t)) {
//                    queue.add(num * t);
//                    set.add(num * t);
//                }
//            }
//        }
//        return -1;

        int[] res = new int[k + 1];
        res[1] = 1;
        for (int i3 = 1, i5 = 1, i7 = 1, idx = 2; idx <= k; idx++) {
            int a = res[i3] * 3, b = res[i5] * 5, c = res[i7] * 7;
            int min = Math.min(a, Math.min(b, c));
            if (min == a) {
                i3++;
            }
            if (min == b) {
                i5++;
            }
            if (min == c) {
                i7++;
            }
            res[idx] = min;
        }
        return res[k];
    }

}
