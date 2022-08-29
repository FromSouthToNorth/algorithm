package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic189RotateTests {

    @Test
    public void rotate() {
        Topic189Rotate topic189Rotate = new Topic189Rotate();
        int nums[] = { 1,2,3,4,5,6,7 }, k = 3;
        topic189Rotate.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

}
