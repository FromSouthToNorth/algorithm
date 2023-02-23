package vip.hyzt.questions;

import org.junit.Test;

public class Topic2572SquareFreeSubsetsTests {

    @Test
    public void squareFreeSubsets() {
        Topic2572SquareFreeSubsets topic2572SquareFreeSubsets = new Topic2572SquareFreeSubsets();
        System.out.printf("res: %d\n", topic2572SquareFreeSubsets.squareFreeSubsets(new int[] { 3, 4, 4, 5 }));
        System.out.printf("res: %d\n", topic2572SquareFreeSubsets.squareFreeSubsets(new int[] { 1 }));
    }

}
