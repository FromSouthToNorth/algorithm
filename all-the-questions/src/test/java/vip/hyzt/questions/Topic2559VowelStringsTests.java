package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2559VowelStringsTests {

    @Test
    public void vowelStrings() {
        Topic2559VowelStrings topic2559VowelStrings = new Topic2559VowelStrings();
        System.out.printf("res: %s\n", Arrays.toString(topic2559VowelStrings.vowelStrings(new String[]{ "aba", "bcb", "ece", "aa", "e" }, new int[][]{ { 0, 2 }, { 1, 4 }, { 1, 1 } })));
        System.out.printf("res: %s\n", Arrays.toString(topic2559VowelStrings.vowelStrings(new String[]{ "a","e","i" }, new int[][]{ { 0, 2 }, { 0, 1 }, { 2, 2 } })));
    }

}
