package vip.hyzt.questions;

import org.junit.Test;

public class Topic2537CountGoodTests {

    @Test
    public void countGood() {
        Topic2537CountGood topic2537CountGood = new Topic2537CountGood();
        System.out.printf("res: %d\n", topic2537CountGood.countGood(new int[]{1, 1, 1, 1, 1}, 10));
        System.out.printf("res: %d\n", topic2537CountGood.countGood(new int[]{3, 1, 4, 3, 2, 2, 4}, 2));
    }

}
