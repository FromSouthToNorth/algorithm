package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>1089. 复写零</h3>
 * <p>给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。</p>
 * <p>注意：请不要在超过该数组长度的位置写入元素。</p>
 * <p>要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：[1,0,2,3,0,4,5,0]
 *     输出：null
 *     解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：[1,2,3]
 *     输出：null
 *     解释：调用函数后，输入的数组将被修改为：[1,2,3]
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= arr.length <= 10000</li>
 * <li>0 <= arr[i] <= 9</li>
 * @see <a href="https://leetcode.cn/problems/duplicate-zeros/">https://leetcode.cn/problems/duplicate-zeros/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1089DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        int n = arr.length, i = 0, j = 0;
        while (j < n) {
            if (arr[i] == 0) j++;
            i++; j++;
        }
        i--; j--;
        while (i >= 0) {
            if (j < n) arr[j] = arr[i];
            if (arr[i] == 0 && --j >= 0) arr[j] = 0;
            i--; j--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
