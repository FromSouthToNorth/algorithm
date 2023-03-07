package vip.hyzt.questions.wc315;

import org.junit.Test;
import vip.hyzt.questions.wc315.Topic2441FindMaxK;

public class Topic2441FindMaxKTests {

    @Test
    public void findMaxK() {
        Topic2441FindMaxK topic2441FindMaxK = new Topic2441FindMaxK();
        int[][] nums = {{-1, 2, -3, 3}, {-1, 10, 6, 7, -7, 1}, {-10, 8, 6, 7, -2, -3}, {-1, 1, -10, 10, 8, 7, 2, -12}};
        for (int[] num : nums) {
            int res = topic2441FindMaxK.findMaxK(num);
            System.out.printf("%d\n", res);
        }
    }

}
