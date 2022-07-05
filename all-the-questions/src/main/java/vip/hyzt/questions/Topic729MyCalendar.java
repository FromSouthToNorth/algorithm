package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>729. 我的日程安排表 I</h3>
 * @see <a href="https://leetcode.cn/problems/my-calendar-i/">https://leetcode.cn/problems/my-calendar-i/</a>
 * @author hy
 */
public class Topic729MyCalendar {

    private List<int[]> list;

    public Topic729MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] ints : list) {
            if (ints[0] < end && ints[1] > start) {
                return false;
            }
        }
        list.add(new int[]{ start, end });
        return true;
    }

}
