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
            while (j > 0 && SortUtils.less(elements[j], elements[j - 1])) {
                SortUtils.exch(elements, j, j - 1);
                j--;
            }
        }
    }

}
