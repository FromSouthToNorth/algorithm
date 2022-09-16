package vip.hyzt.questions;

import java.util.*;

/**
 * <h2>850. 矩形面积 II</h2>
 * <p>我们给出了一个（轴对齐的）二维矩形列表 rectangles 。 对于 rectangle[i] = [x1, y1, x2, y2]，其中（x1，y1）是矩形 i 左下角的坐标， (x<sub>i1</sub>, y<sub>i1</sub>) 是该矩形 <strong>左下角</strong> 的坐标， (x<sub>i2</sub>, y<sub>i2</sub>) 是该矩形 <strong>右上角</strong> 的坐标。</p>
 * <p>计算平面中所有 rectangles 所覆盖的 <strong>总面积</strong> 。任何被两个或多个矩形覆盖的区域应只计算 <strong>一次 </strong> 。</p>
 * <p>返回 <em><strong>总面积</strong></em> 。因为答案可能太大，返回 10<sup>9</sup> + 7 的 <strong>模</strong> 。</p>
 * <h3>示例 1：</h3>
 * <img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/06/06/rectangle_area_ii_pic.png">
 * <pre>
 *     输入：rectangles = [[0,0,2,2],[1,0,2,3],[1,0,3,1]]
 *     输出：6
 *     解释：如图所示，三个矩形覆盖了总面积为6的区域。
 *     从(1,1)到(2,2)，绿色矩形和红色矩形重叠。
 *     从(1,0)到(2,3)，三个矩形都重叠。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：rectangles = [[0,0,1000000000,1000000000]]
 *     输出：49
 *     解释：答案是 1018 对 (109 + 7) 取模的结果， 即 49 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= rectangles.length <= 200</li>
 *     <li>rectanges[i].length = 4</li>
 *     <li>0 <= x<sub>i1</sub>, y<sub>i1</sub>, x<sub>i2</sub>, y<sub>i2</sub> <= 10<sup>9</sup></li>
 *     <li>矩形叠加覆盖后的总面积不会超越 ^63 - 1 ，这意味着可以用一个 64 位有符号整数来保存面积结果。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/rectangle-area-ii">https://leetcode.cn/problems/rectangle-area-ii</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic850RectangleArea {

    private Segtree[] tree;
    private List<Integer> hbound;

    public int rectangleArea(int[][] rectangles) {
        final int MOD = 1000000007;
        int n = rectangles.length;
        Set<Integer> set = new HashSet<Integer>();
        for (int[] rect : rectangles) {
            // 下边界
            set.add(rect[1]);
            // 上边界
            set.add(rect[3]);
        }
        hbound = new ArrayList<Integer>(set);
        Collections.sort(hbound);
        int m = hbound.size();
        // 线段树有 m-1 个叶子节点，对应着 m-1 个会被完整覆盖的线段，需要开辟 ~4m 大小的空间
        tree = new Segtree[m * 4 + 1];
        init(1, 1, m - 1);

        List<int[]> sweep = new ArrayList<int[]>();
        for (int i = 0; i < n; ++i) {
            // 左边界
            sweep.add(new int[]{rectangles[i][0], i, 1});
            // 右边界
            sweep.add(new int[]{rectangles[i][2], i, -1});
        }
        sweep.sort((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            else if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            else {
                return a[2] - b[2];
            }
        });

        long ans = 0;
        for (int i = 0; i < sweep.size(); ++i) {
            int j = i;
            while (j + 1 < sweep.size() && sweep.get(i)[0] == sweep.get(j + 1)[0]) {
                ++j;
            }
            if (j + 1 == sweep.size()) {
                break;
            }
            // 一次性地处理掉一批横坐标相同的左右边界
            for (int k = i; k <= j; ++k) {
                int[] arr = sweep.get(k);
                int idx = arr[1], diff = arr[2];
                // 使用二分查找得到完整覆盖的线段的编号范围
                int left = binarySearch(hbound, rectangles[idx][1]) + 1;
                int right = binarySearch(hbound, rectangles[idx][3]);
                update(1, 1, m - 1, left, right, diff);
            }
            ans += (long) tree[1].length * (sweep.get(j + 1)[0] - sweep.get(j)[0]);
            i = j;
        }
        return (int) (ans % MOD);
    }

    public void init(int idx, int l, int r) {
        tree[idx] = new Segtree();
        if (l == r) {
            tree[idx].maxLength = hbound.get(l) - hbound.get(l - 1);
            return;
        }
        int mid = (l + r) / 2;
        init(idx * 2, l, mid);
        init(idx * 2 + 1, mid + 1, r);
        tree[idx].maxLength = tree[idx * 2].maxLength + tree[idx * 2 + 1].maxLength;
    }

    public void update(int idx, int l, int r, int ul, int ur, int diff) {
        if (l > ur || r < ul) {
            return;
        }
        if (ul <= l && r <= ur) {
            tree[idx].cover += diff;
            pushup(idx, l, r);
            return;
        }
        int mid = (l + r) / 2;
        update(idx * 2, l, mid, ul, ur, diff);
        update(idx * 2 + 1, mid + 1, r, ul, ur, diff);
        pushup(idx, l, r);
    }

    public void pushup(int idx, int l, int r) {
        if (tree[idx].cover > 0) {
            tree[idx].length = tree[idx].maxLength;
        }
        else if (l == r) {
            tree[idx].length = 0;
        }
        else {
            tree[idx].length = tree[idx * 2].length + tree[idx * 2 + 1].length;
        }
    }

    public int binarySearch(List<Integer> hbound, int target) {
        int left = 0, right = hbound.size() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (hbound.get(mid) >= target) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}

/**
 * 线段树
 */
class Segtree {
    int cover = 0;
    int length = 0;
    int maxLength = 0;
}
