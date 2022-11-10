package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic74SearchMatrixTests {

    @Test
    public void searchMatrix() {
        Topic74SearchMatrix topic74SearchMatrix = new Topic74SearchMatrix();
        int[][] matrix1 = {{1, 3, 5, 7}, {10, 11, 12, 13}, {23, 24, 26, 30}, {78, 99, 100, 120}};
        System.out.printf("matrix: %s target: %d res: %b\n", Arrays.deepToString(matrix1), 120, topic74SearchMatrix.searchMatrix(matrix1, 120));
        int[][] matrix2 = {{-(int) 10e4, 3, 5, 7, 10}, {10, 11, 12, 13, 20}, {23, 24, 26, 30, 70}, {66, 78, 99, 100, 120}};
        System.out.printf("matrix: %s target: %d res: %b\n", Arrays.deepToString(matrix2), 120, topic74SearchMatrix.searchMatrix(matrix2, 120));
    }

}
