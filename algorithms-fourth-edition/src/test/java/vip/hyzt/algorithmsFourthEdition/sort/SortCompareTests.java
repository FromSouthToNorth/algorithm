package vip.hyzt.algorithmsFourthEdition.sort;

import org.junit.Test;

public class SortCompareTests {

    @Test
    public void sortCompare() {
        String alg1 = "Selection";
        String alg2 = "Insertion";
        int N = 1000;
        int T = 100;
        double v1 = SortCompare.timeRandInput(alg1, N, T);
        double v2 = SortCompare.timeRandInput(alg2, N, T);
        System.out.printf("For %d 随机双打\n %s is", N, alg1);
        System.out.printf(" %.1f 随机快于 %s\n", v2/v1, alg2);
    }

}
