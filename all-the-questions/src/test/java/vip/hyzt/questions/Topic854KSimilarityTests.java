package vip.hyzt.questions;

import org.junit.Test;

public class Topic854KSimilarityTests {

    @Test
    public void kSimilarity() {
        Topic854KSimilarity topic854KSimilarity = new Topic854KSimilarity();
        System.out.printf("res: %d\n", topic854KSimilarity.kSimilarity("ababcbcdef", "faaebbcdbc"));
        System.out.printf("res: %d\n", topic854KSimilarity.kSimilarity("aba", "aba"));
        System.out.printf("res: %d\n", topic854KSimilarity.kSimilarity("a", "a"));
    }

}
