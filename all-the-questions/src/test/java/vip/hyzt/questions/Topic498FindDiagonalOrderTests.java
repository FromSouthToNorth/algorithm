package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic498FindDiagonalOrderTests {

    @Test
    public void findDiagonalOrder() {
        int[][] mat = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = Topic498FindDiagonalOrder.findDiagonalOrder(mat);
        System.out.println(Arrays.toString(ans));
    }

}
