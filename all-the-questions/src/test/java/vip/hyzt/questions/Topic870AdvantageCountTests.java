package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic870AdvantageCountTests {

    @Test
    public void advantageCount() {
        Topic870AdvantageCount topic870AdvantageCount = new Topic870AdvantageCount();
        int[] nums1 = {2, 7, 11, 15}, nums2 = {1, 10, 4, 11};
        int[] result = topic870AdvantageCount.advantageCount(nums1, nums2);
        System.out.printf("res: %s\n", Arrays.toString(result));
    }

}
