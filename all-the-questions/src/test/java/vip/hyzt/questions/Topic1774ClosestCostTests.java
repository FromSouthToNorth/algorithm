package vip.hyzt.questions;

import org.junit.Test;

public class Topic1774ClosestCostTests {

    @Test
    public void closestCost() {
        Topic1774ClosestCost topic1774ClosestCost = new Topic1774ClosestCost();
        System.out.printf("res: %d\n", topic1774ClosestCost.closestCost(new int[]{1, 7}, new int[]{3, 4}, 10));
        System.out.printf("res: %d\n", topic1774ClosestCost.closestCost(new int[]{2, 3}, new int[]{4, 5, 100}, 18));
        System.out.printf("res: %d\n", topic1774ClosestCost.closestCost(new int[]{3, 10}, new int[]{2, 5}, 9));
        System.out.printf("res: %d\n", topic1774ClosestCost.closestCost(new int[]{10}, new int[]{1}, 10));
    }

}
