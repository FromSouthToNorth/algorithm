package vip.hyzt.questions;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;

/**
 * <h2>6184. 统计共同度过的日子数</h2>
 * <p>Alice 和 Bob 计划分别去罗马开会。</p>
 * <p>给你四个字符串 arriveAlice ，leaveAlice，arriveBob 和 leaveBob 。Alice 会在日期 arriveAlice 到 leaveAlice 之间在城市里<strong>（日期为闭区间）</strong>，而 Bob 在日期 arriveBob 到 leaveBob 之间在城市里<strong>（日期为闭区间）</strong>。每个字符串都包含 5 个字符，格式为 "MM-DD" ，对应着一个日期的月和日。</p>
 * <p>请你返回 Alice和 Bob 同时在罗马的天数。</p>
 * <p>你可以假设所有日期都在 <strong>同一个</strong> 自然年，而且 <strong>不是</strong> 闰年。每个月份的天数分别为：[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31] 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19"
 *     输出：3
 *     解释：Alice 从 8 月 15 号到 8 月 18 号在罗马。Bob 从 8 月 16 号到 8 月 19 号在罗马，他们同时在罗马的日期为 8 月 16、17 和 18 号。所以答案为 3 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob = "12-31"
 *     输出：0
 *     解释：Alice 和 Bob 没有同时在罗马的日子，所以我们返回 0 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>所有日期的格式均为 "MM-DD" 。</li>
 *     <li>Alice 和 Bob 的到达日期都 <strong>早于或等于</strong> 他们的离开日期。</li>
 *     <li>题目测试用例所给出的日期均为 <strong>非闰年</strong> 的有效日期。</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-days-spent-together">https://leetcode.cn/problems/count-days-spent-together</a>
 */
public class Topic6184CountDaysTogether {


    private final int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
//        return (int) Math.max(
//                (Math.min(countDaysTogether(leaveAlice), countDaysTogether(leaveBob)) / 86400000 -
//                        Math.max(countDaysTogether(arriveAlice), countDaysTogether(arriveBob)) / 86400000), -1) + 1;

        int[] arriveA = split(arriveAlice), leaveA = split(leaveAlice);
        int[] arriveB = split(arriveBob), leaveB = split(leaveBob);
        int month = 0, day = 0, result = 0;
        for (int i = 0; i < 365; i++) {
            if (isValid(arriveA, leaveA, month + 1, day + 1)
            && isValid(arriveB, leaveB, month + 1, day + 1)) {
                result++;
            }
            day += 1;
            if (day >= months[month]) {
                day -= months[month];
                month++;
            }
        }
        return result;
    }

    private int[] split(String t) {
        String[] tmp = t.split("-");
        return new int[] { Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]) };
    }

    private boolean isValid(int[] a, int[] l, int month, int day) {
        return compare(a, month, day) <= 0 && compare(l, month, day) >= 0;
    }

    private int compare(int[] time, int month, int day) {
        if (time[0] != month) {
            return time[0] - month;
        }
        else {
            return time[1] - day;
        }
    }

    private long countDaysTogether(String t) {
        return new SimpleDateFormat("MM-dd").parse(t, new ParsePosition(0)).getTime();
    }
}
