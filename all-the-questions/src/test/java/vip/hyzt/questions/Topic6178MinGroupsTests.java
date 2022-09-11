package vip.hyzt.questions;

import org.junit.Test;

public class Topic6178MinGroupsTests {

    @Test
    public void minGroups() {
        Topic6178MinGroups topic6178MinGroups = new Topic6178MinGroups();
        int[][] intervals = {{5,10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}};
        System.out.printf("res: %d\n", topic6178MinGroups.minGroups(intervals));
    }

}
