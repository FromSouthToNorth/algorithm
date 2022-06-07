package vip.hyzt.questions;

import org.junit.Test;

public class Topic1455IsPrefixOfWordTests {

    @Test
    public void isPrefixOfWord() {
        String sentence = "this problem is an easy problem";
        String searchWord = "pro";
        int ans = Topic1455IsPrefixOfWord.isPrefixOfWord(sentence, searchWord);
        System.out.printf("%d \n", ans);
    }

}
