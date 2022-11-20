package vip.hyzt.questions;

import org.junit.Test;

public class Topic2475MinimumFuelCostTests {

    @Test
    public void minimumFuelCost() {
        Topic2475MinimumFuelCost topic2475MinimumFuelCost = new Topic2475MinimumFuelCost();
        System.out.printf("res: %d\n", topic2475MinimumFuelCost.minimumFuelCost(new int[][]{{0, 1}, {0, 2}, {0, 3}}, 5));
        System.out.printf("res: %d\n", topic2475MinimumFuelCost.minimumFuelCost(new int[][]{{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}}, 2));
        System.out.printf("res: %d\n", topic2475MinimumFuelCost.minimumFuelCost(new int[][]{}, 1));
    }

}
