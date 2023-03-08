package vip.hyzt.questions.wcb91;

import org.junit.Test;
import vip.hyzt.questions.wcb91.Topic2466CountGoodStrings;

public class Topic2466CountGoodStringsTests {

    @Test
    public void countGoodStrings() {
        Topic2466CountGoodStrings topic2466CountGoodStrings = new Topic2466CountGoodStrings();
        System.out.printf("res: %d\n", topic2466CountGoodStrings.countGoodStrings(3, 3, 1, 1));
        System.out.printf("res: %d\n", topic2466CountGoodStrings.countGoodStrings(2, 3, 1, 2));
        System.out.printf("res: %d\n", topic2466CountGoodStrings.countGoodStrings(200, 200, 10, 1));
        System.out.printf("res: %d\n", topic2466CountGoodStrings.countGoodStrings(100000, 100000, 400, 400));
    }

}
