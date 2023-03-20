package vip.hyzt.questions.wcb100;

/**
 * <h1>2594. 修车的最少时间</h1>
 * <p>给你一个整数数组 ranks ，表示一些机械工的 <strong></strong> 。ranks<sub>i</sub> 是第 i 位机械工的能力值。能力值为 r 的机械工可以在 r * n<sup>2</sup> 分钟内修好 n 辆车。</p>
 * <p>同时给你一个整数 cars ，表示总共需要修理的汽车数目。</p>
 * <p>请你返回修理所有汽车 <strong>最少</strong> 需要多少时间。</p>
 * <p><strong>注意</strong>：所有机械工可以同时修理汽车。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：ranks = [4,2,3,1], cars = 10
 *     输出：16
 *     解释：
 *     - 第一位机械工修 2 辆车，需要 4 * 2 * 2 = 16 分钟。
 *     - 第二位机械工修 2 辆车，需要 2 * 2 * 2 = 8 分钟。
 *     - 第三位机械工修 2 辆车，需要 3 * 2 * 2 = 12 分钟。
 *     - 第四位机械工修 4 辆车，需要 1 * 4 * 4 = 16 分钟。
 *     16 分钟是修理完所有车需要的最少时间。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：ranks = [5,1,8], cars = 6
 *     输出：16
 *     解释：
 *     - 第一位机械工修 1 辆车，需要 5 * 1 * 1 = 5 分钟。
 *     - 第二位机械工修 4 辆车，需要 1 * 4 * 4 = 16 分钟。
 *     - 第三位机械工修 1 辆车，需要 8 * 1 * 1 = 8 分钟。
 *     16 分钟时修理完所有车需要的最少时间。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= ranks.length <= 10<sup>5</sup></li>
 *     <li>1 <= ranks[i] <= 100</li>
 *     <li>1 <= cars <= 10<sup>6</sup></li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-time-to-repair-cars/">https://leetcode.cn/problems/minimum-time-to-repair-cars/</a>
 */
public class Topic2594RepairCars {

    public long repairCars(int[] ranks, int cars) {
        long left = 1, right = 100_000_000_000_000L;
        while (left < right) {
            long mid = (left + right) / 2, count = 0;
            for (int rank : ranks) {
                count += Math.sqrt(mid / rank);
            }
            if (count < cars) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

}
