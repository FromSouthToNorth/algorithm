package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2564SubstringXorQueriesTests {

    @Test
    public void substringXorQueries() {
        Topic2564SubstringXorQueries topic2564SubstringXorQueries = new Topic2564SubstringXorQueries();
        System.out.printf("res: %s\n", Arrays.deepToString(topic2564SubstringXorQueries.substringXorQueries("101101", new int[][] { { 0, 5 }, { 1, 2 } })));
        System.out.printf("res: %s\n", Arrays.deepToString(topic2564SubstringXorQueries.substringXorQueries("0101", new int[][] { { 12, 8 } })));
        System.out.printf("res: %s\n", Arrays.deepToString(topic2564SubstringXorQueries.substringXorQueries("1", new int[][] { { 4, 5 } })));
    }

}
