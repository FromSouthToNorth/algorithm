package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>1394.找出数组中最大的幸运数</h3>
 * <p>在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。</p>
 * <p>给你一个整数数组 arr，请你从中找出并返回一个幸运数。</p>
 * <li>如果数组中存在多个幸运数，只需返回 <strong>最大</strong> 的那个。</li>
 * <li>如果数组中不含幸运数，则返回 <strong>-1</strong> 。</li>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：arr = [2,2,3,4]
 *     输出：2
 *     解释：数组中唯一的幸运数是 2 ，因为数值 2 的出现频次也是 2
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：arr = [1,2,2,3,3,3]
 *     输出：3
 *     解释：1、2 以及 3 都是幸运数，只需要返回其中最大的 3 。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：arr = [2,2,2,3,3]
 *     输出：-1
 *     解释：数组中不存在幸运数。
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入：arr = [5]
 *     输出：-1
 * </pre>
 * <h3>示例 5：</h3>
 * <pre>
 *     输入：arr = [7,7,7,7,7,7,7]
 *     输出：7
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= arr.length <= 500</li>
 * <li>1 <= arr[i] <= 500</li>
 * @see <a href="https://leetcode.cn/problems/find-lucky-integer-in-an-array/">https://leetcode.cn/problems/find-lucky-integer-in-an-array/</a>
 * @author hy
 */
public class Topic1394FindLucky {

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(arr.length - 1);
        int ans = -1;
        for (int j : arr) {
            map.put(j, map.containsKey(j) ? map.get(j) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            System.out.printf("key: %d \tvalue: %d\n", key, value);
            if (key == value) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }

}
