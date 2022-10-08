package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h2>870. 优势洗牌</h2>
 * <p>给定两个大小相等的数组 nums1 和 nums2，nums1 相对于 nums 的优势可以用满足 nums1[i] > nums2[i] 的索引 i 的数目来描述。</p>
 * <p>返回 <span style="color: red">nums1</span> 的<strong>任意</strong>排列，使其相对于 nums2 的优势最大化。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums1 = [2,7,11,15], nums2 = [1,10,4,11]
 *     输出：[2,11,7,15]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums1 = [12,24,8,32], nums2 = [13,25,32,11]
 *     输出：[24,32,8,12]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= nums1.length <= 10<sup>5</sup></li>
 *     <li>nums2.length == nums1.length</li>
 *     <li>0 <= nums1[i], nums2[i] <= 10<sup>9</sup></li>
 * </ul>
 * <h3>js</h3>
 * <pre>
 * const advantageCount = function(nums1, nums2) {
 *   const { length } = nums1;
 *   const idx1 = new Array(length).fill(0);
 *   const idx2 = new Array(length).fill(0);
 *   for (let i = 0; i < length; i++) {
 *     idx1[i] = i;
 *     idx2[i] = i;
 *   }
 *   idx1.sort((i, j) => nums1[i] - nums1[j]);
 *   idx2.sort((i, j) => nums2[i] - nums2[j]);
 *   const result = new Array(length).fill(0);
 *   let left = 0, right = length - 1;
 *   for (let i = 0; i < length; i++) {
 *     if (nums1[idx1[i]] > nums2[idx2[left]]) {
 *       result[idx2[left]] = nums1[idx1[i]];
 *       ++left;
 *     }
 *     else {
 *       result[idx2[right]] = nums1[idx1[i]];
 *       --right;
 *     }
 *   }
 *   return result;
 * }
 * </pre>
 * @see <a href="https://leetcode.cn/problems/advantage-shuffle">https://leetcode.cn/problems/advantage-shuffle</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic870AdvantageCount {

    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Integer[] idx1 = new Integer[n], idx2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx1[i] = i;
            idx2[i] = i;
        }
        Arrays.sort(idx1, (i, j) -> nums1[i] - nums1[j]);
        Arrays.sort(idx2, (i, j) -> nums2[i] - nums2[j]);
        int[] result = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (nums1[idx1[i]] > nums2[idx2[left]]) {
                result[idx2[left]] = nums1[idx1[i]];
                ++left;
            }
            else {
                result[idx2[right]] = nums1[idx1[i]];
                --right;
            }
        }
        return result;
    }

}
