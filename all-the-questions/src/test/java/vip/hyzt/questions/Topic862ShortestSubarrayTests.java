package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Topic862ShortestSubarrayTests {

    @Test
    public void shortestSubarray() {
        Topic862ShortestSubarray t = new Topic862ShortestSubarray();
        Map<Integer, int[]> map = new TreeMap<>();
        map.put(1, new int[]{2, 3, -2});
        map.put(2, new int[]{0, 1, -1});
        map.put(3, new int[]{-1, 2, 0, 1});
        map.put(4, new int[]{2, 1, 0, 1, 1, 2, 3});
        map.put(10, new int[]{2, 0, 1});
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            System.out.printf("key: %d value: %s\t\t\t", entry.getKey(), Arrays.toString(entry.getValue()));
            System.out.printf("res: %d\n", t.shortestSubarray(entry.getValue(), entry.getKey()));
        }
    }

}
