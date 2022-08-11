package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 并归排序
 * @author hy
 */
public class Merge {

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        if (hi + 1 - lo >= 0) {
            System.arraycopy(a, lo, aux, lo, hi + 1 - lo);
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
        for (int i = 1; i < n; i = i+i) {
            for (int lo = 0; lo < n - i; lo += i+i) {
                int mid = lo + i - 1, hi = Math.min(lo + (i * 2) -1, n - 1);
                merge(a, aux, lo, mid, hi);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

}
