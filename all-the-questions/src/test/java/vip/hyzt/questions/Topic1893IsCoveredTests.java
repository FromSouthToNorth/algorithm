package vip.hyzt.questions;

import org.junit.Test;

public class Topic1893IsCoveredTests {

    @Test
    public void isCovered() {
        Topic1893IsCovered topic1893IsCovered = new Topic1893IsCovered();
        int[][] ranges1 = {{1, 2}, {3, 4}, {5, 6}};
        int left1 = 2, right1 = 5;
        System.out.printf("res: %b\n", topic1893IsCovered.isCovered(ranges1, left1, right1));
        int[][] ranges2 = {{1, 10}, {10, 20}};
        int left2 = 21, right2 = 21;
        System.out.printf("res: %b\n", topic1893IsCovered.isCovered(ranges2, left2, right2));
        int[][] ranges3 = {{1, 9}, {10, 13}, {14, 15}};
        int left3 = 9, right3 = 10;
        System.out.printf("res: %b\n", topic1893IsCovered.isCovered(ranges3, left3, right3));
    }

}
