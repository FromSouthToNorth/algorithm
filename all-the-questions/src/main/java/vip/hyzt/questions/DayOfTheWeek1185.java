package vip.hyzt.questions;

/**
 * <p>给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。</p>
 *
 * <p>输入为三个整数：day、month 和year，分别表示日、月、年。</p>
 *
 * <p>您返回的结果必须是这几个值中的一个{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。</p>
 *
 * <h3>示例 1:</h3>
 * <ul>
 *     <li>输入：day = 31, month = 8, year = 2019</li>
 *     <li>输出："Saturday"</li>
 * </ul>
 *
 * <h3>示例 2:</h3>
 * <ul>
 *     <li>输入：day = 18, month = 7, year = 1999</li>
 *     <li>输出："Sunday"</li>
 * </ul>
 *
 * <h3>示例 3:</h3>
 * <ul>
 *     <li>输入：day = 15, month = 8, year = 1993</li>
 *     <li>输出："Sunday"</li>
 * </ul>
 *
 * <p>提示: </p>
 * <p>给出的日期一定是在 1971 到 2100 年之间的有效日期。</p>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/day-of-the-week">链接：https://leetcode-cn.com/problems/day-of-the-week</a>
 */
public abstract class DayOfTheWeek1185 {

    /**
     * 一周中的星期几
     * @param day   日
     * @param month 月
     * @param year  年
     * @return 对应一周当中的那一天
     */
    public static String simulation(int day, int month, int year) {
        String[] week = {"周一", "周二", "周三", "周四", "周五", "周六", "周日"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        /* 输入年份之前的年份的天数贡献 */
        int days = 365 * (year - 1971) + (year - 1969) / 4;
        /* 输入年份中，输入月份之前的月份的天数贡献 */
        for (int i = 0; i < month - 1; ++i) {
            days += monthDays[i];
        }
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days += 1;
        }
        /* 输入月份中的天数贡献 */
        days += day;
        return week[(days + 3) % 7];
    }

}
