package vip.hyzt.questions;

import org.junit.Test;

public class Topic2561MinCostTests {

    @Test
    public void minCost() {
        Topic2561MinCost topic2561MinCost = new Topic2561MinCost();
        System.out.printf("res: %d\n", topic2561MinCost.minCost(new int[]{ 4, 2, 2, 2 }, new int[]{ 1, 4, 1, 2 }));
        System.out.printf("res: %d\n", topic2561MinCost.minCost(new int[]{ 2, 3, 4, 1 }, new int[]{ 3, 2, 5, 1 }));
    }

}
