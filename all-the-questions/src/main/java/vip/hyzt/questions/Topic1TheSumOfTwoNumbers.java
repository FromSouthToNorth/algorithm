package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>1. 两数之和</h3>
 * <p>给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。</p>
 * <p>你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。</p>
 * <p>你可以按任意顺序返回答案。</p>
 * <h4>示例</h4>
 * <p><b>输入: </b> nums = [2,7,11,15], target = 9</p>
 * <p><b>输出: </b> [0,1]</p>
 * <p><b>解释: </b> 因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。</p>
 * @see <a href="https://leetcode-cn.com/problems/two-sum">链接：https://leetcode-cn.com/problems/two-sum</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic1TheSumOfTwoNumbers {

    /**
     * 暴力解决法
     * @param nums - 寻找的数数组
     * @param target - 目标数
     * @return 目标数之和的两数下标数组 Array
     */
    public static int[] violence(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (target == (nums[i] + nums[j])) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 表查找解决法
     * @param nums - 寻找的数数组
     * @param target - 目标数
     * @return 目标数之和的两数下标数组 Array
     */
    public static int[] tableQuery(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> hashMap = new HashMap<>(length - 1);
        hashMap.put(nums[0], 0);
        for (int i = 0; i < length; i++) {
            int key = target - nums[i];
            if (hashMap.containsKey(key)) {
                return new int[] { hashMap.get(key), i };
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }

}
