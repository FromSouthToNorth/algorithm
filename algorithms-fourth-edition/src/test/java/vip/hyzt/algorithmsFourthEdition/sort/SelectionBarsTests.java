package vip.hyzt.algorithmsFourthEdition.sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

public class SelectionBarsTests {

    @Test
    public void selectionBars() {
        int n = 20;
        StdDraw.setCanvasSize(160, 640);
        StdDraw.setXscale(-1, n + 1);
        StdDraw.setPenRadius(0.006);
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniform(0.0, 1.0);
        }
        SelectionBars.sort(a);
    }

}
