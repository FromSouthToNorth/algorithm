package vip.hyzt.questions;

import org.junit.Test;

public class TopicInterview01_02CheckPermutationTests {

    @Test
    public void checkPermutation() {
        TopicInterview01_02CheckPermutation topicInterview01_02CheckPermutation = new TopicInterview01_02CheckPermutation();
        String[][] strings = {{"abc", "bca"}, {"asvss", "sasvv"}, {"abss", "abs"}};
        for (String[] string : strings) {
            System.out.printf("res: %b\n", topicInterview01_02CheckPermutation.checkPermutation(string[0], string[1]));
        }
    }

}
