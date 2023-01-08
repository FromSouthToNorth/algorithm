package vip.hyzt.questions;

import org.junit.Test;

public class Topic2528MaxPowerTests {

    @Test
    public void maxPower() {
        Topic2528MaxPower topic2528MaxPower = new Topic2528MaxPower();
        System.out.printf("%d\n", topic2528MaxPower.maxPower(new int[]{1, 2, 4, 5, 0}, 1, 2));
        System.out.printf("%d\n", topic2528MaxPower.maxPower(new int[]{4, 4, 4, 4}, 0, 3));
    }

}
