package vip.hyzt.questions;

import org.junit.Test;

public class Topic2540GetCommonTests {

    @Test
    public void getCommon() {
        Topic2540GetCommon topic2540GetCommon = new Topic2540GetCommon();
        System.out.printf("res: %d\n", topic2540GetCommon.getCommon(new int[]{ 1, 2, 3 }, new int[]{ 2, 4 }));
        System.out.printf("res: %d\n", topic2540GetCommon.getCommon(new int[]{ 1, 2, 3, 6 }, new int[]{ 2, 3, 4, 5 }));
    }

}
