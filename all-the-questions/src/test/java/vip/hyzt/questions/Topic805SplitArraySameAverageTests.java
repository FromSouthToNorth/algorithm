package vip.hyzt.questions;

import org.junit.Test;

public class Topic805SplitArraySameAverageTests {

    @Test
    public void splitArraySameAverage() {
        Topic805SplitArraySameAverage topic805SplitArraySameAverage = new Topic805SplitArraySameAverage();
        System.out.printf("res: %b\n", topic805SplitArraySameAverage.splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.printf("res: %b\n", topic805SplitArraySameAverage.splitArraySameAverage(new int[]{1, 2}));
        System.out.printf("res: %b\n", topic805SplitArraySameAverage.splitArraySameAverage(new int[]{1, 2, 3, 2, 2, 2}));
    }

}
