package vip.hyzt.questions;

import org.junit.Test;

public class Topic2488CountSubarraysTests {

    @Test
    public void countSubarrays() {
        Topic2488CountSubarrays topic2488CountSubarrays = new Topic2488CountSubarrays();
        System.out.printf("res: %d\n", topic2488CountSubarrays.countSubarrays(new int[]{3, 2, 1, 4, 5}, 4));
        System.out.printf("res: %d\n", topic2488CountSubarrays.countSubarrays(new int[]{2, 3, 1}, 3));
    }

}
