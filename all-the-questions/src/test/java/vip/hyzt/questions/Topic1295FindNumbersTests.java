package vip.hyzt.questions;

import org.junit.Test;

public class Topic1295FindNumbersTests {

    @Test
    public void findNumbers() {
        int[] nums = {12,345,2,6,7896};
        int ans = Topic1295FindNumbers.findNumbers(nums);
        System.out.printf("%d \n", ans);
    }

}
