package vip.hyzt.questions;

import java.util.Random;

/**
 * <h3>398.随机索引</h3>
 * <p>给定一个可能包含有重复元素的整数数组，要求随机输出给定的数字的索引。你可以假设给定的数字一定存在于数组中。</p>
 * <br>
 * <b>注意：</b>
 * <p>数组大小可能非常大。使用太多额外的空间的解决方案将通不过测试。</p>
 * <p><b>示例：</b></p>
 * <pre>
 *     int[] nums = new int[] {1,2,3,3,3};
 *     Solution s = new Solution(nums);
 *
 *     // pick(3) 应该返回索引 2,3 或者 4。每个索引的返回概率应该相等。
 *     s.pick(3);
 *
 *     // pick(1) 应该返回 0。因为只有nums[0]等于1。
 *     s.pick(1);
 * </pre>
 * @see <a href="https://leetcode-cn.com/problems/goat-latin">链接：https://leetcode-cn.com/problems/random-pick-index/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic398RandomNumberIndex {

    int[] nums;

    Random random;

    Topic398RandomNumberIndex(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int pick(int target) {
        int ans = 0;
        for (int i = 0, cnt = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ++cnt;
                if (random.nextInt(cnt) == 0) {
                    ans = i;
                }
            }
        }
        return ans;
    }

}
