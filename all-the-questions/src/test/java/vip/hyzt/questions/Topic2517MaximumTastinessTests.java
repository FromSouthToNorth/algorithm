package vip.hyzt.questions;

import org.junit.Test;

public class Topic2517MaximumTastinessTests {

    @Test
    public void maximumTastiness() {
        Topic2517MaximumTastiness topic2517MaximumTastiness = new Topic2517MaximumTastiness();
        System.out.printf("res: %d\n", topic2517MaximumTastiness.maximumTastiness(new int[]{13, 5, 1, 8, 21, 2}, 3));
        System.out.printf("res: %d\n", topic2517MaximumTastiness.maximumTastiness(new int[]{1, 3, 1}, 2));
        System.out.printf("res: %d\n", topic2517MaximumTastiness.maximumTastiness(new int[]{7, 7, 7, 7}, 2));
    }

}
