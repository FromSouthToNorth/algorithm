package vip.hyzt.questions;

import org.junit.Test;

public class Topic724PivotIndexTests {

    @Test
    public void pivotIndex() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int ans = Topic724PivotIndex.pivotIndex(nums);
        System.out.printf("%d\n", ans);
    }

}
