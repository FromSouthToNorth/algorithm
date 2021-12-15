package vip.hyzt.questions;

import org.junit.Test;

public class ScheduleCourse630Tests {

    @Test
    public void priorityQueueGreedy() {
        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        int i = ScheduleCourse630.priorityQueueGreedy(courses);
        System.out.println(i);
    }

}
