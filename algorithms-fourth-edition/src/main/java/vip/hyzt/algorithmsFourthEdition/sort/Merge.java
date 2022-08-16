package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 并归排序
 * @author hy
 */
public class Merge implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> void sort(T[] elements) {
        int n = elements.length;
        @SuppressWarnings("unchecked")
        T[] aux = (T[]) new Comparable[n];
        for (int size = 1; size < n; size = size + size) {
            for (int lo = 0; lo < n - size; lo += size + size) {
                int min = Math.min(lo + size + size - 1, n - 1);
                merge(elements, aux, lo + size - 1, min, n - 1);
            }
        }
    }

    @Override
    public <T extends Comparable<T>> boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    private <T extends Comparable<T>> void merge(T[] a, T[] aux, int lo, int mid, int hi) {
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

}
