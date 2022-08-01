package vip.hyzt.algorithmsFourthEdition.sort;

import org.junit.Test;
import vip.hyzt.algorithmsFourthEdition.util.Read;

import java.util.Arrays;

public class MergeTests {

    @Test
    public void merge() {
        Read read = new Read("/ints/1Kints.txt");
        Integer[] a = read.readAllInteger();
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
