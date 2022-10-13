package vip.hyzt.questions;

/**
 * <h1>769. 最多能完成排序的块</h1>
 * <p>给定一个长度为 n 的整数数组 arr ，它表示在 [0, n - 1] 范围内的整数的排列。</p>
 * <p>我们将 arr 分割成若干 <strong>块</strong> (即分区)，并对每个块单独排序。将它们连接起来后，使得连接的结果和按升序排序后的原数组相同。</p>
 * <p>返回数组能分成的最多块数量。</p>
 * <h2>示例 1:</h2>
 * <pre>
 *     输入: arr = [4,3,2,1,0]
 *     输出: 1
 *     解释:
 *     将数组分成2块或者更多块，都无法得到所需的结果。
 *     例如，分成 [4, 3], [2, 1, 0] 的结果是 [3, 4, 0, 1, 2]，这不是有序的数组。
 * </pre>
 * <h2>示例 2:</h2>
 * <pre>
 *     输入: arr = [1,0,2,3,4]
 *     输出: 4
 *     解释:
 *     我们可以把它分成两块，例如 [1, 0], [2, 3, 4]。
 *     然而，分成 [1, 0], [2], [3], [4] 可以得到最多的块数。
 * </pre>
 * <h2>提示:</h2>
 * <ul>
 *     <li>n == arr.length</li>
 *     <li>1 <= n <= 10</li>
 *     <li>0 <= arr[i] < n</li>
 *     <li>arr 中每个元素都 不同</li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * const maxChunksToSorted = function(arr) {
 *   let max = 0, res = 0;
 *   for (const i in arr) {
 *     max = Math.max(max, arr[i]);
 *     if (max == i) {
 *       res++;
 *     }
 *   }
 *   return res;
 * }
 *
 * const arr = [[1,0,2,3,4], [4,3,2,1,0]]
 * for (const i in arr) {
 *   console.log(maxChunksToSorted(arr[i]));
 * }
 * </pre>
 * @see <a href="https://leetcode.cn/problems/max-chunks-to-make-sorted/">https://leetcode.cn/problems/max-chunks-to-make-sorted/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic769MaxChunksToSorted {

    public int maxChunksToSorted(int[] arr) {
        int max = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) {
                res++;
            }
        }
        return res;
    }

}
