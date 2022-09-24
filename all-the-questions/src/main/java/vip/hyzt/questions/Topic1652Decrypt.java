package vip.hyzt.questions;

/**
 * <h2>1652. 拆炸弹</h2>
 * <p>你有一个炸弹需要拆除，时间紧迫！你的情报员会给你一个长度为 n 的 <strong>循环</strong> 数组 code 以及一个密钥 k 。</p>
 * <p>为了获得正确的密码，你需要替换掉每一个数字。所有数字会 同时 被替换。</p>
 * <ul>
 *     <li>如果 k > 0 ，将第 i 个数字用 <strong>接下来</strong> k 个数字之和替换。</li>
 *     <li>如果 k < 0 ，将第 i 个数字用 <strong>之前</strong> k 个数字之和替换。</li>
 *     <li>如果 k == 0 ，将第 i 个数字用 0 替换。</li>
 * </ul>
 * <p>由于 code 是循环的， code[n-1] 下一个元素是 code[0] ，且 code[0] 前一个元素是 code[n-1] 。</p>
 * <p>给你 <strong>循环</strong> 数组 code 和整数密钥 k ，请你返回解密后的结果来拆除炸弹！</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：code = [5,7,1,4], k = 3
 *     输出：[12,10,16,13]
 *     解释：每个数字都被接下来 3 个数字之和替换。解密后的密码为 [7+1+4, 1+4+5, 4+5+7, 5+7+1]。注意到数组是循环连接的。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：code = [1,2,3,4], k = 0
 *     输出：[0,0,0,0]
 *     解释：当 k 为 0 时，所有数字都被 0 替换。
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：code = [2,4,9,3], k = -2
 *     输出：[12,5,6,13]
 *     解释：解密后的密码为 [3+9, 2+3, 4+2, 9+4] 。注意到数组是循环连接的。如果 k 是负数，那么和为 之前 的数字。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>n == code.length</li>
 *     <li>1 <= n <= 100</li>
 *     <li>1 <= code[i] <= 100</li>
 *     <li>-(n - 1) <= k <= n - 1</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/defuse-the-bomb">https://leetcode.cn/problems/defuse-the-bomb</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1652Decrypt {

    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0) {
            return ans;
        }
        int[] sum = new int[n * 2 + 10];
        for (int i = 1; i <= 2 * n; i++) {
            sum[i] += sum[i - 1] + code[(i - 1) % n];
        }
        for (int i = 1; i <= n; i++) {
            if (k < 0) {
                ans[i - 1] = sum[i + n - 1] - sum[i + n + k - 1];
            }
            else {
                ans[i - 1] = sum[i + k] - sum[i];
            }
        }
        return ans;
    }

}
