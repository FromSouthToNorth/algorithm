package vip.hyzt.questions;

import org.junit.Test;

public class Topic1710MaximumUnitsTests {

    @Test
    public void maximumUnits() {
        Topic1710MaximumUnits topic1710MaximumUnits = new Topic1710MaximumUnits();
        System.out.printf("res: %d\n", topic1710MaximumUnits.maximumUnits(new int[][]{{1, 3}, {3, 1}, {2, 2}}, 4));
        System.out.printf("res: %d\n", topic1710MaximumUnits.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
    }

}
