package vip.hyzt.questions;

import org.junit.Test;

public class TopicInterview17_09GetKthMagicNumberTests {

    @Test
    public void getKthMagicNumber() {
        TopicInterview17_09GetKthMagicNumber topicInterview17_09GetKthMagicNumber = new TopicInterview17_09GetKthMagicNumber();
        int[] nums = new int[]{5, 6, 7, 8, 9, 10, 11};
        for (int num : nums) {
            System.out.printf("res: %d\n", topicInterview17_09GetKthMagicNumber.getKthMagicNumber(num));
        }
    }

}
