package vip.hyzt.questions;

import org.junit.Test;

public class Topic2473UnequalTripletsTests {

    @Test
    public void unequalTriplets() {
        Topic2473UnequalTriplets topic2473UnequalTriplets = new Topic2473UnequalTriplets();
        System.out.printf("res: %d\n", topic2473UnequalTriplets.unequalTriplets(new int[]{4, 4, 2, 4, 3}));
        System.out.printf("res: %d\n", topic2473UnequalTriplets.unequalTriplets(new int[]{1, 1, 1, 1, 1}));
    }

}
