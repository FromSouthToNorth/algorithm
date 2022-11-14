package vip.hyzt.questions;

import org.junit.Test;

public class Topic2465DistinctAveragesTests {

    @Test
    public void distinctAverages() {
        Topic2465DistinctAverages topic2465DistinctAverages = new Topic2465DistinctAverages();
        System.out.printf("res: %d\n", topic2465DistinctAverages.distinctAverages(new int[]{0, 4, 3, 0, 1, 2, 8, 9, 10}));
        System.out.printf("res: %d\n", topic2465DistinctAverages.distinctAverages(new int[]{4, 1, 4, 0, 3, 5}));
        System.out.printf("res: %d\n", topic2465DistinctAverages.distinctAverages(new int[]{1, 200}));
    }

}
