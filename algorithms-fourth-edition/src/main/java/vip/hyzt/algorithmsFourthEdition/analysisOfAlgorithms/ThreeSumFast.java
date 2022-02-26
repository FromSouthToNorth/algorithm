package vip.hyzt.algorithmsFourthEdition.analysisOfAlgorithms;

import java.util.Arrays;

/**
 * @author hy
 */
public abstract class ThreeSumFast {

    /**
     * 如果排序数组 a[] 包含任何重复的整数，则返回 true
     */
    public static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * 返回具有 {@code i < j < k} 的三元组 (i, j, k) 的数量
     * 这样 {@code a[i] + a[j] + a[k] == 0}。
     * @param a 整数数组
     * @return {@code i < j < k} 的三元组 (i, j, k) 的数量
     * 这样 {@code a[i] + a[j] + a[k] == 0}
     */
    public static int count(int[] a) {
        int length = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) {
            throw new IllegalArgumentException("array contains duplicate integers");
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) {
                    count++;
                }
            }
        }
        return count;
    }

}
