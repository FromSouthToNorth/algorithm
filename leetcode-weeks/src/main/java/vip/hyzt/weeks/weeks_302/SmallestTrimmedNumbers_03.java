package vip.hyzt.weeks.weeks_302;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <h3>6121. 裁剪数字后查询第 K 小的数字</h3>
 * @see <a href="https://leetcode.cn/problems/query-kth-smallest-trimmed-number/">https://leetcode.cn/problems/query-kth-smallest-trimmed-number/</a>
 * @author hy
 */
public class SmallestTrimmedNumbers_03 {

    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Integer[] index = new Integer[nums.length];
            int k = nums[0].length() - queries[i][1];
            for (int j = 0; j < nums.length; j++) {
                index[j] = j;
            }
            Arrays.sort(index, Comparator.comparing(o -> nums[o].substring(k)));
            result[i] = index[queries[i][0] - 1];
        }
        return result;
    }

}
