package vip.hyzt.questions;

import org.junit.Test;

public class Topic2497MaxStarSumTests {

    @Test
    public void maxStarSum() {
        Topic2497MaxStarSum topic2497MaxStarSum = new Topic2497MaxStarSum();
        System.out.printf("res: %d\n", topic2497MaxStarSum.maxStarSum(new int[]{1, 2, 3, 4, 10, -10, -20}, new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}, {3, 5}, {3, 6}}, 2));
        System.out.printf("res: %d\n", topic2497MaxStarSum.maxStarSum(new int[]{-5}, new int[][]{}, 0));
    }

}
