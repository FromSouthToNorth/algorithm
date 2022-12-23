package vip.hyzt.questions;

import org.junit.Test;

public class Topic2506SimilarPairsTests {

    @Test
    public void similarPairs() {
        Topic2506SimilarPairs topic2506SimilarPairs = new Topic2506SimilarPairs();
        System.out.printf("res: %d\n", topic2506SimilarPairs.similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}));
        System.out.printf("res: %d\n", topic2506SimilarPairs.similarPairs(new String[]{"aabb", "ab", "ba"}));
        System.out.printf("res: %d\n", topic2506SimilarPairs.similarPairs(new String[]{"nba", "cba", "dba"}));
    }

}
