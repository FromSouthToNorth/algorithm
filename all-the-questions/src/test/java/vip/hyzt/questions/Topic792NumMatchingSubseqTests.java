package vip.hyzt.questions;

import org.junit.Test;

public class Topic792NumMatchingSubseqTests {

    @Test
    public void numMatchingSubseq() {
        Topic792NumMatchingSubseq topic792NumMatchingSubseq = new Topic792NumMatchingSubseq();
        System.out.printf("res: %d\n", topic792NumMatchingSubseq.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
        System.out.printf("res: %d\n", topic792NumMatchingSubseq.numMatchingSubseq("dsahjpjauf", new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}));
    }

}
