package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic1TheSumOfTwoNumbersTests {

    @Test
    public void violenceTest() {
        int[] nums = new int[] {1, 1, 6, 3, 2, 2};
        int target = 3;
        int[] targetIndexs = Topic1TheSumOfTwoNumbers.violence(nums, target);
        System.out.println(Arrays.toString(targetIndexs));
    }

    @Test
    public void tableQueryTest() {
        int[] nums = new int[] {2, 1, 9, 6, 10, 2};
        int target = 11;
        int[] ints = Topic1TheSumOfTwoNumbers.tableQuery(nums, target);
        System.out.println(Arrays.toString(ints));
    }

}
