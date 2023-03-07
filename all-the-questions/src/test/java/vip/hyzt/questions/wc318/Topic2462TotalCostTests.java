package vip.hyzt.questions.wc318;

import org.junit.Test;
import vip.hyzt.questions.wc318.Topic2462TotalCost;

public class Topic2462TotalCostTests {

    @Test
    public void totalCost() {
        Topic2462TotalCost topic2462TotalCost = new Topic2462TotalCost();
        int[] costs1 = {9, 7, 1, 2, 2, 1, 10};
        System.out.printf("res: %d\n", topic2462TotalCost.totalCost(costs1, 4, 3));
        int[] costs2 = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        System.out.printf("res: %d\n", topic2462TotalCost.totalCost(costs2, 3, 4));
    }

}
