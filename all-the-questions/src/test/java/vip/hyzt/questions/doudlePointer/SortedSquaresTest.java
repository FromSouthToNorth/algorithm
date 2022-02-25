package vip.hyzt.questions.doudlePointer;

import org.junit.Test;
import vip.hyzt.questions.doublePointer.SortedSquares;

import java.util.Arrays;

public class SortedSquaresTest {

    @Test
    public void sortedSquares() {
        int[] nums = { -4, -1, 0, 4, 12 };
        int[] ints = SortedSquares.sortedSquares(nums);
        System.out.println(Arrays.toString(ints));
    }

}
