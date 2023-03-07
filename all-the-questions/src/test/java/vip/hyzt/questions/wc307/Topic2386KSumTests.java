package vip.hyzt.questions.wc307;

import org.junit.Test;
import vip.hyzt.questions.wc307.Topic2386KSum;

public class Topic2386KSumTests {

    @Test
    public void kSum() {
        int nums1[] = {2, 4, -1}, k1 = 5;
        Topic2386KSum topic2386KSum = new Topic2386KSum();
        long l = topic2386KSum.kSum(nums1, k1);
        System.out.println(l);

        int nums2[] = {1, -2, 3, 4, -10, 12}, k2 = 16;
        long l1 = topic2386KSum.kSum(nums2, k2);
        System.out.println(l1);
    }

}
