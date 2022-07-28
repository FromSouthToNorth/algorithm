package vip.hyzt.weeks.weeks_303;

import java.util.Arrays;
import java.util.HashSet;

/**
 * <h3>2354. 优质数对的数目</h3>
 * @author hy
 */
public class CountExcellentPairs_04 {

    public long countExcellentPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long map[] = new long[30], count = 0;
        for (int num : nums) {
            map[Integer.bitCount(num)] += set.add(num) ? 1 : 0;
        }
        System.out.println(Arrays.toString(map));
        for (int i = 0; i < 30; i++) {
            for (int j = Math.max(0, k - i); j < 30; j++) {
                count += map[i] * map[j];
            }
        }
        return count;
    }

}
