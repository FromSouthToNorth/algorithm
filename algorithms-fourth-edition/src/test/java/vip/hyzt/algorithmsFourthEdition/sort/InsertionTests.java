package vip.hyzt.algorithmsFourthEdition.sort;

import edu.princeton.cs.algs4.In;
import org.junit.Test;

import java.util.Arrays;

public class InsertionTests {

    @Test
    public void insertion() {
        In in = new In("/strs/tiny.txt");
        String[] strs = in.readAllStrings();
        Insertion.sort(strs);
        System.out.println(Arrays.toString(strs));
    }

}
