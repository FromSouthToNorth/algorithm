package vip.hyzt.algorithmsFourthEdition.sort;

import edu.princeton.cs.algs4.In;
import org.junit.Test;

import java.util.Arrays;

public class BubblingTests {

    @Test
    public void bubbling() {
        In in = new In("/strs/tiny.txt");
        String[] strs = in.readAllStrings();
        new BubblingSort().sort(strs);
        System.out.println(Arrays.toString(strs));
    }

}
