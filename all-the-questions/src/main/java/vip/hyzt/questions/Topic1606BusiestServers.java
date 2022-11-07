package vip.hyzt.questions;

import java.util.*;

/**
 * <h3>1606.找到处理请求最多的服务器</h3>
 * <p>你有 k个服务器，编号为 0到 k-1，它们可以同时处理多个请求组。每个服务器有无穷的计算能力但是 不能同时处理超过一个请求。请求分配到服务器的规则如下：</p>
 * <ul>
 *     <li>第 i （序号从 0 开始）个请求到达。</li>
 *     <li>如果所有服务器都已被占据，那么该请求被舍弃（完全不处理）。</li>
 *     <li>如果第 (i % k) 个服务器空闲，那么对应服务器会处理该请求。</li>
 *     <li>否则，将请求安排给下一个空闲的服务器（服务器构成一个环，必要的话可能从第 0 个服务器开始继续找下一个空闲的服务器）。比方说，如果第 i 个服务器在忙，那么会查看第 (i+1) 个服务器，第 (i+2) 个服务器等等。</li>
 * </ul>
 * <p>给你一个 严格递增 的正整数数组 arrival ，表示第 i 个任务的到达时间，和另一个数组 load ，其中 load[i] 表示第 i 个请求的工作量（也就是服务器完成它所需要的时间）。你的任务是找到 最繁忙的服务器 。最繁忙定义为一个服务器处理的请求数是所有服务器里最多的。</p>
 *
 * <p>请你返回包含所有 最繁忙服务器 序号的列表，你可以以任意顺序返回这个列表。</p>
 * <p><b>示例 1：</b></p>
 * <img src=https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/03/load-1.png>
 * <pre>
 *     <strong>输入：</strong>k = 3, arrival = [1,2,3,4,5], load = [5,2,3,3,3]
 *     <strong>输出：</strong>[1]
 *     <strong>解释：</strong>
 *     所有服务器一开始都是空闲的。
 *     前 3 个请求分别由前 3 台服务器依次处理。
 *     请求 3 进来的时候，服务器 0 被占据，所以它呗安排到下一台空闲的服务器，也就是服务器 1 。
 *     请求 4 进来的时候，由于所有服务器都被占据，该请求被舍弃。
 *     服务器 0 和 2 分别都处理了一个请求，服务器 1 处理了两个请求。所以服务器 1 是最忙的服务器。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>k = 3, arrival = [1,2,3,4], load = [1,2,1,2]
 *     <strong>输出：</strong>[0]
 *     <strong>解释：</strong>
 *     前 3 个请求分别被前 3 个服务器处理。
 *     请求 3 进来，由于服务器 0 空闲，它被服务器 0 处理。
 *     服务器 0 处理了两个请求，服务器 1 和 2 分别处理了一个请求。所以服务器 0 是最忙的服务器。
 * </pre>
 * <p><b>示例 3：</b></p>
 * <pre>
 *     <strong>输入：</strong>k = 3, arrival = [1,2,3,4], load = [1,2,1,2]
 *     <strong>输出：</strong>[0,1,2]
 *     <strong>解释：</strong>每个服务器分别处理了一个请求，所以它们都是最忙的服务器。
 * </pre>
 * <p><b>示例 4：</b></p>
 * <pre>
 *     <strong>输入：</strong>k = 3, arrival = [1,2,3,4,8,9,10], load = [5,2,10,3,1,2,2]
 *     <strong>输出：</strong>[1]
 * </pre>
 * <p><b>示例 5：</b></p>
 * <pre>
 *     <strong>输入：</strong>k = 1, arrival = [1], load = [1]
 *     <strong>输出：</strong>[0]
 * </pre>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/find-servers-that-handled-most-number-of-requests">1606.找到处理请求最多的服务器</a>
 */
public abstract class Topic1606BusiestServers {

    static int N = 100010;
    static int[] cnts = new int[N];

    public static List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        Arrays.fill(cnts, 0);
        int n = arrival.length, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> busy = new PriorityQueue<>((a, b)->a[1]-b[1]);
        TreeSet<Integer> free = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            free.add(i);
        }
        for (int i = 0; i < n; i++) {
            int start = arrival[i], end = start + load[i];
            while (!busy.isEmpty() && busy.peek()[1] <= start) {
                free.add(busy.poll()[0]);
            }
            Integer u = free.ceiling(i % k);
            if (u == null) {
                u = free.ceiling(0);
            }
            if (u == null) {
                continue;
            }
            free.remove(u);
            busy.add(new int[] {u, end});
            max = Math.max(max, ++cnts[u]);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (cnts[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
//leetcode submit region end(Prohibit modification and deletion)
}
