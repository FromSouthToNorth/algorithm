package vip.hyzt.questions;

import org.junit.Test;

public class Topic2489IsCircularSentenceTests {

    @Test
    public void isCircularSentence() {
        Topic2489IsCircularSentence topic2489IsCircularSentence = new Topic2489IsCircularSentence();
        System.out.printf("res: %b\n", topic2489IsCircularSentence.isCircularSentence("leetcode exercises sound delightful"));
        System.out.printf("res: %b\n", topic2489IsCircularSentence.isCircularSentence("eetcode"));
        System.out.printf("res: %b\n", topic2489IsCircularSentence.isCircularSentence("Leetcode is cool"));
        System.out.printf("res: %b\n", topic2489IsCircularSentence.isCircularSentence("abc cab bca"));
        System.out.printf("res: %b\n", topic2489IsCircularSentence.isCircularSentence("abc cab Bca"));
    }

}
