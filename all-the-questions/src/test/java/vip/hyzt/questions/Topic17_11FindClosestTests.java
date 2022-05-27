package vip.hyzt.questions;

import org.junit.Test;

public class Topic17_11FindClosestTests {

    @Test
    public void findClosest() {
        String[] words = {"I","am","a","student","from","a","university","in","a","city"};
        String word1 = "a", word2 = "student";
        int ans = Topic17_11FindClosest.findClosest(words, word1, word2);
        System.out.println(ans);
    }

}
