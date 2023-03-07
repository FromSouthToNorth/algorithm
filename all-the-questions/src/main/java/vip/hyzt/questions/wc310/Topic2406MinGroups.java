package vip.hyzt.questions.wc310;

import java.util.*;

/**
 * <h2>6178. 将区间分为最少组数</h2>
 * <p>给你一个二维整数数组 intervals ，其中 intervals[i] = [left<sub>i</sub>, right<sub>i</sub>] 表示 闭 区间 [left<sub>i</sub>, right<sub>i</sub>] 。</p>
 * <p>你需要将 intervals 划分为一个或者多个区间 <strong>组</strong> ，每个区间 只 属于一个组，且同一个组中任意两个区间 <strong>不相交</strong> 。</p>
 * <p>请你返回 <strong>最少</strong> 需要划分成多少个组。</p>
 * <p>如果两个区间覆盖的范围有重叠（即至少有一个公共数字），那么我们称这两个区间是 <strong>相交</strong> 的。比方说区间 [1, 5] 和 [5, 8] 相交。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]]
 *     输出：3
 *     解释：我们可以将区间划分为如下的区间组：
 *     - 第 1 组：[1, 5] ，[6, 8] 。
 *     - 第 2 组：[2, 3] ，[5, 10] 。
 *     - 第 3 组：[1, 10] 。
 *     可以证明无法将区间划分为少于 3 个组。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：intervals = [[1,3],[5,6],[8,10],[11,13]]
 *     输出：1
 *     解释：所有区间互不相交，所以我们可以把它们全部放在一个组内。
 * </pre>
 * <ul>
 *     <li>1 <= intervals.length <= 10<sup>5</sup></li>
 *     <li>intervals[i].length == 2</li>
 *     <li>1 <= left<sub>i</sub> <= right<sub>i</sub> <= 10<sup>6</sup></li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/divide-intervals-into-minimum-number-of-groups">https://leetcode.cn/problems/divide-intervals-into-minimum-number-of-groups</a>
 */
public class Topic2406MinGroups {

    public int minGroups(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            list.addAll(Set.of(new int[]{interval[0], 1}, new int[]{interval[1], -1}));
        }
        list.sort((o, p) -> o[0] == p[0] ? p[1] - o[1] : o[0] - p[0]);
        int max = 0, count = 0;
        for (int[] ints : list) {
            max = Math.max(max, count += ints[1]);
        }
        return max;
    }

}
