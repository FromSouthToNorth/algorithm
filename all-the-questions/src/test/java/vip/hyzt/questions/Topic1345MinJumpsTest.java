package vip.hyzt.questions;

import org.junit.Test;

public class Topic1345MinJumpsTest {

    @Test
    public void minJumps() {
        int[] arr = { 11,22,7,7,7,7,7,7,7,22,13 };
        int i = Topic1345MinJumps.minJumps(arr);
        System.out.println(i);
    }

}
