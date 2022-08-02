package vip.hyzt.algorithmsFourthEdition.sort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSortTests {

    @Test
    public void merge() {
        MergeSort mergeSort = new MergeSort();
        int[] array = { 5, 4, 6, 1, 0, 3, 7 };
        mergeSort.sort(array);
        System.out.printf("%s \n", Arrays.toString(array));
    }

}
