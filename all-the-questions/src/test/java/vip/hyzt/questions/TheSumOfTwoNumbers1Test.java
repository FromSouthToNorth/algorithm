package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class TheSumOfTwoNumbers1Test {

    @Test
    public void violenceTest() {
        int[] nums = new int[] {1, 1, 6, 3, 2, 2};
        int target = 3;
        int[] targetIndexs = TheSumOfTwoNumbers1.violence(nums, target);
        System.out.println(Arrays.toString(targetIndexs));
    }

    @Test
    public void tableQueryTest() {
        int[] nums = new int[] {2, 1, 9, 6, 10, 2};
        int target = 11;
        int[] ints = TheSumOfTwoNumbers1.tableQuery(nums, target);
        System.out.println(Arrays.toString(ints));
    }

}
