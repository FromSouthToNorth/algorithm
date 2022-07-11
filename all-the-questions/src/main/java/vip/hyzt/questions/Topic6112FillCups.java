package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>6112. 装满杯子需要的最短总时长</h3>
 * @see <a href="https://leetcode.cn/problems/minimum-amount-of-time-to-fill-cups/">https://leetcode.cn/problems/minimum-amount-of-time-to-fill-cups/</a>
 * @author hy
 */
public class Topic6112FillCups {

    public static int fillCups1(int[] amount) {
        int res = 0;
        while (amount[0] != 0 || amount[1] != 0 || amount[2] != 0) {
            Arrays.sort(amount);
            if (amount[1] != 0) amount[1] --;
            if (amount[2] != 0) amount[2] --;
            res++;
        }
        return res;
    }

    public static int fillCups2(int[] amount) {
        return Math.max(amount[0],
                Math.max(amount[1],
                        Math.max(amount[2], (amount[0] + amount[1] + amount[2] + 1) / 2)));
    }

}
