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
        Insertion.sort(strs);
        System.out.println(Arrays.toString(strs));
    }

    @Test
    public void insertion1M() {
        Read read = new Read("/ints/1Mints.txt");
        Integer[] a = read.readAllInteger();
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
