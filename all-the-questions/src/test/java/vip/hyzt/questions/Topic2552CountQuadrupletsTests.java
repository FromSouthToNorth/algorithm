package vip.hyzt.questions;

import org.junit.Test;

public class Topic2552CountQuadrupletsTests {

    @Test
    public void countQuadruplets() {
        Topic2552CountQuadruplets topic2552CountQuadruplets = new Topic2552CountQuadruplets();
        System.out.printf("res: %d\n", topic2552CountQuadruplets.countQuadruplets(new int[]{ 1, 3, 2, 4, 5 }));
        System.out.printf("res: %d\n", topic2552CountQuadruplets.countQuadruplets(new int[]{ 1, 2, 3, 4 }));
    }

}
