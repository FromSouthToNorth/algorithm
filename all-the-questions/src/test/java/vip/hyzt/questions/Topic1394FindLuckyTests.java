package vip.hyzt.questions;

import org.junit.Test;

public class Topic1394FindLuckyTests {

    @Test
    public void findLucky() {
        int[] arr = {2,2,3,3,3,4,6,6,7,7,7,8};
        int ans = Topic1394FindLucky.findLucky(arr);
        System.out.printf("%d \n", ans);
    }

}
