package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2022Construct2DArrayTest {

    @Test
    public void simulation() {
        int[] original = new int[] { 1, 2, 3, 4, 5, 6 };
        int[][] simulation = Topic2022Construct2DArray.simulation(original, 2, 3);
        System.out.println(Arrays.toString(simulation));
    }

}
