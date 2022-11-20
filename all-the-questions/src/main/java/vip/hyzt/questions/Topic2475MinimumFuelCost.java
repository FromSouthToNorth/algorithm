package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <h1>6243. 到达首都的最少油耗</h1>
 * <p>给你一棵 n 个节点的树（一个无向、连通、无环图），每个节点表示一个城市，编号从 0 到 n - 1 ，且恰好有 n - 1 条路。0 是首都。给你一个二维整数数组 roads ，其中 roads[i] = [a<sub>i</sub>, b<sub>i</sub>] ，表示城市 a<sub>i</sub> 和 b<sub>i</sub> 之间有一条 <strong>双向路</strong> 。</p>
 * <p>每个城市里有一个代表，他们都要去首都参加一个会议。</p>
 * <p>每座城市里有一辆车。给你一个整数 seats 表示每辆车里面座位的数目。</p>
 * <p>城市里的代表可以选择乘坐所在城市的车，或者乘坐其他城市的车。相邻城市之间一辆车的油耗是一升汽油。</p>
 * <p>请你返回到达首都最少需要多少升汽油。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/09/22/a4c380025e3ff0c379525e96a7d63a3.png">
 * <pre>
 *     输入：roads = [[0,1],[0,2],[0,3]], seats = 5
 *     输出：3
 *     解释：
 *     - 代表 1 直接到达首都，消耗 1 升汽油。
 *     - 代表 2 直接到达首都，消耗 1 升汽油。
 *     - 代表 3 直接到达首都，消耗 1 升汽油。
 *     最少消耗 3 升汽油。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/11/16/2.png">
 * <pre>
 *     输入：roads = [[3,1],[3,2],[1,0],[0,4],[0,5],[4,6]], seats = 2
 *     输出：7
 *     解释：
 *     - 代表 2 到达城市 3 ，消耗 1 升汽油。
 *     - 代表 2 和代表 3 一起到达城市 1 ，消耗 1 升汽油。
 *     - 代表 2 和代表 3 一起到达首都，消耗 1 升汽油。
 *     - 代表 1 直接到达首都，消耗 1 升汽油。
 *     - 代表 5 直接到达首都，消耗 1 升汽油。
 *     - 代表 6 到达城市 4 ，消耗 1 升汽油。
 *     - 代表 4 和代表 6 一起到达首都，消耗 1 升汽油。
 *     最少消耗 7 升汽油。
 * </pre>
 * <h2>示例 3：</h2>
 * <img src="https://assets.leetcode.com/uploads/2022/09/27/efcf7f7be6830b8763639cfd01b690a.png">
 * <pre>
 *     输入：roads = [], seats = 1
 *     输出：0
 *     解释：没有代表需要从别的城市到达首都。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 10<sup>5</sup></li>
 *     <li>roads.length == n - 1</li>
 *     <li>roads[i].length == 2</li>
 *     <li>0 <= a<sub>i</sub>, b<sub>i</sub> < n</li>
 *     <li>a<sub>i</sub> != b<sub>i</sub></li>
 *     <li>roads 表示一棵合法的树。</li>
 *     <li>1 <= seats <= 10<sup>5</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-fuel-cost-to-report-to-the-capital/">https://leetcode.cn/problems/minimum-fuel-cost-to-report-to-the-capital/</a>
 */
public class Topic2475MinimumFuelCost {

    private long result;

    public long minimumFuelCost(int[][] roads, int seats) {
        result = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] road : roads) {
            map.computeIfAbsent(road[0], t -> new ArrayList<>()).add(road[1]);
            map.computeIfAbsent(road[1], t -> new ArrayList<>()).add(road[0]);
        }

        for (int i : map.getOrDefault(0, List.of())) {
            minimumFuelCost(i, 0, map, seats);
        }
        return result;
    }

    private int minimumFuelCost(int n, int from, HashMap<Integer, List<Integer>> map, int seats) {
        int count = 1;
        for (int i : map.get(n)) {
            count += i == from ? 0 : minimumFuelCost(i, n, map, seats);
        }
        result += (count + seats - 1) / seats;
        return count;
    }

}
