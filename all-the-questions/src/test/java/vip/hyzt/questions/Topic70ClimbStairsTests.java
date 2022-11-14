package vip.hyzt.questions;

import org.junit.Test;

public class Topic70ClimbStairsTests {

    @Test
    public void climbStairs() {
        Topic70ClimbStairs topic70ClimbStairs = new Topic70ClimbStairs();
        for (int i = 1; i <= 45; i++) {
            long startTime = System.currentTimeMillis();
            int res = topic70ClimbStairs.climbStairs(i);
            long endTime = System.currentTimeMillis();
            System.out.printf("%d 执行 %d ms result: %d\n", i, endTime - startTime, res);


        }
    }

}
