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
                if (!SortUtils.less(a[j], a[j + 1])) {
                    SortUtils.exch(a, j, j + 1);
                }
            }
        }
    }

}
