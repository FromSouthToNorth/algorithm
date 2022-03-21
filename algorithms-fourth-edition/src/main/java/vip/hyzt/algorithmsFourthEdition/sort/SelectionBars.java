package vip.hyzt.algorithmsFourthEdition.sort;

import edu.princeton.cs.algs4.StdDraw;

/**
 * 选择排序可视化
 * @author hy
 */
public class SelectionBars {

    public static void sort(double[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
                show(a, i, min);
                exch(a, i, min);
            }
        }
    }

    private static void show(double[] a, int i, int min) {
        StdDraw.setYscale(-a.length + i + 0.8, i + 0.8);
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        for (int k = 0; k < i; k++) {
            StdDraw.filledRectangle(k, a[k] * 0.3, 0.25, a[k] * 0.3);
        }
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.filledRectangle(min, a[min] * 0.3, 0.25, a[min] * 0.3);
    }

    private static void exch(double[] a, int i, int j) {
        double t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static boolean less(double v, double w) {
        return v < w;
    }

}
