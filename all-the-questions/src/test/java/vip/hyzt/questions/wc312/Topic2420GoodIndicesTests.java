package vip.hyzt.questions.wc312;

import org.junit.Test;
import vip.hyzt.questions.wc312.Topic2420GoodIndices;

import java.util.HashMap;
import java.util.Map;

public class Topic2420GoodIndicesTests {

    @Test
    public void goodIndices() {
        Topic2420GoodIndices topic6190GoodIndices = new Topic2420GoodIndices();
        Map<int[], Integer> map = new HashMap<>();
        map.put(new int[] { 2, 1, 1, 1, 3, 4, 1 }, 2);
        map.put(new int[] { 2, 1, 1, 2 }, 2);
        map.put(new int[] { 388589, 17165, 726687, 401298, 600033, 537254, 301052, 151069, 399955 }, 4);
        for (int[] nums : map.keySet()) {
            System.out.printf("res: %s\n", topic6190GoodIndices.goodIndices(nums, map.get(nums)));
        }
    }

}
