package vip.hyzt.questions;

import org.junit.Test;

public class Topic2319CheckXMatrixTests {

    @Test
    public void checkXMatrix() {
        int[][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0}};
        boolean b = Topic2319CheckXMatrix.checkXMatrix(grid);
        System.out.printf("%b \n", b);
    }

}
