package vip.hyzt.algorithmsFourthEdition.sort;

import org.junit.Test;
import vip.hyzt.algorithmsFourthEdition.util.Read;

import java.util.Arrays;

public class MergeTests {

    @Test
    public void merge() {
        Read read = new Read("/ints/1Kints.txt");
        Integer[] a = read.readAllInteger();
        Merge merge = new Merge();
        merge.sort(a);
        System.out.println(Arrays.toString(a));
        Integer[] elements = {5, 5, 4, 4, 5, 5, 1, 1, 2, 2, -1, -2, 5, 5, 3, 3};
        merge.sort(elements);
        System.out.println(Arrays.toString(elements));
    }

}
