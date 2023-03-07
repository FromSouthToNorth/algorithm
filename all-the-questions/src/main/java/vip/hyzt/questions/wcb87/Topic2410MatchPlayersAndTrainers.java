package vip.hyzt.questions.wcb87;

import java.util.Arrays;

/**
 * <h2>6185. 运动员和训练师的最大匹配数</h2>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组 players ，其中 players[i] 表示第 i 名运动员的 能力 值，同时给你一个下标从 <strong>0</strong> 开始的整数数组 trainers ，其中 trainers[j] 表示第 j 名训练师的 <strong>训练能力值</strong> 。</p>
 * <p>如果第 i 名运动员的能力值 <strong>小于等于</strong> 第 j 名训练师的能力值，那么第 i 名运动员可以 <strong>匹配</strong> 第 j 名训练师。除此以外，每名运动员至多可以匹配一位训练师，每位训练师最多可以匹配一位运动员。</p>
 * <p>请你返回满足上述要求 players 和 trainers 的 <strong>最大</strong> 匹配数。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：players = [4,7,9], trainers = [8,2,5,8]
 *     输出：2
 *     解释：
 *     得到两个匹配的一种方案是：
 *     - players[0] 与 trainers[0] 匹配，因为 4 <= 8 。
 *     - players[1] 与 trainers[3] 匹配，因为 7 <= 8 。
 *     可以证明 2 是可以形成的最大匹配数。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：players = [1,1,1], trainers = [10]
 *     输出：1
 *     解释：
 *     训练师可以匹配所有 3 个运动员
 *     每个运动员至多只能匹配一个训练师，所以最大答案是 1 。
 * </pre>
 * <ul>
 *     <li>1 <= players.length, trainers.length <= 10<sup>5</sup></li>
 *     <li>1 <= players[i], trainers[j] <= 10<sup>9</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/maximum-matching-of-players-with-trainers">https://leetcode.cn/problems/maximum-matching-of-players-with-trainers</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2410MatchPlayersAndTrainers {

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0;
        for (int trainer : trainers) {
            if (count < players.length && players[count] <= trainer) {
                count++;
            }
        }
        return count;
    }

}
