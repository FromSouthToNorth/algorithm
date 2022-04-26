package vip.hyzt.theSorting;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTests {

    @Test
    public void insertionSort() {
        int[] nums = { 12, 11, 9, 12, 23, 6, 8, 1, 2 };
        InsertionSort.sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }

}
