package vip.hyzt.questions;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * <h3>954.二倍数的对数</h3>
 * <p>给定一个长度为偶数的整数数组 arr，只有对 arr 进行重组后可以满足 “对于每个 0 <=i < len(arr) / 2，都有 arr[2 * i + 1] = 2 * arr[2 * i]”时，返回 true；否则，返回 false。</p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>arr = [3,1,3,6]
 *     <strong>输出：</strong>false
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>arr = [2,1,2,6]
 *     <strong>输出：</strong>false
 * </pre>
 * <p><b>示例 3：</b></p>
 * <pre>
 *     <strong>输入：</strong>arr = [4,-2,2,-4]
 *     <strong>输出：</strong>true
 *     <strong>解释：</strong>可以用 [-2,-4] 和 [2,4] 这两组组成 [-2,-4,2,4] 或是 [2,4,-2,-4]
 * </pre>
 * <b>提示：</b>
 * <ul>
 *     <li>0 <= arr.length <= 3 * 10<sup>4</sup></li>
 *     <li>arr.length 是偶数</li>
 *     <li>-10<sup>5</sup> <= arr[i] <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode-cn.com/problems/array-of-doubled-pairs">LeetCode 954.二倍数的对数</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic954CanReorderDoubled {


    /**
     * 逐个构造 + 优先队列
     */
    static int N = 100010, M = N * 2;
    static int[] cnts = new int[M * 2];
    public static boolean queueCanReorderDoubled(int[] arr) {
        Arrays.fill(cnts, 0);
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> Math.abs(a) - Math.abs(b));
        for (int i : arr) queue.add(i);
        while (!queue.isEmpty()) {
            int x = queue.poll(), t = x * 2;
            if (cnts[x + M] != 0 && --cnts[x + M] >= 0) continue;
            cnts[t + M]++;
        }
        for (int i = 0; i < M * 2; i++) {
            if (cnts[i] != 0) return false;
        }
        return true;
    }

}
