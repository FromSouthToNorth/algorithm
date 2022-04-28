package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic905SortArrayByParityTests {

    @Test
    public void sortArrayByParity() {
        int[] nums = {1, 3, 4, 5, 7, 8, 10, 9, 2, 11};
        int[] ans = Topic905SortArrayByParity.sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }

}
