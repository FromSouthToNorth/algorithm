package vip.hyzt.questions;

import org.junit.Test;

import java.util.List;

public class Topic310FindMinHeightTreesTests {

    @Test
    public void findMinHeightTrees() {
        int[][] edges = new int[][] {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        List<Integer> ans = Topic310FindMinHeightTrees.findMinHeightTrees(6, edges);
        System.out.println(ans);
    }

}
