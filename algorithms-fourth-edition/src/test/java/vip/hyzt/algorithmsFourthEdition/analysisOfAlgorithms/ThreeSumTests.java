package vip.hyzt.algorithmsFourthEdition.analysisOfAlgorithms;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import org.junit.Test;

public class ThreeSumTests {

    @Test
    public void threeSumTest() {
        In in = new In("/ints/32Kints.txt");
        int[] nums = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = ThreeSum.count(nums);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count);
    }

    @Test
    public void towSumTest() {
        In in = new In("/ints/32Kints.txt");
        int[] nums = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = TwoSum.count(nums);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count);
    }

    @Test
    public void threeSumFast() {
        In in = new In("/ints/32Kints.txt");
        int[] nums = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = ThreeSumFast.count(nums);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count);
    }

}
