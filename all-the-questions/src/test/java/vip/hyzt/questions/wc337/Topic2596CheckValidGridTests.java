package vip.hyzt.questions.wc337;

import org.junit.Test;

public class Topic2596CheckValidGridTests {

    @Test
    public void checkValidGrid() {
        Topic2596CheckValidGrid topic2596CheckValidGrid = new Topic2596CheckValidGrid();
        System.out.printf("res: %b\n", topic2596CheckValidGrid
                .checkValidGrid(new int[][] {
                        { 0, 11, 16, 5, 20 },
                        { 17, 4, 19, 10, 15 },
                        { 12, 1, 8, 21, 6 },
                        { 3, 18, 23, 14, 9 },
                        { 24, 13, 2, 7, 22 }
                }));
        System.out.printf("res: %b\n", topic2596CheckValidGrid
                .checkValidGrid(new int[][] {
                        { 0, 3, 6 },
                        { 5, 8, 1 },
                        { 2, 7, 4 }
                }));
    }

}
