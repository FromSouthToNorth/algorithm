package vip.hyzt.questions;

import java.util.TreeMap;

/**
 * <h1>2555. 两个线段获得的最多奖品</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximize-win-from-two-segments/">https://leetcode.cn/problems/maximize-win-from-two-segments/</a>
 */
public class Topic2555MaximizeWin {

    public int maximizeWin(int[] prizePositions, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0, count = 0; i < prizePositions.length; i++) {
            map.put(prizePositions[i], ++count);
        }
        int max = 0, prev = 0;
        for (int i : map.keySet()) {
            max = Math.max(max, prev + map.floorEntry(i + k).getValue() - (map.firstKey() < i ? map.lowerEntry(i).getValue() : 0));
            prev = Math.max(prev, map.get(i) - (map.firstKey() < i - k ? map.lowerEntry(i - k).getValue() : 0));
        }
        return max;
    }

}
