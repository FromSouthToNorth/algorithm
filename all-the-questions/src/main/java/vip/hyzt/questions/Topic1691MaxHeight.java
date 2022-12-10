package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>1691. 堆叠长方体的最大高度</h1>
 * <p>给你 n 个长方体 cuboids ，其中第 i 个长方体的长宽高表示为 cuboids[i] = [width<sub>i</sub>, length<sub>i</sub>, height<sub>i</sub>]（<strong>下标从 0 开始</strong>）。请你从 cuboids 选出一个 <strong>子集</strong> ，并将它们堆叠起来。</p>
 * <p>如果 width<sub>i</sub> <= width<sub>j</sub> 且 length<sub>i</sub> <= length<sub>j</sub> 且 height<sub>i</sub> <= height<sub>j</sub> ，你就可以将长方体 i 堆叠在长方体 j 上。你可以通过旋转把长方体的长宽高重新排列，以将它放在另一个长方体上。</p>
 * <p>返回 堆叠长方体 cuboids 可以得到的 最大高度 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/12/12/image.jpg">
 * <pre>
 *     输入：cuboids = [[50,45,20],[95,37,53],[45,23,12]]
 *     输出：190
 *     解释：
 *     第 1 个长方体放在底部，53x37 的一面朝下，高度为 95 。
 *     第 0 个长方体放在中间，45x20 的一面朝下，高度为 50 。
 *     第 2 个长方体放在上面，23x12 的一面朝下，高度为 45 。
 *     总高度是 95 + 50 + 45 = 190 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：cuboids = [[38,25,45],[76,35,3]]
 *     输出：76
 *     解释：
 *     无法将任何长方体放在另一个上面。
 *     选择第 1 个长方体然后旋转它，使 35x3 的一面朝下，其高度为 76 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：cuboids = [[7,11,17],[7,17,11],[11,7,17],[11,17,7],[17,7,11],[17,11,7]]
 *     输出：102
 *     解释：
 *     重新排列长方体后，可以看到所有长方体的尺寸都相同。
 *     你可以把 11x7 的一面朝下，这样它们的高度就是 17 。
 *     堆叠长方体的最大高度为 6 * 17 = 102 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>n == cuboids.length</li>
 *     <li>1 <= n <= 100</li>
 *     <li>1 <= width<sub>i</sub>, length<sub>i</sub>, height<sub>i</sub> <= 100</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximum-height-by-stacking-cuboids/">https://leetcode.cn/problems/maximum-height-by-stacking-cuboids/</a>
 */
public class Topic1691MaxHeight {

    public int maxHeight(int[][] cuboids) {
        for (int[] cuboid : cuboids) {
            Arrays.sort(cuboid);
        }
        Arrays.sort(cuboids, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] != b[1] ? a[1] - b[1] : a[2] - b[2]);
        int res = 0, n = cuboids.length;
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (cuboids[j][1] <= cuboids[i][1] && cuboids[j][2] <= cuboids[i][2]) {
                    f[i] = Math.max(f[i], f[j]);
                }
            }
            f[i] += cuboids[i][2];
            res = Math.max(res, f[i]);
        }
        return res;
    }

}
