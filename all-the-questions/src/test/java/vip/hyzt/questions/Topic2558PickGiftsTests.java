package vip.hyzt.questions;

import org.junit.Test;

public class Topic2558PickGiftsTests {

    @Test
    public void pickGifts() {
        Topic2558PickGifts topic2558PickGifts = new Topic2558PickGifts();
        System.out.printf("res: %d\n", topic2558PickGifts.pickGifts(new int[]{ 25, 64, 9, 4, 100 }, 4));
        System.out.printf("res: %d\n", topic2558PickGifts.pickGifts(new int[]{ 1, 1, 1, 1 }, 4));
    }

}
