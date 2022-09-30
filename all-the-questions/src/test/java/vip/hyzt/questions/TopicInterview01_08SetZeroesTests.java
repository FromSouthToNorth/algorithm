package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class TopicInterview01_08SetZeroesTests {

    @Test
    public void setZeroes() {
        TopicInterview01_08SetZeroes topicInterview01_08SetZeroes = new TopicInterview01_08SetZeroes();
        int[][] matrix1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        topicInterview01_08SetZeroes.setZeroes(matrix1);
        for (int[] ints : matrix1) {
            System.out.printf("%s\n", Arrays.toString(ints));
        }
        topicInterview01_08SetZeroes.setZeroes(matrix2);
        for (int[] ints : matrix2) {
            System.out.printf("%s\n", Arrays.toString(ints));
        }

    }

}
