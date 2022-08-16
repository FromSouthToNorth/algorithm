package vip.hyzt.algorithmsFourthEdition.sort;

import edu.princeton.cs.algs4.In;
import org.junit.Test;
import vip.hyzt.algorithmsFourthEdition.util.Read;

import java.util.Arrays;

public class InsertionTests {

    @Test
    public void insertion() {
        In in = new In("/strs/tiny.txt");
        String[] strs = in.readAllStrings();
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(strs);
        System.out.println(Arrays.toString(strs));
    }

    @Test
    public void insertion1M() {
        Integer[] integers = {-2, -2, 0, -1, 0, 1, 2, 3, 4, 5, 66, 66, 0, 8, 9, 10, 9, 10, 6, 6, 8, 5, 2, 1};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(integers);
        System.out.println(Arrays.toString(integers));
    }

}
