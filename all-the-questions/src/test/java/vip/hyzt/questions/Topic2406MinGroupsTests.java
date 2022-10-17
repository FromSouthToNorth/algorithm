package vip.hyzt.questions;

import org.junit.Test;

public class Topic2406MinGroupsTests {

    @Test
    public void minGroups() {
        Topic2406MinGroups topic2406MinGroups = new Topic2406MinGroups();
        int[][] intervals = {{5,10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}};
        System.out.printf("res: %d\n", topic2406MinGroups.minGroups(intervals));
    }

}
