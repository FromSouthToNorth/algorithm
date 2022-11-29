package vip.hyzt.questions;

import org.junit.Test;

public class Topic2484CountPalindromesTests {

    @Test
    public void countPalindromes() {
        Topic2484CountPalindromes topic2484CountPalindromes = new Topic2484CountPalindromes();
        System.out.printf("res: %d\n", topic2484CountPalindromes.countPalindromes("103301"));
        System.out.printf("res: %d\n", topic2484CountPalindromes.countPalindromes("0000000"));
        System.out.printf("res: %d\n", topic2484CountPalindromes.countPalindromes("9999900000"));
    }

}
