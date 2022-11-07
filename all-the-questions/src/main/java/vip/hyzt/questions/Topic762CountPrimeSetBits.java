package vip.hyzt.questions;

/**
 * <h3>762.二进制表示中质数个计算位置</h3>
 * <p>给你两个整数 `left` 和 `right`，在闭区间 `[left, right]` 范围内，统计并返回 <b>计算置位位数位质数</b> 的整数个数。</p>
 * <p><b>计算置位位数</b> 就是二进制表示 `1` 的个数。</p>
 * <ul>
 *     <li>例如，`21` 的二进制表示 `10101` 有 `3` 个计算置位。</li>
 * </ul>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>left = 6，right = 10
 *     <strong>输出：</strong>4
 *     <strong>解释：</strong>
 *     6  -> 0110 (2 个计算置位，2 是质数)
 *     7  -> 0111 (3 个计算置位，3 是质数)
 *     9  -> 1001 (2 个计算置位，2 是质数)
 *     10 -> 1010 (2 个计算置位，2 是质数)
 *     共计 4 个计算置位为质数的数字。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>left = 10, right = 15
 *     <strong>输出：</strong>5
 *     <strong>解释：</strong>
 *     10 -> 1010 (2 个计算置位，2 是质数)
 *     11 -> 1011 (3 个计算置位，3 是质数)
 *     12 -> 1100 (2 个计算置位，2 是质数)
 *     13 -> 1101 (3 个计算置位，3 是质数)
 *     14 -> 1110 (3 个计算置位，3 是质数)
 *     15 -> 1111 (4 个计算置位，4 是质数)
 *     共计 5 个计算置位位质数的数字。
 * </pre>
 * <p><b>提示：</b></p>
 * <ul>
 *     <li>`1 <= left <= right <= 10<sup>6</sup>`</li>
 *     <li>`0 <= right - left <= 10<sup>4</sup>`</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation">762.二进制表示中质数个计算位置</a>
 */
public abstract class Topic762CountPrimeSetBits {

    static boolean[] hash = new boolean[40];
    static {
        int[] nums = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        for (int num : nums) {
            hash[num] = true;
        }
    }

    public static int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            int x = i, cnt = 0;
            while (x != 0 && ++cnt >= 0) {
                x-= (x & -x);
            }
            if (hash[cnt]) {
                ans++;
            }
        }
        return ans;
    }

}
