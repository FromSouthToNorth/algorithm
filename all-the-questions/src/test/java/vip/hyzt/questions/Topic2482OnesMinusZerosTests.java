package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2482OnesMinusZerosTests {

    @Test
    public void onesMinusZeros() {
        Topic2482OnesMinusZeros topic2482OnesMinusZeros = new Topic2482OnesMinusZeros();
        System.out.printf("res: %s\n", Arrays.deepToString(topic2482OnesMinusZeros.onesMinusZeros(new int[][]{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}})));
        System.out.printf("res: %s\n", Arrays.deepToString(topic2482OnesMinusZeros.onesMinusZeros(new int[][]{{1, 1, 1}, {1, 1, 1}})));
    }

}
