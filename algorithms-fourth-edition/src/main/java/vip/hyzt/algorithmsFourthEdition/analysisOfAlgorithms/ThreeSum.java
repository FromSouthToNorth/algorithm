package vip.hyzt.algorithmsFourthEdition.analysisOfAlgorithms;

/**
 * @author hy
 */
public abstract class ThreeSum {

    public static int count(int[] a) {
        int length = a.length;
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + i; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

}
