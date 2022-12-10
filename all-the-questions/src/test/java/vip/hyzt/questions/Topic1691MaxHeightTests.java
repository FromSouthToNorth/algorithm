package vip.hyzt.questions;

import org.junit.Test;

public class Topic1691MaxHeightTests {

    @Test
    public void maxHeight() {
        Topic1691MaxHeight topic1691MaxHeight = new Topic1691MaxHeight();
        System.out.printf("res: %d\n", topic1691MaxHeight.maxHeight(new int[][]{{89, 67, 45}, {79, 55, 32}, {66, 52, 31}}));
        System.out.printf("res: %d\n", topic1691MaxHeight.maxHeight(new int[][]{{50, 45, 20}, {95, 37, 53}, {45, 23, 12}}));
        System.out.printf("res: %d\n", topic1691MaxHeight.maxHeight(new int[][]{{38, 25, 45}, {76, 35, 3}}));
        System.out.printf("res: %d\n", topic1691MaxHeight.maxHeight(new int[][]{{7, 11, 17}, {7, 17, 11}, {11, 7, 17}, {11, 17, 7}, {17, 7, 11}, {17, 11, 7}}));
    }

}
