package vip.hyzt.questions;

import java.util.Arrays;

/**
 * 4. 寻找两个正序数组的中位数
 * <p>给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 <b>中位数</b> 。</p>
 *
 * <p>算法的时间复杂度应该为 O(log (m+n)) 。</p>
 *
 * <h3>示例 1：</h3>
 * <ul>
 *     <li>输入：nums1 = [1,3], nums2 = [2]</li>
 *     <li>输出：2.00000</li>
 *     <li>解释：合并数组 = [1,2,3] ，中位数 2</li>
 * </ul>
 *
 * <h3>示例 2：</h2>
 * <ul>
 *     <li>输入：nums1 = [1,2], nums2 = [3,4]</li>
 *     <li>输出：2.50000</li>
 *     <li>解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5</li>
 * </ul>
 *
 * <h3>示例 3：</h2>
 *
 * <ul>
 *     <li>输入：nums1 = [0,0], nums2 = [0,0]</li>
 *     <li>输出：0.00000</li>
 * </ul>
 *
 * <h3>示例 4：</h3>
 * <ul>
 *     <li>输入：nums1 = [], nums2 = [1]</li>
 *     <li>输出：1.00000</li>
 * </ul>
 *
 * <h3>示例 5：</h3>
 * <ul>
 *     <li>输入：nums1 = [2], nums2 = []</li>
 *     <li>输出：2.00000<</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/median-of-two-sorted-arrays">链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public abstract class Topic4FindMedianSortedArrays {

    public static double simpleFindMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int totalLength = length1 + length2;
        int[] totalArray = new int[totalLength];
        System.arraycopy(nums1, 0, totalArray, 0, length1);
        System.arraycopy(nums2, 0, totalArray, length1, length2);
        Arrays.sort(totalArray);
        if (totalLength % 2 == 0) {
            return (totalArray[(totalLength / 2) - 1] + totalArray[(totalLength / 2)]) / 2.0;
        }
        else {
            return totalArray[totalLength / 2];
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length, length2 = nums2.length;
        int totalLength = length1 + length2;
        double median;
        if (totalLength % 2 == 1) {
            int midIndex = totalLength / 2;
            median = binarySearch(nums1, nums2, midIndex + 1);
        }
        else {
            int midIndex1 = (totalLength / 2) - 1, midIndex2 = totalLength / 2;
            median = (binarySearch(nums1, nums2, midIndex1 + 1) + binarySearch(nums1, nums2, midIndex2 + 1)) / 2.0;
        }
        return median;
    }


    /**
     * 主要思路：要找到第 k (k>1) 小的元素，那么就取 pivot1 = nums1[k/2-1] 和 pivot2 = nums2[k/2-1] 进行比较
     * 这里的 "/" 表示整除
     * nums1 中小于等于 pivot1 的元素有 nums1[0 .. k/2-2] 共计 k/2-1 个
     * nums2 中小于等于 pivot2 的元素有 nums2[0 .. k/2-2] 共计 k/2-1 个
     * 取 pivot = min(pivot1, pivot2)，两个数组中小于等于 pivot 的元素共计不会超过 (k/2-1) + (k/2-1) <= k-2 个
     * 这样 pivot 本身最大也只能是第 k-1 小的元素
     * 如果 pivot = pivot1，那么 nums1[0 .. k/2-1] 都不可能是第 k 小的元素。把这些元素全部 "删除"，剩下的作为新的 nums1 数组
     * 如果 pivot = pivot2，那么 nums2[0 .. k/2-1] 都不可能是第 k 小的元素。把这些元素全部 "删除"，剩下的作为新的 nums2 数组
     * 由于我们 "删除" 了一些元素（这些元素都比第 k 小的元素要小），因此需要修改 k 的值，减去删除的数的个数
     */
    public static int binarySearch(int[] nums1, int[] nums2, int k) {
        int length1 = nums1.length,
                length2 = nums2.length;

        int index1 = 0, index2 = 0;

        while (true) {
            // 边界情况
            if (index1 == length1) {
                return nums2[index2 + k - 1];
            }
            if (index2 == length2) {
                return nums1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }

            // 正常情况
            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, length1) - 1;
            int newIndex2 = Math.min(index2 + half, length2) - 1;
            int pivot1 = nums1[newIndex1], pivot2 = nums2[newIndex2];
            if (pivot1 <= pivot2) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            }
            else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }

    /**
     * 暴力解法
     * @return nums1 和 nums2 的中位数
     */
    public static double explosiveSolution(int[] nums1, int[] nums2) {
        // 创建一个两个数组即将合并的数字
        int[] nums;
        // 获取 nums1 的长度
        int m = nums1.length;
        // 获取 nums2 的长度
        int n = nums2.length;
        // 赋予合并数组的长度为 nums1 和 nums2 的长度之和
        nums = new int[m + n];
        // 当 nums1 长度为 0
        // 就计算 nums2 的长度数奇数还是偶数
        // 为偶数 返回 nums2 中位相邻的 两个元素的平均值
        // 为奇数则返回 nums2 的中位数
        if (m == 0) {
            if (n % 2 == 0) {
                return (nums2[n / 2 - 1] + nums2[n / 2]) / 2.0;
            }
            else {
                return nums2[n / 2];
            }
        }
        if (n == 0) {
            if (m % 2 == 0) {
                return (nums1[m / 2 - 1] + nums1[m / 2]) / 2.0;
            }
            else {
                return nums1[m / 2];
            }
        }

        // 正常情况，合并 nums1, nums2 判断奇数偶数返回对应的中位数
        int count = 0;
        int i = 0, j = 0;
        while (count != (m + n)) {
            if (i == m) {
                while (j != n) {
                    nums[count++] = nums2[j++];
                }
                break;
            }
            if (j == n) {
                while (i != m) {
                    nums[count++] = nums1[i++];
                }
                break;
            }
            if (nums1[i] < nums2[i]) {
                nums[count++] = nums1[i++];
            }
            else {
                nums[count++] = nums2[j++];
            }
        }
        if (count % 2 == 0) {
            return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
        }
        else {
            return nums[count / 2];
        }
    }

}