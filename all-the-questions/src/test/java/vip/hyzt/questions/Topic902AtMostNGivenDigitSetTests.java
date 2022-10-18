package vip.hyzt.questions;

import org.junit.Test;
import java.util.Map;
import java.util.TreeMap;

public class Topic902AtMostNGivenDigitSetTests {

    @Test
    public void atMostNGivenDigitSet() {
        Topic902AtMostNGivenDigitSet topic902AtMostNGivenDigitSet = new Topic902AtMostNGivenDigitSet();
        Map<Integer, String[]> map = new TreeMap<>();
        map.put(8, new String[]{"7"});
        map.put(100, new String[]{"1", "3", "5", "7"});
        map.put(1000000000, new String[]{"1", "4", "9"});
        map.put((int) 10e9, new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"});
        for (int key : map.keySet()) {
            System.out.printf("res: %d\n", topic902AtMostNGivenDigitSet.atMostNGivenDigitSet(map.get(key), key));
        }
    }

}
