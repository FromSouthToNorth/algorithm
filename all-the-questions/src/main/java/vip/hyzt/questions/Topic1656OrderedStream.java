package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>1656. 设计有序流</h3>
 * <p>有 n 个 (id, value) 对，其中 id 是 1 到 n 之间的一个整数，value 是一个字符串。不存在 id 相同的两个 (id, value) 对。。</p>
 * <p>设计一个流，以 <strong>任意</strong> 顺序获取 n 个 (id, value) 对，并在多次调用时 <strong>按 id 递增的顺序</strong> 返回一些值。</p>
 * <p>实现 OrderedStream 类：</p>
 * <ul>
 *     <li>OrderedStream(int n) 构造一个能接收 n 个值的流，并将当前指针 ptr 设为 1 。</li>
 *     <li>
 *         String[] insert(int id, String value) 向流中存储新的 (id, value)
 *         <ul>
 *             <li>如果流存储有 id = ptr 的 (id, value) 对，则找出从 id = ptr 开始的 <strong>最长 id 连续递增序列</strong> ，并 <strong>按顺序</strong> 返回与这些 id 关联的值的列表。然后，将 ptr 更新为最后那个 id + 1。</li>
 *             <li>否则，返回一个空列表。</li>
 *         </ul>
 *     </li>
 * </ul>
 * <h4>示例：</h4>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/15/q1.gif">
 * <pre>
 *     输入
 *     ["OrderedStream", "insert", "insert", "insert", "insert", "insert"]
 *     [[5], [3, "ccccc"], [1, "aaaaa"], [2, "bbbbb"], [5, "eeeee"], [4, "ddddd"]]
 *     输出
 *     [null, [], ["aaaaa"], ["bbbbb", "ccccc"], [], ["ddddd", "eeeee"]]
 *
 *     解释
 *     OrderedStream os= new OrderedStream(5);
 *     os.insert(3, "ccccc"); // 插入 (3, "ccccc")，返回 []
 *     os.insert(1, "aaaaa"); // 插入 (1, "aaaaa")，返回 ["aaaaa"]
 *     os.insert(2, "bbbbb"); // 插入 (2, "bbbbb")，返回 ["bbbbb", "ccccc"]
 *     os.insert(5, "eeeee"); // 插入 (5, "eeeee")，返回 []
 *     os.insert(4, "ddddd"); // 插入 (4, "ddddd")，返回 ["ddddd", "eeeee"]
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= n <= 1000</li>
 *     <li>1 <= id <= n</li>
 *     <li>value.length == 5</li>
 *     <li>value 仅由小写字母组成</li>
 *     <li>每次调用 insert 都会使用一个唯一的 id</li>
 *     <li>恰好调用 n 次 insert</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/design-an-ordered-stream">https://leetcode.cn/problems/design-an-ordered-stream</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1656OrderedStream {

    private final String[] data;
    private int index;

    public Topic1656OrderedStream(int n) {
        data = new String[n + 1];
        index = 1;
    }

    public List<String> insert(int idKey, String value) {
        data[idKey] = value;
        List<String> result = new ArrayList<>();
        while (index < data.length && data[index] != null) {
            result.add(data[index]);
            index++;
        }
        return result;
    }

}
