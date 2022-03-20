package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * 冒泡排序
 * @author hy
 */
public class Bubbling {

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (!less(a[j], a[j + 1])) {
                    exchange(a, j, j + 1);
                }
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
