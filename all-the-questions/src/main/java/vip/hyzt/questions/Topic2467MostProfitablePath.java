package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * <h1>2467. 树上最大得分和路径</h1>
 * <p>一个 n 个节点的无向树，节点编号为 0 到 n - 1 ，树的根结点是 0 号节点。给你一个长度为 n - 1 的二维整数数组 edges ，其中 edges[i] = [a<sup>i</sup>, b<sup>i</sup>] ，表示节点 a<sup>i</sup> 和 b<sup>i</sup> 在树中有一条边。</p>
 * <p>在每一个节点 i 处有一扇门。同时给你一个都是偶数的数组 amount ，其中 amount[i] 表示：</p>
 * <ul>
 *     <li>如果 amount[i] 的值是负数，那么它表示打开节点 i 处门扣除的分数。</li>
 *     <li>如果 amount[i] 的值是正数，那么它表示打开节点 i 处门加上的分数。</li>
 * </ul>
 * <p>游戏按照如下规则进行：</p>
 * <ul>
 *     <li>一开始，Alice 在节点 0 处，Bob 在节点 bob 处。</li>
 *     <li>每一秒钟，Alice 和 Bob <strong>分别</strong> 移动到相邻的节点。Alice 朝着某个 <strong>叶子结点</strong> 移动，Bob 朝着节点 0 移动。</li>
 *     <li>
 *         对于他们之间路径上的 <strong>每一个</strong> 节点，Alice 和 Bob 要么打开门并扣分，要么打开门并加分。注意：
 *         <ul>
 *             <li>如果门 <strong>已经打开</strong> （被另一个人打开），不会有额外加分也不会扣分。</li>
 *             <li>如果 Alice 和 Bob <strong>同时</strong> 到达一个节点，他们会共享这个节点的加分或者扣分。换言之，如果打开这扇门扣 c 分，那么 Alice 和 Bob 分别扣 c / 2 分。如果这扇门的加分为 c ，那么他们分别加 c / 2 分。</li>
 *         </ul>
 *     </li>
 *     <li>如果 Alice 到达了一个叶子结点，她会停止移动。类似的，如果 Bob 到达了节点 0 ，他也会停止移动。注意这些事件互相 <strong>独立</strong> ，不会影响另一方移动。</li>
 * </ul>
 * <p>请你返回 Alice 朝最优叶子结点移动的 <strong>最大</strong> 净得分。</p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/10/29/eg1.png">
 * <pre>
 *     输入：edges = [[0,1],[1,2],[1,3],[3,4]], bob = 3, amount = [-2,4,2,-4,6]
 *     输出：6
 *     解释：
 *     上图展示了输入给出的一棵树。游戏进行如下：
 *     - Alice 一开始在节点 0 处，Bob 在节点 3 处。他们分别打开所在节点的门。
 *       Alice 得分为 -2 。
 *     - Alice 和 Bob 都移动到节点 1 。
 *       因为他们同时到达这个节点，他们一起打开门并平分得分。
 *       Alice 的得分变为 -2 + (4 / 2) = 0 。
 *     - Alice 移动到节点 3 。因为 Bob 已经打开了这扇门，Alice 得分不变。
 *       Bob 移动到节点 0 ，并停止移动。
 *     - Alice 移动到节点 4 并打开这个节点的门，她得分变为 0 + 6 = 6 。
 *     现在，Alice 和 Bob 都不能进行任何移动了，所以游戏结束。
 *     Alice 无法得到更高分数。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/10/29/eg2.png">
 * <per>
 *     输入：edges = [[0,1]], bob = 1, amount = [-7280,2350]
 *     输出：-7280
 *     解释：
 *     Alice 按照路径 0->1 移动，同时 Bob 按照路径 1->0 移动。
 *     所以 Alice 只打开节点 0 处的门，她的得分为 -7280 。
 * </per>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= n <= 10<sup>5</sup></li>
 *     <li>edges.length == n - 1</li>
 *     <li>edges[i].length == 2</li>
 *     <li>0 <= a<sub>i</sub>, b<sub>i</sub> < n</li>
 *     <li>a<sub>i</sub> != b<sub>i</sub></li>
 *     <li>edges 表示一棵有效的树。</li>
 *     <li>1 <= bob < n</li>
 *     <li>amount.length == n</li>
 *     <li>amount[i] 是范围 [-10<sup>4</sup>, 10<sup>4</sup>] 之间的一个 <strong>偶数</strong> 。</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/most-profitable-path-in-a-tree/">https://leetcode.cn/problems/most-profitable-path-in-a-tree/</a>
 */
public class Topic2467MostProfitablePath {

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], t -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], t -> new ArrayList<>()).add(edge[0]);
        }
        int[] dist = new int[amount.length];
        mostProfitablePath(Integer.MIN_VALUE, bob, -1, dist, new boolean[amount.length], map);
        return mostProfitablePath(Integer.MIN_VALUE, 0, -1, dist, amount, map);
    }

    private boolean mostProfitablePath(int i, int bob, int j, int[] dist, boolean[] visited,
                                       HashMap<Integer, ArrayList<Integer>> map) {

        if (!visited[bob]) {

            dist[bob] = bob > 0 ? dist[bob] : i;
            for (int k : map.get(bob)) {
                dist[bob] = k != j && mostProfitablePath(i + 1, k, bob, dist, visited, map) ? i : dist[bob];
            }
        }
        return dist[bob] < 0;
    }

    private int mostProfitablePath(int i, int j, int k, int[] dist, int[] amount,
                                   HashMap<Integer, ArrayList<Integer>> map) {

        int max = Integer.MIN_VALUE;
        for (int l : map.get(j)) {
            max = Math.max(max, l == k ? Integer.MIN_VALUE : mostProfitablePath(i + 1, l, j, dist, amount, map));
        }
        return (max > Integer.MIN_VALUE ? max : 0) + (i > dist[j] ? 0 : amount[j] / (i < dist[j] ? 1 : 2));
    }

}
