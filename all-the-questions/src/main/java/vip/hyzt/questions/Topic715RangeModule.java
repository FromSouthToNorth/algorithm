package vip.hyzt.questions;

import java.util.Map;
import java.util.TreeMap;

/**
 * <h3>715. Range 模块</h3>
 * <p>Range模块是跟踪数字范围的模块。设计一个数据结构来跟踪表示为 半开区间 的范围并查询它们。</p>
 * <p>半开区间 [left, right) 表示所有 left <= x < right 的实数 x 。</p>
 * <p>实现 RangeModule 类:</p>
 * <ul>
 *     <li>RangeModule() 初始化数据结构的对象。</li>
 *     <li>void addRange(int left, int right) 添加 半开区间[left, right)，跟踪该区间中的每个实数。添加与当前跟踪的数字部分重叠的区间时，应当添加在区间[left, right)中尚未跟踪的任何数字到该区间中。</li>
 *     <li>boolean queryRange(int left, int right)只有在当前正在跟踪区间[left, right)中的每一个实数时，才返回 true，否则返回 false 。</li>
 *     <li>void removeRange(int left, int right) 停止跟踪 半开区间 [left, right) 中当前正在跟踪的每个实数。</li>
 * </ul>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入
 *     ["RangeModule", "addRange", "removeRange", "queryRange", "queryRange", "queryRange"]
 *     [[], [10, 20], [14, 16], [10, 14], [13, 15], [16, 17]]
 *     输出
 *     [null, null, null, true, false, true]
 *
 *     解释
 *     RangeModule rangeModule = new RangeModule();
 *     rangeModule.addRange(10, 20);
 *     rangeModule.removeRange(14, 16);
 *     rangeModule.queryRange(10, 14); 返回 true （区间 [10, 14) 中的每个数都正在被跟踪）
 *     rangeModule.queryRange(13, 15); 返回 false（未跟踪区间 [13, 15) 中像 14, 14.03, 14.17 这样的数字）
 *     rangeModule.queryRange(16, 17); 返回 true （尽管执行了删除操作，区间 [16, 17) 中的数字 16 仍然会被跟踪）
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= left < right <= 10<sup>9</sup></li>
 * <li>在单个测试用例中，对 addRange 、  queryRange 和 removeRange 的调用总数不超过 10<sup>4</sup> 次</li>
 * @see <a href="https://leetcode.cn/problems/range-module/">https://leetcode.cn/problems/range-module/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic715RangeModule {

    TreeMap<Integer, Integer> intervals;

    public Topic715RangeModule() {
        intervals = new TreeMap<>();
    }

    public void addRange(int left, int right) {
        Map.Entry<Integer, Integer> entry = intervals.higherEntry(left);
        if (entry != intervals.firstEntry()) {
            Map.Entry<Integer, Integer> start = entry != null ? intervals.lowerEntry(entry.getKey())
                    : intervals.lastEntry();
            if (start != null && start.getValue() >= right) {
                return;
            }
            if (start != null && start.getValue() >= left) {
                left = start.getKey();
                intervals.remove(start.getKey());
            }
        }
        while (entry != null && entry.getKey() <= right) {
            right = Math.max(right, entry.getValue());
            intervals.remove(entry.getKey());
            entry = intervals.higherEntry(entry.getKey());
        }
        intervals.put(left, right);
    }

    public boolean queryRange(int left, int right) {
        Map.Entry<Integer, Integer> entry = intervals.higherEntry(left);
        if (entry == intervals.firstEntry()) {
            return false;
        }
        entry = entry != null ? intervals.lowerEntry(entry.getKey()) : intervals.lastEntry();
        return entry != null && right <= entry.getValue();
    }

    public void removeRange(int left, int right) {
        Map.Entry<Integer, Integer> entry = intervals.higherEntry(left);
        if (entry != intervals.firstEntry()) {
            Map.Entry<Integer, Integer> start = entry != null ? intervals.lowerEntry(entry.getKey())
                    : intervals.lastEntry();
            if (start != null && start.getValue() >= right) {
                int ri = start.getValue();
                if (start.getKey() == left) {
                    intervals.remove(start.getKey());
                }
                else {
                    intervals.put(start.getKey(), left);
                }
                if (right != ri) {
                    intervals.put(right, ri);
                }
                return;
            }
            else if (start != null && start.getValue() > left) {
                intervals.put(start.getKey(), left);
            }
        }
        while (entry != null && entry.getKey() < right) {
            if (entry.getValue() <= right) {
                intervals.remove(entry.getKey());
                entry = intervals.higherEntry(entry.getKey());
            }
            else {
                intervals.put(right, entry.getValue());
                intervals.remove(entry.getKey());
                break;
            }
        }
    }

}
