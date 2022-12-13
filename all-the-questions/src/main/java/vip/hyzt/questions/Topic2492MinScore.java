package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <h1>2492. 两个城市间路径的最小分数</h1>
 * <p>给你一个正整数 n ，表示总共有 n 个城市，城市从 1 到 n 编号。给你一个二维数组 roads ，其中 roads[i] = [a<sub>i</sub>, b<sub>i</sub>, distance<sub>i</sub>] 表示城市 a<sub>i</sub> 和 b<sub>i</sub> 之间有一条 <strong>双向</strong> 道路，道路距离为 distance<sub>i</sub> 。城市构成的图不一定是连通的。</p>
 * <p>两个城市之间一条路径的 <strong>分数</strong> 定义为这条路径中道路的 <strong>最小</strong> 距离。</p>
 * <p>城市 1 和城市 n 之间的所有路径的 <strong>最小</strong> 分数。</p>
 * <p><strong>注意：</strong></p>
 * <ul>
 *     <li>一条路径指的是两个城市之间的道路序列。</li>
 *     <li>一条路径可以 <strong>多次</strong> 包含同一条道路，你也可以沿着路径多次到达城市 1 和城市 n 。</li>
 *     <li>测试数据保证城市 1 和城市n 之间 <strong>至少</strong> 有一条路径。</li>
 * </ul>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/10/12/graph11.png">
 * <pre>
 *     输入：n = 4, roads = [[1,2,9],[2,3,6],[2,4,5],[1,4,7]]
 *     输出：5
 *     解释：城市 1 到城市 4 的路径中，分数最小的一条为：1 -> 2 -> 4 。这条路径的分数是 min(9,5) = 5 。
 *     不存在分数更小的路径。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/10/12/graph22.png">
 * <pre>
 *     输入：n = 4, roads = [[1,2,2],[1,3,4],[3,4,7]]
 *     输出：2
 *     解释：城市 1 到城市 4 分数最小的路径是：1 -> 2 -> 1 -> 3 -> 4 。这条路径的分数是 min(2,2,4,7) = 2 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= n <= 10<sup>5</sup></li>
 *     <li>1 <= roads.length <= 10<sup>5</sup></li>
 *     <li>roads[i].length == 3</li>
 *     <li>1 <= ai, bi <= n</li>
 *     <li>a<sub>i</sub> != b<sub>i</sub></li>
 *     <li>1 <= distance<sub>i</sub> <= 10<sup>4</sup></li>
 *     <li>不会有重复的边。</li>
 *     <li>城市 1 和城市 n 之间至少有一条路径。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-score-of-a-path-between-two-cities/description/">https://leetcode.cn/problems/minimum-score-of-a-path-between-two-cities/description/</a>
 */
public class Topic2492MinScore {

    public int minScore(int n, int[][] roads) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for (int[] road : roads) {
            map.computeIfAbsent(road[0], t -> new ArrayList<>()).add(new int[] {road[1], road[2]});
            map.computeIfAbsent(road[1], t -> new ArrayList<>()).add(new int[] {road[0], road[2]});
        }
        return minScore(1, map);
    }

    private int minScore(int n, HashMap<Integer, List<int[]>> map) {
        int min = Integer.MAX_VALUE;
        for (int[] next : map.replace(n, List.of())) {
            min = Math.min(min, Math.min(next[1], minScore(next[0], map)));
        }
        return min;
    }

}
