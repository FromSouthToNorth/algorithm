package vip.hyzt.weeks.weeks_302;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * <h3>6164. 数位和相等数对的最大和</h3>
 * @see <a href="https://leetcode.cn/problems/max-sum-of-a-pair-with-equal-sum-of-digits/">https://leetcode.cn/problems/max-sum-of-a-pair-with-equal-sum-of-digits/</a>
 * @author hy
 */
public class MaximumSum_02 {

    public int maximumSum(int[] nums) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int num : nums) {
            int sum = 0;
            for (char c : ("" + num).toCharArray()) {
                sum += c - '0';
            }
            map.computeIfAbsent(sum, t -> new PriorityQueue<>()).offer(-num);
        }
        int max = -1;
        for (PriorityQueue<Integer> queue : map.values()) {
            max = Math.max(max, queue.size() > 1 ? -queue.poll() - queue.poll() : -1);
        }
        return max;
    }

}
