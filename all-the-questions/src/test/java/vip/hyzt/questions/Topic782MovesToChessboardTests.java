package vip.hyzt.questions;

import org.junit.Test;

public class Topic782MovesToChessboardTests {

    @Test
    public void movesToChessboard() {
        int[][] board = {{0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}, {1, 0, 0, 1}};
        Topic782MovesToChessboard topic782MovesToChessboard = new Topic782MovesToChessboard();
        System.out.println(topic782MovesToChessboard.movesToChessboard(board));
    }

}
