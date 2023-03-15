package vip.hyzt.questions.wc336;

import java.util.Arrays;

/**
 * <h1>2587. 重排数组以得到最大前缀分数</h1>
 * <p></p>
 * <p>给你一个下标从 <strong>0</strong> 开始的整数数组 nums 。你可以将 nums 中的元素按 <strong>任意顺序</strong> 重排（包括给定顺序）。</p>
 * <p>令 prefix 为一个数组，它包含了 nums 重新排列后的前缀和。换句话说，prefix[i] 是 nums 重新排列后下标从 0 到 i 的元素之和。nums 的 <strong>分数</strong> 是 prefix 数组中正整数的个数。</p>
 * <p>返回可以得到的最大分数。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：nums = [2,-1,0,1,-3,3,-3]
 *     输出：6
 *     解释：数组重排为 nums = [2,3,1,-1,-3,0,-3] 。
 *     prefix = [2,5,6,5,2,2,-1] ，分数为 6 。
 *     可以证明 6 是能够得到的最大分数。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：nums = [-2,-3,0]
 *     输出：0
 *     解释：不管怎么重排数组得到的分数都是 0 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= nums.length <= 10<sup>5</sup></li>
 *     <li>-10<sup>6</sup> <= nums[i] <= 10<sup>6</sup></li>
 * </ul>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/rearrange-array-to-maximize-prefix-score/">https://leetcode.cn/problems/rearrange-array-to-maximize-prefix-score/</a>
 */
public class Topic2587MaxScore {

    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        long count = 0, sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            count += (sum += nums[i]) > 0 ? 1 : 0;
        }
        return (int) count;
    }

}
