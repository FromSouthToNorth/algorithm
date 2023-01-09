package vip.hyzt.questions;

import org.junit.Test;

public class Topic2530MaxKelementsTests {

    @Test
    public void maxKelements() {
        Topic2530MaxKelements topic2530MaxKelements = new Topic2530MaxKelements();
        System.out.printf("res: %d\n", topic2530MaxKelements.maxKelements(new int[]{10, 10, 10, 10, 10}, 5));
        System.out.printf("res: %d\n", topic2530MaxKelements.maxKelements(new int[]{1, 10, 3, 3, 3}, 3));
    }

}
