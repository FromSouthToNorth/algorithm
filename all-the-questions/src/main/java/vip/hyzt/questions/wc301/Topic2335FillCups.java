package vip.hyzt.questions.wc301;

import java.util.Arrays;

/**
 * <h1>6112. 装满杯子需要的最短总时长</h1>
 * <p>现有一台饮水机，可以制备冷水、温水和热水。每秒钟，可以装满 2 杯 <strong>不同</strong> 类型的水或者 1 杯任意类型的水。</p>
 * <p>给你一个下标从 <strong>0</strong> 开始、长度为 3 的整数数组 amount ，其中 amount[0]、amount[1] 和 amount[2] 分别表示需要装满冷水、温水和热水的杯子数量。返回装满所有杯子所需的 <strong>最少</strong> 秒数。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：amount = [1,4,2]
 *     输出：4
 *     解释：下面给出一种方案：
 *     第 1 秒：装满一杯冷水和一杯温水。
 *     第 2 秒：装满一杯温水和一杯热水。
 *     第 3 秒：装满一杯温水和一杯热水。
 *     第 4 秒：装满一杯温水。
 *     可以证明最少需要 4 秒才能装满所有杯子。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：amount = [5,4,4]
 *     输出：7
 *     解释：下面给出一种方案：
 *     第 1 秒：装满一杯冷水和一杯热水。
 *     第 2 秒：装满一杯冷水和一杯温水。
 *     第 3 秒：装满一杯冷水和一杯温水。
 *     第 4 秒：装满一杯温水和一杯热水。
 *     第 5 秒：装满一杯冷水和一杯热水。
 *     第 6 秒：装满一杯冷水和一杯温水。
 *     第 7 秒：装满一杯热水。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：amount = [5,0,0]
 *     输出：5
 *     解释：每秒装满一杯冷水。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>amount.length == 3</li>
 *     <li>0 <= amount[i] <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/minimum-amount-of-time-to-fill-cups/">https://leetcode.cn/problems/minimum-amount-of-time-to-fill-cups/</a>
 * @author hy
 */
public class Topic2335FillCups {

    public static int fillCups(int[] amount) {
//        return Math.max(amount[0],
//                Math.max(amount[1],
//                        Math.max(amount[2], (amount[0] + amount[1] + amount[2] + 1) / 2)));
        int res = 0;
        while (amount[0] != 0 || amount[1] != 0 || amount[2] != 0) {
            Arrays.sort(amount);
            if (amount[1] != 0) {
                amount[1] --;
            }
            if (amount[2] != 0) {
                amount[2] --;
            }
            res++;
        }
        return res;
    }

}
