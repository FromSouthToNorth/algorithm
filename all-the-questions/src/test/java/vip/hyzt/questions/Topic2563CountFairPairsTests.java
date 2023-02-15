package vip.hyzt.questions;

import org.junit.Test;

public class Topic2563CountFairPairsTests {

    @Test
    public void countFairPairs() {
        Topic2563CountFairPairs topic2563CountFairPairs = new Topic2563CountFairPairs();
        System.out.printf("res: %d\n", topic2563CountFairPairs.countFairPairs(new int[] { 0, 1, 7, 4, 4, 5 }, 3, 6));
        System.out.printf("res: %d\n", topic2563CountFairPairs.countFairPairs(new int[] { 1, 7, 9, 2, 5 }, 11, 11));
    }

}
