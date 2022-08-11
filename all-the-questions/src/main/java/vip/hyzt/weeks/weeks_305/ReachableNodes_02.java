package vip.hyzt.weeks.weeks_305;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * <h3>6139. 受限条件下可到达节点的数目</h3>
 * <p>现有一棵由 n 个节点组成的无向树，节点编号从 0 到 n - 1 ，共有 n - 1 条边。</p>
 * <p>给你一个二维整数数组 edges ，长度为 n - 1 ，其中 edges[i] = [ai, bi] 表示树中节点 ai 和 bi 之间存在一条边。另给你一个整数数组 restricted 表示 受限 节点。</p>
 * <p>在不访问受限节点的前提下，返回你可以从节点 0 到达的 最多 节点数目。</p>
 * <p>注意，节点 0 <strong>不</strong> 会标记为受限节点。</p>
 * <h4>示例 1：</h4>
 * <img src="https://assets.leetcode.com/uploads/2022/06/15/ex1drawio.png">
 * <pre>
 *     <strong>输入：</strong>n = 7, edges = [[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]], restricted = [4,5]
 *     <strong>输出：</strong>4
 *     <strong>解释：</strong>上图所示正是这棵树。
 *     在不访问受限节点的前提下，只有节点 [0,1,2,3] 可以从节点 0 到达。
 * </pre>
 * <h4>示例 2：</h4>
 * <img src="https://assets.leetcode.com/uploads/2022/06/15/ex2drawio.png">
 * <pre>
 *     <strong>输入：</strong>n = 7, edges = [[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]], restricted = [4,2,1]
 *     <strong>输出：</strong>3
 *     <strong>解释：</strong>上图所示正是这棵树。
 *     在不访问受限节点的前提下，只有节点 [0,5,6] 可以从节点 0 到达。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>2 <= n <= 10<sup>5</sup></li>
 *     <li>edges.length == n - 1</li>
 *     <li>edges[i].length == 2</li>
 *     <li>0 <= a<sub>i</sub>, b<sub>i</sub> < n</li>
 *     <li>a<sub>i</sub> != b<sub>i</sub></li>
 *     <li>edges 表示一棵有效的树</li>
 *     <li>1 <= restricted.length < n</li>
 *     <li>1 <= restricted[i] < n</li>
 *     <li>restricted 中的所有值 <strong>互不相同</strong></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/reachable-nodes-with-restrictions">https://leetcode.cn/problems/reachable-nodes-with-restrictions</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class ReachableNodes_02 {

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        ArrayList<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            list[edge[0]].add(edge[1]);
            list[edge[1]].add(edge[0]);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int r : restricted) {
            set.add(r);
        }
        return reachableNodes(0, -1, list, set);
    }

    private int reachableNodes(int node, int parent, ArrayList<Integer>[] list, HashSet<Integer> set) {
        int count = 1;
        for (Integer i : list[node]) {
            count += i == parent || set.contains(i) ? 0 : reachableNodes(i, node, list, set);
        }
        return count;
    }

}
