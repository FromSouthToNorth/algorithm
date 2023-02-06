package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <h1>2538. 最大价值和与最小价值和的差值</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/difference-between-maximum-and-minimum-price-sum/">https://leetcode.cn/problems/difference-between-maximum-and-minimum-price-sum/</a>
 */
public class Topic2538MaxOutput {

    private long max = 0;

    public long maxOutput(int n, int[][] edges, int[] price) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], t -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], t -> new ArrayList<>()).add(edge[0]);
        }
        maxOutput(0, -1, map, price);
        return max;
    }

    private long[] maxOutput(int i, int from, HashMap<Integer, List<Integer>> map, int[] price) {
        ArrayList<long[]> list1 = new ArrayList<>(List.of(new long[]{ 0, i })),
                list2 = new ArrayList<>(List.of(new long[]{ 0, i }));
        for (int j : map.getOrDefault(i, List.of())) {
            if (j != from) {
                long[] next = maxOutput(j, i, map, price);
                list1.add(new long[]{ next[0], j });
                list2.add(new long[]{ next[1] + price[i], j });
            }
        }
        list1.sort((o, p) -> Long.compare(p[0], o[0]));
        list2.sort((o, p) -> Long.compare(p[0], o[0]));
        max = Math.max(max,
                list1.get(0)[1] != list2.get(0)[1] ? list1.get(0)[0] + list2.get(0)[0]
                        : Math.max(list1.get(0)[0] + (list2.size() > 1 ? list2.get(1)[0] : 0),
                        (list1.size() > 1 ? list1.get(1)[0] : 0) + list2.get(0)[0]));
        return new long[]{ list1.get(0)[0] + price[i], list2.get(0)[0] };
    }

}
