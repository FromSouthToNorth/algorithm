package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Topic699FallingSquaresTests {

    @Test
    public void fallingSquares() {
        int[][] positions1 = {{1,2}, {2,3}, {6,1}};
        List<Integer> ans1 = Topic699FallingSquares.fallingSquares(positions1);
        System.out.println(ans1);
        int[][] positions2 = {{100, 100}, {200,100}};
        List<Integer> ans2 = Topic699FallingSquares.fallingSquares(positions2);
        System.out.println(ans2);
    }

}
