package vip.hyzt.questions;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * <h2>2402. 会议室 III</h2>
 * <p>给你一个整数 n ，共有编号从 0 到 n - 1 的 n 个会议室。</p>R
 * <p>给你一个二维整数数组 meetings ，其中 meetings[i] = [start<sub>i</sub>, end<sub>i</sub>] 表示一场会议将会在 半闭 时间区间 [start<sub>i</sub>, end<sub>i</sub>) 举办。所有 start<sub>i</sub> 的值 <strong>互不相同</strong> 。</p>
 * <p>会议将会按以下方式分配给会议室：</p>
 * <ol>
 *     <li>每场会议都会在未占用且编号 <strong></strong> 的会议室举办。</li>
 *     <li>如果没有可用的会议室，会议将会延期，直到存在空闲的会议室。延期会议的持续时间和原会议持续时间 <strong>相同</strong> 。</li>
 *     <li>当会议室处于未占用状态时，将会优先提供给原 <strong>开始</strong> 时间更早的会议。</li>
 * </ol>
 * <p>返回举办最多次会议的房间 <strong>编号</strong> 。如果存在多个房间满足此条件，则返回编号 <strong>最小</strong> 的房间。</p>
 * <p><strong>半闭区间</strong> [a, b) 是 a 和 b 之间的区间，<strong>包括</strong> a 但 <strong>不包括</strong> b 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：n = 2, meetings = [[0,10],[1,5],[2,7],[3,4]]
 *     输出：0
 *     解释：
 *     - 在时间 0 ，两个会议室都未占用，第一场会议在会议室 0 举办。
 *     - 在时间 1 ，只有会议室 1 未占用，第二场会议在会议室 1 举办。
 *     - 在时间 2 ，两个会议室都被占用，第三场会议延期举办。
 *     - 在时间 3 ，两个会议室都被占用，第四场会议延期举办。
 *     - 在时间 5 ，会议室 1 的会议结束。第三场会议在会议室 1 举办，时间周期为 [5,10) 。
 *     - 在时间 10 ，两个会议室的会议都结束。第四场会议在会议室 0 举办，时间周期为 [10,11) 。
 *     会议室 0 和会议室 1 都举办了 2 场会议，所以返回 0 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：n = 3, meetings = [[1,20],[2,10],[3,5],[4,9],[6,8]]
 *     输出：1
 *     解释：
 *     - 在时间 1 ，所有三个会议室都未占用，第一场会议在会议室 0 举办。
 *     - 在时间 2 ，会议室 1 和 2 未占用，第二场会议在会议室 1 举办。
 *     - 在时间 3 ，只有会议室 2 未占用，第三场会议在会议室 2 举办。
 *     - 在时间 4 ，所有三个会议室都被占用，第四场会议延期举办。
 *     - 在时间 5 ，会议室 2 的会议结束。第四场会议在会议室 2 举办，时间周期为 [5,10) 。
 *     - 在时间 6 ，所有三个会议室都被占用，第五场会议延期举办。
 *     - 在时间 10 ，会议室 1 和 2 的会议结束。第五场会议在会议室 1 举办，时间周期为 [10,12) 。
 *     会议室 1 和会议室 2 都举办了 2 场会议，所以返回 1 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= n <= 100</li>
 *     <li>1 <= meetings.length <= 10<sup>5</sup></li>
 *     <li>meetings[i].length == 2</li>
 *     <li>0 <= start<sub>i</sub> < end<sub>i</sub> <= 5 * 10<sup>5</sup></li>
 *     <li>start<sub>i</sub> 的所有值 互不相同</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/meeting-rooms-iii">https://leetcode.cn/problems/meeting-rooms-iii</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2402MostBooked {

    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (o, p) -> o[0] - p[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }
        int counts[] = new int[n], result = 0;
        PriorityQueue<int[]> time = new PriorityQueue<>((o, p) -> o[0] == p[0] ? o[1] - p[1] : o[0] - p[0]);
        for (int[] meeting : meetings) {
            while (!time.isEmpty() && time.peek()[0] <= meeting[0]) {
                queue.offer(time.poll()[1]);
            }
            if (queue.isEmpty()) {
                int[] poll = time.poll();
                counts[poll[1]]++;
                time.offer(new int[] { meeting[1] - meeting[0] + poll[0], poll[1] });
            }
            else {
                int poll = queue.poll();
                counts[poll]++;
                time.offer(new int[] { meeting[1], poll });
            }
        }
        for (int i = 1; i < n; i++) {
            if (counts[i] > counts[result]) {
                result = i;
            }
        }
        return result;
    }


}
