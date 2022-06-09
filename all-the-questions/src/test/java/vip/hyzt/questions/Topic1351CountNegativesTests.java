package vip.hyzt.questions;

import org.junit.Test;

public class Topic1351CountNegativesTests {

    @Test
    public void countNegatives() {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans = Topic1351CountNegatives.countNegatives(grid);
        System.out.println(ans);
    }

}
