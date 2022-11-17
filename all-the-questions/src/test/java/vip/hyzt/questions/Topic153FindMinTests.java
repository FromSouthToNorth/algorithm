package vip.hyzt.questions;

import org.junit.Test;

public class Topic153FindMinTests {

    @Test
    public void findMin() {
        Topic153FindMin topic153FindMin = new Topic153FindMin();
        System.out.printf("res: %d\n", topic153FindMin.findMin(new int[]{3, 4, 5, 6, 7, 1, 2}));
        System.out.printf("res: %d\n", topic153FindMin.findMin(new int[]{9, 9, 10, 11, 11, 12, 6, 6, 7, 8}));
    }

}
