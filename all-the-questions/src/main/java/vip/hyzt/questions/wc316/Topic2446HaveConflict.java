package vip.hyzt.questions.wc316;

/**
 * <h2>2446. 判断两个事件是否存在冲突</h2>
 * <p>给你两个字符串数组 event1 和 event2 ，表示发生在同一天的两个闭区间时间段事件，其中：</p>
 * <ul>
 *     <li>event1 = [startTime<sup>1</sup>, endTime<sup>1</sup>] 且</li>
 *     <li>event2 = [startTime<sup>2</sup>, endTime<sup>2</sup>]</li>
 * </ul>
 * <p>事件的时间为有效的 24 小时制且按 HH:MM 格式给出。</p>
 * <p>当两个事件存在某个非空的交集时（即，某些时刻是两个事件都包含的），则认为出现 <strong>冲突</strong> 。</p>
 * <p>如果两个事件之间存在冲突，返回 true ；否则，返回 false 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：event1 = ["01:15","02:00"], event2 = ["02:00","03:00"]
 *     输出：true
 *     解释：两个事件在 2:00 出现交集。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：event1 = ["01:00","02:00"], event2 = ["01:20","03:00"]
 *     输出：true
 *     解释：两个事件的交集从 01:20 开始，到 02:00 结束。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：event1 = ["10:00","11:00"], event2 = ["14:00","15:00"]
 *     输出：false
 *     解释：两个事件不存在交集。
 * </pre>
 * <ul>
 *     <li>evnet1.length == event2.length == 2</li>
 *     <li>event1[i].length == event2[i].length == 5</li>
 *     <li>startTime<sup>1</sup> <= endTime<sup>1</sup></li>
 *     <li>startTime<sup>2</sup> <= endTime<sup>2</sup></li>
 *     <li>所有事件的时间都按照 HH:MM 格式给出</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/determine-if-two-events-have-conflict/">https://leetcode.cn/problems/determine-if-two-events-have-conflict/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2446HaveConflict {

    public boolean haveConflict(String[] event1, String[] event2) {
        return 60 * Integer.parseInt(event1[0].substring(0, 2)) + Integer.parseInt(event1[0].substring(3)) <= 60
                * Integer.parseInt(event2[1].substring(0, 2)) + Integer.parseInt(event2[1].substring(3))
                && 60 * Integer.parseInt(event2[1].substring(0, 2)) + Integer.parseInt(event2[0].substring(3)) <= 60
                * Integer.parseInt(event1[1].substring(0, 2)) + Integer.parseInt(event1[1].substring(3));
    }

}
