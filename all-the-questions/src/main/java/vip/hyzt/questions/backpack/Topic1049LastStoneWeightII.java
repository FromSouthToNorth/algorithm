package vip.hyzt.questions.backpack;

import java.util.Arrays;

/**
 * <h3>1049. 最后一块石头的重量 II</h3>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/last-stone-weight-ii/">链接：https://leetcode.cn/problems/last-stone-weight-ii/</a>
 */
public class Topic1049LastStoneWeightII {

    public static int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).sum();
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int stone : stones) {
            for (int i = target; i >= stone; i--) {
                dp[i] = Math.max(dp[i], dp[i - stone] + stone);
            }
        }
        return sum - 2 * dp[target];
    }

}
