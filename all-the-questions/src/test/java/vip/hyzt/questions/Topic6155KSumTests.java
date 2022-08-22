package vip.hyzt.questions;

import org.junit.Test;

public class Topic6155KSumTests {

    @Test
    public void kSum() {
        int nums1[] = {2, 4, -1}, k1 = 5;
        Topic6155KSum topic6155KSum = new Topic6155KSum();
        long l = topic6155KSum.kSum(nums1, k1);
        System.out.println(l);

        int nums2[] = {1, -2, 3, 4, -10, 12}, k2 = 16;
        long l1 = topic6155KSum.kSum(nums2, k2);
        System.out.println(l1);
    }

}
