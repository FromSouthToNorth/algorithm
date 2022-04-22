package vip.hyzt.questions;

/**
 * <h3>396. 旋转函数</h3>
 * <p>给定一个长度为 `n` 的整数数组 `nums`。</p>
 * <p>假设 `arr<sub>k</sub>` 是数组 `nums` 顺时针旋转 `k` 个位置的数组，我们定义 `nums` 的<b>旋转函数</b> `F` 为</p>
 * <li>`F(k) = 0 * arr<sub>k</sub>[0] + 1 * arr<sub>k</sub>[i] + ... + (n - 1) * arr<sub>k</sub>[n - 1]`</li>
 * <p>返回 `F(0),F(1), ... F(n-1)` 中的最大值。</p>
 * <p>生成的测试用例让答案符合 <b>32 位</b> 整数。</p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入:</strong>nums = [4,3,2,6]
 *     <strong>输出:</strong>26
 *     <strong>解释:</strong>
 *     F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
 *     F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
 *     F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
 *     F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
 *     所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入:</strong>nums = [100]
 *     <strong>输出:</strong>0
 * </pre>
 * <br>
 * <b>提示：</b>
 * <li>n == nums.length</li>
 * <li>1 <= n <= 10<sup>5</sup></li>
 * <li>-100 <= nums[i] <= 100</li>
 * @see <a href="https://leetcode-cn.com/problems/rotate-function/">396.旋转函数</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic396MaxRotateFunction {

    public static int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n * 2 + 10];
        for (int i = 1; i <= 2 * n; i++) sum[i] = sum[i - 1] + nums[(i - 1) % n];
        int ans = 0;
        for (int i = 1; i <= n; i++) ans += nums[i - 1] * (i - 1);
        for (int i = n + 1, cur = ans; i < 2 * n; i++) {
            cur += nums[(i - 1) % n] * (n - 1);
            cur -= sum[i - 1] - sum[i - n];
            if (cur > ans) ans = cur;
        }
        return ans;
    }

}
