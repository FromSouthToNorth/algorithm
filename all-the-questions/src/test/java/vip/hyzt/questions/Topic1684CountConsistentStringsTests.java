package vip.hyzt.questions;

import org.junit.Test;

public class Topic1684CountConsistentStringsTests {

    @Test
    public void countConsistentStrings() {
        Topic1684CountConsistentStrings topic1684CountConsistentStrings = new Topic1684CountConsistentStrings();
        System.out.printf("res %d\n", topic1684CountConsistentStrings.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
        System.out.printf("res %d\n", topic1684CountConsistentStrings.countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}));
        System.out.printf("res %d\n", topic1684CountConsistentStrings.countConsistentStrings("cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}));
    }

}
