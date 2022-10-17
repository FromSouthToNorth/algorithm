package vip.hyzt.questions;

import org.junit.Test;

public class Topic2407LengthOfLISTests {

    @Test
    public void lengthOfLIS() {
        Topic2407LengthOfLIS topic2407LengthOfLIS = new Topic2407LengthOfLIS();
        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
        int k = 3;
        System.out.printf("res: %d\n", topic2407LengthOfLIS.lengthOfLIS(nums, k));
    }

}
