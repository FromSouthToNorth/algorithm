package vip.hyzt.questions;

import org.junit.Test;

public class Topic2538MaxOutputTests {

    @Test
    public void maxOutput() {
        Topic2538MaxOutput topic2538MaxOutput1 = new Topic2538MaxOutput();
        System.out.printf("res: %d\n", topic2538MaxOutput1.maxOutput(6, new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}, {3, 5}}, new int[]{9, 8, 7, 6, 10, 5}));
        Topic2538MaxOutput topic2538MaxOutput2 = new Topic2538MaxOutput();
        System.out.printf("res: %d\n", topic2538MaxOutput2.maxOutput(3, new int[][]{{0, 1}, {1, 2}}, new int[]{1, 1, 1}));
    }

}
