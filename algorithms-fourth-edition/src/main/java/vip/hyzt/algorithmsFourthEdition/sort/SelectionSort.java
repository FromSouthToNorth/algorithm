package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 选择排序
 * @author hy
 */
public class SelectionSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (SortUtils.less(a[j], a[min])) {
                    min = j;
                }
            }
            SortUtils.exch(a, i, min);
        }
    }

}
