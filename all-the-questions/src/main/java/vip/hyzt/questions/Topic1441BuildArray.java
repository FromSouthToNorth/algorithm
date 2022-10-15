package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>1441. 用栈操作构建数组</h1>
 * <p>给你一个数组 target 和一个整数 n。每次迭代，需要从  list = { 1 , 2 , 3 ..., n } 中依次读取一个数字。</p>
 * <p>请使用下述操作来构建目标数组 target ：</p>
 * <ul>
 *     <li>"Push"：从 list 中读取一个新元素， 并将其推入数组中。</li>
 *     <li>"Pop"：删除数组中的最后一个元素。</li>
 *     <li>如果目标数组构建完成，就停止读取更多元素。</li>
 * </ul>
 * <p>题目数据保证目标数组严格递增，并且只包含 1 到 n 之间的数字。</p>
 * <p>请返回构建目标数组所用的操作序列。如果存在多个可行方案，返回任一即可。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：target = [1,3], n = 3
 *     输出：["Push","Push","Pop","Push"]
 *     解释：
 *     读取 1 并自动推入数组 -> [1]
 *     读取 2 并自动推入数组，然后删除它 -> [1]
 *     读取 3 并自动推入数组 -> [1,3]
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：target = [1,2,3], n = 3
 *     输出：["Push","Push","Push"]
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：target = [1,2], n = 4
 *     输出：["Push","Push"]
 *     解释：只需要读取前 2 个数字就可以停止。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= target.length <= 100</li>
 *     <li>1 <= n <= 100</li>
 *     <li>1 <= target[i] <= n</li>
 *     <li>target 严格递增</li>
 * </ul>
 * @see <a href=""></a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1441BuildArray {

    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1, j = 0; i <= n; i++) {
            if (j == target.length) {
                break;
            }
            if (i == target[j]) {
                res.add("Push");
                j++;
            }
            else {
                res.add("Push");
                res.add("Pop");
            }
        }
        return res;
    }

}
