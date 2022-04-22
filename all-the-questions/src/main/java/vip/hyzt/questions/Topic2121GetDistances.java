package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h3>2121. 相同元素的间隔之和</h3>
 * <p>给你一个下标从 0 开始，由 `n` 个整数数组的数组 `arr`。</p>
 * <p>arr 中两个元素的 <b>间隔</b> 定义为它们下标之间的 <b>绝对差</b>。更正式地，arr[i] 和 arr[j] 之间的间隔是 |i - j|。</p>
 * <p>放回一个长度为 n 的数组 intervals ，其中 intervals[i] 是 arr[i] 和 arr 中 每个相同元素 (与 arr[i] 的值相同) 的 <b>间隔之和</b>。</p>
 * <p><b>注意：</b>|x| 是 x 的绝对值。</p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>arr = [2,1,3,1,2,3,3]
 *     <strong>输出：</strong>[4,2,7,2,4,4,5]
 *     <strong>解释：</strong>
 *     - 下标 0 ：另一个 2 在下标 4 ，|0 - 4| = 4
 *     - 下标 1 ：另一个 1 在下标 3 ，|1 - 3| = 2
 *     - 下标 2 ：另两个 3 在下标 5 和 6 ，|2 - 5| + |2 - 6| = 7
 *     - 下标 3 ：另一个 1 在下标 1 ，|3 - 1| = 2
 *     - 下标 4 ：另一个 2 在下标 0 ，|4 - 0| = 4
 *     - 下标 5 ：另两个 3 在下标 2 和 6 ，|5 - 2| + |5 - 6| = 4
 *     - 下标 6 ：另两个 3 在下标 2 和 5 ，|6 - 2| + |6 - 5| = 5
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>arr = [10,5,10,10]
 *     <strong>输出：</strong>[5,0,3,4]
 *     <strong>解释：</strong>
 *     - 下标 0 ：另两个 10 在下标 2 和 3 ，|0 - 2| + |0 - 3| = 5
 *     - 下标 1 ：只有这一个 5 在数组中，所以到相同元素的间隔之和是 0
 *     - 下标 2 ：另两个 10 在下标 0 和 3 ，|2 - 0| + |2 - 3| = 3
 *     - 下标 3 ：另两个 10 在下标 0 和 2 ，|3 - 0| + |3 - 2| = 4
 * </pre>
 * <p><b>提示：</b></p>
 * <li>n == arr.length</li>
 * <li>1 <= n <= 105<sup>5</sup></li>
 * <li>1 <= arr[i] <= 10<sup>5</sup></li>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/intervals-between-identical-elements/">2104.子数组范围和</a>
 */
public class Topic2121GetDistances {

    public static long[] getDistances(int[] arr) {
        //key存储的是值,value集合存储的是相同值对应的下标集合
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], t -> new ArrayList<>()).add(i);
        }
        long[] result = new long[arr.length];
        //遍历map的value
        for (List<Integer> list : map.values()) {
            //先计算出当前集合第一个元素所对应的间隔和,后续集合中的其它元素都可根据第一个间隔和推算出来
            for (int i : list) {
                result[list.get(0)] += i - list.get(0);
            }
            //遍历其它的相同元素,并根据第集合中第一个元素对应的间隔和推算出来
            for (int i = 1; i < list.size(); i++) {
                result[list.get(i)] = result[list.get(i - 1)] + (2L * i - list.size()) * (list.get(i) - list.get(i - 1));
            }
        }
        return result;
    }

}
