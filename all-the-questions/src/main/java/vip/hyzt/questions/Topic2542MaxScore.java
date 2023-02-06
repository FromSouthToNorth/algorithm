package vip.hyzt.questions;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * <h1>2542. 最大子序列的分数</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximum-subsequence-score/">https://leetcode.cn/problems/maximum-subsequence-score/</a>
 */
public class Topic2542MaxScore {

    public long maxScore(int[] nums1, int[] nums2, int k) {
        Integer[] index = new Integer[nums1.length];
        for (int i = 0; i < index.length; i++) {
            index[i] = i;
        }
        Arrays.sort(index, (o, p) -> nums2[p] - nums2[o]);
        long max = 0, sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums1.length; i++) {
            sum += nums1[index[i]];
            queue.offer(nums1[index[i]]);
            if (queue.size() > k) {
                sum -= queue.poll();
            }
            max = Math.max(max, queue.size() < k ? 0 : sum * nums2[index[i]]);
        }
        return max;
    }

}
