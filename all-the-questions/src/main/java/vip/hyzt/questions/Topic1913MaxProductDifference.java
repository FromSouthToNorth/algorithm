package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>1913. 两个数对之间的最大乘积差</h3>
 * <p>两个数对 (a, b) 和 (c, d) 之间的 乘积差 定义为 (a * b) - (c * d) 。</p>
 * <li>例如，(5, 6) 和 (2, 7) 之间的乘积差是 (5 * 6) - (2 * 7) = 16 。</li>
 * <p>给你一个整数数组 nums ，选出四个 不同的 下标 w、x、y 和 z ，使数对 (nums[w], nums[x]) 和 (nums[y], nums[z]) 之间的 乘积差 取到 最大值 。</p>
 * <p>返回以这种方式取得的乘积差中的 最大值 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：nums = [5,6,2,7,4]
 *     输出：34
 *     解释：可以选出下标为 1 和 3 的元素构成第一个数对 (6, 7) 以及下标 2 和 4 构成第二个数对 (2, 4)
 *     乘积差是 (6 * 7) - (2 * 4) = 34
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：nums = [4,2,5,9,7,4,8]
 *     输出：64
 *     解释：可以选出下标为 3 和 6 的元素构成第一个数对 (9, 8) 以及下标 1 和 5 构成第二个数对 (2, 4)
 *     乘积差是 (9 * 8) - (2 * 4) = 64
 * </pre>
 * <h3>提示：</h3>
 * <li>4 <= nums.length <= 10<sup>4</sup></li>
 * <li>1 <= nums[i] <= 10<sup>4</sup></li>
 * @see <a href="https://leetcode.cn/problems/maximum-product-difference-between-two-pairs/">https://leetcode.cn/problems/maximum-product-difference-between-two-pairs/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1913MaxProductDifference {

    public static int maxProductDifference(int[] nums) {
        int ans = 0;
        aux = new int[nums.length];
        sort(nums,0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        ans = (nums[nums.length - 1]) * (nums[nums.length - 2]) - (nums[1] * nums[0]);
        return ans;
    }

    static int[] aux;

    static void sort(int[] nums, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2 ;
        sort(nums, lo, mid);
        sort(nums, mid + 1, hi);
        merge(nums, lo, mid, hi);
    }

    static void merge(int[] nums, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        if (hi + 1 - lo >= 0) {
            System.arraycopy(nums, lo, aux, lo, hi + 1 - lo);
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                nums[k] = aux[j++];
            }
            else if (j > hi) {
                nums[k] = aux[i++];
            }
            else if (aux[j] < aux[i]) {
                nums[k] = aux[j++];
            }
            else {
                nums[k] = aux[i++];
            }
        }
    }


    public static int maxProductDifference2(int[] nums) {
        int max1 = Math.max(nums[0], nums[1]);
        int max2 = Math.min(nums[0], nums[1]);
        int min1 = Math.min(nums[0], nums[1]);
        int min2 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int tmp = nums[i];
            if (tmp > max1) {
                max2 = max1;
                max1 = tmp;
            }
            else if (tmp > max2) {
                max2 = tmp;
            }
            if (tmp < min1) {
                min2 = min1;
                min1 = tmp;
            }
            else if (tmp < min2) {
                min2 = tmp;
            }
        }
        return (max1 * max2) - (min1 * min2);
    }

}
