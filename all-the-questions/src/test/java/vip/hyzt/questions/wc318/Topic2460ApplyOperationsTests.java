package vip.hyzt.questions.wc318;

import org.junit.Test;
import vip.hyzt.questions.wc318.Topic2460ApplyOperations;

import java.util.Arrays;

public class Topic2460ApplyOperationsTests {

    @Test
    public void applyOperations() {
        Topic2460ApplyOperations topic2460ApplyOperations = new Topic2460ApplyOperations();
        int[] nums1 = {1, 2, 2, 1, 1, 0};
        int[] res1 = topic2460ApplyOperations.applyOperations(nums1);
        System.out.printf("res: %s\n", Arrays.toString(res1));
        int[] nums2 = {0, 1};
        int[] res2 = topic2460ApplyOperations.applyOperations(nums2);
        System.out.printf("res: %s\n", Arrays.toString(res2));
    }

}
