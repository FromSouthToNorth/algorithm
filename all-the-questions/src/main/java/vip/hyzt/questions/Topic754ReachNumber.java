package vip.hyzt.questions;

/**
 * <h1>754. 到达终点数字</h1>
 * <p>在一根无限长的数轴上，你站在0的位置。终点在target的位置。</p>
 * <p>你可以做一些数量的移动 numMoves :</p>
 * <ul>
 *     <li>每次你可以选择向左或向右移动。</li>
 *     <li>第 i 次移动（从  i == 1 开始，到 i == numMoves ），在选择的方向上走 i 步。</li>
 * </ul>
 * <p>给定整数 target ，返回 到达目标所需的 <em><strong>最小</strong></em> 移动次数(即最小 numMoves ) 。</p>
 * <h2>示例 1:</h2>
 * <pre>
 *     输入: target = 2
 *     输出: 3
 *     解释:
 *     第一次移动，从 0 到 1 。
 *     第二次移动，从 1 到 -1 。
 *     第三次移动，从 -1 到 2 。
 * </pre>
 * <h2>示例 2:</h2>
 * <pre>
 *     输入: target = 3
 *     输出: 2
 *     解释:
 *     第一次移动，从 0 到 1 。
 *     第二次移动，从 1 到 3 。
 * </pre>
 * <h2>提示:</h2>
 * <ul>
 *     <li>-10<sup>9</sup> <= target <= 10<sup>9</sup></li>
 *     <li>target != 0</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/reach-a-number/">https://leetcode.cn/problems/reach-a-number/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic754ReachNumber {

    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0) {
            k++;
            target -=k;
        }
        return target % 2 == 0 ? k : k + 1 + k % 2;
    }

}
