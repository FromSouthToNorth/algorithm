package vip.hyzt.questions.doublePointer;

/**
 * <h2>977. 有序数组的平方</h2>
 *
 * <p>给你一个 <b>非递减顺序</b> 排序的整数数组 <b>nums</b>，返回 <b>每个数字的平方</b> 组成的新数组，要求 <b>非递减顺序</b> 排序</p>
 *
 * <b>示例 1：</b>
 * <pre>
 *     <strong>输入：</strong>nums = [-4,-1,0,3,10]
 *     <strong>输出：</strong>[0,1,9,16,100]
 *     <strong>解释：</strong>平方后，数组变为 [16,1,0,9,100] 排序后，数组变为 [0,1,9,16,100]
 * </pre>
 *
 * <b>示例 2：</b>
 * <pre>
 *     <strong>输入：</strong>nums = [-7,-3,2,3,11]
 *     <strong>输出：</strong>[4,9,9,49,121]
 * </pre>
 *
 * <b>提示：</b>
 * <ul>
 *     <li>1 <= nums.length <= 104</li>
 *     <li>-104 <= nums[i] <= 104</li>
 *     <li>nums 已按 非递减顺序 排序</li>
 * </ul>
 *
 * @see <a href="https://leetcode-cn.com/problems/squares-of-a-sorted-array">链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array</a>
 * @author hy
 * @author 力扣（LeetCode）
 */
public abstract class SortedSquares {

    /**
     * <p>双指针 非递减顺序 排序</p>
     * @param nums 平方根数组
     * @return 非递减顺序 平方
     */
    public static int[] sortedSquares(int[] nums) {
        int length = nums.length, i = 0, j = length - 1, pos = length - 1;
        int[] result = new int[length];
        while (i <= j) {
            int inum = nums[i] * nums[i], jnum = nums[j] * nums[j];
            if (inum > jnum) {
                result[pos] = inum;
                i++;
            }
            else {
                result[pos] = jnum;
                j--;
            }
            pos--;
        }
        return result;
    }

}
