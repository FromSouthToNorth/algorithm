package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>2491. 划分技能点相等的团队</h1>
 * <p>给你一个正整数数组 skill ，数组长度为 <strong>偶数</strong> n ，其中 skill[i] 表示第 i 个玩家的技能点。将所有玩家分成 n / 2 个 2 人团队，使每一个团队的技能点之和 <strong>相等</strong> 。</p>
 * <p>团队的 <strong>化学反应</strong> 等于团队中玩家的技能点 <strong>乘积</strong> 。</p>
 * <p>返回所有团队的 <strong>化学反应</strong> 之和，如果无法使每个团队的技能点之和相等，则返回 -1 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：skill = [3,2,5,1,3,4]
 *     输出：22
 *     解释：
 *     将玩家分成 3 个团队 (1, 5), (2, 4), (3, 3) ，每个团队的技能点之和都是 6 。
 *     所有团队的化学反应之和是 1 * 5 + 2 * 4 + 3 * 3 = 5 + 8 + 9 = 22 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：skill = [3,4]
 *     输出：12
 *     解释：
 *     两个玩家形成一个团队，技能点之和是 7 。
 *     团队的化学反应是 3 * 4 = 12 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：skill = [1,1,2,3]
 *     输出：-1
 *     解释：
 *     无法将玩家分成每个团队技能点都相等的若干个 2 人团队。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>2 <= skill.length <= 10<sup>5</sup></li>
 *     <li>skill.length 是偶数</li>
 *     <li>1 <= skill[i] <= 1000</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/divide-players-into-teams-of-equal-skill/">https://leetcode.cn/problems/divide-players-into-teams-of-equal-skill/</a>
 */
public class Topic2491DividePlayers {

    public long dividePlayers(int[] skill) {
        // [3, 2, 5, 1, 3, 4]
        Arrays.sort(skill);
        // [1, 2, 3, 3, 4, 5]
        long sum = 0;
        for (int i = 0; i < skill.length / 2; i++) {
            // [1, 2, 3 | 3, 4, 5]
            // 1 + 5 == 1 + 5
            // 2 + 4 == 1 + 5
            // 3 + 3 == 1 + 5
            if (skill[i] + skill[skill.length - 1 - i] != skill[0] + skill[skill.length - 1]) {
                return -1;
            }
            // sum = 0  + 1 * 5
            // sum = 5  + 2 * 4
            // sum = 13 + 3 * 3
            // sum = 22
            sum += (long) skill[i] * skill[skill.length - 1 - i];
        }
        return sum;
    }

}
