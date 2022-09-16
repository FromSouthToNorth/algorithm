package vip.hyzt.questions;

import static java.util.Arrays.binarySearch;

/**
 * <h2>剑指 Offer 04. 二维数组中的查找</h2>
 * <p>在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。</p>
 * <h3>示例:</h3>
 * <p>现有矩阵 matrix 如下：</p>
 * <pre>
 *     [
 *       [1,   4,  7, 11, 15],
 *       [2,   5,  8, 12, 19],
 *       [3,   6,  9, 16, 22],
 *       [10, 13, 14, 17, 24],
 *       [18, 21, 23, 26, 30]
 *     ]
 * </pre>
 * <p>给定 target = 5，返回 true。</p>
 * <p>给定 target = 20，返回 false。</p>
 * <h3>限制：</h3>
 * <p>0 <= n <= 1000</p>
 * <p>0 <= m <= 1000</p>
 * @see <a href="https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof">https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class TopicOffer04FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        for (int[] ints : matrix) {
//            if (binarySearch(ints, target) != -1) {
//                return true;
//            }
//        }
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            int num = matrix[i][j];
            if (num > target) {
                i--;
            }
            else if (num < target) {
                j++;
            }
            else {
                return true;
            }
        }
        return false;
    }

    private int findNumberIn2DArray(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = ((right - left) >>> 1) + left, num = nums[mid];
            if (num == target) {
                return mid;
            }
            else if (num > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
