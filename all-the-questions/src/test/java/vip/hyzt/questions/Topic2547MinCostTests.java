package vip.hyzt.questions;

import org.junit.Test;

public class Topic2547MinCostTests {

    @Test
    public void minCost() {
        Topic2547MinCost topic2547MinCost = new Topic2547MinCost();
        System.out.printf("res: %d\n", topic2547MinCost.minCost(new int[]{ 1, 2, 1, 2, 1, 3, 3 }, 2));
        System.out.printf("res: %d\n", topic2547MinCost.minCost(new int[]{ 1, 2, 1, 2, 1 }, 2));
    }

}
