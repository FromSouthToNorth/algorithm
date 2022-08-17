package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 插入排序
 * @author hy
 */
public class InsertionSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> void sort(T[] elements) {
        int n = elements.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && less(elements[j], elements[j - 1])) {
                exchange(elements, j, j - 1);
                j--;
            }
        }
    }

    @Override
    public <T extends Comparable<T>> boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    private <T extends Comparable<T>> void exchange(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
