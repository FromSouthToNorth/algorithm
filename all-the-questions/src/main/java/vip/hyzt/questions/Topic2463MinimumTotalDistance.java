package vip.hyzt.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h1>2463. 最小移动总距离</h1>
 * <p>X 轴上有一些机器人和工厂。给你一个整数数组 robot ，其中 robot[i] 是第 i 个机器人的位置。再给你一个二维整数数组 factory ，其中 factory[j] = [position<sub>j</sub>, limit<sub>j</sub>] ，表示第 j 个工厂的位置在 position<sub>j</sub> ，且第 j 个工厂最多可以修理 limit<sub>j</sub> 个机器人。</p>
 * <p>每个机器人所在的位置 <strong>互不相同</strong> 。每个工厂所在的位置也 <strong>互不相同</strong> 。注意一个机器人可能一开始跟一个工厂在 <strong>相同的位置</strong> 。</p>
 * <p>所有机器人一开始都是坏的，他们会沿着设定的方向一直移动。设定的方向要么是 X 轴的正方向，要么是 X 轴的负方向。当一个机器人经过一个没达到上限的工厂时，这个工厂会维修这个机器人，且机器人停止移动。</p>
 * <p><strong>任何时刻</strong>，你都可以设置 <strong>部分</strong> 机器人的移动方向。你的目标是最小化所有机器人总的移动距离。</p>
 * <p>请你返回所有机器人移动的最小总距离。测试数据保证所有机器人都可以被维修。</p>
 * <p><strong>注意：</strong></p>
 * <ul>
 *     <li>所有机器人移动速度相同。</li>
 *     <li>如果两个机器人移动方向相同，它们永远不会碰撞。</li>
 *     <li>如果两个机器人迎面相遇，它们也不会碰撞，它们彼此之间会擦肩而过。</li>
 *     <li>如果一个机器人经过了一个已经达到上限的工厂，机器人会当作工厂不存在，继续移动。</li>
 *     <li>机器人从位置 x 到位置 y 的移动距离为 |y - x| 。</li>
 * </ul>
 * <h2>示例 1：</h2>
 * <img src="https://pic.leetcode-cn.com/1667542978-utuiPv-image.png">
 * <pre>
 *     输入：robot = [0,4,6], factory = [[2,2],[6,2]]
 *     输出：4
 *     解释：如上图所示：
 *     - 第一个机器人从位置 0 沿着正方向移动，在第一个工厂处维修。
 *     - 第二个机器人从位置 4 沿着负方向移动，在第一个工厂处维修。
 *     - 第三个机器人在位置 6 被第二个工厂维修，它不需要移动。
 *     第一个工厂的维修上限是 2 ，它维修了 2 个机器人。
 *     第二个工厂的维修上限是 2 ，它维修了 1 个机器人。
 *     总移动距离是 |2 - 0| + |2 - 4| + |6 - 6| = 4 。没有办法得到比 4 更少的总移动距离。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://pic.leetcode-cn.com/1667542984-OAIRFN-image.png">
 * <pre>
 *     输入：robot = [1,-1], factory = [[-2,1],[2,1]]
 *     输出：2
 *     解释：如上图所示：
 *     - 第一个机器人从位置 1 沿着正方向移动，在第二个工厂处维修。
 *     - 第二个机器人在位置 -1 沿着负方向移动，在第一个工厂处维修。
 *     第一个工厂的维修上限是 1 ，它维修了 1 个机器人。
 *     第二个工厂的维修上限是 1 ，它维修了 1 个机器人。
 *     总移动距离是 |2 - 1| + |(-2) - (-1)| = 2 。没有办法得到比 2 更少的总移动距离。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= robot.length, factory.length <= 100</li>
 *     <li>factory[j].length == 2</li>
 *     <li>-10<sup>9</sup> <= robot[i], position<sub>j</sub> <= 10<sup>9</sup></li>
 *     <li>0 <= limit<sub>j</sub> <= robot.length</li>
 *     <li>测试数据保证所有机器人都可以被维修。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/minimum-total-distance-traveled/">https://leetcode.cn/problems/minimum-total-distance-traveled/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2463MinimumTotalDistance {

    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (o, p) -> o[0] - p[0]);
        long[] dp = new long[robot.size() + 1];
        for (int i = 1; i <= robot.size(); i++) {
            dp[i] = 1000000000000L;
        }
        for (int[] ints : factory) {
            for (int j = robot.size(); j > 0; j--) {
                for (long k = 1, sum = 0; k <= Math.min(ints[1], j); k++) {
                    dp[j] = Math.min(dp[j], dp[j - (int) k] + (sum += Math.abs(ints[0] - robot.get(j - (int) k))));
                }
            }
        }
        return dp[robot.size()];
    }

}
