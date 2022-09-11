package vip.hyzt.questions;

import org.junit.Test;

public class Topic6179LengthOfLISTests {

    @Test
    public void lengthOfLIS() {
        Topic6179LengthOfLIS topic6179LengthOfLIS = new Topic6179LengthOfLIS();
        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
        int k = 3;
        System.out.printf("res: %d\n", topic6179LengthOfLIS.lengthOfLIS(nums, k));
    }

}
