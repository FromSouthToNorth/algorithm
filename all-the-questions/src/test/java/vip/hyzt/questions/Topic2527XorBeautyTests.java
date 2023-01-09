package vip.hyzt.questions;

import org.junit.Test;

public class Topic2527XorBeautyTests {

    @Test
    public void xorBeauty() {
        Topic2527XorBeauty topic2527XorBeauty = new Topic2527XorBeauty();
        System.out.printf("res: %d\n", topic2527XorBeauty.xorBeauty(new int[]{1, 4}));
        System.out.printf("res: %d\n", topic2527XorBeauty.xorBeauty(new int[]{15, 45, 20, 2, 34, 35, 5, 44, 32, 30}));
    }

}
