package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 希尔排序
 * @author hy
 */
public class ShellSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        int n = a.length;
        int h = 1;
        while (h < n/3) {
            h = 3*h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && SortUtils.less(a[j], a[j - h]); j -= h) {
                    SortUtils.exch(a, j, j - h);
                }
            }
            h = h/3;
        }
    }

}
