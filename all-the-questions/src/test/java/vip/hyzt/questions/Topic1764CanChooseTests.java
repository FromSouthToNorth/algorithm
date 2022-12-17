package vip.hyzt.questions;

import org.junit.Test;

public class Topic1764CanChooseTests {

    @Test
    public void canChoose() {
        Topic1764CanChoose topic1764CanChoose = new Topic1764CanChoose();
        System.out.printf("res: %b\n", topic1764CanChoose.canChoose(new int[][]{{1, -1, -1}, {3, -2, 0}}, new int[]{1, -1, 0, 1, -1, -1, 3, -2, 0}));
        System.out.printf("res: %b\n", topic1764CanChoose.canChoose(new int[][]{{10, -2}, {1, 2, 3, 4}}, new int[]{1, 2, 3, 4, 10 - 2}));
        System.out.printf("res: %b\n", topic1764CanChoose.canChoose(new int[][]{{1, 2, 3}, {3, 4}}, new int[]{7, 7, 1, 2, 3, 4, 7, 7}));
        System.out.printf("res: %b\n", topic1764CanChoose.canChoose(new int[][]{}, new int[]{}));
    }

}
