package vip.hyzt.questions;

import vip.hyzt.segmentTree.SegmentTree;

/**
 * <h2>1893. 检查是否区域内所有整数都被覆盖</h2>
 * <p>给你一个二维整数数组 ranges 和两个整数 left 和 right 。每个 ranges[i] = [start<sub>i</sub>, end<sub>i</sub>] 表示一个从 start<sub>i</sub> 到 end<sub>i</sub> 的 <strong>闭区间</strong> 。</p>
 * <p>如果闭区间 [left, right] 内每个整数都被 ranges 中 <string>至少一个</string> 区间覆盖，那么请你返回 true ，否则返回 false</p>
 * <p>已知区间 ranges[i] = [start<sub>i</sub>, end<sub>i</sub>] ，如果整数 x 满足 start<sub>i</sub> <= x <= end<sub>i</sub> ，那么我们称整数x 被覆盖了。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
 *     输出：true
 *     解释：2 到 5 的每个整数都被覆盖了：
 *     - 2 被第一个区间覆盖。
 *     - 3 和 4 被第二个区间覆盖。
 *     - 5 被第三个区间覆盖。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：ranges = [[1,10],[10,20]], left = 21, right = 21
 *     输出：false
 *     解释：21 没有被任何一个区间覆盖。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= ranges.length <= 50</li>
 *     <li>1 <= start<sub>i</sub> <= end<sub>i</sub> <= 50</li>
 *     <li>1 <= left <= right <= 50</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/check-if-all-the-integers-in-a-range-are-covered">https://leetcode.cn/problems/check-if-all-the-integers-in-a-range-are-covered</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1893IsCovered {

    public boolean isCovered(int[][] ranges, int left, int right) {
//        int[] diff = new int[52];
//        for (int[] range : ranges) {
//            ++diff[range[0]];
//            --diff[range[1] + 1];
//        }
//        int curr = 0;
//        for (int i = 1; i <= 50; i++) {
//            curr += diff[i];
//            if (i >= left && i <= right && curr <= 0) {
//                return false;
//            }
//        }
//        return true;
        SegmentTree segmentTree = new SegmentTree(55);
        segmentTree.build(1, 1, 55);
        for (int[] range : ranges) {
            int a = range[0], b = range[1];
            for (int i = a; i <= b; i++) {
                segmentTree.update(1, i);
            }
        }
        int tot = right - left + 1, cnt = segmentTree.query(1, left, right);
        return tot == cnt;
    }

}
