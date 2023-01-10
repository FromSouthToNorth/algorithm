package vip.hyzt.questions;

import org.junit.Test;

public class Topic2532FindCrossingTimeTests {

    @Test
    public void findCrossingTime(){
        Topic2532FindCrossingTime topic2532FindCrossingTime = new Topic2532FindCrossingTime();
        System.out.printf("res: %d\n", topic2532FindCrossingTime.findCrossingTime(1, 3, new int[][]{{1, 1, 2, 1}, {1, 1, 3, 1}, {1, 1, 4, 1}}));
        System.out.printf("res: %d\n", topic2532FindCrossingTime.findCrossingTime(3, 2, new int[][]{{1, 9, 1, 8}, {10, 10, 10, 10}}));
    }

}
