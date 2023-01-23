package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2536RangeAddQueriesTests {

    @Test
    public void rangeAddQueries() {
        Topic2536RangeAddQueries topic2536RangeAddQueries = new Topic2536RangeAddQueries();
        System.out.printf("res: %s\n", Arrays.deepToString(topic2536RangeAddQueries.rangeAddQueries(2, new int[][]{{0, 0, 1, 1}})));
        System.out.printf("res: %s\n", Arrays.deepToString(topic2536RangeAddQueries.rangeAddQueries(3, new int[][]{{1, 1, 2, 2}, {0, 0, 1, 1}})));
    }

}
