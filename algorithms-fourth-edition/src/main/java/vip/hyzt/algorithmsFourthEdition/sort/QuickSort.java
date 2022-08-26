package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 快排
 * @author hy
 */
public class QuickSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> void sort(T[] elements) {
        sort(elements, 0, elements.length - 1);
    }

    private <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        if (lo < hi) {
            int j = partition(a, lo, hi);
            sort(a, lo, j-1);
            sort(a, j+1, hi);
        }
    }

    private <T extends Comparable<T>> int partition(T[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        T v= a[lo];
        while (true) {
            while (SortUtils.less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (SortUtils.less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            SortUtils.exch(a, i ,j);
        }
        SortUtils.exch(a, lo, j);
        return j;
    }

}
