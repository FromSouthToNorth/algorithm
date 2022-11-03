package vip.hyzt.questions;

import java.util.*;

/**
 * <h3>1046. 最后一块石头的重量</h3>
 * @see <a href="https://leetcode.cn/problems/last-stone-weight/">https://leetcode.cn/problems/last-stone-weight/</a>
 * @author hy
 */
public class Topic1046LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
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
        return queue.isEmpty() ? 0 : queue.peek();
    }

}
