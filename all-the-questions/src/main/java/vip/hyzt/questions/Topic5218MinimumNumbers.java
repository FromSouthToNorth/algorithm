package vip.hyzt.questions;

/**
 * <h3>5218. 个位数字为 K 的整数之和</h3>
 * <p>给你两个整数 num 和 k ，考虑具有以下属性的正整数多重集：</p>
 * <ul>
 *     <li>每个整数个位数字都是 k 。</li>
 *     <li>所有整数之和是 num 。</li>
 * </ul>
 * <p>返回该多重集的最小大小，如果不存在这样的多重集，返回 -1 。</p>
 * <p>注意：</p>
 * <ul>
 *     <li>多重集与集合类似，但多重集可以包含多个同一整数，空多重集的和为 0 。</li>
 *     <li>个位数字 是数字最右边的数位。</li>
 * </ul>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：num = 58, k = 9
 *     输出：2
 *     解释：
 *     多重集 [9,49] 满足题目条件，和为 58 且每个整数的个位数字是 9 。
 *     另一个满足条件的多重集是 [19,39] 。
 *     可以证明 2 是满足题目条件的多重集的最小长度。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：num = 37, k = 2
 *     输出：-1
 *     解释：个位数字为 2 的整数无法相加得到 37 。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：num = 0, k = 7
 *     输出：0
 *     解释：空多重集的和为 0 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>0 <= num <= 3000</li>
 *     <li>0 <= k <= 9</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/sum-of-numbers-with-units-digit-k/">https://leetcode.cn/problems/sum-of-numbers-with-units-digit-k/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic5218MinimumNumbers {

    public static int minimumNumbers1(int num, int k) {
        if (num == 0) return 0;
        for (int i = 1; i <= num; i++) {
            int t = num - i * k;
            if (t >= 0 && t % 10 == 0) return i;
        }
        return -1;
    }

    public static int minimumNumbers2(int num, int k) {
        if (num == 0) return 0;
        for (int i = 1, j = num - k; i <= 10 && j >= 0; i++, j -= k) {
            if (j % 10 == 0) return i;
        }
        return -1;
    }

}
