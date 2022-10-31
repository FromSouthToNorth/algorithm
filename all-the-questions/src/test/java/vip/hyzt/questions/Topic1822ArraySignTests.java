package vip.hyzt.questions;

import org.junit.Test;

public class Topic1822ArraySignTests {

    @Test
    public void arraySign() {
        Topic1822ArraySign t = new Topic1822ArraySign();
        int[][] nums = {{-1, -2, -3, -4, 3, 2, 1}, {1, 5, 0, 2, -3}, {-1, 1, -1, 1, -1}};
        for (int[] num : nums) {
            System.out.printf("res: %d\n", t.arraySign(num));
        }
    }

}
