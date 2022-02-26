package vip.hyzt.algorithmsFourthEdition.analysisOfAlgorithms;

/**
 * @author hy
 */
public abstract class TwoSum {

    public static int count(int[] a) {
        int length = a.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (a[i] + a[j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
