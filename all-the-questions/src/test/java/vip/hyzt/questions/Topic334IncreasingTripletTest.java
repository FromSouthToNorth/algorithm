package vip.hyzt.questions;

import org.junit.Test;

public class Topic334IncreasingTripletTest {

    @Test
    public void twoWayTraversal() {
        int[] nums = new int[] {9, 0, -1, 2, 3, 1, 2, 3};
        boolean b = Topic334IncreasingTriplet.twoWayTraversal(nums);
        System.out.println(b);
    }

    @Test
    public void greedy() {
        int[] nums = new int[] {2, 1, -1, -3, 0, 2, 1, 7, 8};
        boolean greedy = Topic334IncreasingTriplet.greedy(nums);
        System.out.println(greedy);
    }

}
