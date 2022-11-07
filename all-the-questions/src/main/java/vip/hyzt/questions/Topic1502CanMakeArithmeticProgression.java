package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h2>1502. 判断能否形成等差数列</h2>
 * <p>给你一个数字数组 arr 。</p>
 * <p>如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。</p>
 * <p>如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：arr = [3,5,1]
 *     输出：true
 *     解释：对数组重新排序得到 [1,3,5] 或者 [5,3,1] ，任意相邻两项的差分别为 2 或 -2 ，可以形成等差数列。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：arr = [1,2,4]
 *     输出：false
 *     解释：无法通过重新排序得到等差数列。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>2 <= arr.length <= 1000</li>
 *     <li>-10^6 <= arr[i] <= 10^6</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/can-make-arithmetic-progression-from-sequence/">https://leetcode.cn/problems/can-make-arithmetic-progression-from-sequence/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1502CanMakeArithmeticProgression {

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int num = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) != num) {
                return false;
            }
        }
        return true;
    }

}
