package vip.hyzt.questions;

import org.junit.Test;

public class Topic1592NumSpecialTests {

    @Test
    public void numSpecial() {
        Topic1592NumSpecial topic1592NumSpecial = new Topic1592NumSpecial();
        int[][] mat = {{0,0,0,1},{1,0,0,0},{0,1,1,0},{0,0,0,0}};
        int res = topic1592NumSpecial.numSpecial(mat);
        System.out.printf("%d \n", res);
    }

}
