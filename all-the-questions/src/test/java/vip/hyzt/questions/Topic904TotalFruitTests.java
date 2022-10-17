package vip.hyzt.questions;

import org.junit.Test;

public class Topic904TotalFruitTests {

    @Test
    public void totalFruit() {
        Topic904TotalFruit topic904TotalFruit = new Topic904TotalFruit();
        int[][] fruits = {{1, 2, 1}, {0, 1, 2, 2}, {1, 2, 3, 2, 2}, {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}};
        for (int[] fruit : fruits) {
            System.out.printf("res: %d\n", topic904TotalFruit.totalFruit(fruit));
        }
    }

}
