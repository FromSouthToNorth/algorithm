package vip.hyzt.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <h3>1331. 数组序号转换</h3>
 * <p>给你一个整数数组 arr ，请你将数组中的每个元素替换为它们排序后的序号。</p>
 * <p>序号代表了一个元素有多大。序号编号的规则如下：</p>
 * <ul>
 *     <li>序号从 1 开始编号。</li>
 *     <li>一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。</li>
 *     <li>每个数字的序号都应该尽可能地小。</li>
 * </ul>
 * <h3>示例 1：</h3>
 * <pre>
 *     <strong>输入：</strong>arr = [40,10,20,30]
 *     <strong>输出：</strong>[4,1,2,3]
 *     <strong>解释：</strong>40 是最大的元素。 10 是最小的元素。 20 是第二小的数字。 30 是第三小的数字。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入：</strong>arr = [100,100,100]
 *     <strong>输出：</strong>[1,1,1]
 *     <strong>解释：</strong>所有元素有相同的序号。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     <strong>输入：</strong>arr = [37,12,28,9,100,56,80,5,12]
 *     <strong>输出：</strong>[5,3,4,2,8,6,7,1,3]
 * </pre>
 * <p>提示：</p>
 * <ul>
 *     <li>0 <= arr.length <= 10<sup>5</sup></li>
 *     <li>-10<sup>9</sup> <= arr[i] <= 10<sup>9</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/rank-transform-of-an-array/">https://leetcode.cn/problems/rank-transform-of-an-array/</a>
 * @author hy
 */
public class Topic1331ArrayRankTransform {

    public int[] arrayRankTransform(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length, idx = 1;
        for (int i : clone) {
            if (!map.containsKey(i)) {
                map.put(i, idx++);
            }
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }

}
