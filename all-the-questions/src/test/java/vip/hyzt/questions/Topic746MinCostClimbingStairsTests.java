package vip.hyzt.questions;

import org.junit.Test;

public class Topic746MinCostClimbingStairsTests {

    @Test
    public void minCOstClimbingStairs() {
        Topic746MinCostClimbingStairs topic746MinCostClimbingStairs = new Topic746MinCostClimbingStairs();
        System.out.printf("res: %d\n", topic746MinCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.printf("res: %d\n", topic746MinCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1, 100, 1, 1, 2, 100, 2, 3, 100, 9, 1, 2}));
    }

}
