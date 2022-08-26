package vip.hyzt.algorithmsFourthEdition.sort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTests {

    @Test
    public void quickSort() {
        QuickSort quickSort = new QuickSort();
        String[] element = {"K", "R", "A", "T", "E", "L", "E", "P", "U", "I", "M", "Q", "C", "X", "O", "S"};
        quickSort.sort(element);
        String s = Arrays.toString(element);
        System.out.println(s);
    }

}
