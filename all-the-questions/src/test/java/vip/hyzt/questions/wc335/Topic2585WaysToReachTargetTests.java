package vip.hyzt.questions.wc335;

import org.junit.Test;

public class Topic2585WaysToReachTargetTests {

    @Test
    public void waysToReachTarget() {
        Topic2585WaysToReachTarget topic2585WaysToReachTarget = new Topic2585WaysToReachTarget();
        System.out.printf("res: %d\n", topic2585WaysToReachTarget.waysToReachTarget(6, new int[][] { { 6, 1 }, { 3, 2 }, { 2, 3 } }));
        System.out.printf("res: %d\n", topic2585WaysToReachTarget.waysToReachTarget(5, new int[][] { { 50, 1 }, { 50, 2 }, { 50, 5 } }));
        System.out.printf("res: %d\n", topic2585WaysToReachTarget.waysToReachTarget(18, new int[][] { { 6, 1 }, { 3, 2 }, { 2, 3 } }));
    }

}
