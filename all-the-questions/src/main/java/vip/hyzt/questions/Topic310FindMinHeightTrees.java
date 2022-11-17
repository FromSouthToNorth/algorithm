package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>310.最小高度树</h3>
 * <p>树是一个无向图，其中任何两个顶点只通过一条路径连接。换句话说，一个任何没有简单环路的联通图都是一颗树。</p>
 * <p>给你一棵包含 `n` 各节点的树，标记为 `0` 到 `n - 1`。给定数字 `n` 和一个有 `n - 1` 条无向边的 `edges` 列表（每一个边都是一对标签），其中 `edges[i] = [a<sub>i</sub>, b<sub>i</sub>]` 表示树中节点 `a<sub>i</sub>` 和 `b<sub>i</sub>` 之间存在一条无向边。</p>
 * <p>可选择树中任何一个节点作为根。当选择节点 `x` 作为根节点时，设结果树的高度为 `h` 。在所有可能的树中，具有最小高度的树（即，`min(h)`）被称为 <b>最小高度树</b>。</p>
 * <p>请你找到所有的 <b>最小高度树</b> 并按 <b>任意顺序</b> 返回它们的根节点标签列表。</p>
 * <p>树的 <b>高度</b> 是指根节点和叶子节点之间最长向下路径上边的数量。</p>
 * <p><b>示例 1：</b></p>
 * <img src="https://assets.leetcode.com/uploads/2020/09/01/e1.jpg">
 * <pre>
 *     <strong>输入：</strong>n = 4, edges = [[1,0],[1,2],[1,3]]
 *     <strong>输出：</strong>[1]
 *     <strong>解释：</strong>如图所示，当根是标签为 1 的节点时，树的高度是 1 ，这是唯一的最小高度树。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <img src="https://assets.leetcode.com/uploads/2020/09/01/e2.jpg">
 * <pre>
 *     <strong>输入：</strong>n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
 *     <strong>输出：</strong>[3,4]
 * </pre>
 * <p><b>提示：</b></p>
 * <ul>
 *     <li>`1 <= n <= 2 * 104`</li>
 *     <li>`edges.length == n - 1`</li>
 *     <li>`0 <= ai, bi < n`</li>
 *     <li>`ai != bi`</li>
 *     <li>所有 `(ai, bi)` 互不相同</li>
 *     <li>给定的输入 <b>保证</b> 是一棵树，并且 <b>不会有重复的边</b></li>
 * </ul>
 * @see <a href="https://leetcode-cn.com/problems/minimum-height-trees">minimum-height-trees</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic310FindMinHeightTrees {

    static int N = 20010, M = N * 2, idx = 0;
    static int[] he = new int[N], e = new int[M], ne = new int[M];
    static int[] f1 = new int[N], f2 = new int[N], g = new int[N], p = new int[N];

    static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = he[a];
        he[a] = idx++;
    }

    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        Arrays.fill(he, -1);
        for (int[] e : edges) {
            int a = e[0], b = e[1];
            add(a, b); add(b, a);
        }
        dfs1(0, -1);
        dfs2(0, -1);
        List<Integer> ans = new ArrayList<>();
        int min = n;
        for (int i = 0; i < n; i++) {
            int cur = Math.max(f1[i], g[i]);
            if (cur < min) {
                min = cur;
                ans.clear();
                ans.add(i);
            }
            else if (cur == min) {
                ans.add(i);
            }
        }
        return ans;
    }

    static int dfs1(int u, int fa) {
        for (int i = he[u]; i != -1; i = ne[i]) {
            int j = e[i];
            if (j == fa) {
                continue;
            }
            int sub = dfs1(j, u) + 1;
            if (sub > f1[u]) {
                f2[u] = f1[u];
                f1[u] = sub;
                p[u] = j;
            }
            else if (sub > f2[u]) {
                f2[u] = sub;
            }
        }
        return f1[u];
    }

    static void dfs2(int u, int fa) {
        for (int i = he[u]; i != -1; i = ne[i]) {
            int j = e[i];
            if (j == fa) {
                continue;
            }
            if (p[u] != j) {
                g[j] = Math.max(g[j], f1[u] + 1);
            }
            else {
                g[j] = Math.max(g[j], f2[u] + 1);
            }
            g[j] = Math.max(g[j], g[u] + 1);
            dfs2(j, u);
        }
    }

}
