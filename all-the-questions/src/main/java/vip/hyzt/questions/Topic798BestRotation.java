package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>798.得分最高的最小轮调</h3>
 * <p>给你一个数组nums，我们可以将它按一个非负整数 k 进行轮调，这样可以使数组变为[nums[k], nums[k + 1], ... nums[nums.length - 1], nums[0], nums[1], ..., nums[k-1]]的形式。此后，任何值小于或等于其索引的项都可以记作一分。</p>
 *
 * <p>例如，数组为nums = [2,4,1,3,0]，我们按k = 2进行轮调后，它将变成[1,3,0,2,4]。这将记为 3 分，因为 1 > 0 [不计分]、3 > 1 [不计分]、0 <= 2 [计 1 分]、2 <= 3 [计 1 分]，4 <= 4 [计 1 分]。</p>
 * <p>在所有可能的轮调中，返回我们所能得到的最高分数对应的轮调下标 k 。如果有多个答案，返回满足条件的最小的下标 k 。</p>
 * <b>示例 1：</b>
 * <pre>
 *     <strong>输入：</strong>nums = [2,3,1,4,0]
 *     <strong>输出：</strong>3
 *     <strong>解释：</strong>下面列出了每个 k 的得分：
 *     k = 0,  nums = [2,3,1,4,0],    score 2
 *     k = 1,  nums = [3,1,4,0,2],    score 3
 *     k = 2,  nums = [1,4,0,2,3],    score 3
 *     k = 3,  nums = [4,0,2,3,1],    score 4
 *     k = 4,  nums = [0,2,3,1,4],    score 3
 *     所以我们应当选择 k = 3，得分最高。
 * </pre>
 * <pre>
 *     <strong>输入：</strong>nums = [1,3,0,2,4]
 *     <strong>输出：</strong>0
 *     <strong>解释：</strong>nums 无论怎么变化总是有 3 分。
 *     所以我们将选择最小的 k，即 0。
 * </pre>
 * @see <a href="https://leetcode-cn.com/problems/smallest-rotation-with-highest-score">798.得分最高的最小轮调</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic798BestRotation {

    static int N = 100010;
    static int[] c = new int[N];

    public static int bestRotation(int[] nums) {
        Arrays.fill(c, 0);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int a = (i - (n - 1) + n) % n, b = (i - nums[i] + n) % n;
            if (a <= b) {
                add(a, b);
            }
            else {
                add(0, b);
                add(a, n - 1);
            }
        }
        for (int i = 1; i <= n; i++) {
            c[i] += c[i - 1];
        }
        int ans = 0, k = c[0];
        for (int i = 1; i <= n; i++) {
            if (c[i] > k) {
                k = c[i]; ans = i;
            }
        }
        return ans;
    }

    public static void add(int l, int r) {
        c[l] += 1; c[r + 1] -= 1;
    }

}
