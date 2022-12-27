package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>2517. 礼盒的最大甜蜜度</h1>
 * <p>给你一个正整数数组 price ，其中 price[i] 表示第 i 类糖果的价格，另给你一个正整数 k 。</p>
 * <p>商店组合 k 类 <strong>不同</strong> 糖果打包成礼盒出售。礼盒的 <strong>甜蜜度</strong> 是礼盒中任意两种糖果 <strong>价格</strong> 绝对差的最小值。</p>
 * <p>返回礼盒的 <strong>最大</strong> 甜蜜度。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：price = [13,5,1,8,21,2], k = 3
 *     输出：8
 *     解释：选出价格分别为 [13,5,21] 的三类糖果。
 *     礼盒的甜蜜度为 min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8 。
 *     可以证明能够取得的最大甜蜜度就是 8 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：price = [1,3,1], k = 2
 *     输出：2
 *     解释：选出价格分别为 [1,3] 的两类糖果。
 *     礼盒的甜蜜度为 min(|1 - 3|) = min(2) = 2 。
 *     可以证明能够取得的最大甜蜜度就是 2 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：price = [7,7,7,7], k = 2
 *     输出：0
 *     解释：从现有的糖果中任选两类糖果，甜蜜度都会是 0 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= price.length <= 10<sup>5</sup></li>
 *     <li>1 <= price[i] <= 10<sup>9</sup></li>
 *     <li>2 <= k <= price.length</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximum-tastiness-of-candy-basket/">https://leetcode.cn/problems/maximum-tastiness-of-candy-basket/</a>
 */
public class Topic2517MaximumTastiness {

    public int maximumTastiness(int[] price, int k) {
        int left = 0, right = 1000000000;
        for (Arrays.sort(price); left < right;) {
            int mid = (left + right + 1) / 2, count = 1;
            for (int i = 1, prev = 0; i < price.length; i++) {
                if (price[i] - price[prev] >= mid) {
                    count++;
                    prev = i;
                }
            }
            if (count < k) {
                right = mid - 1;
            }
            else {
                left = mid;
            }
        }
        return left;
    }

}
