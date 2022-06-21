package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic1365SmallerNumbersThanCurrentTests {

    @Test
    public void smallerNumbersThanCurrent() {
        int[] nums = new int[] {8,1,2,2,3};
        int[] ans = Topic1365SmallerNumbersThanCurrent.smallerNumbersThanCurrent1(nums);
        int[] ans2 = Topic1365SmallerNumbersThanCurrent.smallerNumbersThanCurrent2(nums);
//        System.out.printf("%s \n", Arrays.toString(ans));
    }

}
