package vip.hyzt.algorithmsFourthEdition.sort;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {

    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if ("Insertion".equals(alg)) {
            Insertion.sort(a);
        }
        if ("Selection".equals(alg)) {
            Selection.sort(a);
        }
        if ("Bubbling".equals(alg)) {
            Bubbling.sort(a);
        }
        return timer.elapsedTime();
    }

    public static double timeRandInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

}
