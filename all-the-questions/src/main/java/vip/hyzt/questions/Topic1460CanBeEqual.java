package vip.hyzt.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <h2>1460. 通过翻转子数组使两个数组相等</h3>
 * <p>给你两个长度相同的整数数组 target 和 arr 。每一步中，你可以选择 arr 的任意 非空子数组 并将它翻转。你可以执行此过程任意次。</p>
 * <p>如果你能让 <i>arr</i> 变得与 <i>target</i> 相同，返回 <i>True</i>；否则，返回 <i>False</i> 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：target = [1,2,3,4], arr = [2,4,1,3]
 *     输出：true
 *     解释：你可以按照如下步骤使 arr 变成 target：
 *     1- 翻转子数组 [2,4,1] ，arr 变成 [1,4,2,3]
 *     2- 翻转子数组 [4,2] ，arr 变成 [1,2,4,3]
 *     3- 翻转子数组 [4,3] ，arr 变成 [1,2,3,4]
 *     上述方法并不是唯一的，还存在多种将 arr 变成 target 的方法。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：target = [7], arr = [7]
 *     输出：true
 *     解释：arr 不需要做任何翻转已经与 target 相等。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：target = [3,7,9], arr = [3,7,11]
 *     输出：false
 *     解释：arr 没有数字 9 ，所以无论如何也无法变成 target 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>target.length == arr.length</li>
 *     <li>1 <= target.length <= 1000</li>
 *     <li>1 <= target[i] <= 1000</li>
 *     <li>1 <= arr[i] <= 1000</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/make-two-arrays-equal-by-reversing-sub-arrays/">https://leetcode.cn/problems/make-two-arrays-equal-by-reversing-sub-arrays/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1460CanBeEqual {

    public static boolean canBeEqual1(int[] target, int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : target) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) - 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean canBeEqual2(int[] target, int[] arr) {
        int[] cnt = new int[1001];
        for (int i = 0; i < target.length; i++) {
            cnt[target[i]]++;
            cnt[arr[i]]--;
        }
        for (int i : cnt) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
