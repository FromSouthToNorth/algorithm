package vip.hyzt.questions;

import java.util.PriorityQueue;

/**
 * <h1>2558. 从数量最多的堆取走礼物</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/take-gifts-from-the-richest-pile/">https://leetcode.cn/problems/take-gifts-from-the-richest-pile/</a>
 */
public class Topic2558PickGifts {

    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        long sum = 0;
        for (int gift : gifts) {
            queue.offer(-gift);
            sum += gift;
        }
        for (int i = 0; i < k; i++) {
            sum += queue.peek() + (int) Math.sqrt(-queue.peek());
            queue.offer((int) -Math.sqrt(-queue.poll()));
        }
        return sum;
    }

}
