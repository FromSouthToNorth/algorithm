package vip.hyzt.questions;

import org.junit.Test;

public class Topic720LongestWordTests {

    @Test
    public void longestWordSimulation() {
        String[] words = new String[]{"w", "wo", "wor", "worl", "world"};
        String word = Topic720LongestWord.longestWordSimulation(words);
        System.out.println(word);
    }
    
    @Test
    public void longestWordTrie() {
        String[] words = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String word = Topic720LongestWord.longestWordTrie(words);
        System.out.println(word);
    }

}
