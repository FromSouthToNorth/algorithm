package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Map;

/**
 * <h1>907. 子数组的最小值之和</h1>
 * <p>给定一个整数数组 arr，找到 min(b) 的总和，其中 b 的范围为 arr 的每个（连续）子数组。</p>
 * <p>由于答案可能很大，因此 返回答案模 10^9 + 7 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：arr = [3,1,2,4]
 *     输出：17
 *     解释：
 *     子数组为 [3]，[1]，[2]，[4]，[3,1]，[1,2]，[2,4]，[3,1,2]，[1,2,4]，[3,1,2,4]。
 *     最小值为 3，1，2，4，1，1，2，1，1，1，和为 17。
 * </pre>
 * <h2>示例 2：</h2>
 * <per>
 *     输入：arr = [11,81,94,43,3]
 *     输出：444
 * </per>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= arr.length <= 3 * 10<sup>4</sup></li>
 *     <li>1 <= arr[i] <= 3 * 10<sup>4</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/sum-of-subarray-minimums/">https://leetcode.cn/problems/sum-of-subarray-minimums/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic907SumSubarrayMins {

    private static final int MOD = 1000000007;

    public int sumSubarrayMins(int[] arr) {
        int length = arr.length;
//        long res = 0L;
//        for (int i = 0; i < length; i++) {
//            int min = arr[i];
//            for (int j = i; j < length; j++) {
//                min = Math.min(min, arr[j]);
//                res = (res + min) % MOD;
//            }
//        }
//        return (int) res;

        int[] left = new int[length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for (int i = 0; i < length; i++) {
            while (stack.size() > 1 && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.peek();
            stack.push(i);
        }
        int[] right = new int[length];
        stack.clear();
        stack.push(length);
        for (int i = length - 1; i >= 0; i--) {
            while (stack.size() > 1 && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            right[i] = stack.peek();
            stack.push(i);
        }
        long res = 0L;
        for (int i = 0; i < length; i++) {
            res += (long) arr[i] * (i - left[i]) * (right[i] - i);
        }
        return (int) (res % MOD);
    }

}
