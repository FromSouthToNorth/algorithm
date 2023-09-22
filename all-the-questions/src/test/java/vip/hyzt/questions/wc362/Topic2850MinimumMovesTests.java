package vip.hyzt.questions.wc362;

import org.junit.Test;

public class Topic2850MinimumMovesTests {

    @Test
    public void minimumMoves() {
        Topic2850MinimumMoves topic2850MinimumMoves = new Topic2850MinimumMoves();
        int[][] grid1 = {
                { 1, 1, 0 },
                { 1, 1, 1 },
                { 1, 2, 1 }
        };
        System.out.printf("res: %d\n", topic2850MinimumMoves.minimumMoves(grid1));
        int[][] grid2 = {
                { 1, 3, 0 },
                { 1, 0, 0 },
                { 1, 0, 3 }
        };
        System.out.printf("res: %d\n", topic2850MinimumMoves.minimumMoves(grid2));
    }
}
