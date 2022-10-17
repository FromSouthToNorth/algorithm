package vip.hyzt.questions;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <h1>42. 接雨水</h1>
 * <p>给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。</p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/rainwatertrap.png">
 * <pre>
 *     输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 *     输出：6
 *     解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：height = [4,2,0,3,2,5]
 *     输出：9
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>n == height.length</li>
 *     <li>1 <= n <= 2 * 10<sup>4</sup></li>
 *     <li>0 <= height[i] <= 10<sup>5</sup></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/trapping-rain-water/">https://leetcode.cn/problems/trapping-rain-water/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic42Trap {

    public int trap(int[] height) {
        int res = 0;
        int n = height.length;
        // 动态规划
//
//        if (n == 0) {
//            return 0;
//        }
//        int[] leftMax = new int[n];
//        leftMax[0] = height[0];
//        for (int i = 1; i < n; i++) {
//            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
//        }
//
//        int[] rightMax = new int[n];
//        rightMax[n - 1] = height[n - 1];
//        for (int i = n - 2; i >= 0; i--) {
//            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            res += Math.min(leftMax[i], rightMax[i]) - height[i];
//        }

        // 单调栈
//        Deque<Integer> stack = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
//                int pop = stack.pop();
//                if (stack.isEmpty()) {
//                    break;
//                }
//                int left = stack.peek();
//                int w = i - left - 1;
//                int h = Math.min(height[left], height[i]) - height[pop];
//                res += w * h;
//            }
//            stack.push(i);
//        }

        int left = 0, right = n - 1, leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                res += leftMax - height[left];
                left++;
            }
            else {
                res += rightMax - height[right];
                right--;
            }
        }
        return res;
    }

}
