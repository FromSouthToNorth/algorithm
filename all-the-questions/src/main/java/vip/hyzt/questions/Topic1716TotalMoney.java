package vip.hyzt.questions;

/**
 * <h3>1716. 计算力扣银行的钱</h3>
 * <p>Hercy 想要为购买第一辆车存钱。他 每天 都往力扣银行里存钱。</p>
 *
 * <p>最开始，他在周一的时候存入 1块钱。从周二到周日，他每天都比前一天多存入 1块钱。在接下来每一个周一，他都会比 前一个周一 多存入 1块钱。</p>
 *
 * <p>给你n，请你返回在第 n天结束的时候他在力扣银行总共存了多少块钱。</p>
 *
 * <p>示例 1：</p>
 * <pre>
 *     <b>输入：</b>n = 4
 *     <b>输出：</b>10
 *     <b>解释：</b>第 4 天后，总额为 1 + 2 + 3 + 4 = 10。
 * </pre>
 *
 * <p>示例 2：</p>
 * <pre>
 *     <b>输入：</b>n = 10
 *     <b>输出：</b>37
 *     <b>解释：</b>第 10 天后，总额为 (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37 。注意到第二个星期一，Hercy 存入 2 块钱。
 * </pre>
 *
 * <p>示例 3：</p>
 * <pre>
 *     <b>输入：</b>n = 20
 *     <b>输出：</b>96
 *     <b>解释：</b>第 20 天后，总额为 (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96。
 * </pre>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see  <a href="https://leetcode-cn.com/problems/calculate-money-in-leetcode-bank">链接：https://leetcode-cn.com/problems/calculate-money-in-leetcode-bank</a>
 */
public abstract class Topic1716TotalMoney {

    public static int bruteForceComputing(int n) {
        int week = 1, day = 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += week + day - 1;
            ++day;
            if (day == 8) {
                day = 1;
                ++week;
            }
        }
        return result;
    }

    public static int arithmeticSum(int n) {
        // 所有完整的周存的钱
        int weekNumber = n / 7;
        int firstWeekMoney = (1 + 7) * 7 / 2;
        int lastWeekMoney = firstWeekMoney + 7 * (weekNumber - 1);
        int weekMoney = (firstWeekMoney + lastWeekMoney) * weekNumber / 2;
        // 剩下的不能构成一个完整的周的天数里存的钱
        int dayNumber = n % 7;
        int firstDayMoney = 1 + weekNumber;
        int lastDayMoney = firstDayMoney + dayNumber - 1;
        int dayMoney = (firstDayMoney + lastDayMoney) * dayNumber / 2;
        return weekMoney + dayMoney;
    }

}
