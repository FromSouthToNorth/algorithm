package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 并归排序
 * @author hy
 */
public class Merge {

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            }
            else if (j > hi) {
                a[k] = aux[i++];
            }
            else if (less(aux[j], aux[i])) {
                a[k] = a[j++];
            }
            else {
                a[k] = aux[i++];
            }
        }
    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        Comparable[] aux = new Comparable[n];
        for (int i = 1; i < n; i *= 2) {
            for (int j = 0; j < n - i; j += i + i) {
                int mid = j + i - 1;
                int hi = Math.min(j + i + i - 1, n - 1);
                merge(a, aux, j, mid, hi);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

}
