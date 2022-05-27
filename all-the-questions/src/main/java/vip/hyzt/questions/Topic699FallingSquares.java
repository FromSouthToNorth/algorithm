package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>699. 掉落的方块</h3>
 * <p>在二维平面上的 x 轴上，放置着一些方块。</p>
 * <p>给你一个二维整数数组 `positions` ，其中 `positions[i] = [left<sub>i</sub>, sideLength<sub>i</sub>]` 表示：第 `i` 个方块边长为 `sideLength<sub>i</sub>` ，其左侧边与 `x` 轴上坐标点 `left<sub>i</sub>` 对齐。</p>
 * <p>每个方块都从一个比目前所有的落地方块更高的高度掉落而下。方块沿 y 轴负方向下落，直到着陆到 <strong>另一个正方形的顶边</strong> 或者是 <strong>x 轴上</strong> 。一个方块仅仅是擦过另一个方块的左侧边或右侧边不算着陆。一旦着陆，它就会固定在原地，无法移动。</p>
 * <p>在每个方块掉落后，你必须记录目前所有已经落稳的 <strong>方块堆叠的最高高度</strong> 。</p>
 * <p>返回一个整数数组 `ans` ，其中 `ans[i]` 表示在第 `i` 块方块掉落后堆叠的最高高度。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode.com/uploads/2021/04/28/fallingsq1-plane.jpg">
 * <pre>
 *     输入：positions = [[1,2],[2,3],[6,1]]
 *     输出：[2,5,5]
 *     解释：
 *     第 1 个方块掉落后，最高的堆叠由方块 1 组成，堆叠的最高高度为 2 。
 *     第 2 个方块掉落后，最高的堆叠由方块 1 和 2 组成，堆叠的最高高度为 5 。
 *     第 3 个方块掉落后，最高的堆叠仍然由方块 1 和 2 组成，堆叠的最高高度为 5 。
 *     因此，返回 [2, 5, 5] 作为答案。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：positions = [[100,100],[200,100]]
 *     输出：[100,100]
 *     解释：
 *     第 1 个方块掉落后，最高的堆叠由方块 1 组成，堆叠的最高高度为 100 。
 *     第 2 个方块掉落后，最高的堆叠可以由方块 1 组成也可以由方块 2 组成，堆叠的最高高度为 100 。
 *     因此，返回 [100, 100] 作为答案。
 *     注意，方块 2 擦过方块 1 的右侧边，但不会算作在方块 1 上着陆。
 * </pre>
 * <h3>提示: </h3>
 * <li>1 <= positions.length <= 1000</li>
 * <li>1 <= left<sub>i</sub> <= 10<sup>8</sup></li>
 * <li>1 <= sideLength<sub>i</sub> <= 10<sup>6</sup></li>
 * @see <a href="https://leetcode.cn/problems/falling-squares">链接：https://leetcode.cn/problems/falling-squares</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic699FallingSquares {

    static int N = (int)1e9;

    static class Node {
        // ls 和 rs 分别代表当前区间的左右子节点
        Node ls, rs;
        // val 代表当前区间的最大高度，add 为懒标记
        int val, add;
    }

    static Node ROOT = new Node();

    static void update(Node node, int lc, int rc, int l, int r, int v) {
        if (l <= lc && rc <= r) {
            node.add = v;
            node.val = v;
            return;
        }
        pushup(node);
        int mid = lc + rc >> 1;
        if (l <= mid) update(node.ls, lc, mid, l, r, v);
        if (r > mid) update(node.rs, mid + 1, rc, l, r, v);
        pushup(node);
    }

    static int query(Node node, int lc, int rc, int l, int r) {
        if (l <= lc && rc <= r) return node.val;
        pushdown(node);
        int mid = lc + rc >> 1, ans = 0;
        if (l <= mid) ans = query(node.ls, lc, mid, l, r);
        if (r > mid)  ans = Math.max(ans, query(node.rs, mid + 1, rc, l, r));
        return ans;
    }

    static void pushdown(Node node) {
        if (node.ls == null) node.ls = new Node();
        if (node.rs == null) node.rs = new Node();
        if (node.add == 0) return;
        node.ls.add = node.add; node.rs.add = node.add;
        node.ls.val = node.add; node.rs.val = node.add;
        node.add = 0;
    }

    static void pushup(Node node) {
        node.val = Math.max(node.ls.val, node.rs.val);
    }

    public static List<Integer> fallingSquares(int[][] positions) {
        List<Integer> ans = new ArrayList<>();
        for (int[] info : positions) {
            int x = info[0], h = info[1], cur = query(ROOT, 0, N, x, x + h - 1);
            update(ROOT, 0, N, x, x + h - 1, cur + h);
            ans.add(ROOT.val);
        }
        return ans;
    }

}
