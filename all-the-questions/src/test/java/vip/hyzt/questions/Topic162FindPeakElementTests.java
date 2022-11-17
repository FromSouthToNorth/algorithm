package vip.hyzt.questions;

import org.junit.Test;

public class Topic162FindPeakElementTests {

    @Test
    public void findPeakElement() {
        Topic162FindPeakElement topic162FindPeakElement = new Topic162FindPeakElement();
        System.out.printf("res: %d\n", topic162FindPeakElement.findPeakElement(new int[]{1, 2, 3, 2, 1, 3, 1}));
//        System.out.printf("res: %d\n", topic162FindPeakElement.findPeakElement(new int[]{1, 3, 3, 2, 1, 3, 1}));  对于所有有效的 i 都有 nums[i] != nums[i + 1]
        System.out.printf("res: %d\n", topic162FindPeakElement.findPeakElement(new int[]{1, -2, -4, -1, 1, 3, 1}));
    }

}
