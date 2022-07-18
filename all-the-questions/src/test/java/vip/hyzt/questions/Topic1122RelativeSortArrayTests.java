package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic1122RelativeSortArrayTests {

    @Test
    public void relativeSortArray() {
        int[] arr1 = { 2,3,1,3,2,4,6,7,9,2,19 };
        int[] arr2 = { 2,1,4,3,9,6 };

        System.out.println(Arrays.toString(new Topic1122RelativeSortArray().relativeSortArray(arr1, arr2)));
    }

}
