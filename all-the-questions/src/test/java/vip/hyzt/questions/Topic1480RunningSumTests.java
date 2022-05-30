package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic1480RunningSumTests {

    @Test
    public void runningSum() {
        int[] nums = {1,2,3,4,5};
        int[] ans = Topic1480RunningSum.runningSum(nums);
        System.out.printf("%s \n", Arrays.toString(ans));
    }

}
