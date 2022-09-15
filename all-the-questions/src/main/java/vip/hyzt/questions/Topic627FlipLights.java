package vip.hyzt.questions;

/**
 * <h2>672. 灯泡开关 Ⅱ</h2>
 * <p>房间中有 n 只已经打开的灯泡，编号从 1 到 n 。墙上挂着 <strong>4 个开关</strong> 。</p>
 * <p>这 4 个开关各自都具有不同的功能，其中：</p>
 * <ul>
 *     <li><strong>开关 1</strong> ：反转当前所有灯的状态（即开变为关，关变为开）</li>
 *     <li><strong>开关 2</strong> ：反转编号为偶数的灯的状态（即 2, 4, ...）</li>
 *     <li><strong>开关 3</strong> ：反转编号为奇数的灯的状态（即 1, 3, ...）</li>
 *     <li><strong>开关 4</strong> ：反转编号为 j = 3k + 1 的灯的状态，其中 k = 0, 1, 2, ...（即 1, 4, 7, 10, ...）</li>
 * </ul>
 *  <p>你必须 <strong>恰好</strong> 按压开关 presses 次。每次按压，你都需要从 4 个开关中选出一个来执行按压操作。</p>
 *  <p>给你两个整数 n 和 presses ，执行完所有按压之后，返回 <strong>不同可能状态</strong> 的数量。</p>
 *  <h3>示例 1：</h3>
 *  <pre>
 *      输入：n = 1, presses = 1
 *      输出：2
 *      解释：状态可以是：
 *      - 按压开关 1 ，[关]
 *      - 按压开关 2 ，[开]
 *  </pre>
 *  <h3>示例 2：</h3>
 *  <pre>
 *      输入：n = 2, presses = 1
 *      输出：3
 *      解释：状态可以是：
 *      - 按压开关 1 ，[关, 关]
 *      - 按压开关 2 ，[开, 关]
 *      - 按压开关 3 ，[关, 开]
 *  </pre>
 *  <h3>示例 3：</h3>
 *  <pre>
 *      输入：n = 3, presses = 1
 *      输出：4
 *      解释：状态可以是：
 *      - 按压开关 1 ，[关, 关, 关]
 *      - 按压开关 2 ，[关, 开, 关]
 *      - 按压开关 3 ，[开, 关, 开]
 *      - 按压开关 4 ，[关, 开, 开]
 *  </pre>
 *  <h3>提示：</h3>
 *  <ul>
 *      <li>1 <= n <= 1000</li>
 *      <li>0 <= presses <= 1000</li>
 *  </ul>
 * @see <a href="https://leetcode.cn/problems/bulb-switcher-ii">https://leetcode.cn/problems/bulb-switcher-ii</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic627FlipLights {

    public int flipLights(int n, int presses) {
        if (presses == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        else if (n == 2) {
            return presses == 1 ? 3 : 4;
        }
        else {
            return presses == 1 ? 4 : presses == 2 ? 7 : 8;
        }
    }

}
