package vip.hyzt.questions;

import org.junit.Test;

public class Topic769MaxChunksToSortedTests {

    @Test
    public void maxChunksToSorted() {
        Topic769MaxChunksToSorted topic769MaxChunksToSorted = new Topic769MaxChunksToSorted();
        int[][] arr = {{4, 3, 2, 1, 0}, {1, 0, 2, 3, 4}};
        for (int[] ints : arr) {
            System.out.printf("res: %d\n", topic769MaxChunksToSorted.maxChunksToSorted(ints));
        }
    }

}
