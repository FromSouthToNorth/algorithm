package vip.hyzt.algorithmsFourthEdition.sort;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortTests {

    @Test
    public void sort() {
        Integer[] a = {2, 1, 3}, b = {1, 2, 3};
        System.out.println(Arrays.toString(Sort.sort(a, b)));
    }

}
