package vip.hyzt.questions;

import org.junit.Test;

public class Topic2531IsItPossibleTests {

    @Test
    public void isItPossible() {
        Topic2531IsItPossible topic2531IsItPossible = new Topic2531IsItPossible();
        System.out.printf("res: %b\n", topic2531IsItPossible.isItPossible("ac", "b"));
        System.out.printf("res: %b\n", topic2531IsItPossible.isItPossible("abcc", "aab"));
        System.out.printf("res: %b\n", topic2531IsItPossible.isItPossible("abcde", "fghij"));
        System.out.printf("res: %b\n", topic2531IsItPossible.isItPossible("aa", "bb"));
    }

}
