package vip.hyzt.questions.wc312;

import org.junit.Test;
import vip.hyzt.questions.wc312.Topic2421NumberOfGoodPaths;

import java.util.HashMap;
import java.util.Map;

public class Topic2421NumberOfGoodPathsTests {

    @Test
    public void numberOfGoodPaths() {
        Topic2421NumberOfGoodPaths topic2421NumberOfGoodPaths = new Topic2421NumberOfGoodPaths();
        Map<int[], int[][]> map = new HashMap<>();
        map.put(new int[]{1, 3, 2, 1, 3}, new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}});
        map.put(new int[]{1, 1, 2, 2, 3}, new int[][]{{0, 1}, {1, 2}, {2, 3}, {2, 4}});
        map.put(new int[]{1}, new int[][]{});
        for (Map.Entry<int[], int[][]> entry : map.entrySet()) {
            System.out.printf("res: %d\n", topic2421NumberOfGoodPaths.numberOfGoodPaths(entry.getKey(), entry.getValue()));
        }
    }

}
