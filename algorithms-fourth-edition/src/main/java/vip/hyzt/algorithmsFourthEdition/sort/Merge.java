package vip.hyzt.algorithmsFourthEdition.sort;

import java.util.Arrays;

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
            System.out.printf("size: %d \n", size);
            for (int lo = 0; lo < n - size; lo += size + size) {
                int min = Math.min(lo + size + size - 1, n - 1);
                int mid = lo + size - 1;
                merge(elements, aux, lo, mid, min);
            }
            System.out.print("\n");
        }
    }

    private <T extends Comparable<T>> void merge(T[] a, T[] aux, int lo, int mid, int hi) {
        System.out.printf("merge(%d, %d, %d)\n", lo, mid, hi);

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
            else if (SortUtils.less(aux[j], aux[i])) {
                a[k] = a[j++];
            }
            else {
                a[k] = aux[i++];
            }
        }
        System.out.printf("%s \n", Arrays.toString(a));
    }

}
