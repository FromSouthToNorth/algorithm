package vip.hyzt.questions;

import org.junit.Test;

public class Topic1946LastStoneWeightTests {

    @Test
    public void lastStoneWeight() {
        int[] stones = new int[] {1,3};
        int res = Topic1946LastStoneWeight.lastStoneWeight1(stones);
        System.out.printf("%d \n", res);
    }

}
