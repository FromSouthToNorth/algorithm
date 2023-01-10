package vip.hyzt.questions;

import java.util.PriorityQueue;

/**
 * <h1>2532. 过桥的时间</h1>
 * <p>共有 k 位工人计划将 n 个箱子从旧仓库移动到新仓库。给你两个整数 n 和 k，以及一个二维整数数组 time ，数组的大小为 k x 4 ，其中 time[i] = [leftToRight<sub>i</sub>, pickOld<sub>i</sub>, rightToLeft<sub>i</sub>, putNew<sub>i</sub>] 。</p>
 * <p>一条河将两座仓库分隔，只能通过一座桥通行。旧仓库位于河的右岸，新仓库在河的左岸。开始时，所有 k 位工人都在桥的左侧等待。为了移动这些箱子，第 i 位工人（下标从 <strong>0</strong> 开始）可以：</p>
 * <ul>
 *     <li>从左岸（新仓库）跨过桥到右岸（旧仓库），用时 leftToRight<sub>i</sub> 分钟。</li>
 *     <li>从旧仓库选择一个箱子，并返回到桥边，用时 pickOld<sub>i</sub> 分钟。不同工人可以同时搬起所选的箱子。</li>
 *     <li>从右岸（旧仓库）跨过桥到左岸（新仓库），用时 rightToLeft<sub>i</sub> 分钟。</li>
 *     <li>将箱子放入新仓库，并返回到桥边，用时 putNew<sub>i</sub> 分钟。不同工人可以同时放下所选的箱子。</li>
 * </ul>
 * <p>如果满足下面任一条件，则认为工人 i 的 效率低于 工人 j ：</p>
 * <ul>
 *     <li>leftToRight<sub>i</sub + rightToLeft<sub>i</sub > leftToRight<sub>j</sub> + rightToLeft<sub>j</sub></li>
 *     <li>leftToRight<sub>i</sub + rightToLeft<sub>i</sub == leftToRight<sub>j</sub> + rightToLeft<sub>j</sub> 且 i > j</li>
 * </ul>
 * <p>工人通过桥时需要遵循以下规则：</p>
 * <ul>
 *     <li>如果工人 x 到达桥边时，工人 y 正在过桥，那么工人 x 需要在桥边等待。</li>
 *     <li>如果没有正在过桥的工人，那么在桥右边等待的工人可以先过桥。如果同时有多个工人在右边等待，那么 效率最低 的工人会先过桥。</li>
 *     <li>如果没有正在过桥的工人，且桥右边也没有在等待的工人，同时旧仓库还剩下至少一个箱子需要搬运，此时在桥左边的工人可以过桥。如果同时有多个工人在左边等待，那么 效率最低 的工人会先过桥。</li>
 * </ul>
 * <p>所有 n 个盒子都需要放入新仓库，请你返回最后一个搬运箱子的工人 <strong>到达河左岸</strong> 的时间。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：n = 1, k = 3, time = [[1,1,2,1],[1,1,3,1],[1,1,4,1]]
 *     输出：6
 *     解释：
 *     从 0 到 1 ：工人 2 从左岸过桥到达右岸。
 *     从 1 到 2 ：工人 2 从旧仓库搬起一个箱子。
 *     从 2 到 6 ：工人 2 从右岸过桥到达左岸。
 *     从 6 到 7 ：工人 2 将箱子放入新仓库。
 *     整个过程在 7 分钟后结束。因为问题关注的是最后一个工人到达左岸的时间，所以返回 6 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 3, k = 2, time = [[1,9,1,8],[10,10,10,10]]
 *     输出：50
 *     解释：
 *     从 0 到 10 ：工人 1 从左岸过桥到达右岸。
 *     从 10 到 20 ：工人 1 从旧仓库搬起一个箱子。
 *     从 10 到 11 ：工人 0 从左岸过桥到达右岸。
 *     从 11 到 20 ：工人 0 从旧仓库搬起一个箱子。
 *     从 20 到 30 ：工人 1 从右岸过桥到达左岸。
 *     从 30 到 40 ：工人 1 将箱子放入新仓库。
 *     从 30 到 31 ：工人 0 从右岸过桥到达左岸。
 *     从 31 到 39 ：工人 0 将箱子放入新仓库。
 *     从 39 到 40 ：工人 0 从左岸过桥到达右岸。
 *     从 40 到 49 ：工人 0 从旧仓库搬起一个箱子。
 *     从 49 到 50 ：工人 0 从右岸过桥到达左岸。
 *     从 50 到 58 ：工人 0 将箱子放入新仓库。
 *     整个过程在 58 分钟后结束。因为问题关注的是最后一个工人到达左岸的时间，所以返回 50 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n, k <= 10<sup>4</sup></li>
 *     <li>time.length == k</li>
 *     <li>time[i].length == 4</li>
 *     <li>1 <= leftToRight<sub>i</sub>, pickOld<sub>i</sub>, rightToLeft<sub>i</sub>, putNew<sub>i</sub> <= 1000</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/time-to-cross-a-bridge/">https://leetcode.cn/problems/time-to-cross-a-bridge/</a>
 */
public class Topic2532FindCrossingTime {

    public int findCrossingTime(int n, int k, int[][] time) {
        PriorityQueue<Integer> left = new PriorityQueue<>(
                (o, p) -> time[o][0] + time[o][2] == time[p][0] + time[p][2] ? p - o
                        : time[p][0] + time[p][2] - time[o][0] - time[o][2]),
                right = new PriorityQueue<>((o, p) -> time[o][0] + time[o][2] == time[p][0] + time[p][2] ? p - o
                        : time[p][0] + time[p][2] - time[o][0] - time[o][2]);
        PriorityQueue<int[]> left2 = new PriorityQueue<>((o, p) -> o[0] - p[0]),
                right2 = new PriorityQueue<>((o, p) -> o[0] - p[0]);
        for (int i = 0; i < time.length; i++) {
            left.offer(i);
        }
        int max = 0;
        for (int i = 0; n > 0 || !right.isEmpty()
                || !right2.isEmpty(); i = n > 0 && (!left.isEmpty() || !left2.isEmpty() && left2.peek()[0] <= i)
                || !right.isEmpty() || !right2.isEmpty() && right2.peek()[0] <= i ? i
                : Math.min(n == 0 || left2.isEmpty() ? Integer.MAX_VALUE : left2.peek()[0],
                right2.isEmpty() ? Integer.MAX_VALUE : right2.peek()[0])) {
            for (; !left2.isEmpty() && left2.peek()[0] <= i; left.offer(left2.poll()[1])) {
            }
            for (; !right2.isEmpty() && right2.peek()[0] <= i; right.add(right2.poll()[1])) {
            }
            if (right.isEmpty()) {
                n--;
                right2.add(new int[] { (i += time[left.peek()][0]) + time[left.peek()][1], left.poll() });
            } else if (n == 0) {
                max = Math.max(max, i += time[right.poll()][2]);
            } else {
                left2.add(new int[] { (i += time[right.peek()][2]) + time[right.peek()][3], right.poll() });
            }
        }
        return max;
    }

}
