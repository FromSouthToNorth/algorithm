package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 冒泡排序
 * @author hy
 */
public class BubblingSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (!less(a[j], a[j + 1])) {
                    exchange(a, j, j + 1);
                }
            }
        }
    }

    public  <T extends Comparable<T>> boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    private <T extends Comparable<T>> void exchange(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
