package vip.hyzt.questions;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <h1>2561. 重排水果</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/rearranging-fruits/">https://leetcode.cn/problems/rearranging-fruits/</a>
 */
public class Topic2561MinCost {

    public long minCost(int[] basket1, int[] basket2) {
        Arrays.sort(basket1);
        Arrays.sort(basket2);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < basket1.length; i++) {
            map.put(basket1[i], map.getOrDefault(basket1[i], 0) + 1);
            map.put(basket2[i], map.getOrDefault(basket2[i], 0) - 1);
        }
        long sum = 0;
        for (int i = 0, j = basket1.length - 1; i < basket1.length || j >= 0; ) {
            if (i < basket1.length && map.get(basket1[i]) <= 0) {
                i++;
            }
            else if (j >= 0 && map.get(basket2[j]) >= 0) {
                j--;
            }
            else if (i == basket1.length || j < 0 || map.get(basket1[i]) % 2 != 0 || map.get(basket2[j]) % 2 != 0) {
                return -1;
            }
            else {
                map.put(basket1[i], map.get(basket1[i]) - 2);
                map.put(basket2[j], map.get(basket2[j]) + 2);
                sum += Math.min(Math.min(basket1[i], basket2[j]), 2 * Math.min(basket1[0], basket2[0]));
            }
        }
        return sum;
    }

}
