package vip.hyzt.questions;

import org.junit.Test;

import java.util.List;

public class Topic2089TargetIndicesTests {

    @Test
    public void targetIndices() {
        int[] nums1 = new int[] {1,2,5,2,3};
        int[] nums2 = new int[] {1,2,5,2,3};
        int target1 = 5;
        int target2 = 4;
        List<Integer> ans1 = Topic2089TargetIndices.targetIndices2(nums1, target1);
        List<Integer> ans2 = Topic2089TargetIndices.targetIndices1(nums2, target2);
        System.out.printf("%s \n", ans1);
        System.out.printf("%s \n", ans2);
    }

}
