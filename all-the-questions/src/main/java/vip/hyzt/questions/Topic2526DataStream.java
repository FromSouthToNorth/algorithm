package vip.hyzt.questions;

/**
 * <h1>2526. 找到数据流中的连续整数</h1>
 * <p>给你一个整数数据流，请你实现一个数据结构，检查数据流中最后 k 个整数是否 等于 给定值 value 。</p>
 * <p>请你实现 <strong>DataStream</strong> 类：</p>
 * <ul>
 *     <li>DataStream(int value, int k) 用两个整数 value 和 k 初始化一个空的整数数据流。</li>
 *     <li>boolean consec(int num) 将 num 添加到整数数据流。如果后 k 个整数都等于 value ，返回 true ，否则返回 false 。如果少于 k 个整数，条件不满足，所以也返回 false 。</li>
 * </ul>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：
 *     ["DataStream", "consec", "consec", "consec", "consec"]
 *     [[4, 3], [4], [4], [4], [3]]
 *     输出：
 *     [null, false, false, true, false]
 *
 *     解释：
 *     DataStream dataStream = new DataStream(4, 3); // value = 4, k = 3
 *     dataStream.consec(4); // 数据流中只有 1 个整数，所以返回 False 。
 *     dataStream.consec(4); // 数据流中只有 2 个整数
 *                           // 由于 2 小于 k ，返回 False 。
 *     dataStream.consec(4); // 数据流最后 3 个整数都等于 value， 所以返回 True 。
 *     dataStream.consec(3); // 最后 k 个整数分别是 [4,4,3] 。
 *                           // 由于 3 不等于 value ，返回 False 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= value, num <= 10<sup>9</sup></li>
 *     <li>1 <= k <= 10<sup>5</sup></li>
 *     <li>至多调用 consec 次数为 10<sup>5</sup> 次</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/find-consecutive-integers-from-a-data-stream/description/">https://leetcode.cn/problems/find-consecutive-integers-from-a-data-stream/description/</a>
 */
public class Topic2526DataStream {

    private final int value;

    private final int k;

    private int count;

    Topic2526DataStream(int value, int k) {
        this.value = value;
        this.k = k;
    }

    public boolean consec(int num) {
        this.count = this.value == num ? this.count + 1 : 0;
        return this.count >= k;
    }

}
