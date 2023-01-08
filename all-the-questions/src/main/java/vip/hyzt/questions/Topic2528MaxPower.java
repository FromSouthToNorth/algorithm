package vip.hyzt.questions;

import java.util.ArrayDeque;

/**
 * <h1>2528. 最大化城市的最小供电站数目</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始长度为 n 的整数数组 stations ，其中 stations[i] 表示第 i 座城市的供电站数目。</p>
 * <p>每个供电站可以在一定 <strong>范围</strong> 内给所有城市提供电力。换句话说，如果给定的范围是 r ，在城市 i 处的供电站可以给所有满足 |i - j| <= r 且 0 <= i, j <= n - 1 的城市 j 供电。</p>
 * <ul>
 *     <li>|x| 表示 x 的 绝对值 。比方说，|7 - 5| = 2 ，|3 - 10| = 7 。</li>
 * </ul>
 * <p>一座城市的 <strong>电量</strong> 是所有能给它供电的供电站数目。</p>
 * <p>政府批准了可以额外建造 k 座供电站，你需要决定这些供电站分别应该建在哪里，这些供电站与已经存在的供电站有相同的供电范围。</p>
 * <p>给你两个整数 r 和 k ，如果以最优策略建造额外的发电站，返回所有城市中，最小供电站数目的最大值是多少。</p>
 * <p>这 k 座供电站可以建在多个城市。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：stations = [1,2,4,5,0], r = 1, k = 2
 *     输出：5
 *     解释：
 *     最优方案之一是把 2 座供电站都建在城市 1 。
 *     每座城市的供电站数目分别为 [1,4,4,5,0] 。
 *     - 城市 0 的供电站数目为 1 + 4 = 5 。
 *     - 城市 1 的供电站数目为 1 + 4 + 4 = 9 。
 *     - 城市 2 的供电站数目为 4 + 4 + 5 = 13 。
 *     - 城市 3 的供电站数目为 5 + 4 = 9 。
 *     - 城市 4 的供电站数目为 5 + 0 = 5 。
 *     供电站数目最少是 5 。
 *     无法得到更优解，所以我们返回 5 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：stations = [4,4,4,4], r = 0, k = 3
 *     输出：4
 *     解释：
 *     无论如何安排，总有一座城市的供电站数目是 4 ，所以最优解是 4 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>n == stations.length</li>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 *     <li>0 <= stations[i] <= 10<sup>5</sup></li>
 *     <li>0 <= r <= n - 1</li>
 *     <li>0 <= k <= 10<sup>9</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximize-the-minimum-powered-city/">https://leetcode.cn/problems/maximize-the-minimum-powered-city/</a>
 */
public class Topic2528MaxPower {

    public long maxPower(int[] stations, int r, int k) {
        long pre[] = new long[stations.length + r * 2 + 1],
                left = 0, right = 110_000_000_000L;
        for (int i = 0; i < stations.length; i++) {
            pre[i + r + 1] = pre[i + r] + stations[i];
        }
        for (int i = stations.length + r + 1; i < pre.length; i++) {
            pre[i] = pre[i - 1];
        }
        while (left < right) {
            long mid = (left + right + 1) / 2;
            if (maxPower(mid, pre, r, k, new ArrayDeque<>(), 0)) {
                left = mid;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    private boolean maxPower(long mid, long[] pre, int r, long k, ArrayDeque<long[]> deque, long sum) {
        for (int i = r + 1; i < pre.length - r; i++) {
            while (!deque.isEmpty() && deque.peek()[0] < i - r) {
                sum -= deque.remove()[1];
            }
            if (pre[i + r] - pre[i - r - 1] + sum < mid) {
                if ((k -= mid - pre[i + r] + pre[i - r - 1] - sum) < 0) {
                    return false;
                }
                deque.offer(new long[] {i + r, -sum + (sum = mid - pre[i + r] + pre[i - r - 1])});
            }
        }
        return true;
    }

}
