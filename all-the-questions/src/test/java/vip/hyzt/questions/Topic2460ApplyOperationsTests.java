package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2460ApplyOperationsTests {

    @Test
    public void applyOperations() {
        Topic2460ApplyOperations topic2460ApplyOperations = new Topic2460ApplyOperations();
        int[] nums = {1, 2, 2, 1, 1, 0};
        int[] res1 = topic2460ApplyOperations.applyOperations(nums);
        System.out.printf("res: %s\n", Arrays.toString(res1));
    }

}
