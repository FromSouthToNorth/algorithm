package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 排序工具
 * @author hy
 */
public abstract class SortUtils {

    public static <T extends Comparable<T>> boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    public static  <T extends Comparable<T>> void exch(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
