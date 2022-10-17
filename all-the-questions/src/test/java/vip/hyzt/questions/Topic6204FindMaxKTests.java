package vip.hyzt.questions;

import org.junit.Test;

public class Topic6204FindMaxKTests {

    @Test
    public void findMaxK() {
        Topic6204FindMaxK topic6204FindMaxK = new Topic6204FindMaxK();
        int[][] nums = {{-1, 2, -3, 3}, {-1, 10, 6, 7, -7, 1}, {-10, 8, 6, 7, -2, -3}, {-1, 1, -10, 10, 8, 7, 2, -12}};
        for (int[] num : nums) {
            int res = topic6204FindMaxK.findMaxK(num);
            System.out.printf("%d\n", res);
        }
    }

}
