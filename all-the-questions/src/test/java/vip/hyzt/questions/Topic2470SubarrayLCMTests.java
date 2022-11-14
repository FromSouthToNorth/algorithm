package vip.hyzt.questions;

import org.junit.Test;

public class Topic2470SubarrayLCMTests {

    @Test
    public void subarrayLCM() {
        Topic2470SubarrayLCM topic2470SubarrayLCM = new Topic2470SubarrayLCM();
        System.out.printf("res: %d\n", topic2470SubarrayLCM.subarrayLCM(new int[]{3, 6, 2, 7, 1}, 6));
        System.out.printf("res: %d\n", topic2470SubarrayLCM.subarrayLCM(new int[]{3}, 2));
    }

}
