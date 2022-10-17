package vip.hyzt.questions;

import org.junit.Test;

public class Topic6219SumOfNumberAndReverseTests {

    @Test
    public void sumOfNumberAndReverse() {
        Topic6219SumOfNumberAndReverse topic6219SumOfNumberAndReverse = new Topic6219SumOfNumberAndReverse();
        int[] nums = {443, 63, 181, (int) 10e5, (int) 10e5 - 6, (int) 10e5 - 1};
        for (int num : nums) {
            System.out.printf("%d %b\n", num, topic6219SumOfNumberAndReverse.sumOfNumberAndReverse(num));
        }
    }

}
