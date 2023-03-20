package vip.hyzt.questions.wc336;

import org.junit.Test;

public class Topic2589FindMinimumTimeTests {

    @Test
    public void findMinimumTime() {
        Topic2589FindMinimumTime topic2589FindMinimumTime = new Topic2589FindMinimumTime();
        System.out.printf("res: %d\n", topic2589FindMinimumTime.findMinimumTime(new int[][] { { 2, 3, 1 }, { 4, 5, 1 }, { 1, 5, 2 } }));
        System.out.printf("res: %d\n", topic2589FindMinimumTime.findMinimumTime(new int[][] { { 1, 3, 2 }, { 2, 5, 3 }, { 5, 6, 2 } }));
    }

}
