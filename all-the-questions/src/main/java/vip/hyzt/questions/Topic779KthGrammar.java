package vip.hyzt.questions;

/**
 * <h1>779. 第K个语法符号</h1>
 * <p>我们构建了一个包含 n 行( <strong>索引从 1 开始</strong> )的表。首先在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。</p>
 * <ul>
 *     <li>例如，对于 n = 3 ，第 1 行是 0 ，第 2 行是 01 ，第3行是 0110 。</li>
 * </ul>
 * <p>给定行数 n 和序数 k，返回第 n 行中第 k 个字符。（ k <strong>索引从 1 开始</strong>）</p>
 * <h2>示例 1:</h2>
 * <pre>
 *     输入: n = 1, k = 1
 *     输出: 0
 *     解释: 第一行：0
 * </pre>
 * <h2>示例 2:</h2>
 * <pre>
 *     输入: n = 2, k = 1
 *     输出: 0
 *     解释:
 *     第一行: 0
 *     第二行: 0<u>1</u>
 * </pre>
 * <h2>示例 3:</h2>
 * <pre>
 *     输入: n = 2, k = 2
 *     输出: 1
 *     解释:
 *     第一行: 0
 *     第二行: 0<u>1</u>
 * </pre>
 * <h2>提示:</h2>
 * <ul>
 *     <li>1 <= n <= 30</li>
 *     <li>1 <= k <= 2n - 1</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/k-th-symbol-in-grammar/description/"></a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic779KthGrammar {

    public int kthGrammar(int n, int k) {
//        if (n == 1) {
//            return 0;
//        }
//        return (k & 1) ^ 1 ^ kthGrammar(n - 1, (k + 1) / 2);

//        return Integer.bitCount(k - 1) & 1;
        k--;
        int res = 0;
        while (k > 0) {
            k &= k - 1;
            res ^= 1;
        }
        return res;
    }

}
