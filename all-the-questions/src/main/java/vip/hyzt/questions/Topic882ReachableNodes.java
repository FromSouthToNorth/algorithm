package vip.hyzt.questions;

import java.util.*;

/**
 * <h1>882. 细分图中的可到达节点</h1>
 * <p>给你一个无向图<strong>（原始图）</strong>，图中有 n 个节点，编号从 0 到 n - 1 。你决定将图中的每条边 细分 为一条节点链，每条边之间的新节点数各不相同。</p>
 * <p>图用由边组成的二维数组 edges 表示，其中 edges[i] = [u<sub>i</sub>, v<sub>i</sub>, cnt<sub>i</sub>] 表示原始图中节点 u<sub>i</sub> 和 v<sub>i</sub> 之间存在一条边，cnt<sub>i</sub> 是将边 细分 后的新节点总数。注意，cnt<sub>i</sub> == 0 表示边不可细分。</p>
 * <p>要 细分 边 [u<sub>i</sub>, v<sub>i</sub>] ，需要将其替换为 (cnt<sub>i</sub> + 1) 条新边，和 cnt<sub>i</sub> 个新节点。新节点为 x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>cnt<sub>i</sub></sub> ，新边为 [u<sub>i</sub>, x<sub>1</sub>], [x<sub>1</sub>, x<sub>2</sub>], [x<sub>2</sub>, x<sub>3</sub>], ..., [x<sub>cnt<sub>i</sub>+1</sub>, x<sub>cnt<sub>i</sub>+1</sub>], [x<sub>cnt<sub>i</sub></sub>, v<sub>i</sub>] 。</p>
 * <p>现在得到一个 <strong>新的细分图</strong> ，请你计算从节点 0 出发，可以到达多少个节点？如果节点间距离是 maxMoves 或更少，则视为 <strong>可以到达</strong> 。</p>
 * <p>给你原始图和 maxMoves ，返回 <em>新的细分图中从节点 0 出发</em> <em><strong>可到达的节点数。</strong></em></p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/01/origfinal.png">
 * <pre>
 *     输入：edges = [[0,1,10],[0,2,1],[1,2,2]], maxMoves = 6, n = 3
 *     输出：13
 *     解释：边的细分情况如上图所示。
 *     可以到达的节点已经用黄色标注出来。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], maxMoves = 10, n = 4
 *     输出：23
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：edges = [[1,2,4],[1,4,5],[1,3,1],[2,3,4],[3,4,5]], maxMoves = 17, n = 5
 *     输出：1
 *     解释：节点 0 与图的其余部分没有连通，所以只有节点 0 可以到达。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>0 <= edges.length <= min(n * (n - 1) / 2, 10<sup>4</sup>)</li>
 *     <li>edges[i].length == 3</li>
 *     <li>0 <= u<sub>i</sub> < v<sub>i</sub> < n</li>
 *     <li>图中 <strong>不存在平行边</strong></li>
 *     <li>0 <= cnt<sub>i</sub> <= 10<sup>4</sup></li>
 *     <li>0 <= maxMoves <= 10<sup>9</sup></li>
 *     <li>1 <= n <= 3000</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/reachable-nodes-in-subdivided-graph/description/">https://leetcode.cn/problems/reachable-nodes-in-subdivided-graph/description/</a>
 */
public class Topic882ReachableNodes {

    public int reachableNodes(int[][] edges, int maxMoves, int n) {
        List<int[]>[] adList = new List[n];
        for (int i = 0; i < n; i++) {
            adList[i] = new ArrayList<int[]>();
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], nodes = edge[2];
            adList[u].add(new int[]{v, nodes});
            adList[v].add(new int[]{u, nodes});
        }
        Map<Integer, Integer> used = new HashMap<Integer, Integer>();
        Set<Integer> visited = new HashSet<Integer>();
        int reachableNodes = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0});

        while (!pq.isEmpty() && pq.peek()[0] <= maxMoves) {
            int[] pair = pq.poll();
            int step = pair[0], u = pair[1];
            if (!visited.add(u)) {
                continue;
            }
            reachableNodes++;
            for (int[] next : adList[u]) {
                int v = next[0], nodes = next[1];
                if (nodes + step + 1 <= maxMoves && !visited.contains(v)) {
                    pq.offer(new int[]{nodes + step + 1, v});
                }
                used.put(encode(u, v, n), Math.min(nodes, maxMoves - step));
            }
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], nodes = edge[2];
            reachableNodes += Math.min(nodes, used.getOrDefault(encode(u, v, n), 0) + used.getOrDefault(encode(v, u, n), 0));
        }
        return reachableNodes;
    }

    public int encode(int u, int v, int n) {
        return u * n + v;
    }

}
