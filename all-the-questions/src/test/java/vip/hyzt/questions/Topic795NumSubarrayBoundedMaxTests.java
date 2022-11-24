package vip.hyzt.questions;

import org.junit.Test;

public class Topic795NumSubarrayBoundedMaxTests {

    @Test
    public void numSubarrayBoundedMax() {
        Topic795NumSubarrayBoundedMax topic795NumSubarrayBoundedMax = new Topic795NumSubarrayBoundedMax();
        System.out.printf("res: %d\n", topic795NumSubarrayBoundedMax.numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3));
        System.out.printf("res: %d\n", topic795NumSubarrayBoundedMax.numSubarrayBoundedMax(new int[]{2, 9, 2, 5, 6}, 2, 8));
        System.out.printf("res: %d\n", topic795NumSubarrayBoundedMax.numSubarrayBoundedMax(new int[]{2, 4, 6, 7, 8, 1, 3, 5, 4, 6, 9, 10, 1, 0, 2, 2, 2, 2, 34, 10, 13, 90, 89}, 2, 8));
    }

}
