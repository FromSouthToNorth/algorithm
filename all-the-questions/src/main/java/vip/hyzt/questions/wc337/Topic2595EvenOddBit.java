package vip.hyzt.questions.wc337;

/**
 * <h1>2595. 奇偶位数</h1>
 * <p></p>
 * <p>给你一个 <strong>正</strong> 整数 n 。</p>
 * <p>用 even 表示在 n 的二进制形式（下标从 <strong>0</strong> 开始）中值为 1 的偶数下标的个数。</p>
 * <p>用 odd 表示在 n 的二进制形式（下标从 <strong>0</strong> 开始）中值为 1 的奇数下标的个数。</p>
 * <p>返回整数数组 answer ，其中 answer = [even, odd] 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：n = 17
 *     输出：[2,0]
 *     解释：17 的二进制形式是 10001 。
 *     下标 0 和 下标 4 对应的值为 1 。
 *     共有 2 个偶数下标，0 个奇数下标。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：n = 2
 *     输出：[0,1]
 *     解释：2 的二进制形式是 10 。
 *     下标 1 对应的值为 1 。
 *     共有 0 个偶数下标，1 个奇数下标。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= n <= 1000</li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/number-of-even-and-odd-bits/">https://leetcode.cn/problems/number-of-even-and-odd-bits/</a>
 */
public class Topic2595EvenOddBit {

    public int[] evenOddBit(int n) {
        int[] result = new int[2];
        for (int i = 0; n > 0; i = 1 - i, n /= 2) {
            result[i] += n % 2;
        }
        return result;
    }

}
