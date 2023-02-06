package vip.hyzt.questions;

import org.junit.Test;

public class Topic2541MinOperationsTests {

    @Test
    public void minOperations() {
        Topic2541MinOperations topic2541MinOperations = new Topic2541MinOperations();
        System.out.printf("res: %d\n", topic2541MinOperations.minOperations(new int[]{ 4, 3, 1, 4 }, new int[]{ 1, 3, 7, 1 }, 3));
        System.out.printf("res: %d\n", topic2541MinOperations.minOperations(new int[]{ 3, 8, 5, 2 }, new int[]{ 2, 4, 1, 6 }, 1));
        System.out.printf("res: %d\n", topic2541MinOperations.minOperations(new int[]{ 3, 8, 5, 2 }, new int[]{ 2, 4, 1, 6 }, 0));
    }

}
