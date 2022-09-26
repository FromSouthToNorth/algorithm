package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class TopicInterview17_19MissingTwoTests {

    @Test
    public void missingTwo() {
        TopicInterview17_19MissingTwo topicInterview17_19MissingTwo = new TopicInterview17_19MissingTwo();
        int[][] nums = {{1, 2}, {3, 4}, {1, 2, 3, 4}};
        for (int[] num : nums) {
            System.out.printf("res: %s \n", Arrays.toString(topicInterview17_19MissingTwo.missingTwo(num)));
        }
    }

}
