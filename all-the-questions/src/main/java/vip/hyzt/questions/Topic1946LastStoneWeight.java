package vip.hyzt.questions;

import java.util.*;

/**
 * <h3>1046. 最后一块石头的重量</h3>
 * @see <a href="https://leetcode.cn/problems/last-stone-weight/">https://leetcode.cn/problems/last-stone-weight/</a>
 * @author hy
 */
public class Topic1946LastStoneWeight {

    public static int lastStoneWeight1(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }

        while (list.size() > 1) {
            Collections.sort(list);
            int size = list.size();
            int a = list.get(size - 1);
            int b = list.get(size - 2);
            list.remove(size - 1);
            list.remove(size - 2);
            if (a > b) {
                list.add(a - b);
            }
        }

        return list.isEmpty() ? 0 : list.get(0);
    }


    public static int lastStoneWeight2(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            if (a > b) {
                queue.offer(a - b);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }

}
