package vip.hyzt.questions;

import java.util.Collections;
import java.util.List;

/**
 * <h3>539. 最小时间差</h3>
 * <p>给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。</p>
 *
 * <p>示例 1：</p>
 * <per>
 *     <strong>输入：</strong>timePoints = ["23:59","00:00"]
 *     <strong>输出：</strong>1
 * </per>
 *
 * <p>示例 2：</p>
 * <per>
 *     <strong>输入：</strong>timePoints = ["00:00","23:59","00:00"]
 *     <strong>输出：</strong>0
 * </per>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/minimum-time-difference/">链接</a>
 */
public abstract class Topic539FindMinDifference {

    public static int sort(List<String> timePoints) {
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        int t0Minutes = getMinutes(timePoints.get(0));
        int preMinutes = t0Minutes;
        for (int i = 1; i < timePoints.size(); ++i) {
            int minutes = getMinutes(timePoints.get(i));
            ans = Math.min(ans, minutes - preMinutes);
            preMinutes = minutes;
        }

        ans = Math.min(ans, t0Minutes + 1440 - preMinutes);
        return ans;
    }

    private static int getMinutes(String t) {
        return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
    }

    public static int pigeonholePrinciple(List<String> timePoints) {
        int n = timePoints.size();
        if (n > 1440) {
            return 0;
        }
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        int t0Minutes = getMinutes(timePoints.get(0));
        int preMinutes = t0Minutes;
        for (int i = 1; i < n; i++) {
            int minutes = getMinutes(timePoints.get(i));
            ans = Math.min(ans, minutes - preMinutes);
            preMinutes = minutes;
        }

        ans = Math.min(ans, t0Minutes + 1440 - preMinutes);
        return ans;
    }

}
