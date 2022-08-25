package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>658. 找到 K 个最接近的元素</h2>
 * <p>给定一个 <strong>排序好</strong> 的数组 arr ，两个整数 k 和 x ，从数组中找到最靠近 x（两数之差最小）的 k 个数。返回的结果必须要是按升序排好的。</p>
 * <p>整数 a 比整数 b 更接近 x 需要满足：</p>
 * <ul>
 *     <li>|a - x| < |b - x| 或者</li>
 *     <li>|a - x| == |b - x| 且 a < b</li>
 * </ul>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：arr = [1,2,3,4,5], k = 4, x = 3
 *     输出：[1,2,3,4]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：arr = [1,2,3,4,5], k = 4, x = -1
 *     输出：[1,2,3,4]
 * </pre>
 * <ul>
 *     <li>1 <= k <= arr.length</li>
 *     <li>1 <= arr.length <= 10<sup>4</sup></li>
 *     <li>arr 按 升序 排列</li>
 *     <li>-10<sup>4</sup> <= arr[i], x <= 10<sup>4</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/find-k-closest-elements/">https://leetcode.cn/problems/find-k-closest-elements/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic658FindClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int size = arr.length;

        int left = 0;
        int right = size - k;

        while (left < right) {
            // int mid = left + (right - left) / 2;
            int mid = (left + right) >>> 1;
            // 尝试从长度为 k + 1 的连续子区间删除一个元素
            // 从而定位左区间端点的边界值
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }

}
