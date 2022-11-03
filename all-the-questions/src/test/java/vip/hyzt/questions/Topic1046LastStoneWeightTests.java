package vip.hyzt.questions;

import org.junit.Test;

public class Topic1046LastStoneWeightTests {

    @Test
    public void lastStoneWeight() {
        int[] stones = new int[]{10, 2, 1, 3, 4, 1};
        int res = Topic1046LastStoneWeight.lastStoneWeight(stones);
        System.out.printf("%d \n", res);
    }

}
