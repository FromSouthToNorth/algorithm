package vip.hyzt.questions;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * <h1>2497. 图中最大星和</h1>
 * <p>给你一个 n 个点的无向图，节点从 0 到 n - 1 编号。给你一个长度为 n 下标从 <strong>0</strong> 开始的整数数组 vals ，其中 vals[i] 表示第 i 个节点的值。</p>
 * <p>同时给你一个二维整数数组 edges ，其中 edges[i] = [a<sub>i</sub>, b<sub>i</sub>] 表示节点 a<sub>i</sub> 和 b<sub>i</sub> 之间有一条双向边。</p>
 * <p><strong>星图</strong> 是给定图中的一个子图，它包含一个中心节点和 0 个或更多个邻居。换言之，星图是给定图中一个边的子集，且这些边都有一个公共节点。</p>
 * <p>下图分别展示了有 3 个和 4 个邻居的星图，蓝色节点为中心节点。</p>
 * <img src="https://assets.leetcode.com/uploads/2022/11/07/max-star-sum-descdrawio.png">
 * <p><strong>星和</strong> 定义为星图中所有节点值的和。</p>
 * <p>给你一个整数 k ，请你返回 <strong>至多</strong> 包含 k 条边的星图中的 <strong>最大星和</strong> 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/11/07/max-star-sum-example1drawio.png">
 * <pre>
 *     输入：vals = [1,2,3,4,10,-10,-20], edges = [[0,1],[1,2],[1,3],[3,4],[3,5],[3,6]], k = 2
 *     输出：16
 *     解释：上图展示了输入示例。
 *     最大星和对应的星图在上图中用蓝色标出。中心节点是 3 ，星图中还包含邻居 1 和 4 。
 *     无法得到一个和大于 16 且边数不超过 2 的星图。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：vals = [-5], edges = [], k = 0
 *     输出：-5
 *     解释：只有一个星图，就是节点 0 自己。
 *     所以我们返回 -5 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>n == vals.length</li>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 *     <li>-10<sup>4</sup> <= vals[i] <= 10<sup>4</sup></li>
 *     <li>0 <= edges.length <= min(n * (n - 1) / 2, 10<sup>5</sup>)</li>
 *     <li>edges[i].length == 2</li>
 *     <li>0 <= a<sub>i</sub>, b<sub>i</sub> <= n - 1</li>
 *     <li>a<sub>i</sub> != b<sub>i</sub></li>
 *     <li>0 <= k <= n - 1</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximum-star-sum-of-a-graph/">https://leetcode.cn/problems/maximum-star-sum-of-a-graph/</a>
 */
public class Topic2497MaxStarSum {

    public int maxStarSum(int[] vals, int[][] edges, int k) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], t -> new PriorityQueue<>()).offer(-vals[edge[1]]);
            map.computeIfAbsent(edge[1], t -> new PriorityQueue<>()).offer(-vals[edge[0]]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < k && map.containsKey(i) && !map.get(i).isEmpty() && map.get(i).peek() < 0; j++) {
                vals[i] -= map.get(i).poll();
            }
            max = Math.max(max, vals[i]);
        }
        return max;
    }

}
