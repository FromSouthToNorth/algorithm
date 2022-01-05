package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Construct2DArray2022Test {

    @Test
    public void simulation() {
        int[] original = new int[] { 1, 2, 3, 4, 5, 6 };
        int[][] simulation = Construct2DArray2022.simulation(original, 2, 3);
        System.out.println(Arrays.toString(simulation));
    }

}
