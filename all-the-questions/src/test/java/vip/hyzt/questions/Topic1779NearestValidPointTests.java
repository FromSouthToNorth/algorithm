package vip.hyzt.questions;

import org.junit.Test;

public class Topic1779NearestValidPointTests {

    @Test
    public void nearestValidPoint() {
        Topic1779NearestValidPoint topic1779NearestValidPoint = new Topic1779NearestValidPoint();
        System.out.printf("res: %d\n", topic1779NearestValidPoint.nearestValidPoint(3, 4, new int[][]{{3, 4}}));
        System.out.printf("res: %d\n", topic1779NearestValidPoint.nearestValidPoint(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}}));
        System.out.printf("res: %d\n", topic1779NearestValidPoint.nearestValidPoint(3, 4, new int[][]{{2, 3}}));
    }

}
