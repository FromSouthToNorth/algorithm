package vip.hyzt.questions;

import java.util.PriorityQueue;

/**
 * <h1>2462. 雇佣 K 位工人的总代价</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组 costs ，其中 costs[i] 是雇佣第 i 位工人的代价。</p>
 * <p>同时给你两个整数 k 和 candidates 。我们想根据以下规则恰好雇佣 k 位工人：</p>
 * <ul>
 *     <li>总共进行 k 轮雇佣，且每一轮恰好雇佣一位工人。</li>
 *     <li>
 *         在每一轮雇佣中，从最前面 candidates 和最后面 candidates 人中选出代价最小的一位工人，如果有多位代价相同且最小的工人，选择下标更小的一位工人。
 *         <ul>
 *             <li>比方说，costs = [3,2,7,7,1,2] 且 candidates = 2 ，第一轮雇佣中，我们选择第 4 位工人，因为他的代价最小 <em>[3,2,7,7,<strong>1</strong>,2]</em> 。</li>
 *             <li>第二轮雇佣，我们选择第 1 位工人，因为他们的代价与第 4 位工人一样都是最小代价，而且下标更小，<em>[3,<strong>2</strong>,7,7,2]</em> 。注意每一轮雇佣后，剩余工人的下标可能会发生变化。</li>
 *         </ul>
 *     </li>
 *     <li>如果剩余员工数目不足 candidates 人，那么下一轮雇佣他们中代价最小的一人，如果有多位代价相同且最小的工人，选择下标更小的一位工人。</li>
 *     <li>一位工人只能被选择一次。</li>
 * </ul>
 * <p>返回雇佣恰好 k 位工人的总代价。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：costs = [17,12,10,2,7,2,11,20,8], k = 3, candidates = 4
 *     输出：11
 *     解释：我们总共雇佣 3 位工人。总代价一开始为 0 。
 *     - 第一轮雇佣，我们从 [17,12,10,2,7,2,11,20,8] 中选择。最小代价是 2 ，有两位工人，我们选择下标更小的一位工人，即第 3 位工人。总代价是 0 + 2 = 2 。
 *     - 第二轮雇佣，我们从 [17,12,10,7,2,11,20,8] 中选择。最小代价是 2 ，下标为 4 ，总代价是 2 + 2 = 4 。
 *     - 第三轮雇佣，我们从 [17,12,10,7,11,20,8] 中选择，最小代价是 7 ，下标为 3 ，总代价是 4 + 7 = 11 。注意下标为 3 的工人同时在最前面和最后面 4 位工人中。
 *     总雇佣代价是 11 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：costs = [1,2,4,1], k = 3, candidates = 3
 *     输出：4
 *     解释：我们总共雇佣 3 位工人。总代价一开始为 0 。
 *     - 第一轮雇佣，我们从 [1,2,4,1] 中选择。最小代价为 1 ，有两位工人，我们选择下标更小的一位工人，即第 0 位工人，总代价是 0 + 1 = 1 。注意，下标为 1 和 2 的工人同时在最前面和最后面 3 位工人中。
 *     - 第二轮雇佣，我们从 [2,4,1] 中选择。最小代价为 1 ，下标为 2 ，总代价是 1 + 1 = 2 。
 *     - 第三轮雇佣，少于 3 位工人，我们从剩余工人 [2,4] 中选择。最小代价是 2 ，下标为 0 。总代价为 2 + 2 = 4 。
 *     总雇佣代价是 4 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= costs.length <= 10<sup>5</sup></li>
 *     <li>1 <= costs[i] <= 10<sup>5</sup></li>
 *     <li>1 <= k, candidates <= costs.length</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/total-cost-to-hire-k-workers/">https://leetcode.cn/problems/total-cost-to-hire-k-workers/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2462TotalCost {

    public long totalCost(int[] costs, int k, int candidates) {
        long sum = 0, i = 0, j = costs.length - 1;
        PriorityQueue<Integer> left = new PriorityQueue<>(), right = new PriorityQueue<>();
        while (left.size() < candidates) {
            left.offer(costs[(int) i++]);
        }
        while (right.size() < candidates) {
            right.offer(j < i ? Integer.MAX_VALUE : costs[(int) j--]);
        }
        System.out.printf("%s\n", left);
        System.out.printf("%s\n", right);
        for (; k > 0; k--) {
            if (right.peek() < left.peek()) {
                sum += right.poll();
                right.offer(j < i ? Integer.MAX_VALUE : costs[(int) j--]);
            }
            else {
                sum += left.poll();
                left.offer(i > j ? Integer.MAX_VALUE : costs[(int) i++]);
            }
        }
        return sum;
    }

}
