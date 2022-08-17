package vip.hyzt.algorithmsFourthEdition.sort;

import java.util.HashMap;
import java.util.Map;

public class Sort {

    public static <T extends Comparable<T>> T[] sort(T[] a, T[] b) {
        int length = a.length;
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Comparable[length];
        Map<Integer, T> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(i, a[i]);
        }
        for (int i = 0; i < length; i++) {
            if (map.containsKey(i)) {
                result[i] = map.get(i);
            }
        }
        return result;
    }

}
