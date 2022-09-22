package vip.hyzt.questions;

/**
 * <h2>1640. 能否连接形成数组</h2>
 * <p>给你一个整数数组 arr ，数组中的每个整数 <strong>互不相同</strong> 。另有一个由整数数组构成的数组 pieces，其中的整数也 <strong>互不相同</strong>  。请你以 <strong>任意顺序</strong> 连接 pieces 中的数组以形成 arr 。但是，<strong>不允许</strong> 对每个数组 pieces[i] 中的整数重新排序。</p>
 * <p>如果可以连接 pieces 中的数组形成 arr ，返回 true ；否则，返回 false 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：arr = [15,88], pieces = [[88],[15]]
 *     输出：true
 *     解释：依次连接 [15] 和 [88]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：arr = [49,18,16], pieces = [[16,18,49]]
 *     输出：false
 *     解释：即便数字相符，也不能重新排列 pieces[0]
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
 *     输出：true
 *     解释：依次连接 [91]、[4,64] 和 [78]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= pieces.length <= arr.length <= 100</li>
 *     <li>sum(pieces[i].length) == arr.length</li>
 *     <li>1 <= pieces[i].length <= arr.length</li>
 *     <li>1 <= arr[i], pieces[i][j] <= 100</li>
 *     <li>arr 中的整数 <strong>互不相同</strong></li>
 *     <li>pieces 中的整数 <strong>互不相同</strong>（也就是说，如果将 pieces 扁平化成一维数组，数组中的所有整数互不相同）</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/check-array-formation-through-concatenation">https://leetcode.cn/problems/check-array-formation-through-concatenation</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1640CanFormArray {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] index = new int[101];
        for (int i = 0; i < pieces.length; i++) {
            index[pieces[i][0]] = i;
        }
        for (int i = 0; i < arr.length;) {
            if (index[arr[i]] == -1) {
                return false;
            }
            for (int num : pieces[index[arr[i]]]) {
                if (arr[i] != num) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

}
