package vip.hyzt.questions;

import java.util.*;

/**
 * <h2>2421. 好路径的数目</h2>
 * <p>给你一棵 n 个节点的树（连通无向无环的图），节点编号从 0 到 n - 1 且恰好有 n - 1 条边。</p>
 * <p>给你一个长度为 n 下标从 <strong>0</strong> 开始的整数数组 vals ，分别表示每个节点的值。同时给你一个二维整数数组 edges ，其中 edges[i] = [ai, bi] 表示节点 ai 和 bi 之间有一条 <strong>无向</strong> 边。</p>
 * <p>一条 <strong>好路径</strong> 需要满足以下条件：</p>
 * <ol>
 *     <li>开始节点和结束节点的值 <strong>相同</strong> 。</li>
 *     <li>开始节点和结束节点中间的所有节点值都 <strong>小于等于</strong> 开始节点的值（也就是说开始节点的值应该是路径上所有节点的最大值）。</li>
 * </ol>
 * <p>请你返回不同好路径的数目。</p>
 * <p>注意，一条路径和它反向的路径算作 <strong>同一</strong> 路径。比方说， 0 -> 1 与 1 -> 0 视为同一条路径。单个节点也视为一条合法路径。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/08/04/f9caaac15b383af9115c5586779dec5.png">
 * <pre>
 *     输入：vals = [1,3,2,1,3], edges = [[0,1],[0,2],[2,3],[2,4]]
 *     输出：6
 *     解释：总共有 5 条单个节点的好路径。
 *     还有 1 条好路径：1 -> 0 -> 2 -> 4 。
 *     （反方向的路径 4 -> 2 -> 0 -> 1 视为跟 1 -> 0 -> 2 -> 4 一样的路径）
 *     注意 0 -> 2 -> 3 不是一条好路径，因为 vals[2] > vals[0] 。
 * </pre>
 * <h3>示例 2：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/08/04/149d3065ec165a71a1b9aec890776ff.png">
 * <pre>
 *     输入：vals = [1,1,2,2,3], edges = [[0,1],[1,2],[2,3],[2,4]]
 *     输出：7
 *     解释：总共有 5 条单个节点的好路径。
 *     还有 2 条好路径：0 -> 1 和 2 -> 3 。
 * </pre>
 * <h3>示例 3：</h3>
 * <img src="https://assets.leetcode.com/uploads/2022/08/04/31705e22af3d9c0a557459bc7d1b62d.png">
 * <pre>
 *     输入：vals = [1], edges = []
 *     输出：1
 *     解释：这棵树只有一个节点，所以只有一条好路径。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>n == vals.length</li>
 *     <li>1 <= n <= 3 * 10<sup>4</sup></li>
 *     <li>0 <= vals[i] <= 10<sup>5</sup></li>
 *     <li>edges.length == n - 1</li>
 *     <li>edges[i].length == 2</li>
 *     <li>0 <= a<sub>i</sub>, b<sub>i</sub> < n</li>
 *     <li>a<sub>i</sub> != b<sub>i</sub></li>
 *     <li>edges 表示一棵合法的树。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/number-of-good-paths">https://leetcode.cn/problems/number-of-good-paths</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2421NumberOfGoodPaths {

    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        Arrays.sort(edges, (o, p) -> Math.max(vals[o[0]], vals[o[1]]) - Math.max(vals[p[0]], vals[p[1]]));
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for (int i = 0; i < vals.length; i++) {
            map.computeIfAbsent(vals[i], t -> new ArrayList<>()).add(i);
        }
        UF uf = new UF(vals.length);
        int result = 0, i = 0;
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            for (; i < edges.length && Math.max(vals[edges[i][0]], vals[edges[i][1]]) == entry.getKey(); i++) {
                uf.union(edges[i][0], edges[i][1]);
            }
            HashMap<Integer, Integer> count = new HashMap<>();
            for (Integer j : entry.getValue()) {
                int key = uf.find(j);
                count.put(key, count.getOrDefault(key, 0) + 1);
                result += count.get(key);
            }
        }
        return result;
    }

    class UF {
        private int[] parent, rank;

        private UF(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        private int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        private void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) {
                return;
            }
            if (rank[rootP] < rank[rootQ]) {
                parent[rootP] = rootQ;
            }
            else if (rank[rootP] > rank[rootQ]) {
                parent[rootQ] = rootP;
            }
            else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
        }
    }

}
