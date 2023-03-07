package vip.hyzt.questions.wc315;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * <h1>6204. 与对应负数同时存在的最大正整数</h1>
 * <p>给你一个 <strong>不包含</strong> 任何零的整数数组 nums ，找出自身与对应的负数都在数组中存在的最大正整数 k 。</p>
 * <p>返回正整数 k ，如果不存在这样的整数，返回 -1 。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [-1,2,-3,3]
 *     输出：3
 *     解释：3 是数组中唯一一个满足题目要求的 k 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [-1,10,6,7,-7,1]
 *     输出：7
 *     解释：数组中存在 1 和 7 对应的负数，7 的值更大。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：nums = [-10,8,6,7,-2,-3]
 *     输出：-1
 *     解释：不存在满足题目要求的 k ，返回 -1 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 1000</li>
 *     <li>-1000 <= nums[i] <= 1000</li>
 *     <li>nums[i] != 0</li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * const findMaxK = function(nums) {
 *   let res = -1;
 *   // for (let i = 0; i < nums.length - 1; i++) {
 *   //   for (let j = i; j < nums.length; j++) {
 *   //     if (nums[i] === -nums[j]) {
 *   //       res = Math.max(Math.abs(-nums[j]), res);
 *   //     }
 *   //   }
 *   // }
 *   // return res;
 *   const set = new Set(nums);
 *   for (const i of set) {
 *     if (set.has(-i)) {
 *       res = Math.max(Math.abs(-i), res);
 *     }
 *   }
 *   return res;
 * }
 * const nums = [[-1, 2, -3, 3],[-1, 10, 6, 7, -7, 1],[-10, 8, 6, 7, -2, -3],[-12, 1, 0, -1, 12, 13, 1, -13, 0]];
 * for (const num of nums) {
 *   console.log("%s 与对应负数同时存在的最大正整数: %d\n",num, findMaxK(num));
 * }
 * </pre>
 * @see <a href="https://leetcode.cn/problems/largest-positive-integer-that-exists-with-its-negative/">https://leetcode.cn/problems/largest-positive-integer-that-exists-with-its-negative/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2441FindMaxK {

    public int findMaxK(int[] nums) {
//        int res = -1;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i; j < nums.length; j++) {
//                if (nums[i] == -nums[j]) {
//                    res = Math.max(Math.abs(-nums[j]), res);
//                }
//            }
//        }
//        return res;
//        TreeSet<Integer> set = new TreeSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        for (int i : set) {
//            if (set.contains(-i)) {
//                return -i;
//            }
//        }
//        return -1;]

        Arrays.sort(nums);
        int n = nums.length, left = 0, right = n - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == 0) {
                return nums[right];
            }
            else if (sum > 0) {
                right--;
            }
            else {
                left++;
            }
        }
        return -1;
    }

}
