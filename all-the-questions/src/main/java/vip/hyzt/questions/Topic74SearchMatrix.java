package vip.hyzt.questions;

/**
 * <h1>74. 搜索二维矩阵</h1>
 * <p>编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：</p>
 * <ul>
 *     <li>每行中的整数从左到右按升序排列。</li>
 *     <li>每行的第一个整数大于前一行的最后一个整数。</li>
 * </ul>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2020/10/05/mat.jpg">
 * <pre>
 *     输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 *     输出：true
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/25/mat2.jpg">
 * <pre>
 *     输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 *     输出：false
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>m == matrix.length</li>
 *     <li>n == matrix[i].length</li>
 *     <li>1 <= m, n <= 100</li>
 *     <li>-10<sup>4</sup> <= matrix[i][j], target <= 10<sup>4</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/search-a-2d-matrix/description/">https://leetcode.cn/problems/search-a-2d-matrix/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic74SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            int num = matrix[mid / n][mid % n];
            if (num == target) {
                return true;
            }
            else if (num > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return false;
    }

}
