package vip.hyzt.questions;

/**
 * <h1>2483. 商店的最少代价</h1>
 * <p>给你一个顾客访问商店的日志，用一个下标从 <strong>0</strong> 开始且只包含字符 'N' 和 'Y' 的字符串 customers 表示：</p>
 * <ul>
 *     <li>如果第 i 个字符是 'Y' ，它表示第 i 小时有顾客到达。</li>
 *     <li>如果第 i 个字符是 'N' ，它表示第 i 小时没有顾客到达。</li>
 * </ul>
 * <p>如果商店在第 j 小时关门（0 <= j <= n），代价按如下方式计算：</p>
 * <ul>
 *     <li>在开门期间，如果某一个小时没有顾客到达，代价增加 1 。</li>
 *     <li>在关门期间，如果某一个小时有顾客到达，代价增加 1 。</li>
 * </ul>
 * <p>请你返回在确保代价 <strong>最小</strong> 的前提下，商店的 <strong>最早</strong> 关门时间。</p>
 * <p>注意，商店在第 j 小时关门表示在第 j 小时以及之后商店处于关门状态。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：customers = "YYNY"
 *     输出：2
 *     解释：
 *     - 第 0 小时关门，总共 1+1+0+1 = 3 代价。
 *     - 第 1 小时关门，总共 0+1+0+1 = 2 代价。
 *     - 第 2 小时关门，总共 0+0+0+1 = 1 代价。
 *     - 第 3 小时关门，总共 0+0+1+1 = 2 代价。
 *     - 第 4 小时关门，总共 0+0+1+0 = 1 代价。
 *     在第 2 或第 4 小时关门代价都最小。由于第 2 小时更早，所以最优关门时间是 2 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：customers = "NNNNN"
 *     输出：0
 *     解释：最优关门时间是 0 ，因为自始至终没有顾客到达。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：customers = "YYYY"
 *     输出：4
 *     解释：最优关门时间是 4 ，因为每一小时均有顾客到达。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= customers.length <= 10<sup>5</sup></li>
 *     <li>customers 只包含字符 'Y' 和 'N' 。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-penalty-for-a-shop/">https://leetcode.cn/problems/minimum-penalty-for-a-shop/</a>
 */
public class Topic2483BestClosingTime {

    public int bestClosingTime(String customers) {
        int count = 0, min = 0, res = customers.length();
        for (char c : customers.toCharArray()) {
            min = count += c == 'Y' ? 0 : 1;
        }
        for (int i = customers.length() - 1; i >= 0 ; i--) {
            res = (count += customers.charAt(i) == 'Y' ? 1 : -1) > (min = Math.min(min, count)) ? res : i;
        }
        return res;
    }

}
