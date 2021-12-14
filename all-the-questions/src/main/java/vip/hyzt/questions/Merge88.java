package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <p>给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。<p/>
 *
 * <p>请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。</p>
 *
 * <p>注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。</p>
 *
 * <b>示例 1：<b/>
 * <ul>
 *     <li>输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3</li>
 *     <li> 输出：[1,2,2,3,5,6]</li>
 *     <li>解释：需要合并 [1,2,3] 和 [2,5,6] 。</li>
 *     <li>合并结果是 [<i>1</i>,<i>2</i>,2,<i>3</i>,5,6] ，其中斜体加粗标注的为 nums1 中的元素。</li>
 * </ul>
 *
 * <b>示例 2：</b>
 *
 * <ul>
 *     <li>输入：nums1 = [1], m = 1, nums2 = [], n = 0</li>
 *     <li>输出：[1]</li>
 *     <li>解释：需要合并 [1] 和 [] 。</li>
 *     <li>合并结果是 [1] 。</li>
 * </ul>
 *
 * <b>示例 3：</b>
 *
 * <ul>
 *     <li>输入：nums1 = [0], m = 0, nums2 = [1], n = 1</li>
 *     <li>输出：[1]</li>
 *     <li>解释：需要合并的数组是 [] 和 [1] 。</li>
 *     <li>合并结果是 [1] 。</li>
 *     <li>注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/merge-sorted-array">链接：https://leetcode-cn.com/problems/merge-sorted-array</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public abstract class Merge88 {

    /**
     * <p>调用 Java 中 {@link System#arraycopy(Object, int, Object, int, int)} 方法 合并数组</p>
     * <p>并调用用 {@link Arrays#sort(int[])} 方法进行排序</p>
     *
     * @param nums1 需要排序的有序数组 1
     * @param m     需要排序的有序数组 1 长度
     * @param nums2 需要排序的有序数组 2
     * @param n     需要排序的有序数组 2 长度
     */
    public static void systemArraycopySortMerge(int[] nums1, int m, int[] nums2, int n) {
        // 将 nums2 数组为 0 的起始下标开始复制，到 nums1 为 m 的位置起始复制 n 个元素
        System.arraycopy(nums2, 0, nums1, m, n);
        // 进行排序
        Arrays.sort(nums1);
    }

    /**
     * <p>使用双指针进行合并排序</p>
     * @param nums1 需要排序的有序数组 1
     * @param m     需要排序的有序数组 1 长度
     * @param nums2 需要排序的有序数组 2
     * @param n     需要排序的有序数组 2 长度
     */
    public static void doublePointerMerge(int[] nums1, int m, int[] nums2, int n) {

        int[] num1Copy = new int[m];
        System.arraycopy(nums1, 0, num1Copy, 0, m);
        int pointerOne = 0;
        int pointerTwo = 0;
        int pointer = 0;

        while ((pointerOne < m) && (pointerTwo < n)) {
            nums1[pointer++] = (num1Copy[pointerOne] < nums2[pointerTwo]) ? num1Copy[pointerOne++] : nums2[pointerTwo++];
        }

        if (pointerOne < m) {
            System.arraycopy(num1Copy, pointerOne, nums1, pointerOne + pointerTwo, m + n - pointerOne - pointerTwo);
        }

        if (pointerTwo < n) {
            System.arraycopy(nums2, pointerTwo, nums1, pointerOne + pointerTwo, m + n - pointerOne - pointerTwo);
        }
    }

    /**
     * <p>使用双指针末尾倒序进行合并排序</p>
     * @param nums1 需要排序的有序数组 1
     * @param m     需要排序的有序数组 1 长度
     * @param nums2 需要排序的有序数组 2
     * @param n     需要排序的有序数组 2 长度
     */
    public static void doublePointerReverseOrderMerge(int[] nums1, int m, int[] nums2, int n) {

        // 定义 num1 倒序迭代的指针
        int pointerOne = m - 1;
        // 定义 num2 倒序迭代的指针
        int pointerTwo = n - 1;
        // 定义合并后的数组的指针
        int pointer = m + n - 1;
        // 倒序迭代 nums1, nums2 当指针为 0 终止迭代
        while ((pointerOne >= 0) && (pointerTwo >= 0)) {
            ///////////////////////////
            //                       7
            //                       ↓
            // [1, 2, 3, 4, 0, 0, 0, 0]  pointerOne = 3, pointerTwo = 3, pointer = 7, nums1[pointerOne] = 4, nums2[pointerTwo] = 7
            //                    6
            //                    ↓
            // [1, 2, 3, 4, 0, 0, 0, 7]  pointerOne = 3, pointerTwo = 2, pointer = 6, nums1[pointerOne] = 4, nums2[pointerTwo] = 6
            //                 4
            //                 ↓
            // [1, 2, 3, 4, 0, 0, 6, 7]  pointerOne = 3, pointerTwo = 1, pointer = 5, nums1[pointerOne] = 4, nums2[pointerTwo] = 4
            //              4
            //              ↓
            // [1, 2, 3, 4, 4, 4, 6, 7]  pointerOne = 2, pointerTwo = 1, pointer = 4, nums1[pointerOne] = 3, nums2[pointerTwo] = 4
            //           3
            //           ↓
            // [1, 2, 3, 3, 4, 4, 6, 7]  pointerOne = 2, pointerTwo = 0, pointer = 3, nums1[pointerOne] = 3, nums2[pointerTwo] = 2
            //        2
            //        ↓
            // [1, 2, 2, 3, 4, 4, 6, 7]  pointerOne = 1, pointerTwo = 0, pointer = 2, nums1[pointerOne] = 2, nums2[pointerTwo] = 2
            //     2
            //     ↓
            // [1, 2, 2, 3, 4, 4, 6, 7]  pointerOne = 0, pointerTwo = 0, pointer = 1, nums1[pointerOne] = 1, nums2[pointerTwo] = 2
            //
            // 合并 nums1 和 nums2, 并判断 num1[pointerOne] 小于 nums2[pointerTwo] 时 倒序插入 nums2[pointerTwo--] 否则为 nums1[pointerOne--]
            nums1[pointer--] = (nums1[pointerOne] < nums2[pointerTwo]) ? nums2[pointerTwo--] : nums1[pointerOne--];
        }
        System.arraycopy(nums2, 0, nums1, 0, pointerTwo + 1);
    }

}
