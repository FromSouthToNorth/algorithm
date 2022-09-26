package vip.hyzt.questions;

/**
 * <h2>面试题 17.19. 消失的两个数字</h2>
 * <p>给定一个数组，包含从 1 到 N 所有的整数，但其中缺了两个数字。你能在 O(N) 时间内只用 O(1) 的空间找到它们吗？</p>
 * <p>以任意顺序返回这两个数字均可。</p>
 * <h3>示例 1:</h3>
 * <pre>
 *     输入: [1]
 *     输出: [2,3]
 * </pre>
 * <h3>示例 2:</h3>
 * <pre>
 *     输入: [2,3]
 *     输出: [1,4]
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>nums.length <= 30000</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/missing-two-lcci/">https://leetcode.cn/problems/missing-two-lcci/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class TopicInterview17_19MissingTwo {

    public int[] missingTwo(int[] nums) {
        int x = 0;
        int n = nums.length + 2;
        for (int num : nums) {
            x ^= num;
        }
        for (int i = 1; i <= n; i++) {
            x ^= i;
        }
        // Integer.MIN_VALUE = 0x80000000
        int l = (x == Integer.MIN_VALUE ? x : x & (-x));
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & l) != 0) {
                a ^= num;
            }
            else {
                b ^= num;
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i & l) != 0) {
                a ^= i;
            }
            else {
                b ^= i;
            }
        }
        return new int[]{a, b};
    }

}
